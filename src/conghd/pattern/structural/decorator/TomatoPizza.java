package conghd.pattern.structural.decorator;

/**
 * Created by conghd on 19-Aug-17.
 */
public class TomatoPizza implements IPizza {

    @Override
    public String doPizza() {
        return "I am a Tomato Pizza";
    }
}
