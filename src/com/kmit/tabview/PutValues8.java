package com.kmit.tabview;



import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.Toast;

public class PutValues8 extends Activity {
	public static SQLiteDatabase db=null;
 
	TableLayout tl;
	 dbhelper help1;
	 EditText ed1,ed2,ed3;
	 String s1,s2,s3;
	 Button b1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.putv8);
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		ed3=(EditText)findViewById(R.id.editText3);
		b1=(Button)findViewById(R.id.but1);
		help1=new dbhelper(this,"school",null,1);
		db=help1.getWritableDatabase();
      b1.setOnClickListener(new View.OnClickListener(){

			
			@Override
			public void onClick(View arg0) {
			
				if((ed1.getText().toString().isEmpty())||(ed2.getText().toString().isEmpty())||(ed3.getText().toString().isEmpty()))
				{
				Toast.makeText(getApplicationContext(), "Fill the details to enter", Toast.LENGTH_SHORT).show();
					
				}
				else{	
			    s1=ed1.getText().toString();
				s2=ed2.getText().toString();
				s3=ed3.getText().toString();
				upda(null);
				b1.setEnabled(false);
				
				}
				
				

				
			}
			
			
		});
		
		
}
	public void upda(View v){
		   String s1= ed1.getText().toString();
			String s2= ed2.getText().toString();
			String s3=ed2.getText().toString();
		ContentValues cv1=new ContentValues();
		cv1.put("name", s1);
		cv1.put("roll", s2);
		cv1.put("average", s3);
		db.update("marks", cv1, "roll=?", new String[]{String.valueOf(s2)});
		
	}
}