package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GetAlertAction extends UIInteractionSteps {

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


}
