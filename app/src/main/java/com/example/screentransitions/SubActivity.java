package com.example.screentransitions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //activity_subレイアウトをセット
        setContentView(R.layout.activity_sub);

        Button returnButton = findViewById(R.id.return_first_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button returnButton2 = findViewById(R.id.return_second_btn);
        returnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SubActivityに画面遷移
                Intent intent = new Intent(getApplication(), ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}