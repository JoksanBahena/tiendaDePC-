package mx.edu.appbar_jbp_4b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.appbar_jbp_4b.databinding.ActivityMain3Binding
import mx.edu.appbar_jbp_4b.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var memoria = intent.getStringExtra("RAM")
        var precioRam = intent.getStringExtra("precioRAM")
        var procesador = intent.getStringExtra("PROCESADOR")
        var precioProcesador = intent.getStringExtra("precioPROCESADOR")

        binding.btnSiguiente4.setOnClickListener {
            val opcion = binding.rgTarjeta.checkedRadioButtonId
            var tarjeta = when(opcion) {
                R.id.rb1050 -> "GTX 1050"
                R.id.rb1650 -> "GTX 1650"
                R.id.rb2060 -> "RTX 2060"
                R.id.rb2080 -> "RTX 2080"
                else -> "Sin seleccion"
            }

            var precioTarjeta = when(opcion) {
                R.id.rb1050 -> "3899"
                R.id.rb1650 -> "4300"
                R.id.rb2060 -> "5199"
                R.id.rb2080 -> "6299"
                else -> "0"
            }

            val intent = Intent(this@MainActivity4, MainActivity5::class.java)

            intent.putExtra("TARJETA", tarjeta)
            intent.putExtra("precioTARJETA", precioTarjeta)
            intent.putExtra("RAM", memoria)
            intent.putExtra("precioRAM", precioRam)
            intent.putExtra("PROCESADOR", procesador)
            intent.putExtra("precioPROCESADOR", precioProcesador)

            startActivity(intent)
        }
    }
}