package com.saax.armchairconquerors

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.saax.armchairconquerors.ui.theme.MAFfinalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clickForSouls: Button = findViewById(R.id.makesouls_button)

        val totalSouls: TextView = findViewById(R.id.totalsouls_number)

        var souls = 0.toDouble()

        val clickBase = 2

        //val clickMulti = .10


        // Below code updates the total souls value on the screen.
        clickForSouls.setOnClickListener {

            souls += clickBase

            totalSouls.text = souls.toString()

        }






    }
}










