import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.LRUMap;

import java.util.ArrayList;
import java.util.Scanner;

public class LearnLRUMap {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        LearnLRUMap learnLRUMap = new LearnLRUMap();
        LRUMap map = new LRUMap(10);
        learnLRUMap.init(map);

        int n = 0;
        while (n != 7) {
            learnLRUMap.menu();
            n = scanner.nextInt();
            System.out.println("==Your choice: " + n);
            learnLRUMap.choice(n, map);
        }

    }

    public void show(LRUMap map) {
        ArrayList<Integer> list = null;
        MapIterator irt = map.mapIterator();
        list = new ArrayList<Integer>();
        Integer key = null;
        User c = null;
        Animal a = null;
        while (irt.hasNext()) {
            key = (Integer) irt.next();
            if (irt.getValue() instanceof  User)
                c = (User) irt.getValue();
            else
                a = (Animal) irt.getValue();
            if (c != null) {
                list.add(key);
            }
        }

        for (Integer k : list) {

            if (map.get(k) instanceof User){
                User user1 = (User) map.get(k);
                user1.show();
            }else if (map.get(k) instanceof Animal){
                Animal animal = (Animal) map.get(k);
                animal.show();
            }
        }
    }

    public void init(LRUMap map) {
        User cong = new User(1, "Cong", 22);
        User chien = new User(2, "Chien", 25);
        User tran = new User(3, "Tran", 21);
        User quan = new User(4, "Quan", 23);
        User trung = new User(5, "Trung", 24);
        Animal animal = new Animal("Dog");

        map.put(cong.id, cong);
        map.put(chien.id, chien);
        map.put(tran.id, tran);
        map.put(quan.id, quan);
        map.put(trung.id, trung);
        map.put(6,animal);
    }

    public void choice(int b, LRUMap map) {
        switch (b) {
            case 0:
                System.out.println("Chua lam");
                break;
            case 1:
                System.out.print(" -id: ");
                int id = scanner.nextInt();
                scanner.nextLine();
//                System.out.print( " -name: ");
//                String name = scanner.nextLine();
//                System.out.print( " -age: ");
//                int age = scanner.nextInt();
//                User user = new User(id, name, age);
//                map.put(id, user);
//                if (map.get(user.id)!=null)
//                    System.out.println("Add success User " + user.id + " - " + user.name + " - " + user.age + " success");
//                else
//                    System.out.println("Faild");
                System.out.print(" -type: ");
                String type = scanner.nextLine();
                Animal animal = new Animal(type);
                map.put(id, animal);
                break;
            case 2:
                System.out.print(" -Hay nhap key: ");
                User user1 = (User) map.get(scanner.nextInt());
                if (user1!=null)
                    user1.show();
                else
                    System.out.println("Khong co du lieu!");
                break;
            case 3:
                System.out.print(" -Hay nhap key: ");
                int y = scanner.nextInt();
                map.remove(y);
                User user2 = (User) map.get(y);
                if (user2!=null)
                    System.out.println("Remove Fail");
                else
                    System.out.println("Remove Success");
                break;
            case 4:
                System.out.println("Map co " + map.size() + " phan tu");
                break;
            case 5:
                show(map);
                break;
            case 6:
                System.out.println("Chua lam");
                break;
            default:
                b = 7;
                break;
        }
    }

    public void menu() {
        System.out.print("\n\n\n\n------Menu-----" +
                "\n0. Tao LRUMap" +
                "\n1. Them Phan Tu" +
                "\n2. Lay Phan Tu" +
                "\n3. Xoa Phan Tu" +
                "\n4. Check Size" +
                "\n5. Show" +
                "\n--------------" +
                "\n > ");
    }

    public LRUMap createLRUMap(String name, int maxsize){
        LRUMap map = new LRUMap(maxsize);
        return map;
    }

}

class User {
    public int id;
    public String name;
    public int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("\t" + id + "\t"+ name+ "\t"+ age);
    }
}

class Animal{
    public String type;
    public Animal(String type){
        this.type = type;
    }
    public void show(){
        System.out.println("\t" + type);
    }
}
