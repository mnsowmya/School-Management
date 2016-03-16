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

public class PutValues4 extends Activity {
	public static SQLiteDatabase db=null;
 
	TableLayout tl;
	 dbhelper help1;
	 EditText ed1,ed2,ed3;
	 String s1,s2,s3;
	 Button b1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.putv4);
		help1=new dbhelper(this,"school",null,1);
		db=help1.getWritableDatabase();
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		ed3=(EditText)findViewById(R.id.editText3);
		b1=(Button)findViewById(R.id.but1);
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
				inse(null);
				b1.setEnabled(false);
				
				}
				
				

				
			}
			
			
		});
		
		
}
	public void inse(View v)
	{
		
		
		ContentValues cv=new ContentValues();
		
		cv.put("name", s1);
		
		cv.put("roll",s2);
	    cv.put("average", s3);
		
		db.insert("attendendce", null, cv);
		
		




	}
}