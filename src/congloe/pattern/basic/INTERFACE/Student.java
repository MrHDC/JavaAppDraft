package congloe.pattern.basic.INTERFACE;

/**
 * Created by Hoang on 2/17/2015.
 */
public class Student {
    String name;
    University university;

    void display(){
        System.out.println(name + " ~ " + university.showUniver());
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Cong";
        s1.university = new UniA();
        s1.display();
//        System.out.println(s1.name + " - " + s1.university.showUniver(1));

        Student s2 = new Student();
        s2.name = "Chien";
        s2.university = new UniB();
//        System.out.println(s2.name + " - " + s2.university.showUniver(1));
        s2.display();
    }

}
