package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    app()
                }
            }
        }
    }
}

@Composable
fun app(){
    Column(
        Modifier
            .background(Color.Black)
            .fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center) {
            Text(text = "App de noticias")
        }
        Row(Modifier.padding(8.dp)) {
        }
        Column(Modifier
            .background(Color.Gray)) {
            Row(
                Modifier

                    .fillMaxWidth(),
            ) {
                Text(text = "Titulo da noticia")
            }
            Row(
                Modifier
                    .fillMaxWidth(),
            ) {
                Text(text = "Descrição breve da Noticia")
            }
            Row(
                Modifier
                    .fillMaxWidth(),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Saiba mais")
                }
            }
        }
        Row(Modifier.padding(8.dp)) {
        }
        Column(Modifier
            .background(Color.Gray)) {
            Row(
                Modifier

                    .fillMaxWidth(),
            ) {
                Text(text = "Titulo da noticia")
            }
            Row(
                Modifier
                    .fillMaxWidth(),
            ) {
                Text(text = "Descrição breve da Noticia")
            }
            Row(
                Modifier
                    .fillMaxWidth(),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Saiba mais")
                }
            }
        }
    }
}

@Composable
@Preview
fun appPreview(){
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            app()
        }
    }
}