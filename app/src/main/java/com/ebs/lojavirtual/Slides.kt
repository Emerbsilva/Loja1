package com.ebs.lojavirtual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebs.lojavirtual.Form.FormLogin
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide

class Slides : IntroActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_slides)

        isButtonBackVisible = false // Deixar o botão voltar invisivel
        isButtonNextVisible = false // Deixar o botão avançar invisivel

        addSlide(
            SimpleSlide.Builder()
                .background(R.color.Roxo)
                .backgroundDark(R.color.Branco)
                .image(R.drawable.drawer)
                .title("Loja Online de calçados")
                .description("Entre e confira as promoções que preparamos pra voce")
                .build()
        )

        addSlide(
            SimpleSlide.Builder()
                .background(R.color.AV)
                .title("Crie uma conta gratis")
                .description("Cadastre agora mesmo e confira nossos produtos")
                .canGoBackward(false) // Evita que volte para o slide anterior
                .build()
        )
    }

    // Quando passar o ultimo slide, caira aqui e destruira os slides e irá abri
    // a activity de loguin finalizando as demais
    override fun onDestroy() {
        super.onDestroy()
        var intent = Intent(this, FormLogin::class.java)
        startActivity(intent)
        finish()
    }
}