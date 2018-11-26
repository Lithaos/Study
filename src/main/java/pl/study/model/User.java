package pl.study.model;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "User_Entity")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull(message = "Zaznacz płeć!")
	private String sex;

	@NotNull(message = "Podaj poprawny wiek!")
	@Min(value = 16, message = "Nieodpowiedni wiek!")
	private int age;

	public String getSex() {
		return sex;
	}

	private int line = new Random().nextInt(2);

	private boolean article1 = false;
	private boolean article2 = false;
	private boolean article3 = false;
	private boolean article4 = false;
	private boolean article5 = false;

	public boolean isArticle1() {
		return article1;
	}

	public void setArticle1(boolean article1) {
		this.article1 = article1;
	}

	public boolean isArticle2() {
		return article2;
	}

	public void setArticle2(boolean article2) {
		this.article2 = article2;
	}

	public boolean isArticle3() {
		return article3;
	}

	public void setArticle3(boolean article3) {
		this.article3 = article3;
	}

	public boolean isArticle4() {
		return article4;
	}

	public void setArticle4(boolean article4) {
		this.article4 = article4;
	}

	public boolean isArticle5() {
		return article5;
	}

	public void setArticle5(boolean article5) {
		this.article5 = article5;
	}

	public int getLine() {
		return line;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", sex=" + sex + ", age=" + age + ", line=" + line + "]";
	}

}
