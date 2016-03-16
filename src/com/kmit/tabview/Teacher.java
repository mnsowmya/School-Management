package com.kmit.tabview;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import android.widget.AdapterView.OnItemClickListener;

public class Teacher extends ActionBarActivity {
	ListView list;
	 String[] web={"REFERENCES","SYLLABUS","QUALIFICATIONS","CONTACT DETAILS"};
	Integer[] imid=
		{
			R.drawable.refer,
			R.drawable.syll,
			R.drawable.qualifi,
			R.drawable.contac
		
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teacher);
		CustomList adapter=new CustomList(Teacher.this,web,imid);
		ListView list=(ListView)findViewById(R.id.listView1);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener()
		{

			

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,long arg3) {
				switch(position)
				{
				case 0:
					Intent i=new Intent(Teacher.this,References.class);
					startActivity(i);
					break;
				case 1:
					Intent i1=new Intent(Teacher.this,Syllabus.class);
					startActivity(i1);
					break;
				case 2:
					Intent i2=new Intent(Teacher.this,Qualifications.class);
					startActivity(i2);
					break;
				case 3:
					Intent i3=new Intent(Teacher.this,Contact.class);
					startActivity(i3);
					break;
				}
				
				
			}
				
	
				
			});
			
		
	}
	

}
