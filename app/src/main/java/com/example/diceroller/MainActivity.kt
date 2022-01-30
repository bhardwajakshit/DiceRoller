package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var rollBtn:Button
    private lateinit var diceNUm:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceNUm = findViewById(R.id.dice_num)

        rollBtn = findViewById(R.id.roll_btn)

        rollBtn.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        var randomInt:Int = Random().nextInt(6)+1

        diceNUm.text= randomInt.toString()

        Toast.makeText(this,"DiceRolled!",Toast.LENGTH_SHORT).show()
    }
}