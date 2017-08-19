package conghd.pattern.creational.factory.ex2;

/**
 * Created by Loe on 4/27/2017.
 */
public class ColorFactory {
    public Color getColor(String color) {

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
