package com.example.android.kidslearn;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class AlphabetActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);



        final ArrayList<MyList> list = new ArrayList<MyList>();

        list.add(new MyList(R.drawable.a,R.drawable.apple,R.raw.apple));
        list.add(new MyList(R.drawable.b,R.drawable.ball,R.raw.ball));
        list.add(new MyList(R.drawable.c,R.drawable.car,R.raw.car));
        list.add(new MyList(R.drawable.d,R.drawable.dog,R.raw.dog));
        list.add(new MyList(R.drawable.e,R.drawable.elephant,R.raw.elephant));
        list.add(new MyList(R.drawable.f,R.drawable.frog,R.raw.frog));
        list.add(new MyList(R.drawable.g,R.drawable.goose,R.raw.goose));
        list.add(new MyList(R.drawable.h,R.drawable.horse,R.raw.horse));
        list.add(new MyList(R.drawable.i,R.drawable.icecream,R.raw.ice_cream));
        list.add(new MyList(R.drawable.j,R.drawable.juice,R.raw.juice));
        list.add(new MyList(R.drawable.k,R.drawable.kite,R.raw.kite));
        list.add(new MyList(R.drawable.l,R.drawable.lemon,R.raw.lemon));
        list.add(new MyList(R.drawable.m,R.drawable.map,R.raw.map));
        list.add(new MyList(R.drawable.n,R.drawable.nuts,R.raw.nuts));
        list.add(new MyList(R.drawable.o,R.drawable.ostrich,R.raw.ostrich));
        list.add(new MyList(R.drawable.p,R.drawable.pigeon,R.raw.pigeon));
        list.add(new MyList(R.drawable.q,R.drawable.queen,R.raw.queen));
        list.add(new MyList(R.drawable.r,R.drawable.rainbow,R.raw.rainbow));
        list.add(new MyList(R.drawable.s,R.drawable.sheep,R.raw.sheep));
        list.add(new MyList(R.drawable.t,R.drawable.turkey,R.raw.turkey));
        list.add(new MyList(R.drawable.u,R.drawable.umbrella,R.raw.umbrella));
        list.add(new MyList(R.drawable.v,R.drawable.violin,R.raw.violin));
        list.add(new MyList(R.drawable.w,R.drawable.water,R.raw.water));
        list.add(new MyList(R.drawable.x,R.drawable.xylophone,R.raw.xylophone));
        list.add(new MyList(R.drawable.y,R.drawable.yoyo,R.raw.yoyo));
        list.add(new MyList(R.drawable.z,R.drawable.zebra,R.raw.zebra));

        MyAdapter adapter=new MyAdapter(this,list);


        ListView listView=findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setBackgroundColor(getResources().getColor(R.color.colorAlphabet));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {

                releaseMediaPlayer();

                MyList mylist_audio = list.get(index);

                mMediaPlayer = MediaPlayer.create(AlphabetActivity.this, mylist_audio.getWordAudioID());

                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {

                        releaseMediaPlayer();

                    }
                });

            }
        });






    }


    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }



    private void releaseMediaPlayer() {

        if (mMediaPlayer != null) {

            mMediaPlayer.release();

            mMediaPlayer = null;

        }
    }
}
