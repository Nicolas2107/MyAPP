package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() { super.onStart(); }



    @Override
    protected void onStop() {
        super.onStop();
    }

    public  void goTo2(View h){
        Intent go = new Intent(MainActivity.this, MainActivity2.class);
        go.addFlags(go.FLAG_ACTIVITY_CLEAR_TASK | go.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(go);
    }

    public  void goTo3(View h){
        Intent go = new Intent(MainActivity.this, clase.class);
        go.addFlags(go.FLAG_ACTIVITY_CLEAR_TASK | go.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(go);
    }

}