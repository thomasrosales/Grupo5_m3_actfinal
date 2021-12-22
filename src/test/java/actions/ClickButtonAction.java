package actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import page_objects.HomePage;


import static page_objects.HomePage.*;
import static page_objects.ProductPage.ADD_PRODUCT_BUTTON;

public class ClickButtonAction extends UIInteractionSteps {

    @Steps
    private HomePage homePage;

    @Step
    public void clickOnSignUpButton() {
        $(SIGN_UP_BUTTON_ID).click();
    }

    @Step
    public void clickOnCartMenu() {
        homePage.getCartMenuButton().click();
    }

    @Step
    public void clickOnConfirmSignUp() {
        $(SIGN_UP_CONFIRM_BUTTON).click();
    }

    @Step("click on phones tab")
    public void clickOnPhonesTab() {
        TABS_A_HREF.get(0).click();
    }

    @Step("click on laptops tab")
    public void clickOnLaptopsTab() {
        TABS_A_HREF.get(1).click();
    }

    @Step("click on monitors tab")
    public void clickOnMonitorsTab() {
        TABS_A_HREF.get(2).click();
    }

    public void clickOnItem(String item, String type) {
        switch(type) {
            case "phone":
                clickOnPhonesTab();
                break;
            case "monitor":
                clickOnMonitorsTab();
                break;
            case "laptop":
                clickOnLaptopsTab();
                break;
            default:
                return;
        }
        for (WebElementFacade elementItem : homePage.getElementItems()) {
            if (elementItem.getText().toString().equalsIgnoreCase(item)){
                elementItem.click();
                break;
            }
        }
    }

    public void addProductToCartShop() {
        $(ADD_PRODUCT_BUTTON).waitUntilClickable().waitUntilPresent().click();
    }
}
