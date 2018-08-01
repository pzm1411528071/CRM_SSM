package com.ncu.utils;
public class TreeNode {
/* *
 * ztree树上的一个节点
 * 与前端json格式的对象属性要完全对应
 * */
	private Integer id;
	private Integer pId;
	private String name;
	private boolean open;
	private boolean checked;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public TreeNode() {
		super();
	}
	public TreeNode(Integer id, Integer pId, String name, boolean open, boolean checked) {
		super();
		this.id = id;
		this.pId = pId;
		this.name = name;
		this.open = open;
		this.checked = checked;
	}
}
