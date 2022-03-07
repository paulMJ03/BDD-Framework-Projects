package org.stepdef;

import java.util.List;
import java.util.Map;

import org.helper.HelperClass;
import org.pojo.PojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition extends HelperClass {
	
	@Given("^user in login functionality$")
	public void user_in_login_functionality() throws Throwable {
		loadUrl("https://www.facebook.com/");
	}

	@When("^user has to enter invalid username and invalid password$")
	public void user_has_to_enter_invalid_username_and_invalid_password(DataTable d) throws Throwable {
//		Map<String,String> m=d.asMap(String.class, String.class);
//		String user = m.get("user");
//		String pass = m.get("pass");
	   List<String> l1= d.asList(String.class);
	   String user = l1.get(0);
	   String pass = l1.get(1);
		PojoClass l=new PojoClass();
		toText(l.getTxtEmail(), user);
		toText(l.getTxtPass(), pass);
	}

	@When("^user has to click the login button$")
	public void user_has_to_click_the_login_button() throws Throwable {
		PojoClass l=new PojoClass();
		btnClick(l.getBtnLogin());
	}

//	@Then("^user cant able to navigate to home page$")
//	public void user_cant_able_to_navigate_to_home_page() throws Throwable {
//	    
//	}

	@Then("^user is in invalid credentials page$")
	public void user_is_in_invalid_credentials_page() throws Throwable {
		System.out.println("INVALID CREDENTIALS");
	}
	
	
	}


