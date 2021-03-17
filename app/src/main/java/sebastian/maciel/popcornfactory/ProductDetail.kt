package sebastian.maciel.popcornfactory

import android.content.Intent
import android.content.RestrictionEntry
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Esta importación ayuda a llamar directamente los botones
import kotlinx.android.synthetic.main.activity_movie_detail.*

class ProductDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        var  ns = 0
        val bundle = intent.extras
        var id = -1
        var title = ""


        if (bundle != null) {
            ns = bundle.getInt("numberSeats")
            title = bundle.getString("title")!!

            iv_product_image.setImageResource(bundle.getInt("header"))
            iv_product_title.text = bundle.getString("title")
            iv_product_description.text = bundle.getString("sinopsis")
            seats_left.setText("$ns seats avaible")
            id = bundle.getInt("pos")
        }

        if(ns  == 0){
            buy_tickets.isActivated = false
        } else {
            buy_tickets.setOnClickListener(){
                val intent: Intent = Intent (this, SeatSelection::class.java)

                intent.putExtra("movie", id)
                intent.putExtra("name", title)

                this.startActivity(intent)

            }
        }
    }
}