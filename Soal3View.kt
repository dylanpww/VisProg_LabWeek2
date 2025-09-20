package com.example.labweek2.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.labweek2.R


@Composable
fun Soal3View() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFF2F5B2C))
    ) {
        Column() {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Beranda",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .padding(vertical = 30.dp, horizontal = 10.dp)
                )
                Spacer(
                    modifier = Modifier
                        .width(220.dp)
                )
                Image(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = "Back",
                    colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                    modifier = Modifier
                        .padding(vertical = 30.dp)
                        .size(30.dp)
                )
            }

            Image(
                painter = painterResource(R.drawable.soal3vp),
                contentDescription = "halo",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .size(390.dp, 220.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .height(30.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    imageVector = Icons.Filled.Circle,
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                    modifier = Modifier
                        .size(12.dp)
                )
                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )
                Image(
                    imageVector = Icons.Filled.Circle,
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(Color(0xFF858080)),
                    modifier = Modifier
                        .size(12.dp)
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                    )

            ) {
                Column(

                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth()


                ) {

                    Row(
                        modifier = Modifier
                            .height(5.dp)
                            .width(55.dp)
                            .background(
                                Color(0xFF8A8686),
                                shape = RoundedCornerShape(30)
                            )
                            .align(Alignment.CenterHorizontally)
                    ) {

                    }

                    Text(
                        text = "Pengajuan permohonan dan status",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF2C375E),
                        modifier = Modifier
                            .padding(vertical = 10.dp)
                            .padding(horizontal = 15.dp)
                    )

                    Row(
                        modifier = Modifier
                            .height(60.dp)
                            .width(280.dp)
                            .padding(horizontal = 15.dp)
                            .background(
                                Color(0xFF2C375E),
                                shape = RoundedCornerShape(30)
                            ),
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Text(
                            text = "Pengajuan Permohonan",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFFFFFFF),
                            modifier = Modifier
                                .padding(start = 20.dp)

                        )
                        Image(
                            imageVector = Icons.Filled.AddCircle,
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .size(30.dp)
                        )
                    }

                    Box(
                        modifier = Modifier
                            .padding(vertical = 20.dp)
                            .padding(horizontal = 15.dp)
                            .height(180.dp)
                            .width(360.dp)
                            .background(
                                Color(0xFF2F5B2C),
                                shape = RoundedCornerShape(10.dp)
                            )


                    ) {
                        Column() {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()

                            ) {
                                Text(
                                    text = "Dylan Patrick Willyam",
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color(0xFFFFFFFF),
                                    modifier = Modifier

                                )
                                Spacer(
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Image(
                                    imageVector = Icons.Filled.ArrowForwardIos,
                                    contentDescription = "",
                                    colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                                    modifier = Modifier
                                        .padding(end = 20.dp)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .padding(start = 20.dp)
                                        .padding(vertical = 10.dp)
                                ) {
                                    Text(
                                        text = "Jumlah pemohon",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color(0xFFFFFFFF),
                                        modifier = Modifier
                                            .padding(bottom = 10.dp)
                                    )
                                    Text(
                                        text = "Tanggal kedatangan",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color(0xFFFFFFFF),
                                        modifier = Modifier
                                            .padding(bottom = 10.dp)
                                    )
                                    Text(
                                        text = "Jam kedatangan",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color(0xFFFFFFFF),
                                        modifier = Modifier
                                            .padding(bottom = 10.dp)
                                    )

                                }
                                Column(
                                    modifier = Modifier
                                        .padding(start = 20.dp)
                                        .padding(vertical = 10.dp)
                                ) {
                                    Text(
                                        text = ": 1 Orang",
                                        fontSize = 15.sp,
                                        color = Color(0xFFFFFFFF),
                                        modifier = Modifier
                                            .padding(bottom = 10.dp)
                                    )
                                    Text(
                                        text = ": Selasa, 2 September 2025",
                                        fontSize = 15.sp,
                                        color = Color(0xFFFFFFFF),
                                        modifier = Modifier
                                            .padding(bottom = 10.dp)
                                    )
                                    Text(
                                        text = ": (10:01 - 11:00)",
                                        fontSize = 15.sp,
                                        color = Color(0xFFFFFFFF)
                                    )


                                }
                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(),

                                contentAlignment = Alignment.Center
                            ) {
                                Box(
                                    modifier = Modifier
                                        .width(300.dp)
                                        .height(1.dp)
                                        .background(
                                            Color.White,
                                            RoundedCornerShape(50)
                                        )
                                )
                            }
                            Row {
                                Text(
                                    text = "Jumlah pemohon",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color(0xFFFFFFFF),
                                    modifier = Modifier
                                        .padding(start = 20.dp)
                                        .padding(top = 10.dp)
                                )
                                Text(
                                    text = ": Sudah Terbayar",
                                    fontSize = 15.sp,
                                    color = Color(0xFFFFFFFF),
                                    modifier = Modifier
                                        .padding(start = 38.dp)
                                        .padding(top = 10.dp)
                                )
                            }

                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(
                                Color(0xFF2C375E),
                                shape = RoundedCornerShape(10, 10)
                            ),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(start = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Image(
                                imageVector = Icons.Filled.Home,
                                contentDescription = "",
                                colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "Beranda",
                                fontSize = 15.sp,
                                color = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Image(
                                imageVector = Icons.Filled.Book,
                                contentDescription = "",
                                colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "Riwayat",
                                fontSize = 15.sp,
                                color = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Image(
                                imageVector = Icons.Filled.Info,
                                contentDescription = "",
                                colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "Informasi",
                                fontSize = 15.sp,
                                color = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .padding(end = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Image(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "",
                                colorFilter = ColorFilter.tint(Color(0xFFFFFFFF)),
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "Profile",
                                fontSize = 15.sp,
                                color = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(top = 10.dp)
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

fun Soal3Preview() {
    Soal3View()
}