package com.example.composetutorial

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PreviewFunction() {
//    Item(R.drawable.a, "Ankit Singh", "Software Engineers")
//    Column(modifier=Modifier.verticalScroll(rememberScrollState())) {
//        getCatagoryList().map {
//            item->
//            Item(imgID = item.image, name = item.name, occupation = item.occupation)
//        }
//    }
    LazyColumn(content = {
       items(getCatagoryList()){
           Item(imgID = it.image, name = it.name, occupation = it.occupation)
       }
    })
}


@Composable
fun Item(imgID: Int, name: String, occupation: String) {
    Card(modifier = Modifier.padding(8.dp), elevation = CardDefaults.cardElevation(4.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(imgID),
                contentDescription = "",
                modifier = Modifier
                    .size(60.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ContentDescription(name, occupation, Modifier.weight(.8f))
        }

    }
}

@Composable
private fun ContentDescription(name: String, occupation: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = name,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.SemiBold
        )
        Text(text = occupation, fontSize = 18.sp, fontWeight = FontWeight.Thin)

    }
}

data class listItems(val image:Int, val name:String, val occupation: String)

fun getCatagoryList():List<listItems>{
    val list= mutableListOf<listItems>()
    list.add(listItems(R.drawable.a,"Ankit Singh","Software Engineer"))
    list.add(listItems(R.drawable.a,"Akshat pratap","Software Engineer"))
    list.add(listItems(R.drawable.a,"Pushkar khare","Software Engineer"))
    list.add(listItems(R.drawable.a,"Parv Mittal","Software Engineer"))
    list.add(listItems(R.drawable.a,"Deeksha gupta","Software Engineer"))
    list.add(listItems(R.drawable.a,"Aarke Tripathi","Software Engineer"))
    list.add(listItems(R.drawable.a,"Raghav Awasti","Software Engineer"))
    list.add(listItems(R.drawable.a,"Divyanshu rana","Software Engineer"))
    list.add(listItems(R.drawable.a,"Billa singh","Software Engineer"))
    list.add(listItems(R.drawable.a,"Jodha begum","Software Engineer"))
    list.add(listItems(R.drawable.a,"Deeksha gupta","Software Engineer"))
    list.add(listItems(R.drawable.a,"Aarke Tripathi","Software Engineer"))
    list.add(listItems(R.drawable.a,"Raghav Awasti","Software Engineer"))
    list.add(listItems(R.drawable.a,"Divyanshu rana","Software Engineer"))
    list.add(listItems(R.drawable.a,"Billa singh","Software Engineer"))
    list.add(listItems(R.drawable.a,"Jodha begum","Software Engineer"))

    return list
}