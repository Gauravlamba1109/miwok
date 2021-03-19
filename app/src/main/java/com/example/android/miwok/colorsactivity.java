package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class colorsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorsactivity);
        ArrayList<Word> colors = new ArrayList<Word>();

        Word w = new Word("red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red);
        colors.add(w);
        colors.add(new Word("green","chokokki",R.drawable.color_green,R.raw.color_green));
        colors.add(new Word("brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        colors.add(new Word("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        colors.add(new Word("black","kululli",R.drawable.color_black,R.raw.color_black));
        colors.add(new Word("white","kelelli",R.drawable.color_white,R.raw.color_white));
        colors.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colors.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));



        //defining a array-adapter to recycle the view
        WordAdapter itemsAdapter = new WordAdapter(this, colors,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = colors.get(position);
                Toast.makeText(colorsactivity.this,"Playing Audio of the word",Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(colorsactivity.this, word.getAudioResorceId());
                mediaPlayer.start();
            }
        });
    }
}