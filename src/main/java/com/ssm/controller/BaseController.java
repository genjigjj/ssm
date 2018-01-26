package com.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.ssm.utils.Result;
import com.ssm.utils.StringEscapeEditor;

/**
* 功能简述：〈基础 controller〉
* @author     gjj
* @version   [版本号, YYYY-MM-DD]2018年1月26日下午2:39:02;
* @see       [相关类/方法]
* @since     [产品/模块版本]
* 
*/
public abstract class BaseController {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		/**
		 * 自动转换日期类型的字段格式
		 */
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));

		/**
		 * 防止XSS攻击
		 */
		binder.registerCustomEditor(String.class, new StringEscapeEditor(true,false));
	}

	
	/**
	 * 〈ajax返回失败〉
	 * @param [参数1]     [参数1说明]
	 * @param [参数2]     [参数2说明]
	 * @return [返回类型说明]
	 * @Author gjj
	 * Modify [修改人]
	 * Time   2018年1月26日下午2:40:31
	 */
	public Result renderError(String msg) {
		Result result = new Result();
		result.setMsg(msg);
		return result;
	}

	/**
	 * 〈ajax返回失败〉
	 * @param [参数1]     [参数1说明]
	 * @param [参数2]     [参数2说明]
	 * @return [返回类型说明]
	 * @Author gjj
	 * Modify [修改人]
	 * Time   2018年1月26日下午2:40:31
	 */
	public Result renderSuccess() {
		Result result = new Result();
		result.setSuccess(true);
		return result;
	}

	/**
	 * 〈ajax返回成功〉
	 * @param [参数1]     [参数1说明]
	 * @param [参数2]     [参数2说明]
	 * @return [返回类型说明]
	 * @Author gjj
	 * Modify [修改人]
	 * Time   2018年1月26日下午2:40:31
	 */
	public Result renderSuccess(String msg) {
		Result result = new Result();
		result.setSuccess(true);
		result.setMsg(msg);
		return result;
	}

	/**
	 * 〈ajax返回成功〉
	 * @param [参数1]     [参数1说明]
	 * @param [参数2]     [参数2说明]
	 * @return [返回类型说明]
	 * @Author gjj
	 * Modify [修改人]
	 * Time   2018年1月26日下午2:40:31
	 */
	public Result renderSuccess(Object obj) {
		Result result = new Result();
		result.setSuccess(true);
		result.setObj(obj);
		return result;
	}
}
