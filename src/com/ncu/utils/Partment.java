package com.ncu.utils;
public class Partment {
/* *
 * 大饼中不同百分比对应的信息封装类
 * */
	private String name;
	private double y;
	public Partment(String name, double y) {
		super();
		this.name = name;
		this.y = y;
	}
	public Partment() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}

