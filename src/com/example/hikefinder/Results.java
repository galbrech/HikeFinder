package com.example.hikefinder;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class Results extends Activity
{
	// list view
	ListView resultsListView;
	
	// button
	Button submitButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.results);
		Intent intent = getIntent();
		
		resultsListView = (ListView) findViewById(R.id.listView1);
		submitButton = (Button) findViewById(R.id.submitButton);
		
		List<Hike> hikeResults = GlobalDataContainer.getQueryResults();
		
		
		
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
