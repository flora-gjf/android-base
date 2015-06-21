package com.example.testfile;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText tianjia_text;
	Button tijiao;
	Button shanchu;
	TextView neirong;
	FileHelper fileHelper;
	CheckBox moren;
	CheckBox zhuijia;
	boolean flag_moren;
	boolean flag_zhuijia;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        fileHelper = new FileHelper(this, "test.txt");
        
        tianjia_text = (EditText) findViewById(R.id.tianjia_text);
        neirong = (TextView) findViewById(R.id.neirong);
    	tijiao = (Button) findViewById(R.id.tijiao);
    	shanchu = (Button) findViewById(R.id.shanchu);
    	moren = (CheckBox) findViewById(R.id.moren);
    	zhuijia = (CheckBox) findViewById(R.id.zhuijia);
    	
    	flag_moren = false;
    	flag_zhuijia = false;
    	
        tijiao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(moren.isChecked()){
					fileHelper.write(tianjia_text.getText().toString());
					moren.setChecked(false);
					display();					
				}else if(zhuijia.isChecked()){
					fileHelper.write_append(tianjia_text.getText().toString());
					zhuijia.setChecked(false);
					display();
				}
			}
		});
        
        shanchu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub	
				if(fileHelper.delete()){
					Log.v("gjf","-------------------------------onClick_shanchu");
				}
				display();
			}
		});
        
    }

    private void display(){
    	neirong.setText(fileHelper.read());
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
