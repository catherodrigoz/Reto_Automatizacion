package co.com.vivandastore.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_product_cart.feature",
        glue = "co.com.vivandastore.stepdefinitions",
        snippets = SnippetType.CAMELCASE
        )
public class AddArticleToCart {
}
