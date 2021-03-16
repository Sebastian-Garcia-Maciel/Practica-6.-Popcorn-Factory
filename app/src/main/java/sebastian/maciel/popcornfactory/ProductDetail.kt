package sebastian.maciel.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Esta importación ayuda a llamar directamente los botones
import kotlinx.android.synthetic.main.activity_movie_detail.*

class ProductDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val bundle = intent.extras

        if (bundle != null) {
            iv_product_image.setImageResource(bundle.getInt("header"))
            iv_product_title.text = bundle.getString("title")
            iv_product_description.text = bundle.getString("sinopsis")
        }
    }
}