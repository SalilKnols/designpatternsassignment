package builderpattern;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PizzaBuilder(15)
                              .setCrustType("thin")
                              .setSauceType("pizzasauce")
                              .setToppings(Arrays.asList("capsicum", "onion", "paneer"))
                              .build();
        System.out.println(pizza);
    }







}
