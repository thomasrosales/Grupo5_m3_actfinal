package step_definitions;

import actions.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CartShopSteps {

    @Steps
    private NavigateToAction navigator;

    @Steps
    private ClickButtonAction clickButton;

    @Steps
    private GetAlertAction alertAction;

    @Steps
    private GetListElementsAction getListElementsAction;

    @Steps
    private FillFormAction fillForm;

    @Steps
    private GetLoggedInDataAction getLoggedInDataAction;


    @When("agrego los items")
    public void agregoLosItems(DataTable table) {

        navigator.goToHomePage();

        for (List<String> datum : table.asLists()) {
            clickButton.clickOnItem(datum.get(0), datum.get(1));
            clickButton.addProductToCartShop();
            alertAction.acceptAlertText();
            navigator.goToHomePage();
        }
    }

    @Then("deberia observar la lista de {int} items agregados")
    public void deberiaObservarLaListaDeItemsAgregados(int amountOfItems) {
        clickButton.clickOnCartMenu();
        assertThat(getListElementsAction.getAmountOfElementsInCart().size()).isEqualTo(amountOfItems);
    }

    @And("elimino el item {string}")
    public void eliminoElItemSamsungGalaxyS(String arg0) {
        clickButton.clickOnCartMenu();
        clickButton.deleteProduct(arg0);
    }

    @After()
    public void deleteProducts(){
        navigator.goToHomePage();
        clickButton.clickOnCartMenu();
        getListElementsAction.removeElementsInCart();
    }

}
