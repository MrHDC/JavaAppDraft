package conghd.pattern.structural.decorator;

/**
 * Created by conghd on 19-Aug-17.
 */
public class ChickenPizza implements IPizza {

    @Override
    public String doPizza() {
        return "I am a Chicken Pizza";
    }
}