package com.example.fruit;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

public class FruitManger {
	public static List<Fruit> FruitList;
	
	static{
		Log.v("gjf", "FruitManger_static");
		FruitList = new ArrayList<Fruit>(15);

		Fruit pingguo = new Fruit("Æ»¹û", "ºìºìßÕ", "ÌğÌğßÕ");
		Fruit taozi = new Fruit("ÌÒ×Ó", "·Û·ÛßÕ", "ËáËáßÕ");
		Fruit xigua = new Fruit("Î÷¹Ï", "ÂÌÂÌßÕ", "ÌğËáßÕ");
		addFruit(pingguo);
		addFruit(taozi);
		addFruit(xigua);
		addFruit(pingguo);
		addFruit(taozi);
		addFruit(xigua);
		addFruit(pingguo);
		addFruit(taozi);
		addFruit(xigua);
		addFruit(pingguo);
		addFruit(taozi);
		addFruit(xigua);

	}
	
	private static void addFruit(Fruit fruit){
		FruitList.add(fruit);
	}
	
	public static List getFruitList() {
		return FruitList;
	}
	
}
