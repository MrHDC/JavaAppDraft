package congloe.pattern.basic.Factory;

/**
 * Created by Hoang on 2/18/2015.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("triangle")){
            return new Triangle();
        }
        return null;
    }
}
