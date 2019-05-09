package com.example.android.kidslearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<MyList> {

    public MyAdapter(Context context, ArrayList<MyList> list) {
        super(context, 0, list);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        MyList currentList = getItem(position);

        ImageView Alphabet=listItemView.findViewById(R.id.image1);
        ImageView Word =listItemView.findViewById(R.id.image2);
        ImageView Number =listItemView.findViewById(R.id.image3);
        TextView Phrase = listItemView.findViewById(R.id.text1);


        Alphabet.setImageResource(currentList.getAlphabetImageID());
        Word.setImageResource(currentList.getWordImageID());
        Number.setImageResource(currentList.getNumberImageID());
        Phrase.setText(currentList.getPhrase());


        return listItemView;
    }
}
