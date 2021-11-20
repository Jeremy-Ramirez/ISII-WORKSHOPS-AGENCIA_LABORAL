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
  public double computePremium(Customer c) {
    int premium = 0;
    if(c.getAge()<18) {
    	return -1;
    }
    if(c.getSex()!="M" && c.getSex()!="F") {
    	return -1;
    }
    
    if (c.getSex() == "M" && c.getMaritalStatus().equals("not married") && c.getAge() < 25) {
      premium = basePremium + 1500;
      return premium;
    }
    if (c.getSex() == "F" || c.getMaritalStatus().equals("married")) {
      premium = basePremium - 200;
      return premium;
    }
    if (c.getAge() >= 45 && c.getAge() <= 65) {
      premium = basePremium - 100;
      return premium;
    }
    if(!c.getMaritalStatus().equals("not married") && !c.getMaritalStatus().equals("married")) {
    	return -1;
    }
    
    return basePremium;
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
		
		Customer c1 = new Customer(18, "F", "not married", false);
		Customer c2 = new Customer(17, "F", "married", false);
		Customer c3 = new Customer(19, "M", "married", true);
		Customer c4 = new Customer(25, "M", "married", true);
		Customer c5 = new Customer(24, "M", "married", true);
		
		Customer c6 = new Customer(26, "M", "married", false);
		Customer c7 = new Customer(45, "M", "married", false);
		Customer c8 = new Customer(44, "M", "not married", false);
		Customer c9 = new Customer(46, "M", "married", false);
		Customer c10 = new Customer(65, "M", "married", true);
		
		Customer c11 = new Customer(64, "M", "not married", false);
		Customer c12 = new Customer(66, "M", "married", false);
		Customer c13 = new Customer(80, "M", "not married", true);
		Customer c14 = new Customer(79, "M", "married", false);
		Customer c15 = new Customer(81, "F", "married", true);

		
		
		CarInsurance car= new CarInsurance();
		
		System.out.println("c1 " + car.computePremium(c1));
		System.out.println("c2 " + car.computePremium(c2));
		System.out.println("c3 " + car.computePremium(c3));
		System.out.println("c4 " + car.computePremium(c4));
		System.out.println("c5 " + car.computePremium(c5));
		System.out.println("c6 " + car.computePremium(c6));
		System.out.println("c7 " + car.computePremium(c7));
		System.out.println("c8 " + car.computePremium(c8));
		System.out.println("c9 " + car.computePremium(c9));
		System.out.println("c10 " + car.computePremium(c10));
		System.out.println("c11 " + car.computePremium(c11));
		System.out.println("c12 " + car.computePremium(c12));
		System.out.println("c13 " + car.computePremium(c13));
		System.out.println("c14 " + car.computePremium(c14));
		System.out.println("c15 " + car.computePremium(c15));

	}

	
}
