package conghd.pattern.structural.decorator;

/**
 * Created by conghd on 19-Aug-17.
 */
public class PizzaDecorator implements IPizza {
    // reference to component object
    protected IPizza mPizza;

    public PizzaDecorator(IPizza pizza){
        mPizza = pizza;
    }

    public IPizza getPizza(){
        return  mPizza;
    }

    public void setPizza(IPizza mPizza){
        this.mPizza = mPizza;
    }

    @Override
    public String doPizza() {
        return null;
    }
}
