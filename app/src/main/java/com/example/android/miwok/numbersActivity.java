package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        /**
         * we added the word class so now we can use the word class /entity inplace of string
         * in our arraylist so that we can incoperate both the default and the miwok words
         */
        ArrayList<Word> numbers = new ArrayList<Word>();

        Word w = new Word("one","lutti",R.drawable.number_two);
        numbers.add(w);
        numbers.add(new Word("two","ottiko",R.drawable.number_two));
        numbers.add(new Word("three","tolookosu",R.drawable.number_three));
        numbers.add(new Word("four","oyyisa",R.drawable.number_four));
        numbers.add(new Word("five","massokka",R.drawable.number_five));
        numbers.add(new Word("six","temmokka",R.drawable.number_six));
        numbers.add(new Word("seven","kenekaku",R.drawable.number_seven));
        numbers.add(new Word("eight","kawinta",R.drawable.number_eight));
        numbers.add(new Word("nine","wo'e",R.drawable.number_nine));
        numbers.add(new Word("ten","na'aacha",R.drawable.number_ten));


        //defining a array-adapter to recycle the view
        WordAdapter itemsAdapter = new WordAdapter(this, numbers,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        
    }
}