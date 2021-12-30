package actions;

import net.serenitybdd.core.pages.ClickStrategy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import page_objects.CartPage;
import page_objects.HomePage;


import static page_objects.CartPage.PLACE_ORDER_BUTTON;
import static page_objects.CartPage.PURCHASE_BUTTON;
import static page_objects.HomePage.*;
import static page_objects.ProductPage.ADD_PRODUCT_BUTTON;

public class ClickButtonAction extends UIInteractionSteps {

    @Steps
    private HomePage homePage;

    @Steps
    private CartPage cartPage;

    @Step
    public void clickOnSignUpButton() {
        $(SIGN_UP_BUTTON_ID).click();
    }

    @Step
    public void clickOnLoginButton() {
        $(LOGIN_BUTTON_ID).click(ClickStrategy.WAIT_UNTIL_ENABLED);
    }

    @Step
    public void clickOnCartMenu() {
        homePage.getCartMenuButton().click();
    }

    @Step
    public void clickOnConfirmSignUp() {
        $(SIGN_UP_CONFIRM_BUTTON).click();
    }

    @Step
    public void clickOnConfirmLogin() {
        //waitFor(ExpectedConditions.presenceOfElementLocated(LOGIN_CONFIRM_BUTTON)).click();
        $(LOGIN_CONFIRM_BUTTON).click(ClickStrategy.WAIT_UNTIL_ENABLED);
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
        switch (type) {
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
            if (elementItem.getText().equalsIgnoreCase(item)) {
                elementItem.click();
                break;
            }
        }
    }

    public void addProductToCartShop() {
        $(ADD_PRODUCT_BUTTON).waitUntilClickable().waitUntilPresent().click();
    }

    public void deleteProduct(String arg0) {
        for (WebElementFacade webElementFacade : cartPage.getProductsCart()) {
            if (webElementFacade.findElements(By.tagName("td")).get(1).getText().equalsIgnoreCase(arg0)) {
                webElementFacade.findElements(By.tagName("td")).get(3).findElement(By.tagName("a")).click();
                break;
            }

        }

    }

    public void clickOnPlaceOrder() {
        $(PLACE_ORDER_BUTTON).click();
    }

    public void clickOnPurchase() {
        $(PURCHASE_BUTTON).click();
    }
}
