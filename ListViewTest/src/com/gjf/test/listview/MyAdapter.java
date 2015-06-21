package com.gjf.test.listview;


import java.util.List;

import com.example.testqqqqqqqqqqqq.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends BaseAdapter  {

    private Context mContext;
    private List<ItemData> mList;
    private LayoutInflater mInflater;
    
    public static final int TYPE_FIRST = 0;
	public static final int TYPE_SECOND = 1;
	public static final int TYPE_THIRD = 2;

    public MyAdapter(Context context, List<ItemData> mList) {
        this.mContext = context;
        this.mList = mList;
        this.mInflater = LayoutInflater.from(this.mContext);
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }
    
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	
	      ViewHolder holder = null;
	      
	      int type=getItemViewType(position);
        
	      if (convertView == null){
	    	  
	          holder=new ViewHolder();
	          
	          if (TYPE_FIRST == type){
	        	  
	              convertView = mInflater.inflate(R.layout.first,null);
	              holder.imageView = (ImageView) convertView.findViewById(R.id.imageView1);
	              holder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
	              
	          }else if(TYPE_SECOND == type){
	        	  
	              convertView = mInflater.inflate(R.layout.second,null);
	              holder.imageView = (ImageView) convertView.findViewById(R.id.imageView1);
	              holder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
	              holder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
	              
	          }else if(TYPE_THIRD == type){
	        	  
	              convertView = mInflater.inflate(R.layout.third,null);
	              holder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
	              holder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
	              holder.button = (Button) convertView.findViewById(R.id.button1);
	              
	          }else{
	        	  
	          }
	          
	          convertView.setTag(holder);
	          
	      }else{
	    	  
	          holder= (ViewHolder) convertView.getTag();
	      }	 
	      
	      if (TYPE_FIRST == type){
        	  
	    	  holder.imageView.setBackgroundResource(R.drawable.ic_launcher);
              holder.textView1.setText("不睡了");
              
          }else if(TYPE_SECOND == type){
        	  
        	  holder.imageView.setBackgroundResource(R.drawable.ic_launcher);
              holder.textView1.setText("好吧好吧不睡了");
              holder.textView2.setText("对，就是不睡了");
              
          }else if(TYPE_THIRD == type){
        	  
        	  holder.textView1.setText("好吧好吧不睡了");
              holder.textView2.setText("对，就是不睡了");
              holder.button.setText("哼哼哒");
              
          }else{
        	  
          }
          
		  return convertView;
		  
	 }
	
	 class ViewHolder{
		  
		  public ImageView imageView;
		  public TextView textView1;
		  public TextView textView2;
		  public Button button;
	 }

  
}
