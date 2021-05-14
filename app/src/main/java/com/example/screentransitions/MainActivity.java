package com.example.screentransitions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeButton = findViewById(R.id.change_btn);

        //ボタン押下時
        changeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //SubActivityに画面遷移
                Intent intent = new Intent(getApplication(), SubActivity.class);
                startActivity(intent);
            }
        });
    }
}