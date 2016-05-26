package com.hlm.bean;

public class Tablet {
	private String id;
	private String size;
	private String color;
	private String price;
	private String grand;
	
	public Tablet() {
		// TODO Auto-generated constructor stub
	}

	public Tablet(String id, String size, String color, String price, String grand) {
		super();
		this.id = id;
		this.size = size;
		this.color = color;
		this.price = price;
		this.grand = grand;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGrand() {
		return grand;
	}

	public void setGrand(String grand) {
		this.grand = grand;
	}

	@Override
	public String toString() {
		return "Tablet [id=" + id + ", size=" + size + ", color=" + color + ", price=" + price + ", grand=" + grand
				+ "]";
	}
	
	

}
