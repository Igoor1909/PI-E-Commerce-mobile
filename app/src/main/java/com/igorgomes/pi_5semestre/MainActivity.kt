package com.igorgomes.pi_5semestre

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        val cadastrarButton: Button = findViewById(R.id.CadastrarButton)
        cadastrarButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}
