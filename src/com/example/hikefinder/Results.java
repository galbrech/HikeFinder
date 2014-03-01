package com.example.hikefinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Results extends Activity
{
	Button submitButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.results);
		Intent intent = getIntent();
		submitButton = (Button) findViewById(R.id.submitButton);
		submitButton.setOnClickListener( new OnClickListener() {
	        @Override
	        public void onClick(View v) {
	            // TODO Auto-generated method stub
	        	Intent myIntent = new Intent(Results.this, Hike_Description.class);
	        	//myIntent.putExtra("key", value); //Optional parameters
	        	Results.this.startActivity(myIntent);
	        }
	    });
	}
}
