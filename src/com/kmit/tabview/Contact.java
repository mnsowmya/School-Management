package com.kmit.tabview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Contact extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
       // System.out.println("Attendance");
        TextView tv=(TextView)findViewById(R.id.textView1);
 }

}
