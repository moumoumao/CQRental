package manage.action;

import java.io.File;
import java.util.Date;

import org.apache.derby.iapi.services.io.FileUtil;
import org.apache.struts2.ServletActionContext;

import manage.util.AbstractAction;
import manage.util.JsonInfo;

public class FileUploadAction extends AbstractAction {
	private File[] upload;//上传文件
	private String[] uploadFileName;//上传文件名称
	private String[] uploadType;//上传文件类型
	private String savePath="/upload/";
	
	private String fileName;
	private String inputPath;
	public void doUpload(){
		String realPath = ServletActionContext.getServletContext().getRealPath(savePath);
		JsonInfo json = new JsonInfo();
		try{
			if(upload!=null&&upload.length>0){
				String pathStr="";
				for(int i=0;i<upload.length;i++){
					String dstPath = realPath +"\\" +new Date().getTime()+"_"+uploadFileName[i];
					File dst = new File(dstPath);
					FileUtil.copyFile(this.upload[i], dst);
					pathStr+=","+dstPath;
				}
				json.setSuccess(true);
				json.setMes("上传成功！");
				json.setPageData(pathStr);
			}
		}catch (Exception e) {
			json.setSuccess(false);
			json.setMes("上传过程中出现意外！");
		}finally{
			super.writeJson(json);
		}
	}
	private void downLoad(){
		
	}
	public File[] getUpload() {
		return upload;
	}
	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public String[] getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String[] getUploadType() {
		return uploadType;
	}
	public void setUploadType(String[] uploadType) {
		this.uploadType = uploadType;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
	
}
