package com.gjf.test.listview;

public class ItemData {
	
	private int id;
	private int type;
	
	public ItemData(int id, int type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}	
}
