package step_definitions;

import actions.ClickButtonAction;
import actions.FillFormAction;
import actions.GetAlertAction;
import actions.NavigateToAction;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class PlaceHolderSteps {

    @Steps
    private NavigateToAction navigator;

    @Steps
    private ClickButtonAction clickButton;

    @Steps
    private FillFormAction fillForm;

    @Steps
    private GetAlertAction getAlertAction;

    @Before
    public void prepareTests(){
        navigator.goToHomePage();
        clickButton.clickOnCartMenu();
    }

    @And("voy a cart menu")
    public void voyACartMenu() {
        navigator.goToHomePage();
        clickButton.clickOnCartMenu();
    }

    @And("hago click en place order")
    public void hagoClickEnPlaceOrder() {
        clickButton.clickOnPlaceOrder();
    }

    @And("lleno el formulario con {string}, {string}, {string}, {string}")
    public void llenoElFormularioCon(String name, String city, String country, String creditCardNumber) {
        fillForm.fillPlaceOrder(name, city, country, creditCardNumber);
    }

    @And("hago click en Purchase")
    public void hagoClickEnPurchase() {
        clickButton.clickOnPurchase();
    }

    @Then("deberia observar el ticket con Amount {string}, Card Number {string} y Name {string}")
    public void deberiaObservarElTicketConAmountTarjetaABCD(String totalAmount, String creditCardNumber, String name) {
        assertThat(getAlertAction.getInfoSweetAlert().contains(totalAmount)).isTrue();
        assertThat(getAlertAction.getInfoSweetAlert().contains(creditCardNumber)).isTrue();
        assertThat(getAlertAction.getInfoSweetAlert().contains(name)).isTrue();
    }
}
