package com.example.activitycycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class LittleActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.little_activity);
		System.out.println("LittleActivity-onCreate");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		System.out.println("LittleActivity-onDestoy");
	}

	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("LittleActivity-onPause");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("LittleActivity-onRestart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		System.out.println("LittleActivity-onResume");
	}

	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("LittleActivity-onStart");
	}  

	@Override  
	protected void onStop() {
		super.onStop();
		System.out.println("LittleActivity-onStop");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void finishDialog(View v) {
        this.finish();
    }
}
