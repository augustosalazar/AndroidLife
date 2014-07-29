package com.uninorte.androidlifecycle2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	protected String TAG = MainActivity.class.getSimpleName();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Log.d(TAG,"1.onCreate");
        
        setContentView(R.layout.activity_main);
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	Log.d(TAG,"2.onStart");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.d(TAG,"3.onResume");
    }


    
    @Override
    protected void onPause() {
    	super.onPause();
       	Log.d(TAG,"4.onPause");
    }

    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.d(TAG,"4-1.onRestart");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
      	Log.d(TAG,"4-2onStop");
    }
}
