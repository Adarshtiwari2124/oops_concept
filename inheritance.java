public class inheritance {

    void eat() {
        System.out.println("I AM EATING");
    }

}
   class dog extends inheritance {

       public static void main(String[] args) {
        dog d = new dog();
        d.eat();

       }
   }

