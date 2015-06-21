package com.test.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookContent
{
	public static class Book
	{

		public Integer id;
		public String title;
		public String desc;

		public Book(Integer id, String title, String desc)
		{
			this.id = id;
			this.title = title;
			this.desc = desc;
		}

		@Override
		public String toString()
		{
			return title;
		}
	}

	public static List<Book> ITEMS = new ArrayList<Book>();

	public static Map<Integer, Book> ITEM_MAP = new HashMap<Integer, Book>();

	static
	{
		for (int i = 1; i < 10; i++) {
			addItem(new Book(i, "标题    "+i, "内容巴拉巴拉  "+i));
		}	
	}

	private static void addItem(Book book)
	{
		ITEMS.add(book);
		ITEM_MAP.put(book.id, book);
	}
}
