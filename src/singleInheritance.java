public class singleInheritance {

}
    class a{
       void showA(){
           System.out.println("class a method");
       }
    }
    class b extends a{
        void ShowB(){
            System.out.println("class b method");
        }
        public static void main(String[] args) {

            a ob1= new a();
            ob1.showA();
           // ob1.showB(); can't do this


            b ob2= new b();
            ob2.showA(); // from parent class
            ob2.ShowB();// from child class
        }


    }


