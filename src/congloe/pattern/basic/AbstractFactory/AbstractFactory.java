package congloe.pattern.basic.AbstractFactory;

/**
 * Created by Hoang on 2/18/2015.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
