package conghd.pattern.structural.decorator;

/**
 * Created by conghd on 19-Aug-17.
 */
public class PepperDecorator extends PizzaDecorator {
    public PepperDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = mPizza.doPizza();
        return type + addPeper();
    }

    private String addPeper() {
        return " + Peper";
    }
}
