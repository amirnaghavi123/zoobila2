package com.amirnaghavi.quiz_activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Instructions extends ActionBarActivity {

    Button playbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);


        playbtn = (Button)findViewById(R.id.play_btn);
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Instructions.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }




}
