package com.example.labweek2.view

import android.R.attr.text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.labweek2.R
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily


@Composable
fun Soal4View() {
    var text by remember { mutableStateOf("") }
    val poppins = FontFamily(
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_bold, FontWeight.Bold),
        Font(R.font.poppins_semibold, FontWeight.SemiBold)
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.soal4vp),
            contentDescription = "halo",
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-110).dp),
            contentScale = ContentScale.Crop

        )


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .align(Alignment.BottomCenter)
                .background(
                    Color(0xFF866D68),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
                )
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxSize(),

                verticalArrangement = Arrangement.Top
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "My Travel Log",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(end = 10.dp)
                    )


                }
                Text(
                    text = "Sydney Opera House",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = poppins,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    Image(
                        imageVector = Icons.Filled.LocationOn,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color(0xFF662F22)),

                        )
                    Text(
                        text = "Sydney, Australia",
                        fontSize = 15.sp,
                        color = Color.White
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(bottom = 10.dp)
                ) {
                    Image(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color(0xFFE2AF4C)),
                    )
                    Image(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color(0xFFE2AF4C)),
                    )
                    Image(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color(0xFFE2AF4C)),
                    )
                    Image(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color(0xFFE2AF4C)),
                    )
                    Image(
                        imageVector = Icons.Outlined.Star,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                    )
                    Spacer(
                        modifier = Modifier
                            .width(7.dp)
                    )
                    Text(
                        text = "4.0",
                        fontFamily = poppins,
                        fontSize = 20.sp,
                        color = Color.White
                    )

                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    OutlinedTextField(
                        value = "What did you enjoy most about your trip?",
                        onValueChange = { text = it },
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .fillMaxWidth(),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.ThumbUp,
                                contentDescription = "",
                                tint = Color(0xFFF8DADA)
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFF998580),
                            unfocusedTextColor = Color.White,
                            unfocusedBorderColor = Color.Transparent
                        )
                    )
                    Spacer(
                        modifier = Modifier
                            .height(10.dp)
                    )
                    OutlinedTextField(
                        value = "What was your favorite spot?",
                        onValueChange = { text = it },
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .fillMaxWidth(),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = "",
                                tint = Color(0xFFF8DADA)
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFF998580),
                            unfocusedTextColor = Color.White,
                            unfocusedBorderColor = Color.Transparent
                        )
                    )
                    Spacer(
                        modifier = Modifier
                            .height(10.dp)
                    )
                    OutlinedTextField(
                        value = "Anything else you'd like to add?",
                        onValueChange = { text = it },
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .fillMaxWidth(),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Info,
                                contentDescription = "",
                                tint = Color(0xFFF8DADA)
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFF998580),
                            unfocusedTextColor = Color.White,
                            unfocusedBorderColor = Color.Transparent
                        )
                    )

                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 40.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(50.dp)
                                .width(120.dp)
                                .background(
                                    Color(0xFFFD0000),
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Discard",
                                color = Color.White,
                                fontFamily = poppins,
                                fontSize = 15.sp
                            )
                        }
                        Spacer(
                            modifier = Modifier
                                .width(30.dp)
                        )
                        Box(
                            modifier = Modifier
                                .height(50.dp)
                                .width(120.dp)
                                .background(
                                    Color(0xFF9A8681),
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Save",
                                color = Color(0xFF4E4A4A),
                                fontFamily = poppins,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 15.sp
                            )
                        }
                    }
                }


            }
        }
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Soal4Preview() {
    Soal4View()
}