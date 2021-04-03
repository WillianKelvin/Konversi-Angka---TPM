package com.example.konversiangka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     private EditText et_nama, et_nim, et_nilai;
     private Button btn_submit;
     private TextView tv_nama, tv_nim, tv_nilai;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nama = findViewById(R.id.et_nama);
        et_nim = findViewById(R.id.et_nim);
        et_nilai = findViewById(R.id.et_nilai);
        btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sNama = et_nama.getText().toString();
                String sNim = et_nim.getText().toString();
                String sNilai = et_nilai.getText().toString();
                double nilai = Double.parseDouble(sNilai);

                sNilai = KonversiNilai(nilai);
                setContentView(R.layout.activity_output);
                tv_nama = findViewById(R.id.tv_nama);
                tv_nim = findViewById(R.id.tv_nim);
                tv_nilai = findViewById(R.id.tv_nilai);

                tv_nama.setText("Nama : " + sNama);
                tv_nim.setText("NIM    : " + sNim);
                tv_nilai.setText("Nilai   : " + sNilai);
            }
        });
    }

    protected String KonversiNilai(double nilai) {
        if (nilai >= 3.66 && nilai <= 4.00) {
            return "A";
        } else if (nilai >= 3.33 && nilai <= 3.66) {
            return "A-";
        } else if (nilai >= 3.00 && nilai <= 3.33) {
            return "B+";
        } else if (nilai >= 2.66 && nilai <= 3.00) {
            return "B";
        } else if (nilai >= 2.33 && nilai <= 2.66) {
            return "B-";
        } else if (nilai >= 1.66 && nilai <= 2.00) {
            return "C";
        } else if (nilai >= 1.33 && nilai <= 1.66) {
            return "C-";
        } else if (nilai >= 1.00 && nilai <= 1.33) {
            return "D+";
        } else if (nilai <= 0 && nilai <= 1.00) {
            return "D";
        } else{
            return "Nilai tidak sesuai!";
        }
    }
}