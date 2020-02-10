package com.example.messenger.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class RecievedMessageActivity extends AppCompatActivity {
private TextView textViewReceivedMsg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);
        textViewReceivedMsg=findViewById(R.id.textViewReceivedMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewReceivedMsg.setText(msg);



        final ImageButton imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            boolean b = true;
            int a = 0;
            @Override
            public void onClick(View v) {
                if (a % 2 == 0) {
                    imageButton.setImageResource(R.mipmap.mypic);
                    a++;
                }
                else {
                    imageButton.setImageResource(R.mipmap.bar);
                    a++;
                }
            }
        });




    }

    public void onClickGoBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);



    }


}
