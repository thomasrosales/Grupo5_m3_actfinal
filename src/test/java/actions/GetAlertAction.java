package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page_objects.CartPage;

public class GetAlertAction extends UIInteractionSteps {

    private CartPage cartPage;

    @Step
    public String getAlertText() {

        waitFor(ExpectedConditions.alertIsPresent());

        String text = getAlert().getText();
        getAlert().accept();

        return text;
    }

    @Step
    public void acceptAlertText() {
        waitFor(ExpectedConditions.alertIsPresent());
        getAlert().accept();
    }

    @Step
    public String getInfoSweetAlert() {
        waitFor(ExpectedConditions.visibilityOf(cartPage.getSweetAlert()));
        return cartPage.getSweetAlert().getText();
    }


}
