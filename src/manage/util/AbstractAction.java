package manage.util;

import java.io.IOException;


import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	public void writeJson(Object object) {
		try {
			JSONObject json =JSONObject.fromObject(object);
			//String json = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss", new SerializerFeature[0]);
			ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
			ServletActionContext.getResponse().getWriter().write(json.toString());
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
