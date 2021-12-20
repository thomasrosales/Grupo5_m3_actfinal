package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GetAlertAction extends UIInteractionSteps {

    public String getAlertText() {

        waitFor(ExpectedConditions.alertIsPresent());

        return getAlertText();
    }
}
