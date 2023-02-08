package com.ebs.lojavirtual.Form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebs.lojavirtual.R
import com.ebs.lojavirtual.databinding.ActivityFormCadastroBinding
import com.ebs.lojavirtual.databinding.ActivityFormLoginBinding

class FormCadastro : AppCompatActivity() {

    private lateinit var binding: ActivityFormCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide() // ocultar a tools bar


    }
}