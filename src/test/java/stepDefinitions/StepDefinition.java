package stepDefinitions;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.junit.Cucumber;
	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class StepDefinition { 

	    @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	      System.out.println("Hii");
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	 System.out.println("Hii"); 
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	 System.out.println("Hii");
	    }

	    @Then("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	 System.out.println("Hii");
	    }


	}

