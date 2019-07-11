package com.uk.tastytoastyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.uk.tastytoasty.TastyToasty;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		

		TastyToasty.makeText(MainActivity.this, "This is a custom toast",TastyToasty.LONG, R.drawable.ic_action_favourite, R.color.violet, R.color.white, true).show();
		
		/*
		new TastyToasty.Builder(MainActivity.this)
			.setText("This one is using builder method")
			.setBackgroundColor(R.color.green)
			.setIconId(R.drawable.ic_verified_user)
			.showTail(true)
			.show();
		*/
		
		
	}
}
