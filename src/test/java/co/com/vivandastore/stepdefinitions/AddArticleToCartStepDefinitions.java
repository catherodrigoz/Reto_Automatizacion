
package co.com.vivandastore.stepdefinitions;


import co.com.vivandastore.tasks.OpenTheBrowser;
import co.com.vivandastore.userinterfaces.AddArticleToCart;
import co.com.vivandastore.questions.TheProduct;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.com.vivandastore.tasks.AddArticleToCart.toadd;
import static org.hamcrest.Matchers.equalTo;



public class AddArticleToCartStepDefinitions { 

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor Rosie = Actor.named("Rosie");

    private AddArticleToCart  addArticleToCart;




    @Given("^that Rosie enters the page$")
    public void thatRosieEntersThePage() {
        Rosie.can(BrowseTheWeb.with(herBrowser));

        Rosie.wasAbleTo(
            OpenTheBrowser.on(addArticleToCart)  

        );
    }
    
    
    @When("^Rosie add to product$")
    public void rosieAddToProduct() {
            Rosie.attemptsTo(
                toadd()
            );
    }
    
    @Then("^Rosie should verify the '(.*)' has been add to shopping cart$")
    public void rosieShouldVerifyTheProductHasBeenAddToShoppingCart(String product) {
        
        Rosie.should(
        seeThat(TheProduct.is(), equalTo(product))
        
        );
            
    }



}


