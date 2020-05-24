package br.com.jp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String email;
	private Integer phone;
	
	public User() {}

	public User(String name, String email, Integer phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	//@Override
	//public String toString() {
	//	return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	//}
	
	
	
	
}
