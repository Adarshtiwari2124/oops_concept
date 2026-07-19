package Polymorphosim;

public class method_overloading_type_of_arguments {
    void showA( String c) {
        System.out.println("1");
    }

    void showA( int a) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        method_overloading_type_of_arguments t = new method_overloading_type_of_arguments();
        t.showA("abc");
    }

}
