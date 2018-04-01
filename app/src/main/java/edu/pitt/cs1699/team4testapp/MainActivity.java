package edu.pitt.cs1699.team4testapp;

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

    public void onBroadcastClick(View view){
        Intent finishedIntent = new Intent("edu.pitt.cs1699.stocks.BALANCE");
        sendBroadcast(finishedIntent);
    }

    public void onBuyStockClick(View view){

    }

    public void onSellStockClick(View view){

    }

    public void onStartServiceClick(View view){

    }

}
