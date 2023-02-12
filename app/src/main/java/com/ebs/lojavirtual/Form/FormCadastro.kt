package com.ebs.lojavirtual.Form

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ebs.lojavirtual.R
import com.ebs.lojavirtual.databinding.ActivityFormCadastroBinding
import com.ebs.lojavirtual.databinding.ActivityFormLoginBinding
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth

class FormCadastro : AppCompatActivity() {

    private lateinit var binding: ActivityFormCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide() // ocultar a tools bar

        binding.btCadastrar.setOnClickListener{
            CadastroUsuario()
        }

    }

    fun CadastroUsuario(){
        val email = binding.editEmail.text.toString()
        val senha = binding.editSenha.text.toString()
        //val layoutDoCadastro = binding.layoutCadastro

        if (email.isEmpty() || senha.isEmpty()){
            //Toast.makeText(this, "Preencha o Email e a Senha.", Toast.LENGTH_SHORT).show()

            var snackbar = Snackbar.make(binding.layoutCadastro, "Coloque o seu Email e Senha!", Snackbar.LENGTH_INDEFINITE)
                .setBackgroundTint(Color.WHITE).setTextColor(Color.BLUE).setAction("OK", {


                })
            snackbar.show()
        }else{
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, senha).addOnCompleteListener{
                if (it.isSuccessful){
                    //Toast.makeText(this, "Cadastro Realizado com Sucesso.", Toast.LENGTH_SHORT).show()

                    var snackbar = Snackbar.make(binding.layoutCadastro, "Cadastro Realizado com Sucesso!", Snackbar.LENGTH_INDEFINITE)
                        .setBackgroundTint(Color.WHITE).setTextColor(Color.BLUE).setAction("OK", {
                            VoltarTelaLogin()

                        })
                    snackbar.show()
                }
            }.addOnFailureListener{
                //Toast.makeText(this, "Erro ao Cadastrar Usuario.", Toast.LENGTH_SHORT).show()

                var snackbar = Snackbar.make(binding.layoutCadastro, "Erro ao Cadastrar Usuario!", Snackbar.LENGTH_INDEFINITE)
                    .setBackgroundTint(Color.WHITE).setTextColor(Color.BLUE).setAction("OK", {


                    })
                snackbar.show()
            }
        }
    }

    private fun VoltarTelaLogin(){
        var intent = Intent(this, FormLogin::class.java)
        startActivity(intent)
        finish()
    }
}