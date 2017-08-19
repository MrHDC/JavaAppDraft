package conghd.pattern.creational.abstractfactory;

import conghd.pattern.creational.factory.ex1.Circle;
import conghd.pattern.creational.factory.ex1.Rectangle;
import conghd.pattern.creational.factory.ex1.Shape;
import conghd.pattern.creational.factory.ex1.Square;
import conghd.pattern.creational.factory.ex2.Color;

/**
 * Created by Loe on 4/27/2017.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
