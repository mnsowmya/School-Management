package com.kmit.tabview;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class fee extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fee);
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
		Intent i=new Intent(getApplicationContext(),Student.class);
   		startActivity(i);
   		
	}
}
