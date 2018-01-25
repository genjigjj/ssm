package com.ssm.model;


import lombok.Data;

/**
* @Description: 用户表
* @author jiangcaijun
* @date 2016年12月15日 下午5:37:51 
*/
@Data
public class User {
    private String id;

    private String userName;

    private String password;

    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
    
    
    
}