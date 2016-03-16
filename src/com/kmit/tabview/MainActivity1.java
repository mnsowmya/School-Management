package com.kmit.tabview;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity1 extends ActionBarActivity {
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
	       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.first);
		   b=(Button)findViewById(R.id.imageButton1);
	        b.setOnClickListener(new View.OnClickListener()
	        {

	       	@Override
	       	public void onClick(View arg0) {
	       		// TODO Auto-generated method stub
	       		Intent i=new Intent(getApplicationContext(),MainActivity2.class);
	       		startActivity(i);
	       		overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
	       	}
	        });
	}

	}
