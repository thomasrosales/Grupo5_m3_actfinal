package actions;

import net.serenitybdd.core.pages.WithLocator;
import net.serenitybdd.core.steps.UIInteractionSteps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static page_objects.HomePage.*;

public class ClickButtonAction extends UIInteractionSteps {

    @Step
    public void clickOnSignUpButton() {
        $(SIGN_UP_BUTTON_ID).click();
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
}
