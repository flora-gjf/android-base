package com.test.fragment;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BookListFragment extends ListFragment
{
	private Callbacks mCallbacks;

	public interface Callbacks
	{
		public void onItemSelected(Integer id);
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<BookContent.Book>(getActivity(),android.R.layout.simple_list_item_activated_1,android.R.id.text1, BookContent.ITEMS));
	}
	
	@Override
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);

		if (!(activity instanceof Callbacks))
		{
			try {
				throw new Exception("error");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		mCallbacks = (Callbacks)activity;
	}

	@Override
	public void onDetach()
	{
		super.onDetach();
		mCallbacks = null;
	}

	@Override
	public void onListItemClick(ListView listView, View view, int position, long id)
	{
		super.onListItemClick(listView, view, position, id);

		mCallbacks.onItemSelected(BookContent.ITEMS.get(position).id);
	}

}
