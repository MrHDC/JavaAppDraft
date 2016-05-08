package InfaceTest;

/**
 * Created by Hoang on 3/16/2015.
 */
public class HumanMgr implements IHuman {
    @Override
    public boolean createHuman(String name, int age) {
        Human human = new Human();
        human.name = name;
        human.age = age;
        if (human!=null)
        return true;
        else return false;
    }

}
