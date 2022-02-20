package com.bluelzy.androidnewtechlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewStory()
        }
    }
}

@Composable
fun NewStory() {
    MaterialTheme {
        val typography = MaterialTheme.typography

        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "A day wandering through the sandhills " +
                        "in Shark Fin Cove, and a few of the sights I saw",
                style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text("Davenport, California", style = typography.body2)
            Text("December 2018", style = typography.body2)
        }
    }
}

@Composable
fun ListComposable(myList:List<String>) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Column {
            for (item in myList) {
                Text("Item: $item")
            }
        }
        Text("Count: ${myList.size}")
    }
}

@Preview
@Composable
fun PreviewListComposable() {
    val list = mutableListOf<String>()
    list.add("aaa")
    list.add("bbb")
    list.add("ccc")
    ListComposable(myList = list)
}

@Preview
@Composable
fun DefaultPreview() {
    NewStory()
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name")
}

@Preview
@Composable
fun PreviewGreeting() {
    Greeting(name = "Android")
}
