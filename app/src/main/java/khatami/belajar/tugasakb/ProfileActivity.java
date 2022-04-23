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

public class ProfileActivity extends AppCompatActivity {
    private Button btnBeranda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();
        btnBeranda = findViewById(R.id.btn_beranda);

        btnBeranda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}