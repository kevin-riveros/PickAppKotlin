package pe.com.kevinrsd.myapplicationkotlin

import android.support.v7.app.AppCompatActivity
import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val text="seduction"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt=findViewById<TextView>(R.id.txtname)
        txt.setText(text)
    }
}
