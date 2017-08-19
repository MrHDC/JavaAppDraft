package conghd.pattern.creational.factory;

import conghd.pattern.creational.factory.ex1.Shape;
import conghd.pattern.creational.factory.ex1.ShapeFactory;

/**
 * Created by Loe on 4/27/2017.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();
    }

}
