package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Biodata extends AppCompatActivity {

    public static final String masukan_nama = "dev.stdev.monitory.INPUT_NICKNAME";

    public void hai(View view) {
        EditText masukannama = (EditText) findViewById(R.id.EditTextNama);

        if(masukannama.length() < 3) {
            Toast.makeText(this, "Nama panggilan wajib diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, Say_Hai.class);
        intent.putExtra(masukan_nama, masukannama.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        Intent intent = getIntent();
    }
}