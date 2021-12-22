package step_definitions;

import actions.ClickButtonAction;
import actions.GetListElementsAction;
import actions.NavigateToAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigationSetps {

    @Steps
    private NavigateToAction navigator;

    @Steps
    private ClickButtonAction clickButton;

    @Steps
    private GetListElementsAction getListElementsAction;

    @Given("que soy parte del sistema")
    public void queSoyParteDelSistema() {}

    @When("hago click en telefonos")
    public void hagoClickEnTelefonos() {
        navigator.goToHomePage();
        clickButton.clickOnPhonesTab();
    }

    @Then("deberia obserbar una lista de telefonos: {string}, entre ellos {string}")
    public void deberiaObserbarUnaListaDeTelefonosEntreEllosSamsungGalaxyS(String numberOfPhones, String phone) {
        assertThat(getListElementsAction.getCountPhonesListElements()).isEqualTo(Integer.parseInt(numberOfPhones));
        assertThat(getListElementsAction.isPhonePresent(phone)).isTrue();
    }

    @When("hago click en ordenadores")
    public void hagoClickEnOrdenadores() {
        navigator.goToHomePage();
        clickButton.clickOnLaptopsTab();
    }

    @Then("deberia obserbar una lista de ordenadores: {string}, entre ellos {string}")
    public void deberiaObserbarUnaListaDeOrdenadoresEntreEllosSonyVaioI(String numberOfLaptops, String laptop) {
        assertThat(getListElementsAction.getCountLaptopListElements()).isEqualTo(Integer.parseInt(numberOfLaptops));
        assertThat(getListElementsAction.isLaptopPresent(laptop)).isTrue();
    }

    @When("hago click en pantallas")
    public void hagoClickEnPantallas() {
        navigator.goToHomePage();
        clickButton.clickOnMonitorsTab();
    }

    @Then("deberia obserbar una lista de pantallas: {string}, entre ellos {string}")
    public void deberiaObserbarUnaListaDePantallasEntreEllosAppleMonitor(String numberOfMonitors, String monitor) {
        assertThat(getListElementsAction.getCountMonitorsListElements()).isEqualTo(Integer.parseInt(numberOfMonitors));
        assertThat(getListElementsAction.isMonitorPresent(monitor)).isTrue();
    }
}
