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
    EditText tvc,tvk;
    EditTextNumber   editTextNumber1, editTextNumber2;
    Button btnClean;
    Button btntoK;
    Button btntoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ánh xạ các thành phần giao diện
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        btnClean = findViewById(R.id.btnClean);
        btntoK = findViewById(R.id.btntoK);
        btntoC = findViewById(R.id.btntoC);
        // Xử lý sự kiện khi nhấn nút Clean
        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = Integer.parseInt(editTextNumber.getText().toString());
                double k = (int) (c + 273.15);

                editTextNumber.setText("");
                editTextNumber2.setText("");
            }
        });

}
}
