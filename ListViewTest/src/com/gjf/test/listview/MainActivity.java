package com.gjf.test.listview;

import java.util.ArrayList;
import java.util.List;

import com.example.testqqqqqqqqqqqq.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView listView = (ListView) findViewById(R.id.listView1);
               
        listView.setAdapter(new MyAdapter(this, new ArrayList<ItemData>(20){{
        	
        	add(new ItemData(0,MyAdapter.TYPE_FIRST));
        	add(new ItemData(1,MyAdapter.TYPE_FIRST));
        	add(new ItemData(2,MyAdapter.TYPE_FIRST));
        	add(new ItemData(3,MyAdapter.TYPE_THIRD));
        	add(new ItemData(4,MyAdapter.TYPE_SECOND));
        	add(new ItemData(5,MyAdapter.TYPE_THIRD));
        	add(new ItemData(6,MyAdapter.TYPE_THIRD));
        	add(new ItemData(7,MyAdapter.TYPE_FIRST));
        	add(new ItemData(8,MyAdapter.TYPE_SECOND));
        	add(new ItemData(9,MyAdapter.TYPE_SECOND));
        	add(new ItemData(10,MyAdapter.TYPE_THIRD));
        	add(new ItemData(11,MyAdapter.TYPE_FIRST));
        	add(new ItemData(12,MyAdapter.TYPE_FIRST));
        	add(new ItemData(13,MyAdapter.TYPE_SECOND));
        	add(new ItemData(14,MyAdapter.TYPE_SECOND));
        	add(new ItemData(15,MyAdapter.TYPE_THIRD));
        	add(new ItemData(16,MyAdapter.TYPE_THIRD));
        	add(new ItemData(17,MyAdapter.TYPE_FIRST));
        	add(new ItemData(18,MyAdapter.TYPE_FIRST));
        	add(new ItemData(19,MyAdapter.TYPE_SECOND));
        	
        }}));
 
        
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
