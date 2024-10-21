package com.example.pdmr02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pdmr02.ui.theme.Pdmr02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pdmr02Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) }
                    ExemploListadeStrings()
                }
            }
        }
    }
}



@Composable
fun ExemploListadeStrings (itemsList: List<String>){
    LazyColumn {
        items(itemsList) { item ->
            Text(text = item)

        }
    }
}



@Preview(showBackground = true)
@Composable
fun ExercisePreview() {
    Pdmr02Theme {
    }
}