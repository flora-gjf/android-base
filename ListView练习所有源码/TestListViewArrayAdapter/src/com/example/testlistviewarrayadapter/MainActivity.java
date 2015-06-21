package com.example.testlistviewarrayadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

	private ListView lv;   
	 
	private  String[] strs = new String[] {
	    "first", 
        "second",
        "third",
        "fourth", 
        "fifth"
	    };//定义一个String数组用来显示ListView的内容 
   
	@Override
	public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);

	        //得到ListView对象的引用 
	        lv = (ListView) findViewById(R.id.listView1);
            //为ListView设置Adapter来绑定数据
	        lv.setAdapter(new ArrayAdapter<String>(this,
	                android.R.layout.simple_list_item_1, strs));				
	    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
