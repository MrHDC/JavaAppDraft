package conghd.pattern.structural.decorator;

/**
 * Created by conghd on 19-Aug-17.
 */
public class PizzaShop {

    public static void main(String[] args) {
        IPizza tomato = new TomatoPizza();
        IPizza chicken = new ChickenPizza();

        System.out.println(tomato.doPizza());
        System.out.println(chicken.doPizza());

        // add peper to tomato pizza
        PepperDecorator peper = new PepperDecorator(tomato);
        System.out.println(peper.doPizza());

        // add cheese to chicken pizza
        CheeseDecorator cheese = new CheeseDecorator(chicken);
        System.out.println(cheese.doPizza());
        // add more cheese to chicken pizza
        CheeseDecorator cheese2 = new CheeseDecorator(cheese);
        System.out.println(cheese2.doPizza());

        System.out.println(tomato.doPizza());
    }
}
