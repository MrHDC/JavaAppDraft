package conghd.pattern.creational.abstractfactory;

import conghd.pattern.creational.factory.ex1.Shape;
import conghd.pattern.creational.factory.ex2.Blue;
import conghd.pattern.creational.factory.ex2.Color;
import conghd.pattern.creational.factory.ex2.Green;
import conghd.pattern.creational.factory.ex2.Red;

/**
 * Created by Loe on 4/27/2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
