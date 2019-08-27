package com.collabora.animal;

public interface Flys {
	String fly();
}

class ItFlys implements Flys{
	public  String fly() {
		return "Flying";
	}
}
class CantFly implements Flys{
	public  String fly() {
		return "Cannot fly";
	}
}