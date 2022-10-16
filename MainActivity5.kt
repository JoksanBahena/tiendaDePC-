package mx.edu.appbar_jbp_4b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.appbar_jbp_4b.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var memoria = intent.getStringExtra("RAM")
        var procesador = intent.getStringExtra("PROCESADOR")
        var tarjeta = intent.getStringExtra("TARJETA")

        binding.txtRam.text = memoria
        binding.txtProcesador.text = procesador
        binding.txtTarjeta.text = tarjeta

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or
                    Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}