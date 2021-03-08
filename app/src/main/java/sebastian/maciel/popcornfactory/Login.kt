package sebastian.maciel.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button: Button = findViewById<Button>(R.id.button_start)


        button.setOnClickListener(){
            var intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}