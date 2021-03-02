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
        ArrayList<Word> words = new ArrayList<Word>();

        Word w = new Word("one","lutti");
        words.add(w);
        words.add(new Word("two","ottiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));


        //defining a array-adapter to recycle the view
        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}