package com.example.dice.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button rollButton;

        rollButton = (Button) findViewById(R.id.rollButton);

       final ImageView leftDice;
        leftDice=(ImageView) findViewById(R.id.leftdice);

       final ImageView rightDice;
        rightDice=(ImageView) findViewById(R.id.rightdice);

        final int Dicearray[]={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("dice","The button is clicked");

                Random randomnumber=new Random();
                int number=randomnumber.nextInt(6);
                Log.d("dice","The random Number is"+number);

                leftDice.setImageResource(Dicearray[number]);
                number=randomnumber.nextInt(6);
                rightDice.setImageResource(Dicearray[number]);
            }
        });
    }
}