package com.example.test_st7;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.test_st7.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Khai báo biến
    EditText   adtA,adtB,edtTong;
    Button btnTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ánh xạ
        adtA = findViewById(R.id.adtA);
        adtB = findViewById(R.id.adtB);
        edtTong = findViewById(R.id.Tong);
        btnTong = findViewById(R.id.btnTong);
        // Gán sự kiện
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {// từ adt a => add sang int
                int a = Integer.parseInt(adtA.getText().toString());
                int b = Integer.parseInt(adtB.getText().toString());
                int tong = a + b;
                edtTong.setText(tong + "");// hiển thị kết quả
            }
        });

}
}
