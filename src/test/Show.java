package test;

import college.Address;
import college.College;
import student.Student;

public class Show {
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setName("Reema");
		s1.setAge(30);
		College c1=new College();
		c1.setName("CIEM");
		c1.setClassname("ECE");
		c1.setPin(700061);
		Address cAddress=new Address();
		cAddress.setHnumber("tolllygange");
		cAddress.setPin(700061);
		cAddress.setPs("Tollygangefanri");
		c1.setAddress(cAddress);
		s1.setCollege(c1);
		Address sAddress=new Address();
		sAddress.setHnumber("9/2a LN Motilal Road");
		sAddress.setPs("Sursuna");
		s1.setAddress(sAddress);
		System.out.println("the name is:"+s1.getName());
		System.out.println("age is:"+s1.getAge());
		System.out.println("college information:"+"    college name:"+s1.getCollege().getName()
				+"    department:"+s1.getCollege().getClassname()+"    Pin:"+s1.getCollege().getPin()
				+"    address:"+s1.getCollege().getAddress().getHnumber()+"   PS:"+s1.getCollege().getAddress().getPs());
		System.out.println("address of student:"+s1.getAddress().getHnumber()+"    PS of student:"+s1.getAddress().getPs());
		
		
		
	}

}
