package conghd.pattern.structural.decorator;

/**
 * Created by conghd on 19-Aug-17.
 */
public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = mPizza.doPizza();
        return type + addCheese();
    }

    private String addCheese() {
        return " + cheese";
    }
}
