package khatami.belajar.tugasakb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Nim : 10119026
//Nama : Muhammad Khatami
//Kelas : IF-1
//Tanggal Pengerjaan : 22-04-2022

public class RegisterActivity extends AppCompatActivity {
    private Button btnLogin1, btnRegister1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        btnLogin1 = findViewById(R.id.btn_login1);
        btnRegister1 = findViewById(R.id.btn_register1);

        btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnLogin1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}