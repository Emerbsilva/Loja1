package com.ebs.lojavirtual.Form

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebs.lojavirtual.R
import com.ebs.lojavirtual.TelaPrincipal
import com.ebs.lojavirtual.databinding.ActivityFormLoginBinding
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth

class FormLogin : AppCompatActivity() {

    private lateinit var binding: ActivityFormLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide() // ocultar a toolBar

        val text_tela_cadastro = binding.textTelaCadastro
        val bt_entrar = binding.btEntrar

        text_tela_cadastro.setOnClickListener{
            var intent = Intent(this, FormCadastro::class.java)
            startActivity(intent)
        }

        bt_entrar.setOnClickListener{
            AutenticarUsuario()
        }

    }

    private fun AutenticarUsuario(){
        val email = binding.editEmail.text.toString()
        val senha = binding.editSenha.text.toString()

        if (email.isEmpty() || senha.isEmpty()){
            var snackbar = Snackbar.make(binding.layoutLogin, "Coloque um Email e uma Senha", Snackbar.LENGTH_INDEFINITE)
                .setBackgroundTint(Color.WHITE).setTextColor(Color.BLUE)
                .setAction("OK", {

                })
            snackbar.show()
        }else{
            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, senha).addOnCompleteListener{
                if (it.isSuccessful){
                    AbrirTelaPrinciapl()
                }
            }.addOnFailureListener{
                var snackbar = Snackbar.make(binding.layoutLogin, "Erro ao Logar Usuario!", Snackbar.LENGTH_INDEFINITE)
                    .setBackgroundTint(Color.WHITE).setTextColor(Color.BLUE)
                    .setAction("OK", {

                    })
                snackbar.show()
            }
        }
    }

    private fun AbrirTelaPrinciapl(){
        var intent = Intent(this, TelaPrincipal::class.java)
        startActivity(intent)
        finish()
    }
}