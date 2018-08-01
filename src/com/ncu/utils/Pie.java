package com.ncu.utils;
import java.util.List;
public class Pie {
/* *
 * 用于封装highcharts中大饼状图形的报表数据信息工具类
 * */
	private String name;
	private List<Partment> data;
	public Pie(String name, List<Partment> data) {
		super();
		this.name = name;
		this.data = data;
	}
	public Pie() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Partment> getData() {
		return data;
	}
	public void setData(List<Partment> data) {
		this.data = data;
	}
}