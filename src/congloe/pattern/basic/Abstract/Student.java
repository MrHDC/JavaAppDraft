package congloe.pattern.basic.Abstract;

/**
 * Created by Hoang on 2/17/2015.
 */
public class Student {
    String name;
    Univer university;

    void display(){
        System.out.println(name + " : " + university.showUniver());
        university.displayNote();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Cong";
        s1.university = new UniA();
        s1.display();

        Student s2 = new Student();
        s2.name = "Chien";
        s2.university = new UniB();
        s2.display();
    }
}
