package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;

import static page_objects.HomePage.SIGN_UP_USER_NAME_TEXT;
import static page_objects.HomePage.SIGN_UP_USER_PASSWORD_TEXT;

public class FillFormAction extends UIInteractionSteps {

    public void fillSignUpForm(String userName, String userPassword) {

        $(SIGN_UP_USER_NAME_TEXT).type(userName);

        $(SIGN_UP_USER_PASSWORD_TEXT).type(userPassword);
    }

}
