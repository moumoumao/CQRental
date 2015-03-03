package manage.util;

import java.util.List;

public class PageBean {
	private Object recordList=null;//当前页面数据
	private int pageSize;//一页多少条
	private int rowCount;//总条数
	private int currentPage;//当前页码
	private int pageCount;//总页数
	

	public Object getRecordList() {
		return recordList;
	}
	public void setRecordList(Object recordList) {
		this.recordList = recordList;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageCount() {
		return rowCount%pageSize==0?rowCount/pageSize:rowCount/pageSize+1;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	

}
