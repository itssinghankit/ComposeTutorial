package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Say_hello("ankit")
            PreviewFunction()

        }
    }
}

@Preview(showSystemUi = true, widthDp = 300, heightDp = 500)
@Composable
fun PreviewFunc() {
//    Column() {
//        RecyclerItem(R.drawable.a, "Ankit Singh", "Software Developer")
//        RecyclerItem(R.drawable.a, "Pushkar Khare", "Software Developer")
//        RecyclerItem(R.drawable.a, "Akshat Mishra", "Software Developer")
//        RecyclerItem(R.drawable.a, "Siddhant Gurung", "Software Developer")
//
//    }

    TextModifier()

}

@Composable
fun TextModifier() {
    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(20.dp)
            .padding(8.dp)
            .background(color = Color.Blue)
            .clip(CircleShape)
            .clickable { }
            .border(2.dp, Color.White)
    )

}

@Composable
fun RecyclerItem(imgId: Int, name: String, occupation: String) {
    Row(Modifier.padding(8.dp), horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = imgId), contentDescription = "", Modifier.size(60.dp))
        Column {
            Text(text = name, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text(text = occupation, fontSize = 18.sp, fontWeight = FontWeight.Thin)
        }
    }
}

@Composable
fun Boxi() {
    Box(contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.img), contentDescription = "hello")
        Text(text = "hello")
    }
}

@Composable
fun Rows() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "A")
        Text(text = "B")
    }
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "C")
        Text(text = "D")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Texti() {
    val state = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Name", color = Color.Blue) })
}


@Composable
fun Btton() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            containerColor = Color.Gray
        ),

        )
    {
        Text(text = "SUBMIT", fontSize = 24.sp)
    }
}

@Composable
fun Images() {
    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = "good question",
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Say_hello(name: String = "ankit singh") {
    Text(
        text = name,
        fontStyle = FontStyle.Italic,
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        modifier = Modifier.padding(24.dp)
    )
}