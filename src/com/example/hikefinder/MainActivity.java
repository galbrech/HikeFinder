package com.example.hikefinder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
	Button clickButton;
	Button clickButton2;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// to make the button do stuff
		clickButton = (Button) findViewById(R.id.button1);
		clickButton2 = (Button) findViewById(R.id.button2);
		// create listner for button clicks
		clickButton.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
	        	Intent myIntent = new Intent(MainActivity.this, Options.class);
	        	//myIntent.putExtra("key", value); //Optional parameters
	        	MainActivity.this.startActivity(myIntent);
            }
        });
		
		clickButton2.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
	        	Intent myIntent = new Intent(MainActivity.this, Profile.class);
	        	//myIntent.putExtra("key", value); //Optional parameters
	        	MainActivity.this.startActivity(myIntent);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}

