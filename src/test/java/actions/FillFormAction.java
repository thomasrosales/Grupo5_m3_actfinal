package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static page_objects.CartPage.*;
import static page_objects.HomePage.SIGN_UP_USER_NAME_TEXT;
import static page_objects.HomePage.SIGN_UP_USER_PASSWORD_TEXT;

public class FillFormAction extends UIInteractionSteps {

    @Step
    public void fillSignUpForm(String userName, String userPassword) {

        $(SIGN_UP_USER_NAME_TEXT).type(userName);

        $(SIGN_UP_USER_PASSWORD_TEXT).type(userPassword);
    }

    public void fillPlaceOrder(String name, String city, String country, String creditCardNumber) {
        $(PLACE_ORDER_MODAL).waitUntilPresent();

        $(PLACE_ORDER_NAME_FIELD).type(name);
        $(PLACE_ORDER_COUNTRY_FIELD).type(country);
        $(PLACE_ORDER_CITY_FIELD).type(city);
        $(PLACE_ORDER_CARD_FIELD).type(creditCardNumber);
        $(PLACE_ORDER_MONTH_FIELD).type("41");
        $(PLACE_ORDER_YEAR_FIELD).type("9 ABY");
    }
}
