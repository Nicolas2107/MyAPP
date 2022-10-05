package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clase extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }



    @Override
    protected void onStop() {
        super.onStop();
    }

    public  void goToHome(View h){
        Intent go = new Intent(clase.this, MainActivity.class);
        go.addFlags(go.FLAG_ACTIVITY_CLEAR_TASK | go.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(go);
    }

    public  void goTo2(View h){
        Intent go = new Intent(clase.this, MainActivity2.class);
        go.addFlags(go.FLAG_ACTIVITY_CLEAR_TASK | go.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(go);
    }
}
