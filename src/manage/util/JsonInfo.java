package manage.util;

public class JsonInfo {
	private boolean success;//是否操作成功
	private String mes;//返回操作信息
	private Object pageData = null;//返回操作数据
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public Object getPageData() {
		return pageData;
	}
	public void setPageData(Object pageData) {
		this.pageData = pageData;
	}
	

}
