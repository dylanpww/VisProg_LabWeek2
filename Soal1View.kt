package com.example.labweek2.view

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.HeartBroken
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.zIndex
import com.example.labweek2.R


@Composable
fun background() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    )
}

@Composable
fun Soal1View() {

    background()
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier.padding(top = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Menu",


                )
            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier
                    .background(
                        color = Color(0xFFFBCEB1),
                        shape = RoundedCornerShape(24.dp)
                    )
                    .padding(10.dp),


                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,

                )

            {
                Image(
                    imageVector = Icons.Filled.ShoppingCart,
                    contentDescription = "Cart",
                    colorFilter = ColorFilter.tint(Color(0xFFFFAC1C))

                )
                Text(
                    text = "My basket",
                    color = Color(0xFFCC5500)


                )
            }


        }
        Text(
            text = "Hello Bella,",
            fontSize = 24.sp,
            modifier = Modifier.padding(
                top = 20.dp
            )
        )
        Text(
            text = "What fruit salad combo do you want today",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 5.dp
            )
        )
        TextField(
            value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search icon"
                )
            },

            label = { Text("Search for fruit salad combos") },
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),


            )
        Text(
            text = "Recommended Combo",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(
                top = 30.dp
            )
        )
        Row(
            modifier = Modifier
                .padding(top = 10.dp)
        ) {

            Column(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(8.dp),


                ) {
                Box(
                    modifier = Modifier
                        .size(150.dp, 200.dp)
                        .padding(horizontal = 5.dp),

                    ) {
                    Image(
                        imageVector = Icons.Filled.HeartBroken,
                        contentDescription = "Add",
                        colorFilter = ColorFilter.tint(Color(0xFFCC5500)),
                        modifier = Modifier
                            .offset(x = 110.dp, y = 10.dp)
                            .zIndex(1f)

                    )
                    Image(
                        painter = painterResource(R.drawable.logo_uc),
                        contentDescription = "halo",
                        modifier = Modifier
                            .size(100.dp)
                            .align(Alignment.TopCenter)
                            .padding(top = 10.dp)
                    )
                    Text(
                        text = "Honey lime combo",
                        fontSize = 19.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(top = 110.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 160.dp)
                    ) {
                        Text(
                            text = "Rp. 70.000",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFCC5500),
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Image(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Add",
                            colorFilter = ColorFilter.tint(Color(0xFFCC5500))
                        )

                    }


                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(8.dp),


                ) {
                Box(
                    modifier = Modifier
                        .size(150.dp, 200.dp)
                        .padding(horizontal = 5.dp),

                    ) {
                    Image(
                        imageVector = Icons.Filled.HeartBroken,
                        contentDescription = "Add",
                        colorFilter = ColorFilter.tint(Color(0xFFCC5500)),
                        modifier = Modifier
                            .offset(x = 110.dp, y = 10.dp)
                            .zIndex(1f)

                    )
                    Image(
                        painter = painterResource(R.drawable.logo_uc),
                        contentDescription = "halo",
                        modifier = Modifier
                            .size(100.dp)
                            .align(Alignment.TopCenter)
                            .padding(top = 10.dp)
                    )
                    Text(
                        text = "Berry Mango Combo",
                        fontSize = 19.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(top = 110.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 160.dp)
                    ) {
                        Text(
                            text = "Rp. 80.000",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFCC5500),
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Image(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Add",
                            colorFilter = ColorFilter.tint(Color(0xFFCC5500))
                        )
                    }


                }
            }
        }
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {

            Text(
                text = "Hottest",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
            Text(
                text = "Popular",
                fontSize = 20.sp,
                color = Color(0xFFF0F0F0),
                modifier = Modifier
                    .padding(top = 20.dp)

            )
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
            Text(
                text = "New Combo",
                fontSize = 20.sp,
                color = Color(0xFFF0F0F0),
                modifier = Modifier
                    .padding(top = 20.dp)

            )
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
            Text(
                text = "Top",
                fontSize = 20.sp,
                color = Color(0xFFF0F0F0),
                modifier = Modifier
                    .padding(top = 20.dp)

            )

        }
        Box(
            modifier = Modifier
                .width(45.dp)
                .height(2.dp)
                .background(Color(0xFFCC5500))
        )


        Row(
            modifier = Modifier

                .height(180.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            Column (
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .width(140.dp)
                    .fillMaxHeight()
                    .background(Color(0xFFFFFFC5), RoundedCornerShape(10.dp))
            ){


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(horizontal = 10.dp)
                ) {
                    Image(
                        imageVector = Icons.Filled.HeartBroken,
                        contentDescription = "Add",
                        colorFilter = ColorFilter.tint(Color(0xFFCC5500)),
                        modifier = Modifier
                            .offset(x = 100.dp, y = 10.dp)
                            .zIndex(1f)

                    )
                    Image(
                        painter = painterResource(R.drawable.logo_uc),
                        contentDescription = "halo",
                        modifier = Modifier
                            .size(90.dp)
                            .align(Alignment.TopCenter)
                            .padding(top = 10.dp)
                    )

                    Text(
                        text = "Quinoa fruit salad",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(y = (-40).dp)

                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(y = (-10).dp)
                    ) {
                        Text(
                            text = "Rp. 100.000",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFCC5500),
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Image(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Add",
                            colorFilter = ColorFilter.tint(Color(0xFFCC5500))
                        )

                    }
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column (
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                        .width(140.dp)
                        .fillMaxHeight()
                        .background(Color(0xFFF6DCE1), RoundedCornerShape(10.dp))
                    ){


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(horizontal = 10.dp)
                ) {
                    Image(
                        imageVector = Icons.Filled.HeartBroken,
                        contentDescription = "Add",
                        colorFilter = ColorFilter.tint(Color(0xFFCC5500)),
                        modifier = Modifier
                            .offset(x = 100.dp, y = 10.dp)
                            .zIndex(1f)

                    )
                    Image(
                        painter = painterResource(R.drawable.logo_uc),
                        contentDescription = "halo",
                        modifier = Modifier
                            .size(90.dp)
                            .align(Alignment.TopCenter)
                            .padding(top = 10.dp)
                    )

                    Text(
                        text = "Tropical fruit salad",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(y = (-40).dp)

                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(y = (-10).dp)
                    ) {
                        Text(
                            text = "Rp. 87.000",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFCC5500),
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Image(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Add",
                            colorFilter = ColorFilter.tint(Color(0xFFCC5500))
                        )

                    }
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column (
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color(0xFFDAEBF8), RoundedCornerShape(10.dp))
            ){


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(horizontal = 10.dp)
                ) {
                    Image(
                        imageVector = Icons.Filled.HeartBroken,
                        contentDescription = "Add",
                        colorFilter = ColorFilter.tint(Color(0xFFCC5500)),
                        modifier = Modifier
                            .offset(x = 100.dp, y = 10.dp)
                            .zIndex(1f)

                    )
                    Image(
                        painter = painterResource(R.drawable.logo_uc),
                        contentDescription = "halo",
                        modifier = Modifier
                            .size(90.dp)
                            .align(Alignment.TopCenter)
                            .padding(top = 10.dp)
                    )

                    Text(
                        text = "Melon fruit salad",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(y = (-40).dp)

                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(y = (-10).dp)
                    ) {
                        Text(
                            text = "Rp. 120.000",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFCC5500),
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Image(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Add",
                            colorFilter = ColorFilter.tint(Color(0xFFCC5500))
                        )

                    }
                }
            }
            }
        }
    }




@Composable
@Preview(showBackground = true, showSystemUi = true)

fun Soal1Preview() {
    Soal1View()
}