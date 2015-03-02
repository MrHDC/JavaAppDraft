package congloe.pattern.basic.AbstractFactory;

import congloe.pattern.basic.Factory.*;

/**
 * Created by Hoang on 2/18/2015.
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle draw()");
    }
}
