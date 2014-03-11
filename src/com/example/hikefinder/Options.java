package com.example.hikefinder;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class Options  extends Activity{
	
	//check boxes
	CheckBox oceanCheckBox;
	CheckBox waterfallCheckBox;
	CheckBox geologicalCheckBox;
	CheckBox historicalCheckBox;
	CheckBox dogCheckBox;
	// buttons
	Button submitButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// when the screen is first created, show the layout
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);
		Intent intent = getIntent();
		//String value = intent.getStringExtra("key"); //if it's a string you stored.

		final DatabaseHandler db = new DatabaseHandler(this);
		
		// checkboxes
		oceanCheckBox = (CheckBox) findViewById(R.id.checkBox1);
		waterfallCheckBox = (CheckBox) findViewById(R.id.checkBox2);
		geologicalCheckBox = (CheckBox) findViewById(R.id.checkBox3);
		historicalCheckBox = (CheckBox) findViewById(R.id.checkBox4);
		dogCheckBox = (CheckBox) findViewById(R.id.checkBox5);
		// buttons
		submitButton = (Button) findViewById(R.id.button1);
		
		submitButton.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
            	
            	int oceanChecked = (oceanCheckBox.isChecked()) ? 1 : 0;
            	int waterfallChecked = (waterfallCheckBox.isChecked()) ? 1 : 0;
            	int geologicalChecked = (geologicalCheckBox.isChecked()) ? 1 : 0;
            	int historicalChecked = (historicalCheckBox.isChecked()) ? 1 : 0;
            	int dogChecked = (dogCheckBox.isChecked()) ? 1 : 0;
            	
            	// create qurey hike
            	Hike queryHike = new Hike(
            			null, null,
            			0, 0,
            			oceanChecked,
            			waterfallChecked,
            			geologicalChecked,
            			historicalChecked,
            			dogChecked,
            			null);
            	
            	List<Hike> hikeResults = db.queryHike(queryHike);
            	GlobalDataContainer.setQueryResults(hikeResults);
            	
		        	Intent myIntent = new Intent(Options.this, Results.class);
		        	//myIntent.putExtra("key", value); //Optional parameters
		        	Options.this.startActivity(myIntent);
            }
        });
		
	}

}
