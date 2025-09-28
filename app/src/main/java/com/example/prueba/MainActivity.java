package com.example.prueba;

import android.os.Bundle;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("testing" , "Probando mensajes");
    }
}