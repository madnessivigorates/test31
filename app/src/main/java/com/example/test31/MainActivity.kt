package com.example.test31

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test31.ui.theme.Test31Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onStart() {
        super.onStart()


    }
    override fun onPause() {
        super.onPause()

    }
    override fun onStop() {
        super.onStop()

    }

    override fun onResume() {
        super.onResume()
        // Работа с преобразованием строк
        val word1 = "Hello"
        val word2 = "Kotlin"
        val sentence = word1 + ", " + word2 + "!"
        println(sentence)
        // Базовая арифметика и вывод результата в консоль
        val a = 10
        val b = 4
        println(a*b-a%b+a/b)

        // Примеры интерполяции строк
        val k = 10
        val l = 5
        val sumMessage = "Сумма чисел $k и $l равна ${k + l}."
        println(sumMessage)

        val name = "Саша"
        val age = 25
        val message = "Меня зовут $name и мне $age лет"
        println(message)

        // Преобразование типов
        // Преобразование числа в строку
        val number1 = 42
        val numberAsString = number1.toString()
        println("Число как строка: $numberAsString")

        // Преобразование строки в число
        val str = "123"
        val strToInt = str.toInt()
        println("Строка как число: $strToInt")

        // Пример условных операторов (if else)
        val x = 10
        val y = 5
        if (x > y) {
            println("x больше y")
        } else {
            println("x меньше или равно y")
        }

        // Пример цикла for
        for (i in 1..3) {
            println("Номер $i")
        }

        // Пример цикла while
        var i = 1
        while (i <= 4) {
            println("$i")
            i++
        }

        // Пример создания отдельной функции
        //val array = intArrayOf(1, 2, 3, 4, 5)
        //printArray(array)

        // Пример работы с массивом
        val fruits = arrayOf("Вишня", "Манго", "Мандарин")
        for (fruit in fruits) {
            println(fruit)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Test31Theme {
        Greeting("Android")
    }
}