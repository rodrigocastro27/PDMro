package com.example.rocalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.rocalculator.ui.theme.RocalculatorTheme
import kotlin.math.pow
import kotlin.math.sqrt


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RocalculatorTheme() {
                CreateButton()
            }
        }
    }
}

@Composable
fun CreateButton() {
    var display by remember { mutableStateOf("") }
    var firstOperand by remember { mutableStateOf("") }
    var secondOperand by remember { mutableStateOf("") }
    var operator by remember { mutableStateOf<String?>(null) }
    var isNewOperation by remember { mutableStateOf(false) } // Novo controle para nova operação




    Column {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column {
                Button(onClick = {}) { Text("MRC") }
                Button(onClick = {}) { Text("√") }
                Button(onClick = { }) { Text("7") }
                Button(onClick = { }) { Text("4") }
                Button(onClick = { }) { Text("1") }
                Button(onClick = { }) { Text("0") }
            }


            Column {
                Button(onClick = {}) { Text("M-") }
                Button(onClick = {}) { Text("%") }
                Button(onClick = { }) { Text("8") }
                Button(onClick = { }) { Text("5") }
                Button(onClick = { }) { Text("2") }
                Button(onClick = { }) { Text(".") }
            }


            Column {
                Button(onClick = {}) { Text("M+") }
                Button(onClick = { }) { Text("+/-") }
                Button(onClick = { }) { Text("9") }
                Button(onClick = { }) { Text("6") }
                Button(onClick = {  }) { Text("3") }
                Button(onClick = { }) { Text("=") }
            }


            Column {
                Button(onClick = {}) { Text("ON/C") }
                Button(onClick = { }) { Text("CE") }
                Button(onClick = { }) { Text("/") }
                Button(onClick = { }) { Text("*") }
                Button(onClick = { }) { Text("-") }
                Button(onClick = { }) { Text("+") }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CreateButton()
}