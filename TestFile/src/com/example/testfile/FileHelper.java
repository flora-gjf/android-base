package com.example.testfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class FileHelper {

	File file;
	String file_name;
	Context context;
	
	public FileHelper(Context context, String name) {
		// TODO Auto-generated constructor stub
		this.file_name = name;
		this.context = context;
		file = new File(name);
	}
	
	public FileHelper(Context context, String path, String name) {
		// TODO Auto-generated constructor stub
		this.file_name = name;
		this.context = context;
		try {
			file = new File(path, name);
		} catch (Exception e) {
		}	
	}
	
	public String read(){
		StringBuffer sb = new StringBuffer();;
		try {
			FileInputStream fis = context.openFileInput(file_name);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line = null;
			while((line = br.readLine()) != null){
				sb.append(line);
			}
			br.close();

//			byte[] buff = new byte[1024];
//			int num = 0;
//			while((num = fis.read(buff)) > 0){
//				sb.append(new String(buff,0,num));
//			}
//			fis.close();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public boolean write(String text){
		try {
			FileOutputStream fos = context.openFileOutput(file_name,context.MODE_WORLD_WRITEABLE);

			PrintStream ps = new PrintStream(fos);
			ps.println(text);
			ps.close();
			//小文件酱紫处理就行
//			byte[] buffer = text.getBytes();
//			fos.write(buffer);
//			fos.close()
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}	
		return true;
	}
	
	public boolean write_append(String text){
		try {
			FileOutputStream fos = context.openFileOutput(file_name,context.MODE_APPEND);

			PrintStream ps = new PrintStream(fos);
			ps.println(text);
			ps.close();

		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}	
		return true;
	}
	
	public boolean delete(){
		Toast.makeText(context, file.getAbsolutePath(), 1).show();
		if(file.exists()){
			file.delete();
			return true;
		}
		return false;		
	}
	
}
