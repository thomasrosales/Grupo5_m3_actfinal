package step_definitions;

import actions.ClickButtonAction;
import actions.FillFormAction;
import actions.GetLoggedInDataAction;
import actions.NavigateToAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page_objects.HomePage;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class LoginSteps {

    @Steps
    private HomePage homePage;
    @Steps
    private NavigateToAction navigator;
    @Steps
    private ClickButtonAction clickButton;
    @Steps
    private FillFormAction fillForm;
    @Steps
    private GetLoggedInDataAction getLoggedInDataAction;


    @Given("dado que yo quiero entrar al sistema")
    public void entrarAlSistema() {

        navigator.goToHomePage();
        clickButton.clickOnLoginButton();
    }

    @When("ingreso mis credenciales")
    public void ingresarCredenciales() {

        fillForm.fillLoginForm(homePage.KNOWN_USER_NAME, homePage.KNOWN_USER_PASSWORD);
        clickButton.clickOnConfirmLogin();
    }

    @Then("debería ver la página principal")
    public void verPaginaPrincipal() {

        String loggedUser = getLoggedInDataAction.getUserLoggedName();
System.out.println("*********************************");
System.out.println("*********************************");
System.out.println("*********************************");
        System.out.println(loggedUser);
System.out.println("*********************************");
System.out.println("*********************************");
System.out.println("*********************************");
        assertNotNull( loggedUser );
        assertTrue( loggedUser.contains(homePage.KNOWN_USER_NAME) );
    }

}
