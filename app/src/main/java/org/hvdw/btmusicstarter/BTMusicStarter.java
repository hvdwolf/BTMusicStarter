package org.hvdw.btmusicstarter;

import android.app.Activity;
//import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.widget.Toast;

public class BTMusicStarter extends Activity {
    public static final String TAG = "BTMusicStarterApp";
    private static PackageManager pm;
    private static Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();

        Log.d(TAG, "Started BTMusicStarterApp; in OnCreate void");

        Intent sIntent = new Intent(Intent.ACTION_MAIN);
        sIntent.setComponent(ComponentName.unflattenFromString("com.syu.bt/com.syu.bt.act.ActBtAvStart"));
        sIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        sIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(sIntent);
        Log.d(TAG, "Started the BTMusic apk com.syu.bt.act.ActBtAvStart");

        finish();
    }

}
