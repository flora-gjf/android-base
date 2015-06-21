package com.example.testsqlite;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class SQLiteManager<DBHelper> {
	
	private SQLiteHelper helper;
	private SQLiteDatabase db;

	public SQLiteManager(Context context) {
		helper = new SQLiteHelper(context);
		db = helper.getWritableDatabase();
	}

	public void add(List<Fruit> fruits) {
		Fruit fruit;
		for (int i = 0; i < fruits.size(); i++) {
            fruit = fruits.get(i);
			db.execSQL("INSERT INTO fruit VALUES(?, ?, ?, ?)",
					new Object[] { fruit.getId(), fruit.getName(), fruit.getColor(), fruit.getTaste() });
		}		
	}

	public void updateColor(Fruit fruit) {
		ContentValues cv = new ContentValues();
		cv.put("color", fruit.getColor());
		db.update("fruit", cv, "name = ?", new String[] { fruit.getName() });
	}

	public void deleteRedFruit(Fruit fruit) {
		db.delete("fruit", "color = ?",
				new String[] { fruit.getColor() });
	}

	public List<Fruit> query() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		Cursor c = db.rawQuery("SELECT * FROM fruit", null);
		while (c.moveToNext()) {
			Fruit fruit = new Fruit();
			fruit.setId(c.getInt(c.getColumnIndex("_id")));
			fruit.setName(c.getString(c.getColumnIndex("name")));
			fruit.setColor(c.getString(c.getColumnIndex("color")));
			fruit.setTaste(c.getString(c.getColumnIndex("taste")));
			fruits.add(fruit);
		}
		c.close();
		return fruits;
	}
	
	public void close() {
		db.close();
	}
}
