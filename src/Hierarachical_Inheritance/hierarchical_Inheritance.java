package Hierarachical_Inheritance;

public class hierarchical_Inheritance {
}
class A{
    void showA(){
        System.out.println(" a class method");
    }
}

class B extends A {
    void showB(){
        System.out.println(" b class method");
    }
}
class C extends A{
    void showC() {
        System.out.println(" c class method");
    }

    public static void main(String[] args) {
      A ob1 = new A();
        ob1.showA();
        //ob1.showB();
        // ob1.showC();
        System.out.println("-------------");
       B ob2 = new B();
        ob2.showA();
        ob2.showB();
        //ob2.showC();
        System.out.println("-------------");
        C ob3 = new C();
        ob3.showA();
        //ob3.showB();  can't get b value
        ob3.showC();
    }
}
