package com.ebs.lojavirtual.Form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebs.lojavirtual.R
import com.ebs.lojavirtual.databinding.ActivityFormLoginBinding

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

        }
    }
}