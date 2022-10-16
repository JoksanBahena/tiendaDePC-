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
        var precioRam = intent.getStringExtra("precioRAM").toString().toInt()
        var procesador = intent.getStringExtra("PROCESADOR")
        var precioProcesador = intent.getStringExtra("precioPROCESADOR").toString().toInt()
        var tarjeta = intent.getStringExtra("TARJETA")
        var precioTarjeta = intent.getStringExtra("precioTARJETA").toString().toInt()

        var total = precioRam + precioProcesador + precioTarjeta

        binding.txtRam.text = memoria + " $" + precioRam
        binding.txtProcesador.text = procesador + " $" + precioProcesador
        binding.txtTarjeta.text = tarjeta + " $" + precioTarjeta
        binding.txtTotal.text = "$" + total.toString()

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or
                    Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}