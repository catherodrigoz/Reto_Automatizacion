package co.com.vivandastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCart extends PageObject {

    public static final Target CART = Target.the("open cart").located(By.xpath("//i[contains(@class,'minicart__btn__icon-i')]"));
    public static final Target ITEM_CART = Target.the("quantity").located(By.xpath("//p[contains(.,'1 Productos')]"));
}
