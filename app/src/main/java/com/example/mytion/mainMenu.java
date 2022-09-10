package com.example.mytion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button changeVote_button = findViewById(R.id.button_vote);
//        Button result_button = findViewById(R.id.button_result);
        Button close_button = findViewById(R.id.button_close);
    }

    public void startChangeVote(View view) {
        Intent intent = new Intent(this, vote.class);
        startActivity(intent);
    }

//    public void startResult(View view) {
//        Intent intent = new Intent(this, result.class);
//        startActivity(intent);
//    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}