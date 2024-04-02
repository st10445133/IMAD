package com.app.myhistory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult =findViewById<TextView>(R.id.tvResult)

        btnClear.setOnClickListener {
            etAge.clear()
        }

        btnGenerate.setOnClickListener {
            val age = etAge.toString().toInt()

            //When user input matches the values in the case statement
            //information on historic figures will be displayed

            when(age){

                in 0..19 -> {tvResult.text = "Please enter an age between 20 and 100"
                }
                in 101..150 -> {tvResult.text = "Please enter an age between 20 and 100"
                }
                34 -> {tvResult.text = "You are the same age as Ayrton Senna, a Brazilian F1 driver" +
                                        " and 3 time F1 World Drivers' Championship"
                }
                50 -> {tvResult.text = "You are the same age as Micheal Jackson" +
                                        " best known as the King of Pop"
                }
                43 -> {tvResult.text = "You are the same age as Chadwick Boseman" +
                                        " best known for his role as The Black Panther"
                }
                26 -> {tvResult.text = "You are the same age as American artist, Mac Miller" +
                                        " he is best known as a songwriter and singer"
                }
                86 -> {tvResult.text = "You are the same age as Maya Angelou" +
                                    " best known as a poet , an actor and a civil rights activist"
                }
                69 -> {tvResult.text = "You are the same age as Gloria Jean Watkins" +
                                " best known by her pen name 'Bell Hooks'.7" +
                                " who was an author, theorist, educator and social critic"
                }
                35 -> {tvResult.text = "You are the same age as South African artist Kiernan Forbes" +
                                        " better known as 'AKA'"
                }
                39 -> {tvResult.text = "You are the same age as Brenda Fassie" +
                                " best known as a songwriter,dancer and activist"
                }
                60 -> {tvResult.text = "You are the same age as Diego Maradonna" +
                                        " best known as an Argentine footballer"
                }
                91 -> {tvResult.text = "You are the same age as Harriet Tubman" +
                                    " who was know =n for being an abolitionist and social activist"
                }
                40 -> {tvResult.text = "You are the same age as Paul Walker" +
                            " best known as an actor in the franchise Fast and Furious"
                }
                96 -> {tvResult.text = "You are the same age as Elizabeth the 2nd" +
                                        " previously known as the Queen of England"
                }
                41 -> {tvResult.text = "You are the the same age as basketball player Kobe Bryant" +
                                    " also known as 'The Black Mamba' "
                }
                else -> {tvResult.text = "There is no historic figure with that age in our database," +
                                        "please re-enter."
                }
                //CODE ATTRIBUTION
                //
                //
                //
                //
            }


        }




    }
}