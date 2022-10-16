package mx.edu.appbar_jbp_4b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import mx.edu.appbar_jbp_4b.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSiguiente2.setOnClickListener {
            val opcion = binding.rgRam.checkedRadioButtonId
            var memoria = when(opcion) {
                R.id.rb4gb -> "4GB"
                R.id.rb8gb -> "8GB"
                R.id.rb16gb -> "16GB"
                R.id.rb32gb -> "32GB"
                else -> "Sin seleccion"
            }

            val intent = Intent(this@MainActivity2, MainActivity3::class.java)

            intent.putExtra("RAM", memoria)

            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_activity2, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.mnAbrir -> {
                Toast.makeText(this@MainActivity2, "Presionaste abrir", Toast.LENGTH_SHORT).show()
            }

            R.id.mnConfig -> {
                Toast.makeText(this@MainActivity2, "Presionaste configurar", Toast.LENGTH_SHORT).show()
            }

            R.id.mnSalir -> {
                Toast.makeText(this@MainActivity2, "Presionaste salir", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}