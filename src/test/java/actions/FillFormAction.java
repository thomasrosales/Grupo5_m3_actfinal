package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static page_objects.HomePage.*;

public class FillFormAction extends UIInteractionSteps {

    @Step
    public void fillSignUpForm(String userName, String userPassword) {

        $(SIGN_UP_USER_NAME_TEXT).type(userName);

        $(SIGN_UP_USER_PASSWORD_TEXT).type(userPassword);
    }

    @Step
    public void fillLoginForm(String userName, String userPassword) {

        $(LOGIN_USER_NAME_TEXT).type(userName);

        $(LOGIN_USER_PASSWORD_TEXT).type(userPassword);
    }

}
