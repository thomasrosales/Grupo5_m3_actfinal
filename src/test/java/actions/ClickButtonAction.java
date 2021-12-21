package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;

import net.thucydides.core.annotations.Step;

import static page_objects.HomePage.SIGN_UP_BUTTON_ID;
import static page_objects.HomePage.SIGN_UP_CONFIRM_BUTTON;

public class ClickButtonAction extends UIInteractionSteps {

    @Step
    public void clickOnSignUpButton() {

        $(SIGN_UP_BUTTON_ID).click();
    }

    @Step
    public void clickOnConfirmSignUp() {

        $(SIGN_UP_CONFIRM_BUTTON).click();
    }
}
