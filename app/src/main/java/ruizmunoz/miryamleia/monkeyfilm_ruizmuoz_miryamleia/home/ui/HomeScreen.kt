package ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.home.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.R
import ruizmunoz.miryamleia.monkeyfilm_ruizmuoz_miryamleia.model.MediaModel


@Composable
fun Home(homeviewmodel: HomeViewModel) {
    var home by remember { mutableStateOf(true) }
    var fav by remember { mutableStateOf(false) }


    Scaffold(
        topBar = {
            TopBar()
        },
        bottomBar = {
            BottomBar(showHome = {
                home = true
                fav = false
            }, showFav = {
                home = false
                fav = true
            })
        }
    ) {
        if (home) {
            ShowHome(homeviewmodel)
        } else if (fav) {

        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CardPeli(pelicula: MediaModel){
    var expandedState by remember{ mutableStateOf(false) }
    var expandedCard by remember{ mutableStateOf(false) }

    var imagen= when(pelicula.catel){
        1 -> R.drawable.c1
        2 -> R.drawable.c2
        3 -> R.drawable.c3
        4 -> R.drawable.c4
        5 -> R.drawable.c5
        6 -> R.drawable.c6
        7 -> R.drawable.c7
        8 -> R.drawable.c8
        9 -> R.drawable.c9
        10 -> R.drawable.c10

        else -> R.drawable.black
    }

    Card(modifier = Modifier
        .fillMaxWidth()
        .animateContentSize(
            animationSpec = tween(
                durationMillis = 200,
                easing = LinearOutSlowInEasing
            )
        ),
        onClick = {
            expandedState = !expandedState
        }) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)) {

            if(!expandedState){
                Row(verticalAlignment = Alignment.CenterVertically){
                    Image(
                        painter = painterResource(imagen),
                        contentDescription = "",
                        modifier = Modifier
                            .size(90.dp)
                            .weight(2f),
                        contentScale = ContentScale.Fit)

                    Column(modifier = Modifier.weight(6f)) {
                        Text(text = pelicula.title, fontSize = MaterialTheme.typography.h5.fontSize, fontWeight = FontWeight.Bold, maxLines = 1, overflow = TextOverflow.Ellipsis)
                        Text(text = pelicula.description, fontSize = MaterialTheme.typography.h6.fontSize, fontStyle = FontStyle.Italic, maxLines = 2, overflow = TextOverflow.Ellipsis)
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                        IconButton(
                            modifier = Modifier.alpha(ContentAlpha.medium),
                            onClick = {
                                /*marcar como favoritos*/
                            }) {
                            Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        }

                        IconButton(
                            modifier = Modifier.alpha(ContentAlpha.medium),
                            onClick = {
                                expandedState = !expandedState
                            }) {
                            Icon(imageVector = Icons.Default.Add, contentDescription = "",modifier = Modifier.size(26.dp))
                        }
                    }
                }
            }

            if(expandedState){
                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Row{
                        Image(
                            painter = painterResource(imagen),
                            contentDescription = "",
                            modifier = Modifier.size(250.dp),
                            contentScale = ContentScale.Fit)
                    }

                    Row{

                        Column( modifier = Modifier.weight(6f)) {

                            Row{
                                Text(text = pelicula.title)
                            }
                            Row{
                                Text(text = pelicula.description)
                            }

                        }

                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                            IconButton(
                                modifier = Modifier.alpha(ContentAlpha.medium),
                                onClick = {

                                }) {
                                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                            }

                            IconButton(
                                modifier = Modifier.alpha(ContentAlpha.medium),
                                onClick = {
                                    expandedCard = !expandedCard
                                }) {
                                Icon(imageVector = Icons.Default.Add, contentDescription = "",modifier = Modifier.size(26.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ShowHome(homeviewmodel: HomeViewModel) {
    LazyColumn(

    ){
        items(homeviewmodel.listaPeliculas.value!!.size){ index ->
            val pelicula= homeviewmodel.listaPeliculas.value!![index]
            CardPeli(pelicula)
        }
    }
}

@Composable
fun ShowFav() {

}

@Composable
fun TopBar() {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "...",
                    tint = Color.White
                )
            }
        },
        title = {
            Text(
                "MonkeyFilms",
                color = Color.White
            )
        },
        backgroundColor = Color.Magenta,
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "...",
                    tint = Color.White
                )
            }
        }
    )
}

@Composable
fun BottomBar(
    showHome: () -> Unit,
    showFav: () -> Unit,
) {
    BottomNavigation(
        backgroundColor = Color.Magenta
    ) {
        IconButton(onClick = { showHome() }) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "...",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )
        }

        IconButton(onClick = { showFav() }) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "...",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}