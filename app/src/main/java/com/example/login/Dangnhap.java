package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Dangnhap extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap); // Giao diện chứa nút Return

        // Kết nối nút với mã Java
        Button btnReturn = findViewById(R.id.bttreturn);

        // Xử lý sự kiện nhấn nút
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về MainActivity
                startActivity(new Intent(Dangnhap.this, MainActivity.class));
            }
        });

                TextView dk = findViewById(R.id.txtvdk);
                dk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(Dangnhap.this, Dangki.class));
            }
        });
        TextView quenpass = findViewById(R.id.txtrs);
        quenpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dangnhap.this, QuenPass.class));
            }
        });



    }
}
