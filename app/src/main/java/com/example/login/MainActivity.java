package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Kết nối Button Đăng Nhập với mã
        Button btnDangNhap = findViewById(R.id.bttdn);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chuyển sang Activity Đăng Nhập
                startActivity(new Intent(MainActivity.this, Dangnhap.class));
            }
        });
        Button btnDangKy = findViewById(R.id.bttdk);
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chuyển sang Activity Đăng Ký
                startActivity(new Intent(MainActivity.this, Dangki.class));

            }
        });
    }
}
