package com.kmit.tabview;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class dbhelper extends SQLiteOpenHelper{

	public dbhelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
String str="create table admission(name text,roll text,phone text)";
String str1="create table attendence(name text,roll text,average text)";
String str2="create table marks(name text,sub text,roll text,average text)";
db.execSQL(str);
db.execSQL(str1);
db.execSQL(str2);

	
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
	db.execSQL("drop table customer");
	db.execSQL("drop table driver");
	onCreate(db);
	}
	 public void onOpen(SQLiteDatabase database) {
		  if(!database.isOpen()) {
		   SQLiteDatabase.openDatabase(database.getPath(), null, SQLiteDatabase.NO_LOCALIZED_COLLATORS |
		     SQLiteDatabase.CREATE_IF_NECESSARY);
		  }
	

}
}

