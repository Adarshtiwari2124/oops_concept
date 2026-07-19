package Polymorphosim;

public class A {
    void show(int a ){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        A t = new A();
        t.show();
    }

}
