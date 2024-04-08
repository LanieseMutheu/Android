package com.blah.laniese

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun About(
) {
    Column(
        modifier = Modifier
//            .fillMaxSize()
//            .fillMaxWidth()
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Black),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(text = "About screen")
        val home = LocalContext.current

        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(40.dp)
        ){

            Text(text = "All" )

            Spacer(modifier = Modifier .width(width = 10.dp))

            Text(text = "Images")

            Spacer(modifier = Modifier .width(width = 10.dp))

            Text(text = "Videos" )
        }


        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "This is my about page", color = Color.Blue, fontSize = 20.sp, fontFamily = FontFamily.Cursive)
        Text(text = "Gram is best", modifier = Modifier.background(color = Color.Yellow))
        Button(onClick = {
            home.startActivity(Intent(home, MainActivity::class.java))


        },
//            colors = ButtonDefaults.buttonColors(Color.Magenta),
//            shape = RoundedCornerShape(10.dp)
            shape = CutCornerShape(10),
            border = BorderStroke(2.dp, Color.Blue),

            colors = ButtonDefaults.outlinedButtonColors()

            ) {
            Text(text = "Home screen", color = Color.Red)
            
        }
        val nah = AnnotatedString("Go to Home",
            spanStyle = SpanStyle(Color.Green)
        )
        val ii = LocalContext.current
        ClickableText(text = nah, onClick = {
            ii.startActivity(Intent(ii, MainActivity::class.java))
        })
        val ll = LocalContext.current
        Text(text = "Click me",
            modifier = Modifier
                .clickable {
                    ll.startActivity(Intent(ll, MainActivity::class.java))
                }
            )






    }

}




