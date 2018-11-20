package com.example.test.alarm2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class ReceiverYeah extends BroadcastReceiver{
    MediaPlayer mp;

    @Override
    public void onReceive(Context c, Intent arg1) {
        mp = MediaPlayer.create(c, R.raw.alarm);
        mp.setLooping(true);
        mp.start();
        Toast.makeText(c, "Alarm Telah Menyala :D", Toast.LENGTH_LONG).show();
    }
}