package Polymorphosim;

public class method_overloading_seq_of_arguments {
    void showA(int a,String c ){
        System.out.println("1");
    }
    void showA(String c,int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        method_overloading_seq_of_arguments t = new method_overloading_seq_of_arguments();
        t.showA("abc",5);
    }

}
