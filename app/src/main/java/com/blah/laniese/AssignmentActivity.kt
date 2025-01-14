package com.blah.laniese

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.laniese.morning.R

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            classwork()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun classwork() {

    LazyColumn(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
    ){
        item {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {

                    Image(imageVector = Icons.Default.Home,
                        contentDescription ="",
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Current Location")

                        Row {
                            Image(
                                imageVector = Icons.Default.LocationOn,
                                contentDescription ="",
                                modifier = Modifier
                                    .size(15.dp)

                            )
                            Text(text = "Denpasar, Bali")
                        }

                    }

                    Image(imageVector = Icons.Default.Settings, contentDescription ="" )

                }
//
                Spacer(modifier = Modifier.height(15.dp))


                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Hotels")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.Cyan)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Taxi")

                    }

                }



                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Airplane")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Holiday")

                    }

                }

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Ticket")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(imageVector = Icons.Default.Home,
                            contentDescription ="",
                        )
                        Text(text = "Harbour")

                    }

                }

                Row (
                ){

                    Text(text = "Popular in town")

                    Spacer(modifier = Modifier.width(60.dp))

                    Text(text = "View All")

                }

                Spacer(modifier = Modifier.height(20.dp))

                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    item {
                        Column {
                            Card (
                                elevation = CardDefaults.cardElevation(10.dp)
                            ){
                                Image(painter = painterResource(id = R.drawable.well ), contentDescription = "")
                                Text(text = "Nusa Penida")

                            }
                        }
                    }


                }


















            }
        }
    }

}


//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//
//    ) {
//        item {
//            Row {
//
//                Card (
//                    elevation = CardDefaults.cardElevation(10.dp)
//                ) {
//                    Column (
//                        verticalArrangement = Arrangement.SpaceBetween
//                    ){
//                    }
//
//
//                        Row (
//                            verticalAlignment = Alignment.Bottom
//                        ){
//                            Image(painter = painterResource(id = R.drawable.login), contentDescription = "")
//                            Text(text = "Hotels")
//                        }
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Row(
//                            verticalAlignment = Alignment.Bottom
//                        ) {
//                            Image(painter = painterResource(id = R.drawable.login), contentDescription = "")
//                            Text(text = "Taxi")
//                        }
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Row (
//                            verticalAlignment = Alignment.Bottom
//                        ){
//
//                            Image(painter = painterResource(id = R.drawable.login), contentDescription = "")
//                            Text(text = "Airplane")
//
//                        }
//
//
//
//                    }
//                    Spacer(modifier = Modifier.width(100.dp))
//
//
//                    Column(
//                        verticalArrangement = Arrangement.SpaceBetween
//                    ){
//                        Row (
//                            verticalAlignment = Alignment.Bottom
//                        ){
//                            Image(painter = painterResource(id = R.drawable.login), contentDescription = "")
//                            Text(text = "Holiday")
//                        }
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Row (
//                            verticalAlignment = Alignment.Bottom
//                        ){
//                            Image(painter = painterResource(id = R.drawable.login), contentDescription = "")
//                            Text(text = "Ticket")
//                        }
//                        Spacer(modifier = Modifier.height(10.dp))
//
//                        Row(
//                            verticalAlignment = Alignment.Bottom
//                        ) {
//                            Image(painter = painterResource(id = R.drawable.login), contentDescription = "")
//                            Text(text = "Harbour")
//                        }
//
//
//                    }
//
//
//
//                }
//            }
//        }
//
//
//    }
//
