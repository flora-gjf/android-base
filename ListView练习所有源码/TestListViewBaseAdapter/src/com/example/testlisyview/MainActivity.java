package com.example.testlisyview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {

	 private ListView lv;
	    //定义一个动态数组    
	    List<HashMap<String, Object>> listItem;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);

	        listItem = new ArrayList<HashMap<String,Object>>();
	        //为动态数组添加数据 
	        for(int i=0;i<30;i++) 
	         { 
	             HashMap<String, Object> map = new HashMap<String, Object>(); 
	             map.put("name", "郭大大"+i+"号："); 
	             map.put("phone", "8888"+i); 
	             listItem.add(map); 
	         }

	        lv = (ListView) findViewById(R.id.listView1);
	        MyAdapter mAdapter = new MyAdapter(this,listItem);//得到一个MyAdapter对象
	        lv.setAdapter(mAdapter);//为ListView绑定Adapter
	     
	    }


	    // 新建一个类继承BaseAdapter，实现视图与数据的绑定
	    private class MyAdapter extends BaseAdapter {
	        private Context context; 
	        List<HashMap<String, Object>> listItem;
	        public MyAdapter(Context context,List<HashMap<String, Object>> listItem) {
	            this.context = context;
	            this.listItem = listItem;
	        }
	        @Override
	        public int getCount() {
	            return listItem.size();//返回数组的长度        
	        }
	 
	        @Override
	        public Object getItem(int position) {
	            return null;
	        }
	 
	        @Override
	        public long getItemId(int position) {
	            return 0;
	        }
	         
	        //书中详细解释该方法        
	        @Override
	        public View getView(final int position, View convertView, ViewGroup parent) {
	                    HashMap listitem = listItem.get(position);
	                    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	                    ViewGroup group = (ViewGroup) inflater.inflate(R.layout.user_item, null);
	                    //得到各个控件的对象                  
	                    TextView name = (TextView) group.findViewById(R.id.name);
						name.setText(listitem.get("name").toString());
						TextView phone = (TextView) group.findViewById(R.id.phone);
						phone.setText(listitem.get("phone").toString());
						Button bt = (Button) group.findViewById(R.id.button1);
						bt.setBackgroundColor(Color.GREEN);
	                   
	            return group;
	        }
	     
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
