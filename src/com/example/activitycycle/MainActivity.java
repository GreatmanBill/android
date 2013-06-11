package com.example.activitycycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button littleActivity = (Button)findViewById(R.id.littleActivityBtn);
		
		littleActivity.setOnClickListener(new OnClickListener(){
  
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, LittleActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});
		
		Button fillActivity = (Button)findViewById(R.id.FillActivityBtn);
		
		fillActivity.setOnClickListener(new OnClickListener(){
  
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, FillScreenActivity.class);
				MainActivity.this.startActivity(intent);
			}			
			   
		});
		System.out.println("MainActivity-onCreate");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		System.out.println("MainActivity-onDestoy");
	}

	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("MainActivity-onPause");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("MainActivity-onRestart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		System.out.println("MainActivity-onResume");
	}

	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("MainActivity-onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("MainActivity-onStop");
	}

}
