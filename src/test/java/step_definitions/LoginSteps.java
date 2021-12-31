package step_definitions;

import actions.*;
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
    @Steps
    private GetListElementsAction getListElementsAction;


    @Given("dado que yo quiero entrar al sistema")
    public void entrarAlSistema() {

        navigator.goToHomePage();
        clickButton.clickOnLoginButton();
    }

    @When("ingreso mis credenciales")
    public void ingresarCredenciales() {

        fillForm.fillLoginForm(getLoggedInDataAction.getUserName(), getLoggedInDataAction.getUserPassword());
        clickButton.clickOnConfirmLogin();
    }

    @Then("debería ver la página principal")
    public void verPaginaPrincipal() {

        String loggedUser = getLoggedInDataAction.getUserLoggedName();
        assertNotNull( loggedUser );
        assertTrue( loggedUser.contains( getLoggedInDataAction.getUserName() ) );
    }


    @Given("que soy parte del sistema")
    public void queSoyParteDelSistema() {
        navigator.goToHomePage();
        clickButton.clickOnLoginButton();
        fillForm.fillLoginForm(getLoggedInDataAction.getUserName(), getLoggedInDataAction.getUserPassword());
        clickButton.clickOnConfirmLogin();
        assertThat(getLoggedInDataAction.getUserLoggedName()).isNotNull();
    }

}
