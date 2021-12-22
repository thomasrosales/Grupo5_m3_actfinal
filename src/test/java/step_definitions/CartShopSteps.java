package step_definitions;

import actions.ClickButtonAction;
import actions.GetAlertAction;
import actions.GetListElementsAction;
import actions.NavigateToAction;
import io.cucumber.datatable.DataTable;
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
        assertThat(getListElementsAction.getAmountOfElementsInCart()).isEqualTo(amountOfItems);
    }
}
