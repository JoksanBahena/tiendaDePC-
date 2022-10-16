package mx.edu.appbar_jbp_4b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.appbar_jbp_4b.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var memoria = intent.getStringExtra("RAM")
        var precioRam = intent.getStringExtra("precioRAM")

        binding.btnSiguiente3.setOnClickListener {
            val opcion = binding.rgProcesador.checkedRadioButtonId
            var procesador = when(opcion) {
                R.id.rb2600 -> "R5 2600"
                R.id.rb3600 -> "R5 3600"
                R.id.rb3600x -> "R5 3600X"
                R.id.rb5600 -> "R5 5600"
                else -> "Sin seleccion"
            }

            var precioProcesador = when(opcion) {
                R.id.rb2600 -> "2999"
                R.id.rb3600 -> "3350"
                R.id.rb3600x -> "3899"
                R.id.rb5600 -> "4700"
                else -> "0"
            }

            val intent = Intent(this@MainActivity3, MainActivity4::class.java)

            intent.putExtra("PROCESADOR", procesador)
            intent.putExtra("precioPROCESADOR", precioProcesador)
            intent.putExtra("RAM", memoria)
            intent.putExtra("precioRAM", precioRam)

            startActivity(intent)
        }
    }
}