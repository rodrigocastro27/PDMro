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


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RocalculatorTheme {
                Calculator()
            }
        }
    }
}

@Composable
fun Calculator() {
    var display by remember { mutableStateOf("") }
    var firstValue by remember { mutableStateOf("")}
    var secondValue by remember { mutableStateOf("")}
    var operator by remember { mutableStateOf<String?>(null)}
    var newCalculation by remember { mutableStateOf(false)}


    fun completeClear(){
        display = ""
        firstValue = ""
        secondValue = ""
        operator = ""
        newCalculation = false
    }

    fun clearLastValue(){

    }
    fun getNumber(number: String) {

        if(!newCalculation){
            completeClear()
        }

        if (operator == null) {
            firstValue += number
            display = firstValue
        } else {
            secondValue += number
            display = secondValue
        }
    }

 fun Calculate() {
        val num1 = firstValue.toDoubleOrNull()
        val num2 = secondValue.toDoubleOrNull()

        if (num1 != null && operator != null) {
            display = when (operator) {
                "+" -> (num1 + (num2 ?: 0.0)).toString()
                "-" -> (num1 - (num2 ?: 0.0)).toString()
                "*" -> (num1 * (num2 ?: 1.0)).toString()
                "/" -> if (num2 != null && num2 != 0.0) (num1 / num2).toString() else "Error"
                "^" -> num1.pow(num2 ?: 1.0).toString()
                else -> "Error"
            }
            firstValue = display
            secondValue = ""
            operator = null
            newCalculation= true
        }
    }


    Column {

        TextField(value = display, onValueChange = {}, readOnly = true)

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column {
                Button(onClick = {}) { Text("MRC") }
                Button(onClick = {}) { Text("√") }
                Button(onClick = {getNumber("7")}) { Text("7") }
                Button(onClick = {getNumber("4")}) { Text("4") }
                Button(onClick = {getNumber("1")}) { Text("1") }
                Button(onClick = {getNumber("0")}) { Text("0") }
            }


            Column {
                Button(onClick = {}) { Text("M-") }
                Button(onClick = {}) { Text("%") }
                Button(onClick = {getNumber("8")}) { Text("8") }
                Button(onClick = {getNumber("5")}) { Text("5") }
                Button(onClick = {getNumber("2")}) { Text("2") }
                Button(onClick = {}) { Text(".") }
            }


            Column {
                Button(onClick = {}) { Text("M+")}
                Button(onClick = {}) { Text("+/-") }
                Button(onClick = {getNumber("9")}) { Text("9") }
                Button(onClick = {getNumber("6")}) { Text("6") }
                Button(onClick = {getNumber("3")}) { Text("3") }
                Button(onClick = {}) { Text("=") }
            }


            Column {
                Button(onClick = {completeClear()}) { Text("ON/C") }
                Button(onClick = {clearLastValue()}) { Text("CE") }
                Button(onClick = {}) { Text("/") }
                Button(onClick = {}) { Text("*") }
                Button(onClick = {}) { Text("-") }
                Button(onClick = {}) { Text("+") }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    Calculator()
}