package co.com.vivandastore.tasks;

import net.serenitybdd.screenplay.Task;
import static co.com.vivandastore.userinterfaces.AddArticleToCart.*;
import static co.com.vivandastore.userinterfaces.ShoppingCart.CART;
//import co.com.vivandastore.userinterfaces.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddArticleToCart implements Task{

    private static final String ITEM = "brownie";
    

 

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
               Click.on(SEARCHER),
                Enter.theValue(ITEM).into(SEARCHER),
                Click.on(SEARCH_PROD),
                Click.on(SELECT_PROD),
                Click.on(LOCATION),
                Click.on(DISTRICT),
                Click.on(CONF_ADD),
                Click.on(ADD),
                Click.on(CART)
                
                

		);

	}

	public static AddArticleToCart toadd() { return new AddArticleToCart(); }
}