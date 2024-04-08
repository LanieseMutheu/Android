package com.blah.laniese

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.blah.laniese.ui.theme.LanieseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            Greeting()
        }
        
        
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column() {
        Text(text = "This is my first android project", color= Color.Blue)
        Text(text = "Me and school don't get along", color= Color.Yellow)
        Text(text = "Now this is becoming boring")
    }

}



   
