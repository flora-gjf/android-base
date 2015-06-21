package com.example.testsqlite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button zengjia;
	Button gengxin;
	Button chazhao;
	Button shanchu;
	ListView listView;
	private static int curId;
    SQLiteManager manager;  
    List<Fruit> fruits;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        zengjia = (Button) findViewById(R.id.zengjia);
        gengxin = (Button) findViewById(R.id.gengxin);
        chazhao = (Button) findViewById(R.id.chazhao);
        shanchu = (Button) findViewById(R.id.shanchu);
        listView = (ListView) findViewById(R.id.listView1);
        
        manager = new SQLiteManager(this);
        curId = 0;
        fruits = new ArrayList<Fruit>();
        
        zengjia.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				add();
				query();		
			}
		});
        
        gengxin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				update();
				query();
			}
		});
        
        shanchu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				deleteFruitByColor();
				query();
			}
		});
        
        chazhao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				query();
				
			}
		});        
        
    }
          
    @Override  
    protected void onDestroy() {  
        super.onDestroy();   
        manager.close();  
    }  
      
    public void add() {  
        
        if(curId == 0){
	        Fruit f1 = new Fruit(0, "apple", "red", "sweet");  
	        Fruit f2 = new Fruit(1, "banana", "yellow", "sweet"); 
	        Fruit f3 = new Fruit(2, "mellon", "green", "sweet"); 
	        Fruit f4 = new Fruit(3, "orange", "orange", "sweet");  
	        Fruit f5 = new Fruit(4, "apple", "green", "sweet");  
	          
	        fruits.add(f1);  
	        fruits.add(f2);  
	        fruits.add(f3);  
	        fruits.add(f4);  
	        fruits.add(f5);  
	        curId = 5;
	        manager.add(fruits); 
        }else{
        	
        }
//        }else if(curId != 5 && curId < 40){
//        	Fruit f = new Fruit(curId, "apple", "red", "sweet");
//        	curId++;
//        }else{}
              
		Toast.makeText(this, "增加水果", 1).show();	
        
    }  
      
    public void update() {  
        Fruit fruit = new Fruit();  
        fruit.setName("apple");  
        fruit.setColor("red"); 
        
        manager.updateColor(fruit);  
        Toast.makeText(this, "将所有name为apple的水果color更新为red", 1).show();	
    }  
      
    public void deleteFruitByColor() {  
    	Fruit fruit = new Fruit();    
        fruit.setColor("red");  
        
        manager.deleteRedFruit(fruit); 
        Toast.makeText(this, "将所有color为red的水果删除", 1).show();
    }  
      
    public void query() {  
        List<Fruit> fruits = manager.query();  
        
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();  
        for (Fruit fruit : fruits) {  
            Map<String, String> map = new HashMap<String, String>();  
            map.put("name", fruit.getName());  
            map.put("color", fruit.getColor());  
            map.put("taste", fruit.getTaste());
            list.add(map);  
        }  
        
        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.fruit,  
        		new String[]{"name", "color", "taste"}, new int[]{R.id.name, R.id.color, R.id.taste});

        listView.setAdapter(adapter);  
    }  
       
}
