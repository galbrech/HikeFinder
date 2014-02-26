package com.example.hikefinder;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Profile extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// when the screen is first created, show the layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		Intent intent = getIntent();
		//String value = intent.getStringExtra("key"); //if it's a string you stored.
	}

}