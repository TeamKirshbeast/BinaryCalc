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
	private String val1;
	private String val2;
	private CalcNum value1;
	private CalcNum value2;
	private CalcNum result;
	private String oper = "";
	Button plus;
	Button minus;
	
	//private Spinner mode = (Spinner) findViewById(R.id.spinner1);
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    output = (TextView) findViewById(R.id.textView1);
	    mode = (Spinner) findViewById(R.id.spinner1);
	   
	    // Set the user interface layout for this Activity
	    // The layout file is defined in the project res/layout/main_activity.xml file
	    setContentView(R.layout.activity_main);
	    plus = (Button) findViewById(R.id.plusButton);
	    minus = (Button) findViewById(R.id.minusButton);
	    
	}
	
	public void numberSelected(View view) {
		Button b = (Button) view;
		if (oper == "") {
			val1 += (String) b.getText();
		} else {
			val2 += (String) b.getText(); 
		}
		output = (TextView) findViewById(R.id.textView1);
//		output.setText((String) output.getText() + (String) b.getText());
		output.setText(val1 + (String) " " + oper + (String) " " + val2); //eventually change to be the whole result in real time.
		
	}
	
	public void binaryEvent(View view) {
		if (value1 == null) {
			value1 = new CalcNum(val1, mode.getSelectedItemPosition());
			switch (view.getId()) {
			case R.id.plusButton:
				oper = "+";
				break;
			case R.id.minusButton:
				oper = "-";
				break;
			} 
		}else { //in the instance where the result is already calculated
				calculate();
				clear();
		}	
	}
	
	public void calculate() {
		if (oper.equals("+")) {
			result = new CalcNum( "" +((value1.val) + value2.val), 0);
		} else if (oper.equals("-")) {
			result = new CalcNum("" + (value1.val - value2.val), 0);
		} //more operators
		
		//include result in display
	}
	
	public void spinnerIsClicked(Spinner s) {
		
	}
	
	public void clear() {
		val1 = "";
		val2 = "";
		//value1 = null;
		value2 = null;
		oper = "";
		output = (TextView) findViewById(R.id.textView1);
		output.setText("");
		
		//clear text
	}
	
}

