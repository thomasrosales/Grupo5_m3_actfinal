package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import page_objects.HomePage;

public class NavigateToAction {


    private HomePage homePage;
    private ClickButtonAction clickButton;

    @Step
    public void goToHomePage() {

        homePage.open();
    }

    @Step
    public void goToSignUp() {


    }

}
