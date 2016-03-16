package com.kmit.tabview;

import com.kmit.tabview.dbhelper;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Admission extends Activity {
	public static SQLiteDatabase db=null;

	TableLayout tl;
	 dbhelper help1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admiss);
		help1=new dbhelper(this,"school",null,1);
		db=help1.getWritableDatabase();
		ImageButton b1=(ImageButton)findViewById(R.id.imageButton1);
		ImageButton b2=(ImageButton)findViewById(R.id.imageButton2);
		ImageButton b3=(ImageButton)findViewById(R.id.imageButton3);
		ImageButton b4=(ImageButton)findViewById(R.id.imageButton4);
}
	
	public void click(View v) {
	   	 switch (v.getId()) {
		      case R.id.imageButton1:
		    	  Intent i1=new Intent(this,PutValues.class);
		    	  startActivity(i1);
		        break;
		      case R.id.imageButton2:
		    	  Intent i2=new Intent(this,PutValues2.class);
		    	  startActivity(i2);
		        break;
		      case R.id.imageButton3:
		    	  Intent i3=new Intent(this,PutValues3.class);
		    	  startActivity(i3);
			        break;
		      case R.id.imageButton4:
		    	  show(null);
			        break;
		     
		      }
	  }
	public void show(View v)
	{
		Cursor c=db.query("admission", new String[]{"name","roll","phone"},null, null, null, null, null);
		TableLayout t1=(TableLayout)findViewById(R.id.tableLayout1);
		t1.removeAllViews();
	    TableRow tr0=new TableRow(getApplicationContext());
	    TextView tv0=new TextView(getApplicationContext());
	    TextView tv1=new TextView(getApplicationContext());
	    TextView tv2=new TextView(getApplicationContext());
	    /*tv0.setTextColor(color.black);
	    tv1.setTextColor(color.black);
	    tv2.setTextColor(color.black);
	    tv0.setTypeface(null, Typeface.BOLD);
	    tv1.setTypeface(null, Typeface.BOLD);
	    tv2.setTypeface(null, Typeface.BOLD);*/
	    tv0.setText("Name");
	    tv1.setText("Hall Ticket Number");
	    tv2.setText("Phone Number");
	    tr0.addView(tv0);
	    tr0.addView(tv1);
	    tr0.addView(tv2);
	    t1.addView(tr0);
	    if(c.moveToFirst()){
	    	do{
	    		String name=c.getString(0);
	    		String roll=c.getString(1);
	    		String phone=c.getString(2);
	    		TableRow tr=new TableRow(getApplicationContext());
	    		TextView tvs0=new TextView(getApplicationContext());
	    	    TextView tvs1=new TextView(getApplicationContext());
	    	    TextView tvs2=new TextView(getApplicationContext());
	    	    tvs0.setText(name+"");
	    	    tvs1.setText(roll+"");
	    	    tvs2.setText(phone+"");
	    	    tr.addView(tvs0);
	    	    tr.addView(tvs1);
	    	    tr.addView(tvs2);
	    	    t1.addView(tr);
	    	}while(c.moveToNext());
	    	
	    }
	    c.close();
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
		Intent i=new Intent(getApplicationContext(),Student.class);
   		startActivity(i);
   		
	}
		
	}
