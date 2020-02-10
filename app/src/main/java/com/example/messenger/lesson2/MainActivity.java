package com.example.messenger.lesson2;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    private EditText editTextMsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMsg = findViewById(R.id.editTextMessage);
        ImageView myView = findViewById(R.id.myView);
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(myView);




    }

    public void onClickSendmsg(View view) {
        String msg = editTextMsg.getText().toString();

        Intent intent = new Intent(this, RecievedMessageActivity.class);
         intent.putExtra("msg", msg);
        startActivity(intent);
    }
}
