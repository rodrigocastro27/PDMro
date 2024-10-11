package com.example.rocalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rocalculator.ui.theme.RocalculatorTheme


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
    val display by remember { mutableStateOf("") }



    Column {

        TextField(value = display, onValueChange = {}, readOnly = true, modifier = Modifier.fillMaxWidth())

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column {
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("MRC") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("√") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("7") }
                Button(onClick = { }, modifier = Modifier.padding(16.dp)) { Text("4") }
                Button(onClick = { }, modifier = Modifier.padding(16.dp)) { Text("1") }
                Button(onClick = { }, modifier = Modifier.padding(16.dp)) { Text("0") }
            }


            Column {
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("M-") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("%") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("8") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("5") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("2") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text(".") }
            }


            Column {
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("M+") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("+/-") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("9") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("6") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("3") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("=") }
            }


            Column {
                Button(onClick = {}, modifier = Modifier.padding(8.dp)) { Text("ON/C") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("CE") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("/") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("*") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("-") }
                Button(onClick = {}, modifier = Modifier.padding(16.dp)) { Text("+") }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CreateButton()
}