package com.example.danime.dan

import android.content.ClipData.Item
import android.icu.text.CaseMap.Title
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danime.R
import com.example.danime.item
import com.example.danime.ui.theme.DanimeTheme
import com.example.danime.ui.theme.Orange

//class MainActifity : ComponentActivity (){
//    companion object {
//        val items = listOf(
//            Item(
//                image = R.drawable.onepiece
//            ),
//            Item(
//                image = R.drawable.naruto
//            ),
//        )
//
//        private fun Item(image: Int){}
//    }
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun home (){
    var query by remember {
        mutableStateOf("")
    }
Column (Modifier.fillMaxSize()){
Column (Modifier.background(Orange)){
SearchBar(query = query, onQueryChange = {newQuery -> query = newQuery}, onSearch = {}, active = false , onActiveChange = {}, modifier = Modifier.padding(20.dp), leadingIcon = { Icon(
    imageVector = Icons.Default.Search,
    contentDescription = ""
)}) {

}
}
    Row { Text(text = "Anime Populer",Modifier.padding(start = 20.dp, top = 10.dp))
        Text(text = "Lihat Semua",Modifier.padding(start = 150.dp, top = 13.dp), color = Orange, fontSize = 14.sp)
//        Image(painter = painterResource(id = R.drawable.onepiece), contentDescription = "", modifier = Modifier
//            .padding(start = 20.dp)
//            .width(93.dp)
//            .height(117.dp))
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ){
        Image(painter = painterResource(id = R.drawable.onepiece), contentDescription = "", modifier = Modifier
            .padding(start = 20.dp, top = 20.dp)
            .width(93.dp)
            .height(117.dp))
        Image(painter = painterResource(id = R.drawable.naruto), contentDescription = "", modifier = Modifier
            .padding(start = 20.dp, top = 20.dp)
            .width(93.dp)
            .height(117.dp))
        Image(painter = painterResource(id = R.drawable.bleach), contentDescription = "", modifier = Modifier
            .padding(start = 20.dp, top = 20.dp)
            .width(93.dp)
            .height(117.dp))
    }
    Column {
        Row {
            Text(text = "Anime Ongoing",Modifier.padding(start = 20.dp, top = 20.dp))
            Text(text = "Lihat Semua",Modifier.padding(start = 150.dp, top = 23.dp), color = Orange, fontSize = 14.sp)
        }
        Column (
            modifier = Modifier
                .fillMaxHeight()
            ){
            Image(painter = painterResource(id = R.drawable.dbz), contentDescription = "", modifier = Modifier
                .padding(start = 20.dp, top = 20.dp)
                .width(93.dp)
                .height(117.dp))
            Image(painter = painterResource(id = R.drawable.overlord), contentDescription = "", modifier = Modifier
                .padding(start = 20.dp, top = 20.dp)
                .width(93.dp)
                .height(117.dp))
            Image(painter = painterResource(id = R.drawable.bsd), contentDescription = "", modifier = Modifier
                .padding(start = 20.dp, top = 20.dp)
                .width(93.dp)
                .height(117.dp))

        }
    }
}
}

//@Composable
//fun KolomMalas(){
//    LazyRow(modifier = Modifier.fillMaxSize(),
//        contentPadding = PaddingValues(16.dp)
//    ){
//        itemsIndexed(MainActifity.items){index, item ->
//
//        }
//    }
//}
//
//@Composable
//fun RowItem (item:Item){
//    Column (modifier = Modifier
//        .height(117.dp)
//        .width(93.dp),
//    horizontalAlignment = Alignment.CenterHorizontally) {
//Image(painter = painterResource(id = item.image), contentDescription = "")
//    }
//}

//val boticon = listOf(
//    navbar(
//        title = "Home",
//        route = "home",
//        selectedIcon = Icons.Filled.Home,
//        unselectedIcon = Icons.Outlined.Home
//    ),
//    navbar(
//        title = "Populer",
//        route = "animePopuler",
//        selectedIcon = Icons.Filled.Favorite,
//        unselectedIcon = Icons.Outlined.FavoriteBorder
//    ),
//    navbar(
//        title = "Profil",
//        route = "profil",
//        selectedIcon = Icons.Filled.AccountCircle,
//        unselectedIcon = Icons.Outlined.AccountCircle
//    )
//
//)
//
//data class navbar (
//    val title : String,
//    val route : String,
//    val selectedIcon : ImageVector,
//    val unselectedIcon : ImageVector
//)

@Composable
@Preview (showBackground = true)
fun previewhome(){
    DanimeTheme {
        home()
    }
}