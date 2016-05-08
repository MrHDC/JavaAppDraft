package congloe.pattern.basic.Singleton;

import org.apache.commons.collections4.map.LRUMap;

import java.util.Objects;

/**
 * Created by Hoang on 3/4/2015.
 */
public class TestSingleton {
    public static void main(String[] args) {
        GroupMgr groupMgr = new GroupMgr();
        groupMgr.getGroup(5);
    }
}

class GroupMgr{
	private static final LRUMap<Integer, Group> map = new LRUMap<Integer, Group>();

    public GroupMgr(){
        init();
    }

    public static LRUMap getInstance(){
    	return map;
    }

    public void getGroup(int id){
        Group group = map.get(id);
        if(group!=null){
            System.out.println("Da co trong cache");
        }else {
            System.out.println("Chua co trong cache");
        }
    }

    public void init(){
        Group group1 = new Group(1,"TVI");
        Group group2 = new Group(2,"TVS");
        Group group3 = new Group(3,"TVO");
        Group group4 = new Group(4,"TVB");
        map.put(group1.id, group1);
        map.put(group2.id, group2);
        map.put(group3.id, group3);
        map.put(group4.id, group4);
    }

}

class Group{
    int id;
    String name;
    public Group(int id, String name){
        this.id = id;
        this.name = name;
    }
}
