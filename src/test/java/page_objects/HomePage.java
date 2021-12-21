package page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

import static java.time.temporal.ChronoUnit.SECONDS;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class HomePage extends PageObject {

    public static final String SIGN_UP_BUTTON_ID = "#signin2";
    public static final String SIGN_UP_USER_NAME_TEXT = "#sign-username";
    public static final String SIGN_UP_USER_PASSWORD_TEXT = "#sign-password";
    public static final By SIGN_UP_CONFIRM_BUTTON = By.xpath("//html/body/div[2]/div/div/div[3]/button[2]");

    // TABS

    @FindBy(how = How.XPATH, using = "//*[@id='itemc']")
    public static List<WebElement> TABS_A_HREF;

    // CONTENT TABS

    @FindBy(how = How.CLASS_NAME, using = "hrefch")
    List<WebElementFacade> ELEMENT_ITEMS;

    public List<WebElementFacade> getElementItems(){
        waitFor(ExpectedConditions.jsReturnsValue("return jQuery.active == 0"));
        return ELEMENT_ITEMS;
    }

    /**
     * Para comprobar que el ajax termino de ejecutarse
     * @throws InterruptedException
     */
    public void WaitForAjax() throws InterruptedException
    {
        while (true)
        {
            Boolean ajaxIsComplete = (Boolean) evaluateJavascript("return jQuery.active == 0");
            if (ajaxIsComplete){
                break;
            }
            Thread.sleep(100);
        }
    }
}
