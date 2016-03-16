package com.kmit.tabview;



import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class References extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.references);
       // System.out.println("Attendance");
        TextView tv=(TextView)findViewById(R.id.textView1);
        
    }
}
