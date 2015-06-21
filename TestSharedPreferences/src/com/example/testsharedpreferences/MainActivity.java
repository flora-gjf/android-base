package com.example.testsharedpreferences;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	EditText name_edit;
	EditText mima_edit;
	Button tijaio;
	TextView jieguo;
	SharedPreferencesHelper sharedPreferencesHelper;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	
        sharedPreferencesHelper = new SharedPreferencesHelper(this, "testtt");
        
        name_edit = (EditText) findViewById(R.id.name_edit);
        mima_edit = (EditText) findViewById(R.id.mima_edit);
        jieguo = (TextView) findViewById(R.id.jieguo);
        tijaio = (Button) findViewById(R.id.tijiao);
    	          
        tijaio.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
                    //Ð´Èë
					write();
					//¶Á³ö
					read();			
			}
		});
    }
    
    public void write(){
    	String name = name_edit.getText().toString();
    	String mima = mima_edit.getText().toString();
    	
    	sharedPreferencesHelper.putValue("name", name);
    	sharedPreferencesHelper.putValue("mima", mima);
			
    }
    public void read(){
    	String name = sharedPreferencesHelper.getValue("name");
    	String mima = sharedPreferencesHelper.getValue("mima");
    	
    	jieguo.setText("ÐÕÃû: "+name+"  ÃÜÂë: "+mima);

    }
}
