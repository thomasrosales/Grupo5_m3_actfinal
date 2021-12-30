package page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CartPage extends PageObject {
    @FindBy(how = How.CLASS_NAME, using = "success")
    List<WebElementFacade> ELEMENT_ITEMS;

    public List<WebElementFacade> getProductsCart(){
        return ELEMENT_ITEMS;
    }

    @FindBy(how = How.CLASS_NAME, using = "sweet-alert")
    WebElementFacade SWEET_ALERT;

    public WebElementFacade getSweetAlert(){return SWEET_ALERT;}

    public static final By PLACE_ORDER_BUTTON = By.xpath("//*[@id='page-wrapper']/div/div[2]/button");
    public static final By PURCHASE_BUTTON = By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]");


    // PLACE ORDER

    public static By PLACE_ORDER_MODAL = By.xpath("//*[@id='orderModal']/div/div/div[1]");
    public static String PLACE_ORDER_NAME_FIELD = "#name";
    public static String PLACE_ORDER_COUNTRY_FIELD = "#country";
    public static String PLACE_ORDER_CITY_FIELD = "#city";
    public static String PLACE_ORDER_CARD_FIELD = "#card";
    public static String PLACE_ORDER_MONTH_FIELD = "#month";
    public static String PLACE_ORDER_YEAR_FIELD = "#year";

}
