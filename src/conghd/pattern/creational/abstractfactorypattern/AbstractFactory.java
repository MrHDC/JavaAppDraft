package conghd.pattern.creational.abstractfactorypattern;

import conghd.pattern.creational.factorypattern.ex1.Shape;
import conghd.pattern.creational.factorypattern.ex2.Color;

/**
 * Created by Loe on 4/27/2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
