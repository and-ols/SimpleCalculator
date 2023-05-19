package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        math()

    }

    // This function will do our math
    private fun math() {
        // The first number
        var numberFirst = findViewById<EditText>(R.id.firstNumber)
        // The second number
        var numberSecond = findViewById<EditText>(R.id.secondNumber)
        // The add button
        var buttonAdd = findViewById<Button>(R.id.addButton)
        // The subtract button
        var buttonSubtract = findViewById<Button>(R.id.subtractButton)
        // The multiply button
        var buttonMultiply = findViewById<Button>(R.id.multiplyButton)
        // The divide button
        var buttonDivide = findViewById<Button>(R.id.divideButton)
        // The clear button
        var buttonClear = findViewById<Button>(R.id.clearButton)

        // When we click on the button...
        buttonAdd.setOnClickListener{
            // This converts the numbers from a string to an integer
            var addNumberFirst = numberFirst.text.toString().toInt()
            var addNumberSecond = numberSecond.text.toString().toInt()

            // Do the math.
            var answer = addNumberFirst + addNumberSecond

            //Displays the text when the button is pressed.
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }

        // When we click on the button...
        buttonSubtract.setOnClickListener{
            // This converts the numbers from a string to an integer
            var subtractNumberFirst = numberFirst.text.toString().toInt()
            var subtractNumberSecond = numberSecond.text.toString().toInt()

            // Do the math.
            var answer = subtractNumberFirst - subtractNumberSecond



            //Displays the text when the button is pressed.
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }

        // When we click on the button...
        buttonMultiply.setOnClickListener{
            // This converts the numbers from a string to an integer
            var multiplyNumberFirst = numberFirst.text.toString().toInt()
            var multiplyNumberSecond = numberSecond.text.toString().toInt()

            // Do the math.
            var answer = multiplyNumberFirst * multiplyNumberSecond


            //Displays the text when the button is pressed.
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }

        // When we click on the button...
        buttonDivide.setOnClickListener{
            // This converts the numbers from a string to an integer
            var divideNumberFirst = numberFirst.text.toString().toInt()
            var divideNumberSecond = numberSecond.text.toString().toInt()

            // Do the math.
            var answer = divideNumberFirst / divideNumberSecond


            //Displays the text when the button is pressed.
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }


        // This will clear the text when it is pressed
        buttonClear.setOnClickListener{

            // Sets the text in the boxes to empty
            numberFirst.setText("");
            numberSecond.setText("");


            //Displays the text when the button is pressed.
            Toast.makeText(this,"Cleared",Toast.LENGTH_SHORT).show()
        }


    }

}