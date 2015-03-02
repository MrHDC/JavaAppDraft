package congloe.pattern.basic.Factory;

/**
 * Created by Hoang on 2/18/2015.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("triangle");
        shape3.draw();

        Shape shape = new Shape() {
            @Override
            public void draw() {
                System.out.println("This is Shape Inteface");
            }
        };
        shape.draw();
    }
}
