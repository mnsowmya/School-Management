package com.kmit.tabview;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TabHost tabhost=getTabHost();
		
		tabhost.setup();
		TabSpec ps=tabhost.newTabSpec("Student");
		TabSpec vs=tabhost.newTabSpec("Staff");
		
		ps.setIndicator("",getResources().getDrawable(R.drawable.teach1));
		vs.setIndicator("",getResources().getDrawable(R.drawable.stud1));
		//ss.setIndicator("",getResources().getDrawable(R.drawable.song_02));
		Intent pi=new Intent(this,Teacher.class);
		Intent vi=new Intent(this,Student.class);
		//Intent si=new Intent().setClass(this,SongActivity.class);
		ps.setContent(pi);
		vs.setContent(vi);
		//ss.setContent(si);
		tabhost.addTab(ps);
		tabhost.addTab(vs);
		//tabhost.addTab(ss);
		
	}
}
