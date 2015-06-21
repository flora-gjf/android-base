package com.example.testsharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class SharedPreferencesHelper {
	
	SharedPreferences sp;
    SharedPreferences.Editor edit;
    Context context;
    
	public SharedPreferencesHelper(Context context, String name) {
		// TODO Auto-generated constructor stub
		sp = context.getSharedPreferences(name, 0);
		edit = sp.edit();
	}
	
    public void putValue(String key,String value){
        
        edit.putString(key,value);
        edit.commit();
        
    }
    
    public String getValue(String key){
        
        return sp.getString(key,null);
    }
    
    public void deleteValue(String key){
        
        if(sp.contains(key)){
        	edit.remove(key);       	
        }
        Toast.makeText(context, "²»´æÔÚ"+key+"Å¶£¡", 0);
    }

}
