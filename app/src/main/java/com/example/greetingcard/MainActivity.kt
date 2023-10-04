package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    Greeting("Rubén Arranz")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String) {
    Surface (color = Color(255, 153,0)) {
        Text(text = "Hola, me llamo $name!", modifier = Modifier.padding(19.dp))
    }

}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        Greeting("Rubén Arranz")
    }
}