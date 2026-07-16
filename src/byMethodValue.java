public class byMethodValue {
    String name;
    int age;

    void Animal(String a, int b){
        name=a;
        age=b;
    }
    void display(){
        System.out.println(name+" "+age);
    }


    public static void main(String[] args) {
        byMethodValue buzo= new byMethodValue();
        buzo.display();
        buzo.Animal("harsh",5);
        buzo.display();
    }
}
