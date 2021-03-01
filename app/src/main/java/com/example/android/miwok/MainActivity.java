package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        TextView family = findViewById(R.id.family);
        TextView phrases = findViewById(R.id.phrases);
        TextView colors = findViewById(R.id.colors);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "opening Numbers",
                        Toast.LENGTH_SHORT);
                toast.show();
                openNumbersList(v);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "opening family ",
                        Toast.LENGTH_SHORT);
                toast.show();
                openfamilylist(v);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "opening phrases",
                        Toast.LENGTH_SHORT);
                toast.show();
                openphraseslist(v);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "opening colors",
                        Toast.LENGTH_SHORT);
                toast.show();
                openColorslist(v);
            }
        });
    }

    public void openNumbersList(View view) {
        //todo
        Intent i=new Intent(this, numbersActivity.class);
        startActivity(i);
    }

    public void openfamilylist(View view) {
        Intent i=new Intent(this, familyactivity.class);
        startActivity(i);
    }

    public void openColorslist(View view) {
        Intent i=new Intent(this, colorsactivity.class);
        startActivity(i);
    }

    public void openphraseslist(View view) {
        Intent i=new Intent(this, phrasesactivity.class);
        startActivity(i);
    }
}