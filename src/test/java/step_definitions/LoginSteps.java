package step_definitions;

import actions.ClickButtonAction;
import actions.FillFormAction;
import actions.NavigateToAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import page_objects.HomePage;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    @Steps
    private HomePage homePage;
    @Steps
    private NavigateToAction navigator;
    @Steps
    private ClickButtonAction clickButton;
    @Steps
    private FillFormAction fillForm;


    @Given("dado que yo quiero entrar al sistema")
    public void entrarAlSistema() {

        navigator.goToHomePage();
        clickButton.clickOnLoginButton();
    }

    @When("ingreso mis credenciales")
    public void ingresarCredenciales() {

        fillForm.fillLoginForm(homePage.KNOWN_USER_NAME, homePage.KNOWN_USER_PASSWORD);
        clickButton.clickOnLoginButton();
    }

    @Then("debería ver la página principal")
    public void verPaginaPrincipal() {

        assertThat( homePage ).isNotNull();
    }

}
