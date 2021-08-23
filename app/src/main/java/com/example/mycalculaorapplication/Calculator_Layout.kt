package com.example.mycalculaorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import kotlinx.android.synthetic.main.activity_calculator__layout.*

class Calculator_Layout : AppCompatActivity() {

////
//    val Button : b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bdiv,bmul,bdot;
//    val Textview ans;
//    var 1, var 2 : double;
//    val boolean add,div,mul,sub;


//    var digit_on_screen = StringBuilder()
//    var operation: Char = ' '
//    var leftHandSide: Double = 0.0
//    var rightHandSide: Double = 0.0


    /* n1.setOnclickListener {
        appendOnExpression( "1" , canClear = true)
    }
*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator__layout)

//        n1.setOnClickListener {
//            ("1", canClear true)
//        }
//
//        fun evaluateExpression(string: String, canClear: Boolean){
//            if(textArea.text.isNotEmpty()) {
//                textArea.text= ""
//            }
//            if(canClear){
//                textResult.text = ""
//                textArea.append(string)
//            }
//            else {
//                textArea.append(textResult.text)
//                textArea.append(string)
//                textResult.text = ""
//            }
//        }

//
//        class MainActivity : AppCompatActivity() {
//
//            override fun onCreate(savedInstanceState: Bundle?) {
//                super.onCreate(savedInstanceState)
//                setContentView(R.layout.activity_main)


                /*Number Buttons*/

                n1.setOnClickListener {
                    evaluateExpression("1", clear = true)
                }

                n2.setOnClickListener {
                    evaluateExpression("2", clear = true)
                }

                n3.setOnClickListener {
                    evaluateExpression("3", clear = true)
                }
                n4.setOnClickListener {
                    evaluateExpression("4", clear = true)
                }

                n5.setOnClickListener {
                    evaluateExpression("5", clear = true)
                }

                n6.setOnClickListener {
                    evaluateExpression("6", clear = true)
                }

                n7.setOnClickListener {
                    evaluateExpression("7", clear = true)
                }

                n8.setOnClickListener {
                    evaluateExpression("8", clear = true)
                }

                n9.setOnClickListener {
                    evaluateExpression("9", clear = true)
                }

                n0.setOnClickListener {
                    evaluateExpression("0", clear = true)
                }

                /*Operators*/

                addition.setOnClickListener {
                    evaluateExpression("+", clear = true)
                }

                minus.setOnClickListener {
                    evaluateExpression("-", clear = true)
                }

                multiply.setOnClickListener {
                    evaluateExpression("*", clear = true)
                }

                division.setOnClickListener {
                    evaluateExpression("/", clear = true)
                }

                dot.setOnClickListener {
                    evaluateExpression(".", clear = true)
                }

                clear.setOnClickListener {
                    textArea.text = ""
                    textResult.text = ""
                }

                equal.setOnClickListener {
                    val text = textArea.text.toString()
                    val expression = ExpressionBuilder(text).build()

                    val result = expression.evaluate()
                    val longResult = result.toLong()
                    if (result == longResult.toDouble()) {
                        textResult.text = longResult.toString()
                    } else {
                        textResult.text = result.toString()
                    }
                }

