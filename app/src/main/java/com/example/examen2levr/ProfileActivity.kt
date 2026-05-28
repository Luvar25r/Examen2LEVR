package com.example.examen2levr

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {

    // Referencias a las vistas
    private lateinit var tvUsuario: TextView
    private lateinit var tvTelefono: TextView
    private lateinit var ivFotoPerfil: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        initViews()
        loadUserData()
    }

    private fun initViews() {
        tvUsuario = findViewById(R.id.tvUsuario)
        tvTelefono = findViewById(R.id.tvTelefono)
        ivFotoPerfil = findViewById(R.id.ivFotoPerfil)
    }

    private fun loadUserData() {
        // Aquí puedes recibir datos del Intent si vienen del login
        val username = intent.getStringExtra("EXTRA_USERNAME") ?: "Usuario"
        val phone = intent.getStringExtra("EXTRA_PHONE") ?: "Sin teléfono"

        tvUsuario.text = username
        tvTelefono.text = "Teléfono: $phone"
    }
}