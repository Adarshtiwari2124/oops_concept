package Polymorphosim;

class Test {
    void show(){
        System.out.println("1");
    }
}

public class method_overiding_no_of_arguments extends Test {
  
    void show(){
      System.out.println("2");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        method_overiding_no_of_arguments x = new method_overiding_no_of_arguments();
        x.show();
    }


}

   