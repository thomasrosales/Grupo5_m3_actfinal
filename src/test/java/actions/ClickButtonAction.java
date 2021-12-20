package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;

import static page_objects.HomePage.SIGN_UP_BUTTON_ID;
//import static page_objects.HomePage.SIGN_UP_CONFIRM_BUTTON;

public class ClickButtonAction extends UIInteractionSteps {

    public void clickOnSignUpButton() {

        $(SIGN_UP_BUTTON_ID).click();
    }

    public void clickOnConfirmSignUp() {

        //$(SIGN_UP_CONFIRM_BUTTON).click();
    }
}
