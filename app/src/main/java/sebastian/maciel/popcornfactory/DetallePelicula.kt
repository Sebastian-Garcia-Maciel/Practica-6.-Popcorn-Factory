package sebastian.maciel.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Esta importación ayuda a llamar directamente los botones
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle = intent.extras

        if (bundle != null) {
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            iv_nombre_pelicula.text = bundle.getString("name")
            iv_descripcion_pelicula.text = bundle.getString("sinopsis")
        }
    }
}