package com.example.fruit;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class Select_Fruit extends Activity implements FruitList.Callback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("gjf", "Select_Fruit_onCreate");
        
        setContentView(R.layout.activity_select__fruit);
     
    }

    @Override
	public void onSelected(int id) {	
    	Log.v("gjf", "Select_Fruit_onSelected");
    	
    	Bundle bundle = new Bundle();
		bundle.putInt(FruitDes.REQUST, id);	
		FruitDes fruitDes = new FruitDes();
		fruitDes.setArguments(bundle);
        this.getFragmentManager().beginTransaction().replace(R.id.frame_fruit_des, fruitDes).commit();
	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.select__fruit, menu);
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
