package com.example.danime.dan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danime.R
import com.example.danime.ui.theme.DanimeTheme
import com.example.danime.ui.theme.Orange

@Composable
fun des () {
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Column(
            Modifier
                .background(Orange)
                .fillMaxWidth()
        ) {
            Text(
                text = "Deskripsi Anime",
                Modifier
                    .padding(top = 30.dp, bottom = 30.dp)
                    .align(Alignment.CenterHorizontally),
                color = Color.White, fontSize = 18.sp
            )
        }
        Image(painter = painterResource(id = R.drawable.op ), contentDescription = "", modifier = Modifier
            .height(300.dp)
            .width(600.dp)
            .padding(top = 10.dp)
            .align(Alignment.CenterHorizontally))
        Text(text = "One Piece", Modifier.padding(top = 20.dp, start = 30.dp) , fontSize = 18.sp)
        Text(text = "Aksi, Petualangan, Fantasi", Modifier.padding(top = 20.dp, start = 30.dp) , color = Orange, fontSize = 16.sp)
        Text(text = "Sinopsis", Modifier.padding(top = 50.dp, start = 30.dp) , fontSize = 18.sp)
        Text(text = "One Piece menceritakan tentang petualangan seorang anak bernama Monkey D. Luffy " +
                "yang bercita-cita menjadi raja bajak laut dan menemukan \"One Piece\" setelah terinspirasi oleh Shanks. " +
                "Sekitar 22 tahun sebelum cerita dimulai, seorang bajak laut bernama Gol D. Roger, " +
                "atau lebih dikenal sebagai raja bajak laut " +
                "dieksekusi mati di depan publik.", Modifier.padding(top = 20.dp, start = 30.dp, end = 20.dp) , fontSize = 16.sp)
    }
}

@Composable
@Preview(showBackground = true)
fun previewdes(){
    DanimeTheme {
        des()
    }
}