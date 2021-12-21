package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import page_objects.HomePage;

public class NavigateToAction extends UIInteractionSteps {

    private HomePage homePage;
    private ClickButtonAction clickButton;

    public void goToHomePage() {

        homePage.open();
    }

    public void goToSignUp() {


    }

}
