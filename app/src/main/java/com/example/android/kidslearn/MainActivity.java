package com.example.android.kidslearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    protected TextView alphabetsTextView,numbersTextView,phrasesTextView;

    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphabetsTextView=findViewById(R.id.alphabets);
        numbersTextView=findViewById(R.id.numbers);
        phrasesTextView=findViewById(R.id.phrases);

        alphabetsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,AlphabetActivity.class);

                startActivity(intent);



            }
        });


        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent= new Intent(MainActivity.this,NumbersActivity.class);

                startActivity(intent);


            }
        });



        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent= new Intent(MainActivity.this,PhrasesActivity.class);

                startActivity(intent);


            }
        });




    }
}
