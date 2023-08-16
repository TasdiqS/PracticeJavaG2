package serializationPrac;

import java.io.Serializable;

public class Person implements Serializable{

	String name;
	int age;
	String nationality;
	short height;
	
	
	public Person(String name, int age, String nationality, short height) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public short getHeight() {
		return height;
	}
	public void setHeight(short height) {
		this.height = height;
	}
	
	
}
