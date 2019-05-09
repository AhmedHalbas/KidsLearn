package com.example.android.kidslearn;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<MyList> list = new ArrayList<MyList>();

        list.add(new MyList("Thank you",R.raw.ph1));
        list.add(new MyList("You're welcome",R.raw.ph2));
        list.add(new MyList("That was kind",R.raw.ph3));
        list.add(new MyList("You are beautiful",R.raw.ph4));
        list.add(new MyList("That looks nice on you",R.raw.ph5));
        list.add(new MyList("I'm tired",R.raw.ph6));
        list.add(new MyList("Will you help me?",R.raw.ph7));
        list.add(new MyList("I appreciate you!",R.raw.ph8));
        list.add(new MyList("Will you forgive me?",R.raw.ph9));
        list.add(new MyList("I was wrong",R.raw.ph10));


        MyAdapter adapter = new MyAdapter(this, list);


        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setBackgroundColor(getResources().getColor(R.color.colorPhrase));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {

                releaseMediaPlayer();

                MyList mylist_audio = list.get(index);

                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, mylist_audio.getPhraseAudioID());

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
