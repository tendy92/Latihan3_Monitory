package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Say_Hai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say__hai);

        String nickName = getIntent().getStringExtra(Biodata.masukan_nama);

        String text = getString(R.string.pesan).toString();
        TextView pesan = (TextView)findViewById(R.id.pesan);

        pesan.setText(String.format(text, nickName).toString());

    }

    public void oke(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}