package model;

public class Student {
	
  private int roll;
  private String name;
  private String address;
  
  
  public Student() {
	  
	   super();
	   
      }


  public Student(int roll) {
	 super();
	this.roll = roll;
	
   }


public Student(String name) {
	super();
	this.name = name;
}


public Student(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}


public Student(int roll, String name, String address) {
	super();
	this.roll = roll;
	this.name = name;
	this.address = address;
}


@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
}
  
  
  

}
