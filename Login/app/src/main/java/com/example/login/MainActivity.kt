package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ingresarButton: Button = findViewById(R.id.buttonIngresar)
        ingresarButton.setOnClickListener(View.OnClickListener {
            var usuarioEditText = findViewById(R.id.idUsuario)
            val usuario: String = usuarioEditText.text.toString()

            var contraseniaEditText = findViewById(R.id.idContrasenia)
            val contrasenia: String = contraseniaEditText.text.toString()

            if (usuario == "73321272" && contrasenia == "1234") {
                val intent = Intent(this@MainActivity, Activity_Menu::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        })
    }
}