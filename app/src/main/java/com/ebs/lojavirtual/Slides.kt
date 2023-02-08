package com.ebs.lojavirtual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                .build()
        )

    }
}