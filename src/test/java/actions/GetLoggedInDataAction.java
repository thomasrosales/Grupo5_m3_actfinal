package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page_objects.HomePage;

public class GetLoggedInDataAction extends UIInteractionSteps {

    @Step
    public String getUserLoggedName() {

        return getDriver().findElement( HomePage.LOGGED_USER_NAME ).getDomProperty("innerHTML");
    }

}
