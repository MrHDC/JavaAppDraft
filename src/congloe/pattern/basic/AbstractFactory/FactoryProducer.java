package congloe.pattern.basic.AbstractFactory;

/**
 * Created by Hoang on 2/18/2015.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Shape")){
                return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
