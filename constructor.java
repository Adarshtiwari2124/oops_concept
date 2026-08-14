public class constructor {
    String s;
    int a;

    constructor(String s, int a){
        this.s =s;
        this.a =a;

    }
    public static void main(String[] args) {
        constructor t1 = new constructor("adarsh",2);
        constructor t2 = new constructor("rohit",25);
        System.out.println(t1.s+" "+t1.a);
        System.out.println(t2.s+" "+t2.a);
    }
}
