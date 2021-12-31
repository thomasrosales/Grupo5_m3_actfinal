package actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page_objects.CartPage;
import page_objects.HomePage;

import java.util.List;

public class GetListElementsAction extends UIInteractionSteps {

    @Steps
    private HomePage homePage;

    @Steps
    private CartPage cartPage;

    @Step("get list of phones elements")
    public int getCountPhonesListElements() {
        return homePage.getElementItems().size();
    }

    @Step("get an specific phone of phones elements")
    public boolean isPhonePresent(String phone) {
        for (WebElement phonesItem : homePage.getElementItems()) {
            if (phonesItem.getText().equalsIgnoreCase(phone)){
                return true;
            }
        }
        return false;
    }

    public int getCountLaptopListElements() {
        return homePage.getElementItems().size();
    }

    public boolean isLaptopPresent(String laptop) {
        for (WebElement laptopItem : homePage.getElementItems()) {
            if (laptopItem.getText().equalsIgnoreCase(laptop)){
                return true;
            }
        }
        return false;
    }

    public int getCountMonitorsListElements() {
        return homePage.getElementItems().size();
    }

    public boolean isMonitorPresent(String monitor) {
        for (WebElement monitorItem : homePage.getElementItems()) {
            if (monitorItem.getText().equalsIgnoreCase(monitor)){
                return true;
            }
        }
        return false;
    }

    public List<WebElementFacade> getAmountOfElementsInCart() {
        waitFor(ExpectedConditions.jsReturnsValue("return jQuery.active == 0"));
        waitFor(1);
        return cartPage.getProductsCart();
    }

    public void removeElementsInCart(){
        while(true){
            try {
                if(getAmountOfElementsInCart().size() != 0){
                    getAmountOfElementsInCart().get(0).findElements(By.tagName("td")).get(3).findElement(By.tagName("a")).click();
                } else {
                    break;
                }
            }
            catch(Exception ignored) {}

        }
    }
}
