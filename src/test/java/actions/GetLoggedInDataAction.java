package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import page_objects.HomePage;

import static page_objects.HomePage.*;

public class GetLoggedInDataAction extends UIInteractionSteps {

    @Steps
    HomePage homePage;

    @Step
    public String getUserLoggedName() {

        return homePage.getNameOfUser().getText();
    }

    @Step
    public String getUserName() {

        return KNOWN_USER_NAME;
    }

    @Step
    public String getUserPassword() {

        return KNOWN_USER_PASSWORD;
    }

}
