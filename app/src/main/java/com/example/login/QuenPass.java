package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QuenPass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_pass); // Giao diện chứa nút Return

        // Kết nối nút với mã Java
        Button btnReturn = findViewById(R.id.bttreturn4);

        // Xử lý sự kiện nhấn nút
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về MainActivity
                startActivity(new Intent(QuenPass.this, Dangnhap.class));
            }
        });

        TextView dk = findViewById(R.id.txtvdk2);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuenPass.this, Dangki.class));
            }
        });
        // Kết nối nút với mã Java
        Button btnguimail= findViewById(R.id.bttguimail);
        // Xử lý sự kiện nhấn nút
        btnguimail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về MainActivity
                startActivity(new Intent(QuenPass.this, DoiPass.class));
            }
        });

    }
}