                Delete.setOnClickListener {
                    val text = textArea.text.toString()
                    if (text.isNotEmpty()) {
                        textArea.text = text.drop(1)
                    }

                    textResult.text = ""
                }
            }

            /*Function to calculate the expressions using expression builder library*/

            private fun evaluateExpression(string: String, clear: Boolean) {
                if (clear) {
                    textResult.text = ""
                    textArea.append(string)
                } else {
                    textArea.append(textResult.text)
                    textArea.append(string)
                    textResult.text = ""
                }
            }
        }

        /*textArea.text = "0"

        initializeButtons()
    }

    private fun initializeButtons() {
        functionalButtons()
        operationalButtons()
        numericalButtons()
    }

    *//**
     * This function initializes all of our numerical buttons from
     *  [0 - 9]
     *//*
    private fun numericalButtons() {

        n1.setOnClickListener {
            appendToDigitOnScreen("1")
        }

        n2.setOnClickListener {
            appendToDigitOnScreen("2")
        }

        n3.setOnClickListener {
            appendToDigitOnScreen("3")
        }

        n4.setOnClickListener {
            appendToDigitOnScreen("4")
        }

        n5.setOnClickListener {
            appendToDigitOnScreen("5")
        }

        n6.setOnClickListener {
            appendToDigitOnScreen("6")
        }

        n7.setOnClickListener {
            appendToDigitOnScreen("7")
        }

        n8.setOnClickListener {
            appendToDigitOnScreen("8")
        }

        n9.setOnClickListener {
            appendToDigitOnScreen("9")
        }

        n0.setOnClickListener {
            appendToDigitOnScreen("0")
        }

        dot.setOnClickListener {
            appendToDigitOnScreen(".")
        }


    }

    *//**
     *  Insert the button been clicked onto the screen so user can see
     *  inputs for the button clicked
     *//*
    private fun appendToDigitOnScreen(digit: String) {

        // Add each digit to our string builder
        digit_on_screen.append(digit)

        // display it on the screen of our mobile app
        textArea.text = digit_on_screen.toString()
    }

    *//**
     *  Initialize the operation keys in our calculator like the
     *  addition key, subtraction key and the likes
     *//*
    private fun operationalButtons() {

        addition.setOnClickListener {
            selectOperation('A')
        }

        minus.setOnClickListener {
            selectOperation('B')
        }

        division.setOnClickListener {
            selectOperation('D')
        }

        multiply.setOnClickListener {
            selectOperation('M')
        }

    }

    *//**
     * Function to assign operational sign to our math calculations
     *//*
    private fun selectOperation(c: Char) {

        operation = c
        leftHandSide = digit_on_screen.toString().toDouble()
        digit_on_screen.clear()
        textArea.text = "0"
    }

    *//**
     * Handles functional operations in out application like
     * clear button, backspace button and the clear everything button
     *//*
    private fun functionalButtons() {

        clear.setOnClickListener {
            digit_on_screen.clear()
        }

        clear.setOnClickListener {
            clearDigit()
        }

        History.setOnClickListener {
            clearDigit()
        }

        equal.setOnClickListener {
            performMathOperation()
        }

    }


    *//**
     *  This function performs our Math Operation which is then showed on the screen.
     *//*
    private fun performMathOperation() {

        rightHandSide = digit_on_screen.toString().toDouble()
        digit_on_screen.clear()

        when (operation) {

            'A' -> {
                val sum = operation.addition(leftHandSide, rightHandSide)
                textArea.text = sum.toString()
                digit_on_screen.append(sum)
            }
            'S' -> {
                val subtract = operation.minus(leftHandSide, rightHandSide)
                textArea.text = subtract.toString()
                digit_on_screen.append(subtract)
            }
            'M' -> {
                val multiply = operation.multiply(leftHandSide, rightHandSide)
                textArea.text = multiply.toString()
                digit_on_screen.append(multiply)
            }
            'D' -> {
                val divide = operation.toFloat(leftHandSide, rightHandSide)
                textArea.text = divide.toString()
                digit_on_screen.append(divide)
            }

        }

    }

    *//**
     *  This function remove the last digit on the screen.
     *//*
    private fun clearDigit() {

        val length = digit_on_screen.length

        digit_on_screen.deleteCharAt(length - 1)
        textArea.text = digit_on_screen.toString()

    }

}

private fun Char.toFloat(leftHandSide: Double, rightHandSide: Double) {

}

private fun Char.multiply(leftHandSide: Double, rightHandSide: Double) {

}

private fun Char.addition(leftHandSide: Double, rightHandSide: Double) {

}

private fun Char.minus(leftHandSide: Double, rightHandSide: Double) {

}

//        val b1: Button = findViewById(R.id.n0);
//        val b2: Button = findViewById(R.id.n1);
//        val b3: Button = findViewById(R.id.n2);
//        val b4: Button = findViewById(R.id.n3);
//        val b5: Button = findViewById(R.id.n4);
//        val b6: Button = findViewById(R.id.n5);
//        val b7: Button = findViewById(R.id.n6);
//        val b8: Button = findViewById(R.id.n7);
//        val b9: Button = findViewById(R.id.n8);
//        val b0: Button = findViewById(R.id.n9);
//        val badd: Button = findViewById(R.id.addition);
//        val bdiv: Button = findViewById(R.id.division);
//        val bmul: Button = findViewById(R.id.multiply);
//        val bsub: Button = findViewById(R.id.minus);
//        val bdot: Button = findViewById(R.id.dot);
//        val ans: TextView = findViewById(R.id.textArea);
//
//        b1.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("1" + ans.getText())
//            }
//        });
//
//        b2.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("2" + ans.getText())
//            }
//        });
//
//        b3.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("3" + ans.getText())
//            }
//        });
//
//        b4.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("4" + ans.getText())
//            }
//        });
//
//        b5.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("5" + ans.getText())
//            }
//        });
//
//        b6.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("6" + ans.getText())
//            }
//        });
//
//        b7.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("7" + ans.getText())
//            }
//        });
//
//        b8.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("8" + ans.getText())
//            }
//        });
//
//        b9.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("9" + ans.getText())
//            }
//        });
//
//        bdot.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                ans.setText("." + ans.getText())
//            }
//        });

//        badd.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                var var1 = double.parseDouble("" + ans.getText());
//                var add = true;
//                ans.setText(null);
//            }
//        });
//
//        bsub.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v : View) {
//                var var1 = double.parseDouble("" - ans.getText());
//                var add = true;
//                ans.setText(null);
//            }
//        });



//        val textArea: TextView = findViewById(R.id.textArea);
//        val n0: Button = findViewById<Button>(R.id.n0)
//        val n1: Button = findViewById(R.id.n1);
//        val n2: Button = findViewById(R.id.n2);
//        val n3: Button = findViewById(R.id.n3);
//        val n4: Button = findViewById(R.id.n4);
//        val n5: Button = findViewById(R.id.n5);
//        val n6: Button = findViewById(R.id.n6);
//        val n7: Button = findViewById(R.id.n7);
//        val n8: Button = findViewById(R.id.n8);
//        val n9: Button = findViewById(R.id.n9)
//        val dot: Button = findViewById(R.id.dot);
//        val equal: Button = findViewById(R.id.equal);
//        val division: Button = findViewById(R.id.division);
//        val addition: Button = findViewById(R.id.addition);
//        val minus: Button = findViewById(R.id.minus);
//
//        View.onClickListener textArea = new View.onClickListener() {
//            public void onClick(View v) {
//                int id = v.getId();
//                switch(id) {textArea
//                    case R.id.n1
//                }
//            }
//        }

//        n0.setOnClickListener (this);
//        public void onClick(View view)
//        {
//            switch (view.getId()) {
//                case R.id.n0;
//            }
//        }

//
//    }
//}
//});
//private operator fun String.minus(text: CharSequence?): Any {}
*/