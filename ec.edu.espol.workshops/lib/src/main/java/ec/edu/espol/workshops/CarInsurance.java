package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {
	
  public static class Customer{
    public int age; 
    public String sex;
    public String maritalStatus;
    public boolean hasLicence;
		
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
    if(c.getAge()<=0) {
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
		
		Customer c1 = new Customer(23, "F", "married", false);
		Customer c2 = new Customer(46, "M", "not married", true);
		Customer c3 = new Customer(-23, "M", "married", true);
		
		
		CarInsurance car= new CarInsurance();
		
		System.out.println(car.computePremium(c2));
		System.out.println(car.computePremium(c3));
		
		System.out.println(car.policies(c1));
		

	}

	
}
