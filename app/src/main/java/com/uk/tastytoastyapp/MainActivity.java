package com.uk.tastytoastyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.uk.tastytoasty.TastyToasty;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TastyToasty.yellow(MainActivity.this, "This is awesome!", R.drawable.ic_whatshot)
			.show();
		
		
	}
}
