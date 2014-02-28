package com.example.hikefinder;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Profile extends Activity{
	Button homeButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// when the screen is first created, show the layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		Intent intent = getIntent();
		//String value = intent.getStringExtra("key"); //if it's a string you stored.
		
		homeButton = (Button) findViewById(R.id.retrn);
		
		homeButton.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
	        	Intent myIntent = new Intent(Profile.this, MainActivity.class);
	        	//myIntent.putExtra("key", value); //Optional parameters
	        	Profile.this.startActivity(myIntent);
            }
        });
	}

}