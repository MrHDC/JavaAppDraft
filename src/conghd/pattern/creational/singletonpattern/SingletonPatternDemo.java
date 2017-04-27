package conghd.pattern.creational.singletonpattern;

import conghd.pattern.creational.singletonpattern.earlyinstantiation.SingleObject;

/**
 * Created by Loe on 4/27/2017.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject instance = SingleObject.getInstance();

        //show the message
        instance.showMessage();
    }
}
