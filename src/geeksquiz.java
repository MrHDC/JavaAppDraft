
public class geeksquiz {
    public static void main(String[] args) {
        Test t = new Test() {
            @Override
            public void method1() {
                super.method1();
                System.out.println("call from main");
            }
        };
        t.method1();
    }
}

abstract class Test{
    public Test() {
        System.out.println("test inited");
    }

    public void method1(){
        System.out.println("method1 is called");
    }
}
