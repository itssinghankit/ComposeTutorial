package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
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
            Say_hello("ankit")

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
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