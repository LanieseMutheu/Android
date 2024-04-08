package com.blah.laniese

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.laniese.morning.R


class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {
    Column (
        modifier = Modifier
            .background(Color.Unspecified)
            .fillMaxSize()
            .padding(30.dp)
    ) {

        Image(painter = painterResource(id = R.drawable.login) ,
            contentDescription = "yah",

        )

        Spacer(modifier = Modifier .height(height = 10.dp))
        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(value = name,
            onValueChange = { name = it },
            label = { Text(text = "Enter name") }

        )
        Spacer(modifier = Modifier .height(height = 10.dp))

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter email") }

        )
        var phone by remember {
            mutableStateOf(TextFieldValue(""))
        }

        OutlinedTextField(value = phone,
            onValueChange = { phone = it },
            label = { Text(text = "Phone number")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "")},
            textStyle = TextStyle(Color.Black),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Blue,
                focusedLabelColor = Color.Yellow,
                unfocusedBorderColor = Color.Cyan,
                cursorColor = Color.Black,
                unfocusedLeadingIconColor = Color.Blue,
                focusedLeadingIconColor = Color.Green

            )

        )

















    }}












