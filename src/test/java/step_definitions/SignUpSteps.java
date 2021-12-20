package step_definitions;

import actions.ClickButtonAction;
import actions.FillFormAction;
import actions.GetAlertAction;
import actions.NavigateToAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.HomePage;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpSteps {

    @Steps
    private HomePage homePage;
    @Steps
    private NavigateToAction navigator;
    @Steps
    private ClickButtonAction clickButton;
    @Steps
    private FillFormAction fillForm;
    @Steps
    private GetAlertAction alertAction;


    @Given("dado que yo quiero registrarme en el sistema")
    public void dadoQueYoQuieroRegistrarmeEnElSistema() {

        navigator.goToHomePage();
        clickButton.clickOnSignUpButton();
    }

    @When("ingreso usuario y contraseña")
    public void ingresoUsuarioYContraseña() {

        fillForm.fillSignUpForm(UUID.randomUUID().toString(), "user-password");
        clickButton.clickOnConfirmSignUp();
    }

    @Then("debería ver el mensaje {string}")
    public void deberíaVerElMensajeSignUpSuccessful(String mensaje) {

        assertThat( alertAction.getAlertText() ).isEqualToIgnoringCase(mensaje);
    }
}
