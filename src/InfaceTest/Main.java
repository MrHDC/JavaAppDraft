package InfaceTest;

/**
 * Created by Hoang on 3/16/2015.
 */
public class Main {

    public static void main(String[] args) {
        IHuman iHuman = new HumanMgr();
        System.out.println(iHuman.createHuman("Tuan",11));
    }
}
