/**
 * 
 */
package com.vito16.shop.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 管理员
 * @author 周欣文
 * @date 2018/10/16
 * 
 */
@Entity
@Table(name = "t_admin")
public class Admin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;//账户名
	private String password;//密码

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
