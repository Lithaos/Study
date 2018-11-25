package pl.study.model;

import javax.validation.constraints.NotEmpty;

public class User {

	private Long id;

	@NotEmpty(message = "Podaj imię")
	private String userName;

	private int age;

	private String sex;

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
