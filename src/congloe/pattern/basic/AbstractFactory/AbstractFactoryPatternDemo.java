package congloe.pattern.basic.AbstractFactory;

/**
 * Created by Hoang on 2/18/2015.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color color1 = colorFactory.getColor("red");
        color1.fill();
    }
}
