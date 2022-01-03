package lib;
import org.junit.Test;

import ec.edu.espol.workshops.CarInsurance;
import ec.edu.espol.workshops.CarInsurance.Customer;

import static org.junit.Assert.assertEquals;

public class StatementCoverageTest {
	CarInsurance insurance = new CarInsurance();
	
	
	
	   //test to check appraisal
	   @Test
	   public void testCalculatePremium() {
		   //customer.setAge(24);
		   //customer.setMaritalStatus("not married");
		   //customer.setSex("M");
		   //customer.setHasLicence(true);
			
	      //double premium = insurance.computePremium(customer);
	      //assertEquals(2000, premium, 0.0);
	      
	      Customer t1 = new Customer(24,"M","not married", true);
	      double premiumt1 = insurance.computePremium(t1);
	      assertEquals(2000, premiumt1, 0.0);
	      
	      Customer t2 = new Customer(26,"F","married", true);
	      double premiumt2 = insurance.computePremium(t2);
	      assertEquals(300, premiumt2, 0.0);
	      
	      Customer t3 = new Customer(45,"M","married", true);
	      double premiumt3 = insurance.computePremium(t3);
	      assertEquals(200, premiumt3, 0.0);
	      
	      Customer t4 = new Customer(-10,"F","not married", true);
	      double premiumt4 = insurance.computePremium(t4);
	      assertEquals(-1, premiumt4, 0.0);
	      
	      Customer t5 = new Customer(66,"M","not married", true);
	      double premiumt5 = insurance.computePremium(t5);
	      assertEquals(500, premiumt5, 0.0);
	      
	      Customer t6 = new Customer(25,"H","married", true);
	      double premiumt6 = insurance.computePremium(t6);
	      assertEquals(-1, premiumt6, 0.0);
	      
	   }

	   // test to check yearly salary
	   @Test
	   public void testLicence() {
		   //customer.setAge(25);
		   //customer.setMaritalStatus("married");
		   //customer.setSex("F");
		   //customer.setHasLicence(true);
		   
		  Customer customert1 = new Customer(81,"F","not married",false);
	      String licenciat1 = insurance.policies(customert1); 
	      assertEquals("not sell", licenciat1);
	      
	      Customer customert2 = new Customer(21,"M","married",true);
	      String licenciat2 = insurance.policies(customert2); 
	      assertEquals("sell", licenciat2);
	   }

}
