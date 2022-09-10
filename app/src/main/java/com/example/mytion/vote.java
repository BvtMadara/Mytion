package com.example.mytion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class vote extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);



        Spinner sp_vuz1 = findViewById(R.id.sp_vuz1);
        Spinner sp_vuz2 = findViewById(R.id.sp_vuz2);
        Spinner sp_vuz3 = findViewById(R.id.sp_vuz3);

        Spinner sp_napr1 = findViewById(R.id.sp_napr1);
        Spinner sp_napr2 = findViewById(R.id.sp_napr2);
        Spinner sp_napr3 = findViewById(R.id.sp_napr3);


        ArrayAdapter<String> adapter_vuz = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, vuz);
        adapter_vuz.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp_vuz1.setAdapter(adapter_vuz);
        sp_vuz2.setAdapter(adapter_vuz);
        sp_vuz3.setAdapter(adapter_vuz);


        ArrayAdapter<String> adapter_napr = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, napr);
        adapter_napr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp_napr1.setAdapter(adapter_napr);
        sp_napr2.setAdapter(adapter_napr);
        sp_napr3.setAdapter(adapter_napr);



    }
    private String[] vuz = {
            "Выбор ВУЗа",
            "МТУСИ",
            "МГТУ им. Баумана",
            "БелГУ"
    };

    private String[] napr  = {
            "Выбор направления",
            "Информатика и вычислительная техника",
            "Информационная безопасность",
            "Русский язык"
    };

    public void pred(View view) {
        Intent intent = new Intent(this, mainMenu.class);
        startActivity(intent);
    }
}