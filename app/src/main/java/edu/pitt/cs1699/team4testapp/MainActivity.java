package edu.pitt.cs1699.team4testapp;

import android.content.ComponentName;
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
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("edu.pitt.cs1699.stocks", "edu.pitt.cs1699.stocks.BuyShares");
        startActivity(intent);
    }

    public void onSellStockClick(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("edu.pitt.cs1699.stocks", "edu.pitt.cs1699.stocks.SellShares");
        startActivity(intent);
    }

    public void onStartServiceClick(View view){
        System.err.println("SS");
        Intent intent = new Intent(this, StockPriceService.class);
        startService(intent);
    }

}
