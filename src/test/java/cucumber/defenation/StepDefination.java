package cucumber.defenation;

import cucumber.api.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

    @io.cucumber.java.en.Given("^User is on NetBanking landing page$")
    public void user_is_on_NetBanking_landing(){
        System.out.println("given");
    }

    @io.cucumber.java.en.When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);

    }

    @io.cucumber.java.en.Then("^Home page is populated$")
    public void home_page_is(){
        System.out.println("then");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed(){
        System.out.println("and");
    }


}
