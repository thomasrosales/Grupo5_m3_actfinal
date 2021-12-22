package page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CartPage extends PageObject {
    @FindBy(how = How.CLASS_NAME, using = "success")
    List<WebElementFacade> ELEMENT_ITEMS;

    public List<WebElementFacade> getProductsCart(){
        return ELEMENT_ITEMS;
    }
}
