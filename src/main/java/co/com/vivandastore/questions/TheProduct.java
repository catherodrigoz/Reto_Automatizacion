
package co.com.vivandastore.questions;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import co.com.vivandastore.userinterfaces.ShoppingCart;
import net.serenitybdd.screenplay.Actor;

public class TheProduct implements  Question<String> {

        public String nameProduct;
        
    public static TheProduct is(){
            return new TheProduct();

    }

    @Override
    public String answeredBy ( Actor actor){
            return Text.of(ShoppingCart.ITEM_CART).viewedBy(actor).asString();

    }
}