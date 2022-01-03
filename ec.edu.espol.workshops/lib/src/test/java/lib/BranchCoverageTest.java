package lib;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ec.edu.espol.workshops.CarInsurance;
import ec.edu.espol.workshops.CarInsurance.Customer;

public class BranchCoverageTest {

CarInsurance insurance = new CarInsurance();
	
	   //test to calculate premium
	   @Test
public void testCalculatePremium() {
		  
	      Customer t1 = new Customer(24,"M","not married", true);
	      double premiumt1 = insurance.computePremium(t1);
	      //assertEquals(2000, premiumt1, 0.0);
	      
	      Customer t2 = new Customer(26,"F","married", true);
	      double premiumt2 = insurance.computePremium(t2);
	      //assertEquals(300, premiumt2, 0.0);
	      
	      Customer t3 = new Customer(45,"M","married", true);
	      double premiumt3 = insurance.computePremium(t3);
	      //assertEquals(200, premiumt3, 0.0);
	      
	      Customer t4 = new Customer(-10,"F","not married", true);
	      double premiumt4 = insurance.computePremium(t4);
	      //assertEquals(-1, premiumt4, 0.0);
	      
	      Customer t5 = new Customer(66,"M","not married", true);
	      double premiumt5 = insurance.computePremium(t5);
	      //assertEquals(500, premiumt5, 0.0);
	      
	      Customer t6 = new Customer(25,"H","married", true);
	      double premiumt6 = insurance.computePremium(t6);
	      //assertEquals(-1, premiumt6, 0.0);
 
	      Customer t7= new Customer(50,"M","not married",true);
	      double premiumt7= insurance.computePremium(t7);
	      
	      Customer t8= new Customer(65,"M","not married",true);
	      double premiumt8= insurance.computePremium(t8);
	      
	      Customer t9 = new Customer(45,"M","not married", true);
	      double premiumt9 = insurance.computePremium(t9);
	      
	      Customer t10 = new Customer(30,"M","not married", true);
	      double premiumt10 = insurance.computePremium(t10);
	      
	   }

	   // test to verify license
	   @Test 
public void testLicence() {
		   
		   
		  Customer customert1 = new Customer(81,"F","not married",false);
	      String licenciat1 = insurance.policies(customert1); 
	      //assertEquals("not sell", licenciat1);
	      
	      Customer customert2 = new Customer(21,"M","married",true);
	      String licenciat2 = insurance.policies(customert2); 
	      //assertEquals("sell", licenciat2);
	      
	   }
}
