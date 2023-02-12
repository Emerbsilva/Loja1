package com.ebs.lojavirtual

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.ebs.lojavirtual.Form.FormLogin
import com.ebs.lojavirtual.databinding.ActivityFormLoginBinding
import com.ebs.lojavirtual.databinding.ActivityMainBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textChamaLogin.setOnClickListener{
            //var intent = Intent(this, formLogin::class.java)
            startActivity(intent)
        }

    }
}