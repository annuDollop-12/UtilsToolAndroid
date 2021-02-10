package com.dollop.utilssampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dollop.utilsandroid.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.E("check Liberary::");

    }
}