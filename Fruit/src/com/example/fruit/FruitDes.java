package com.example.fruit;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FruitDes extends Fragment{
	public static String REQUST = "1";
	
	private Fruit fruit;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.v("gjf", "FruitDes_onCreate");
		
		if(this.getArguments() != null){
			fruit = (Fruit) (FruitManger.getFruitList().get((this.getArguments().getInt(REQUST))));			
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.v("gjf","FruitDes_onCreateView");
		
		View fruit_des_view = inflater.inflate(R.layout.fruit_des, container,false);
		((TextView)(fruit_des_view.findViewById(R.id.fruit_des_text))).setText("我是大"+fruit.getName()+":   我看起来"+fruit.getColor()+", 尝起来味道"+fruit.getTaste());
		return fruit_des_view;
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
	}
 
}
