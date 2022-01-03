package ec.edu.espol.workshops;


//import static org.junit.Assert.*;

import ec.edu.espol.workshops.CarInsurance.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefs {

	public Customer c1= new Customer();
	public CarInsurance car= new CarInsurance();
	private double actualAnswer;

	
	Customer c3 = new Customer(-23, "M", "married", true);
	@Given("the client has negative age")
	public void client_over_82_years_old(){
		c1.setAge(-23);
		c1.setSex("M");
		c1.setMaritalStatus("married");
		c1.setHasLicence(true);
		//car.policies(c1);		
	}
	@Given("the client has negative {string}")
	public void the_client_is_years_old(String string) {
		
		c1.setAge(Integer.parseInt(string));
		c1.setSex("M");
		c1.setMaritalStatus("married");
		c1.setHasLicence(true);
		//car.policies(c1);		
	}
	
	@When("I ask whether can calculate the premium")
	public void calculate_the_premium(){
		actualAnswer = car.computePremium(c1);	
	}
	
	
	@Then(" I should show -1")
	public void should_show(){
		//assertEquals(-1,actualAnswer);
	}
	
	@Then("I should show {string}")
	public void i_should_show(String string) {
		//assertEquals(-1,actualAnswer);
	}


	 
	
	
	}