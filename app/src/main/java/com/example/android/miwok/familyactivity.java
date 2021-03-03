package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familyactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> family = new ArrayList<Word>();

        Word w = new Word("father","әpә",R.drawable.family_father);
        family.add(w);
        family.add(new Word("mother","әṭa",R.drawable.family_mother));
        family.add(new Word("son","angsi",R.drawable.family_son));
        family.add(new Word("daughter","tune",R.drawable.family_daughter));
        family.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        family.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother ));
        family.add(new Word("older sister","teṭe",R.drawable.family_older_sister));
        family.add(new Word("younger siste","kolliti",R.drawable.family_younger_sister));
        family.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        family.add(new Word("grandfather","paapa",R.drawable.family_father));


        //defining a array-adapter to recycle the view
        WordAdapter itemsAdapter = new WordAdapter(this, family, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}