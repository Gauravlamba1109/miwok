package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        final ArrayList<Word> numbers = new ArrayList<Word>();

        Word w = new Word("one","lutti",R.drawable.number_one,R.raw.number_one);
        numbers.add(w);
        numbers.add(new Word("two","ottiko",R.drawable.number_two,R.raw.number_two));
        numbers.add(new Word("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        numbers.add(new Word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        numbers.add(new Word("five","massokka",R.drawable.number_five,R.raw.number_five));
        numbers.add(new Word("six","temmokka",R.drawable.number_six,R.raw.number_six));
        numbers.add(new Word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        numbers.add(new Word("eight","kawinta",R.drawable.number_eight,R.raw.number_seven));
        numbers.add(new Word("nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        numbers.add(new Word("ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));


        //defining a array-adapter to recycle the view
        WordAdapter itemsAdapter = new WordAdapter(this, numbers,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numbers.get(position);
                Toast.makeText(numbersActivity.this,"Playing Audio of the word",Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(numbersActivity.this, word.getAudioResorceId());
                mediaPlayer.start();
            }
        });
    }
}