package com.kmit.tabview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class CustomList extends BaseAdapter{
	private Activity mcon;
	private final String[] web;
	private final Integer[] imid;
	public CustomList(Activity mcon,String[] web,Integer[] imid)
	{
	this.mcon=mcon;
	this.web=web;
	this.imid=imid;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return web.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
            LayoutInflater inf=mcon.getLayoutInflater();
            View rowview=inf.inflate(R.layout.single_list,null,true);
             TextView txt=(TextView)rowview.findViewById(R.id.textView1);
            ImageView iv=(ImageView)rowview.findViewById(R.id.imageView1);
            txt.setText(web[position]);
            iv.setImageResource(imid[position]);
            return rowview;
            
            
		
	}
	

}
