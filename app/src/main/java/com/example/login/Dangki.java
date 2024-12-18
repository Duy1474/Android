package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Dangki extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki); // Giao diện chứa nút Return

        // Kết nối nút với mã Java
        Button btnReturn = findViewById(R.id.bttreturn2);

        // Xử lý sự kiện nhấn nút
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về MainActivity
                startActivity(new Intent(Dangki.this, MainActivity.class));
            }
        });

        TextView dn = findViewById(R.id.txtvdn);
        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dangki.this, Dangnhap.class));
            }
        });



    }
}
