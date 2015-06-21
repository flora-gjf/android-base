package com.example.fruit;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FruitList extends ListFragment{
	
	public Callback callback; 
	
	public static interface Callback{
		public void onSelected(int id);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.v("gjf", "FruitList_onCreate");
	   
		this.setListAdapter(new ArrayAdapter<String>(getActivity(), 
				android.R.layout.simple_list_item_activated_1,
				FruitManger.getFruitList()));		
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		callback = (Callback) activity;
	}
	
	@Override
	public void onDetach() {
		super.onDetach();
		callback = null;
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Log.v("gjf", "FruitList_onListItemClick"+position);
		
		super.onListItemClick(l, v, position, id);
		callback.onSelected(position);
	}


	

}
