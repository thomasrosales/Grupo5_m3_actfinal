package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebElement;
import page_objects.HomePage;

public class GetListElementsAction extends UIInteractionSteps {

    @Steps
    private HomePage homePage;

    @Step("get list of phones elements")
    public int getCountPhonesListElements() {
        return homePage.getElementItems().size();
    }

    @Step("get an specific phone of phones elements")
    public boolean isPhonePresent(String phone) {
        for (WebElement phonesItem : homePage.getElementItems()) {
            if (phonesItem.getText().toString().equalsIgnoreCase(phone)){
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
            if (laptopItem.getText().toString().equalsIgnoreCase(laptop)){
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
            if (monitorItem.getText().toString().equalsIgnoreCase(monitor)){
                return true;
            }
        }
        return false;
    }
}
