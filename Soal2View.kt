package com.example.labweek2.view

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.labweek2.R

@Composable
fun Soal2View() {
    Column() {
        Box(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(Color(0xFFC7904E)),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,

            ) {



                Row(
                    modifier = Modifier
                        .background(
                            color = Color(0xFFCBC1BC),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        colorFilter = ColorFilter.tint(Color(0xFFFFFFFF))
                    )
                    Text(
                        text = "Go Back",
                        color = Color(0xFFFFFFFF)
                    )
                }
                Spacer(modifier = Modifier
                    .width(40.dp))
                Text(
                    text = "My Basket",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,

                )




            }
        }
        Box(
            modifier = Modifier
                .height(90.dp)
                .fillMaxWidth()
                .background(Color(0xAB88898F)),
            contentAlignment = Alignment.CenterStart
        ){
            Row(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
            ) {
               Image(
                   painter = painterResource(R.drawable.logo_uc),
                   contentDescription = "halo",
                   modifier = Modifier
                       .size(60.dp)
               )
                Column (
                    modifier = Modifier
                        .padding(vertical = 5.dp)
                        .padding(start = 15.dp)

                ){
                    Text(
                        text = "Quinoa Fruit Salad",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                    Spacer(modifier = Modifier
                        .height(5.dp))
                    Text(
                        text = "2 x Rp. 100.000",
                        fontSize = 13.sp,
                        color = Color(0xFF5B5757)
                    )

                }
                Text(
                    text = "Rp. 200.000",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 30.dp)
                        .padding(vertical = 18.dp)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Image(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Back",
                        colorFilter = ColorFilter.tint(Color(0xAB88898F))
                    )
                }
                Text(
                    text = "Card Holders name",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(top = 40.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(10.dp),
                    label = { Text("Bella Hadid") },
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth()

                )
                Text(
                    text = "Card Number",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(top = 40.dp)

                )
                TextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(10.dp),
                    label = { Text("1234 5678 9012 3456") },
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth()

                )

                Row {
                    Column {
                        Text(
                            text = "Date",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .padding(top = 40.dp)
                        )
                        TextField(
                            value = "",
                            onValueChange = {},
                            shape = RoundedCornerShape(10.dp),
                            label = { Text("10/30") },
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .fillMaxWidth(0.45f)

                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .width(20.dp)
                    )
                    Column {
                        Text(
                            text = "CCV",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .padding(top = 40.dp)
                        )
                        TextField(
                            value = "",
                            onValueChange = {},
                            shape = RoundedCornerShape(10.dp),
                            label = { Text("123") },
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .fillMaxWidth()

                        )
                    }



                }
                Spacer(modifier = Modifier
                    .height(30.dp))

                Row(
                    modifier = Modifier
                        .background(
                            color = Color(0xFFC7904E),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    
                    Text(
                        text = "Complete Order",
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier


                    )
                }
            }
        }

    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)

fun Soal2Preview() {
    Soal2View()
}