package com.example.hikefinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Options  extends Activity{
	Button submitButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// when the screen is first created, show the layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);
		Intent intent = getIntent();
		//String value = intent.getStringExtra("key"); //if it's a string you stored.
		submitButton = (Button) findViewById(R.id.button1);
		
		submitButton.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
	        	Intent myIntent = new Intent(Options.this, Results.class);
	        	//myIntent.putExtra("key", value); //Optional parameters
	        	Options.this.startActivity(myIntent);
            }
        });
		
	}

}
