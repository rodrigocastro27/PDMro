package com.example.rocalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rocalculator.ui.theme.RocalculatorTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RocalculatorTheme(){
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Calculator(text = "hello", onClick = )
                }
            }
        }
    }
}


@Composable
fun Calculator(text: String, onClick: () -> Unit) {
    Row() {
        Column() {
           Button(onClick = onClick){
               Text(text = text)
           }
        }
        Column() {

        }

        }
    }





@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    RocalculatorTheme {
        Calculator(text = "hello", onClick = onClick)
    }
}