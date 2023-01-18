package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Set variable for TextView
    TextView number1, number2, operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the TextView component at the Start of the app
        number1 = (TextView) findViewById(R.id.number1);
        number2 = (TextView) findViewById(R.id.number2);
        operator = (TextView) findViewById(R.id.operator);

    }

    public void clickEasy(View view) {
        Random random = new Random();
        int randomNumber = random.nextInt(9);
        Toast.makeText(this, "Your level is easy!", Toast.LENGTH_SHORT).show();
    }
    public void clickMedium(View view) {
        Toast.makeText(this, "Your level is medium!", Toast.LENGTH_SHORT).show();
    }
    public void clickHard(View view) {
        Toast.makeText(this, "Your level is hard!", Toast.LENGTH_SHORT).show();
    }
}