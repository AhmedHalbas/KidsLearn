package com.example.android.kidslearn;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<MyList> list = new ArrayList<MyList>();

        list.add(new MyList(R.drawable.one, R.raw.one));
        list.add(new MyList(R.drawable.two, R.raw.two));
        list.add(new MyList(R.drawable.three, R.raw.three));
        list.add(new MyList(R.drawable.four, R.raw.four));
        list.add(new MyList(R.drawable.five, R.raw.five));
        list.add(new MyList(R.drawable.six, R.raw.six));
        list.add(new MyList(R.drawable.seven, R.raw.seven));
        list.add(new MyList(R.drawable.eight, R.raw.eight));
        list.add(new MyList(R.drawable.nine, R.raw.nine));
        list.add(new MyList(R.drawable.ten, R.raw.ten));


        MyAdapter adapter = new MyAdapter(this, list);


        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setBackgroundColor(getResources().getColor(R.color.colorNumber));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {

                releaseMediaPlayer();

                MyList mylist_audio = list.get(index);

                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, mylist_audio.getNumberAudioID());

                mMediaPlayer.start();

            }
        });


    }


    @Override
    protected void onPause() {
        super.onPause();
        releaseMediaPlayer();
    }



    private void releaseMediaPlayer() {

        if (mMediaPlayer != null) {

            mMediaPlayer.release();



            mMediaPlayer = null;

        }
    }


}
