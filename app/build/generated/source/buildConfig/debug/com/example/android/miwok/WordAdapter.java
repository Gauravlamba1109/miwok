package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResorceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int ColorResorceId) {
        super(context, 0, words);
        mColorResorceId = ColorResorceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //if the existing view is being reused check , otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        Word currentword = getItem(position);
        TextView miwokTextView=(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentword.getMiwokTranslation());

        TextView defaultTextView=(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentword.getDefaultTranslation());

        ImageView imageassocia = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentword.hasImage()) {
            imageassocia.setImageResource(currentword.getImageResorceId());
            imageassocia.setVisibility(View.VISIBLE);              //we put this line because views get used and if there was no image in the prev object then we dont want it to affect the other or to say the next object in the list
        }else{
            //the setVisi GONE means that if there is no image view in the layout then the image view will neither show on the layout nor take space in the side
            imageassocia.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResorceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
