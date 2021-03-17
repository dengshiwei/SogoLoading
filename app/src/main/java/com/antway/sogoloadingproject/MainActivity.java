package com.antway.sogoloadingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.antway.sogoloading.SoGouBrowserLoading;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SoGouBrowserLoading soGouBrowserLoading = new SoGouBrowserLoading(this,null);
        setContentView(soGouBrowserLoading);
    }
}