package com.test.fragment;

import org.crazyit.app.R;

import android.app.Activity;
import android.os.Bundle;

public class SelectBookActivity extends Activity implements
		BookListFragment.Callbacks
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_book);
	}

	@Override
	public void onItemSelected(Integer id)
	{
		Bundle arguments = new Bundle();
		arguments.putInt(BookDetailFragment.ITEM_ID, id);	
		BookDetailFragment fragment = new BookDetailFragment();
		fragment.setArguments(arguments);
		getFragmentManager().beginTransaction().replace(R.id.book_detail_container, fragment).commit();  
	}
}
