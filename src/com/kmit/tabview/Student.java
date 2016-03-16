package com.kmit.tabview;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

@SuppressLint("NewApi")
public class Student extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student);
	}
		
		@SuppressLint("NewApi")
		public void	fun1(View v)
		{
			
				// TODO Auto-generated method stub
				
				Intent i=new Intent(getApplicationContext(),Admission.class);
	       	startActivity(i);
	       		//overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
	       		/*Intent slideactivity = new Intent(Student.this, Admission.class);
	       		Bundle bndlanimation =
	       		ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.pull_in_right, R.anim.push_out_left).toBundle();
	       		startActivity(slideactivity, bndlanimation);
	       		*/
	}
		@SuppressLint("NewApi")
		public void	fun2(View v)
		{
			
				// TODO Auto-generated method stub
				
				Intent i=new Intent(getApplicationContext(),Fee2.class);
	       		startActivity(i);
	       		//overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
	       		/*Intent slideactivity = new Intent(Student.this, Fee2.class);
	       		Bundle bndlanimation =
	       		ActivityOptions.makeCustomAnimation(getApplicationContext(),R.anim.pull_in_right, R.anim.push_out_left).toBundle();
	       		startActivity(slideactivity, bndlanimation);*/
	       		
	}
		@SuppressLint("NewApi")
		public void	fun3(View v)
		{
			Intent i=new Intent(getApplicationContext(),Fee2.class);
       		startActivity(i);
	   /*Intent slideactivity = new Intent(Student.this, Attendence.class);
	   Bundle bndlanimation =  ActivityOptions.makeCustomAnimation(getApplicationContext(),
			   R.anim.pull_in_right, R.anim.push_out_left).toBundle();
	      startActivity(slideactivity, bndlanimation);*/
	       		
	}

		

}
