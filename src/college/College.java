package college;

public class College {
 private String name;
 private String classname;
 private int pin;
 private Address address;
 public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}

}
