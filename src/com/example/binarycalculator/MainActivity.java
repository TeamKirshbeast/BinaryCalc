package com.example.binarycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Spinner mode;
	private TextView output;
	//private Spinner mode = (Spinner) findViewById(R.id.spinner1);
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    output = (TextView) findViewById(R.id.textView1);
	    mode = (Spinner) findViewById(R.id.spinner1);
	   
	    // Set the user interface layout for this Activity
	    // The layout file is defined in the project res/layout/main_activity.xml file
	    setContentView(R.layout.activity_main);
	    
	   
	    
	}
	
	public void numberSelected(View view) {
		output = (TextView) findViewById(R.id.textView1);
		Button b = (Button) view;
		output.setText((String) output.getText() + (String) b.getText());
		
		
	}
	
	public void spinnerIsClicked(Spinner s) {
		
	}
	
	
	
}
