package com.example.testsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class SQLiteHelper extends SQLiteOpenHelper{

	private static int VERSION = 1;
	private static String NAME = "gjf.db";
	public SQLiteHelper(Context context) {
		
		super(context, NAME, null, VERSION);	
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE IF NOT EXISTS fruit" +  
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT, name, color, taste)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		//db.execSQL("ALTER TABLE fruit ADD COLUMN other STRING");  
	}	
}
