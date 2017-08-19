package conghd.pattern.creational.abstractfactory;

import conghd.pattern.creational.factory.ex1.Shape;
import conghd.pattern.creational.factory.ex2.Color;

/**
 * Created by Loe on 4/27/2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
