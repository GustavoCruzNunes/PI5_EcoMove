package com.example.pi5_ecomove

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener {
            // Implementar a ação de login
            Snackbar.make(it, "Login clicado!", Snackbar.LENGTH_SHORT).show()
        }

        btnRegister.setOnClickListener {
            // Implementar a ação de registro
            Snackbar.make(it, "Cadastrar clicado!", Snackbar.LENGTH_SHORT).show()
        }
    }
}