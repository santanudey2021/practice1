package student;

import college.Address;
import college.College;

public class Student {
private String name;
private College college;
private int age;
private Address address;
public void setName(String name)
{
	this.name=name;
}
public void setCollege(College college){
	this.college=college;
}
public void setAge(int age)
{
	this.age=age;
}

public String getName()
{
	return name;
}
public College getCollege()
{
	return college;
}
public int getAge()
{
	return age;
}
public Address getAddress()
{
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
