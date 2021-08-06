package com.example.delivery

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.estudoappmodulo.CadastrarEnderecoActivity
import kotlinx.android.synthetic.main.activity_delivery_main.*

class DeliveryMainActivity : AppCompatActivity() {

    private var startResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if(result.resultCode == 100){
                val data = result.data
                val endereco = data?.getSerializableExtra("endereco")
                Log.i("INFOTESTE", "$endereco")
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery_main)

        btnCadastrarEndereco.setOnClickListener {
            startResult.launch(Intent(this, CadastrarEnderecoActivity::class.java))
        }

    }
}