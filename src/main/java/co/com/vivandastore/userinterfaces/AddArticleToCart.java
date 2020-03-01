package co.com.vivandastore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddArticleToCart extends PageObject {

    public static final Target SEARCHER = Target.the("Type name of product").located(By.xpath("/html/body/div[4]/header/div/div/div[1]/div/div/div[4]/form/input"));
    public static final Target SEARCH_PROD = Target.the("search product").located(By.xpath("/html/body/div[4]/header/div/div/div[1]/div/div/div[4]/form/input"));
    public static final Target SELECT_PROD = Target.the("select product to list").located(By.xpath("/html/body/div[4]/header/div/div/div[1]/div/div/div[4]/div/div[2]/ul/li[1]/div/div[2]/div/div/a"));
    public static final Target LOCATION = Target.the("add product to cart").located(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/button[1]"));
    public static final Target DISTRICT = Target.the("select district for delivery").located(By.xpath("/html/body/div[5]/div/div[3]/div[2]/div[1]/div[2]/select/option[6]"));
    public static final Target CONF_ADD = Target.the("confirm to add product").located(By.xpath("/html/body/div[5]/div/div[3]/div[2]/div[4]/button"));
    public static final Target ADD = Target.the(" add product").located(By.xpath("//div[@class='SalesChannel__close']"));
}
