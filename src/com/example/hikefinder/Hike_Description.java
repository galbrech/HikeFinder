package com.example.hikefinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Hike_Description extends Activity{
	Button selectHike;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// when the screen is first created, show the layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hike_description);
		Intent intent = getIntent();
		//String value = intent.getStringExtra("key"); //if it's a string you stored.
	
	//Below to be filled in after remaining layout.xml files are added
	/*	selectHike = (Button) findViewById(R.id.button1);
		
		selectHike.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
	        	Intent myIntent = new Intent(Hike_Description.this, MainActivity.class);
	        	//myIntent.putExtra("key", value); //Optional parameters
	        	Hike_Description.this.startActivity(myIntent);
            }
        });*/
	}

}






