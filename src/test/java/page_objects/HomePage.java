package page_objects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class HomePage extends PageObject {

    public static final String SIGN_UP_BUTTON_ID = "#signin2";
    public static final String SIGN_UP_USER_NAME_TEXT = "#sign-username";
    public static final String SIGN_UP_USER_PASSWORD_TEXT = "#sign-password";
    //public static final By SIGN_UP_CONFIRM_BUTTON = (By) By.xpath("//html/body/div[2]/div/div/div[3]/button[2]");
}
