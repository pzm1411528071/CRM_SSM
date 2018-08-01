package com.ncu.utils;
import java.io.Serializable;
import java.util.List;
@SuppressWarnings("unused")
public class PageBean<T> implements Serializable {
/* *
 * 分页
 * */
    private static final long serialVersionUID = -3198048449643774660L;
    private int pageNow = 1; // 当前页数
    private int pageSize = 3; // 每页显示记录的条数
    private int totalCount; // 总的记录条数
    private int totalPageCount; // 总的页数
    private int startPos; // 开始位置，从0开始
    private List<T> dataList;//页面要显示的数据集合
    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
    public PageBean(){}
    //通过构造函数 传入总记录数 和 当前页
    public PageBean(int totalCount, int pageNow) {
    	if(pageNow==0){
    		pageNow = 1;
    	}
        this.totalCount = totalCount;
        this.pageNow = pageNow;
    }

    //取得总页数，总页数=总记录数/每页显示记录的条数
    public int getTotalPageCount() {
        totalPageCount = getTotalCount() / getPageSize();
        return (totalCount % pageSize == 0) ? totalPageCount : totalPageCount + 1;
    }

    //取得选择记录的初始位置
    public int getStartPos() {
        return (pageNow - 1) * pageSize;
    }
}
