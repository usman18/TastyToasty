package com.uk.tastytoastyapp;

import android.os.Bundle;

import com.uk.tastytoasty.TastyToasty;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
/*
		
		TastyToasty.makeText(MainActivity.this, "This is a custom toast",TastyToasty.LONG, R.drawable.ic_action_favourite, R.color.violet, R.color.white, true).show();
*/

/*
		new TastyToasty.Builder(MainActivity.this)
			.setText("This one is using builder method")
			.setBackgroundColor(R.color.green)
			.setIconId(R.drawable.ic_verified_user)
			.showTail(true) // Pass false or null or don't call at all if you don't want the "tail" in your toast
			.show();
*/

/*
		//Default text color is white and default background color is pinkinsh red
		new TastyToasty.Builder(MainActivity.this)
			.setIconId(R.drawable.ic_whatshot)
			.show();
*/
	
		
	}
}
