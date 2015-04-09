package org.pb.common.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Base
 * @author jiabaohua
 *
 */
public class BaseController {

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
	/**
	 * spring ModelAttribute
	 * �����ڷ������棺��ʾ��������ÿ��Actionǰ��������ִ������Ҳ���Խ�һЩ׼�����ݵĲ��������ڸ÷�������
	 */
	@ModelAttribute
	public void setBaseController(HttpServletRequest request,HttpServletResponse response){
		this.request=request;
		this.response=response;
		this.session=request.getSession();
	}
	
}
