package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Code extends AppCompatActivity {

    public void biodata(View view){
        Intent intent = new Intent(Login_Code.this, Biodata.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__code);

        Intent intent = getIntent();
    }
}