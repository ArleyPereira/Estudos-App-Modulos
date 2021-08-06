package com.example.estudoappmodulo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastrar_endereco.*

class CadastrarEnderecoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_endereco)

        btnCadastrarEndereco.setOnClickListener {
            val enderco = Endereco(
                edtRua.text.toString(),
                edtBairro.text.toString(),
                edtMunicipio.text.toString(),
                edtEstado.text.toString()
            )

            val intent = Intent()
            intent.putExtra("endereco", enderco)
            setResult(100, intent)
            finish()

        }

    }

}