package Polymorphosim;

public class method_overloading_no_of_arguments {
    void show(int a ){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        method_overloading_no_of_arguments t = new method_overloading_no_of_arguments();
        t.show();
    }

}
