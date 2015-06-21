package com.example.testlistviewsimpleadapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //搞三个数组更方便点，原谅我不想改了就疯狂复制粘贴。。
    	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(); 
    	Map<String, Object> map = new HashMap<String, Object>(); 
    	map.put("name", "苹果"); 
    	map.put("message", "我是苹果"); 
    	map.put("img", R.drawable.pingguo); 
    	list.add(map); 
    	map = new HashMap<String, Object>(); 
    	map.put("name", "西瓜"); 
    	map.put("message", "我是西瓜"); 
    	map.put("img", R.drawable.xigua); 
    	list.add(map); 
    	map = new HashMap<String, Object>(); 
    	map.put("name", "西红柿"); 
    	map.put("message", "我是西红柿 "); 
    	map.put("img", R.drawable.xihongshi); 
    	list.add(map);   
    	map.put("name", "苹果"); 
    	map.put("message", "我是苹果"); 
    	map.put("img", R.drawable.pingguo); 
    	list.add(map); 
    	map = new HashMap<String, Object>(); 
    	map.put("name", "西瓜"); 
    	map.put("message", "我是西瓜"); 
    	map.put("img", R.drawable.xigua); 
    	list.add(map); 
    	map = new HashMap<String, Object>(); 
    	map.put("name", "西红柿"); 
    	map.put("message", "我是西红柿 "); 
    	map.put("img", R.drawable.xihongshi); 
    	list.add(map);   
    	map.put("name", "苹果"); 
    	map.put("message", "我是苹果"); 
    	map.put("img", R.drawable.pingguo); 
    	list.add(map); 
    	map = new HashMap<String, Object>(); 
    	map.put("name", "西瓜"); 
    	map.put("message", "我是西瓜"); 
    	map.put("img", R.drawable.xigua); 
    	list.add(map); 
    	map = new HashMap<String, Object>(); 
    	map.put("name", "西红柿"); 
    	map.put("message", "我是西红柿 "); 
    	map.put("img", R.drawable.xihongshi); 
    	
    	list.add(map);   
	    ListView listView = (ListView) findViewById(R.id.listView1);
	    listView.setAdapter(new SimpleAdapter(this, list,R.layout.user_item, 
	    		new String[]{"name","message","img"} ,
	    		new int[]{R.id.textView1,R.id.textView2,R.id.imageView1}));
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
