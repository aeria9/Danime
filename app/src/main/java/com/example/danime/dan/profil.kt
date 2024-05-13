package com.example.danime.dan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danime.R
import com.example.danime.ui.theme.DanimeTheme
import com.example.danime.ui.theme.Orange

@Composable
fun prof (){
    Column (
        Modifier
            .fillMaxSize()
    ){
        Column (
            Modifier
                .background(Orange)
                .fillMaxWidth()
        ){
            Text(text = "Profil",
                Modifier
                    .padding(top = 30.dp, bottom = 30.dp)
                    .align(Alignment.CenterHorizontally),
                color = Color.White, fontSize = 18.sp)
        }
    }
    Column (
        Modifier
            .fillMaxHeight()
    )
    {
        Image(painter = painterResource(id = R.drawable.lol), contentDescription ="", modifier = Modifier
            .height(300.dp)
            .width(150.dp)
            .padding(top = 100.dp)
            .align(Alignment.CenterHorizontally))
        Text(text = "Nama : Dandi Purnomo", Modifier.padding(top = 50.dp, start = 60.dp) , fontSize = 16.sp)
        Text(text = "Email : dandi.siswa01@gmail.com", Modifier.padding(top = 20.dp, start = 60.dp), fontSize = 16.sp)
        Text(text = "Universitas : Universitas Sulawesi Barat", Modifier.padding(top = 20.dp, start = 60.dp), fontSize = 16.sp)
        Text(text = "Jurusan : Teknik Informatika", Modifier.padding(top = 20.dp, start = 60.dp), fontSize = 16.sp)
        Text(text = "Apa yang lebih hancur dari masa depan Gen Z?", Modifier.padding(top = 50.dp, start = 50.dp), fontSize = 18.sp)
        Text(text = "Tentu saja kodingan saya", Modifier.padding(top = 20.dp, start = 50.dp), fontSize = 18.sp)
    }
}

@Composable
@Preview(showBackground = true)
fun previewprof(){
    DanimeTheme {
        prof()
    }
}