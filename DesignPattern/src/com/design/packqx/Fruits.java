package com.design.packqx;

public enum Fruits {
	apple(1,"apple"),
	orange(2,"orange");
	
	private Integer id;
	private String value;
	
	private Fruits(Integer id, String value) {
		this.id = id;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	//¹«¹²·µ»Ø
	public static Fruits getFruits(Integer id) {
		if(id == null) {
			return null;
		}
		for(Fruits fruits : values()) {
			if(id == fruits.getId()) {
				return fruits;
			}
		}
		return null;
		
	}
	
}
