package com.example.konversiangka;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    TextView tv_nama, tv_nim, tv_nilai;
    String et_nama2, et_nim2, et_nilai2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tv_nama = findViewById(R.id.et_nama);
        tv_nim = findViewById(R.id.et_nim);
        tv_nilai = findViewById(R.id.et_nilai);

        if (getIntent().getStringExtra("et_nama") != null) {
            et_nama2 = getIntent().getStringExtra("nama");
            tv_nama.setText("Nama : " + et_nama2);
        }
        if (getIntent().getStringExtra("et_nim") != null) {
            et_nim2 = getIntent().getStringExtra("nim");
            tv_nim.setText("Nim : " + et_nim2);
        }
        if (getIntent().getStringExtra("et_nilai") != null) {
            et_nilai2 = getIntent().getStringExtra("nilai");
            tv_nilai.setText("Nilai : " + et_nilai2);
        }
    }
}
