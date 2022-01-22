package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {
	
  public static class Customer{
    public int age; 
    public String sex;
    public String maritalStatus;
    public boolean hasLicence;
		
    
    public Customer() {
    	
    }
    
    public Customer(int age, String sex, String maritalStatus, boolean hasLicence) {
      this.age = age;
	  this.sex = sex;
	  this.maritalStatus = maritalStatus;
	  this.hasLicence = hasLicence;
    }
    
    public Customer(String sex, String maritalStatus, boolean hasLicence) {
  	  this.sex = sex;
  	  this.maritalStatus = maritalStatus;
  	  this.hasLicence = hasLicence;
      }
   

    public int getAge() {
	  return age;
    }
    public String getSex() {
	  return sex;
    }

    public String getMaritalStatus() {
	  return maritalStatus;
    }

		
    public boolean isHasLicence() {
	  return hasLicence;
    }

    public void setHasLicence(boolean hasLicence) {
	  this.hasLicence = hasLicence;
    }

		
		
    public void  setAge(int age)    { 
	  this.age = age;
    }
    public void  setSex(String sex)    {
	  this.sex = sex;
    }
    public void  setMaritalStatus(String maritalStatus)    {
	  this.maritalStatus = maritalStatus;
    }
  }
	
  /**
   * The base insurance cannot be change
  */
  final static int basePremium=500; 
	

  /**
   * 
  */
public double computePremium(Customer c){
    int premium = basePremium;
    if(c.getAge()<18 || c.getAge()>80) {
		  return -1;
	}
    if(c.getSex()!="M" && c.getSex()!="F") {
    	return -1;
    }
    if (c.getSex() == "M" && c.getMaritalStatus().equals("not married") && c.getAge() < 25) {
      premium = premium + 1500;
    }
    if(c.getMaritalStatus().equals("not married") && c.getSex().equals("F") && c.getAge()>60) {
     premium = premium - 50;
     	
    }
    if(c.getMaritalStatus().equals("married") && c.getAge()>30 && c.getAge()<60) {
        premium = premium - 100;
        
  	}
    if (c.getSex() == "F" || c.getMaritalStatus().equals("married")) {
      premium = premium - 200;
      
    }
    if (c.getAge() >= 45 && c.getAge() <= 65) {
      premium = premium - 100;
      
    }
    
    return premium;
}
	
	/**
	 * Validate customer limit age and if have licence
	*/
	public String policies(Customer c) {
		if(c.getAge()>80 || !(c.isHasLicence()) ) {
			return "not sell";
		}
		return "sell";
	}
	
	/**
	 * 
	*/
	public static void main(String[] args) {
		
		Customer c1 = new Customer(24, "M", "not married", false);
		Customer c2 = new Customer(36, "F", "married", true);
		Customer c3 = new Customer(50, "M", "not married", true);
		Customer c4 = new Customer(81, "F", "married", true);
		Customer c5 = new Customer(34, "M", "married", true);
		Customer c6 = new Customer(57, "F", "married", true);
		Customer c7 = new Customer(49, "M", "married", true);
		Customer c8 = new Customer(70, "F", "not married", true);
		//Customer c9 = new Customer(70.5, "F", "not married", true);
		Customer c10 = new Customer(15, "F", "not married", true);
		Customer c11 = new Customer(20, "O", "not married", true);
		
		
		CarInsurance car= new CarInsurance();
		
		System.out.println("eeee");
		System.out.println("c1 " + car.computePremium(c1));
		System.out.println("c2 " + car.computePremium(c2));
		System.out.println("c3 " + car.computePremium(c3));
		System.out.println("c4 " + car.computePremium(c4));
		System.out.println("c5 " + car.computePremium(c5));
		System.out.println("c6 " + car.computePremium(c6));
		System.out.println("c7 " + car.computePremium(c7));
		System.out.println("c8 " + car.computePremium(c8));

		System.out.println("c10 " + car.computePremium(c10));
		System.out.println("c11 " + car.computePremium(c11));

		

	}

	
}
