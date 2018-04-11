package edu.pitt.cs1699.team4testapp;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class StockPriceService extends IntentService {

    public StockPriceService(){
        super("StockPriceService");
    }

    public int onStartCommand(Intent intent, int flags, int start){
        System.err.println("ON START");
        Intent newIntent = new Intent(Intent.ACTION_MAIN);
        newIntent.setClassName("edu.pitt.cs1699.stocks", "edu.pitt.cs1699.stocks.StockPriceChangeActivity");
        startActivity(newIntent);

        return Service.START_STICKY;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //
    }
}
