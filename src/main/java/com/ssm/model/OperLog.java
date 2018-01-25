package com.ssm.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import com.alibaba.fastjson.annotation.JSONField;

/***
 * @description 对应t_log表
 * */
@Data
public class OperLog implements Serializable {

	private static final long serialVersionUID = -8690056878905494181L;

	private Long id;
	private String userId;// '操作用户ID',
	private String userName;// '操作人名称',
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date operTime;// '操作时间(yyyy-MM-dd HH:mm:ss)',
	private String clientIp;// '登录IP',
	private String reqUrl;// 访问url
	private String method;// 请求方法
	private String operEvent;// 操作事件（删除，新增，修改，查询，登录，退出）',
	private int operStatus;// '操作状态（1：成功，2：失败）',
	private String logDesc;// 描述信息',
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getOperTime() {
		return operTime;
	}
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getReqUrl() {
		return reqUrl;
	}
	public void setReqUrl(String reqUrl) {
		this.reqUrl = reqUrl;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getOperEvent() {
		return operEvent;
	}
	public void setOperEvent(String operEvent) {
		this.operEvent = operEvent;
	}
	public int getOperStatus() {
		return operStatus;
	}
	public void setOperStatus(int operStatus) {
		this.operStatus = operStatus;
	}
	public String getLogDesc() {
		return logDesc;
	}
	public void setLogDesc(String logDesc) {
		this.logDesc = logDesc;
	}
	
	
	
	
}