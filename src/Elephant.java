public class Elephant extends Animal{
//    public Elephant(){
//        super(5); // to call parent constructor
//        System.out.println("Elephant is born!!");
//
//        int legsE = super.legs;


    //method overriding example(First in child,if not present then parent)
    public String hello(){
        return "Hello from elephant";
    }

    //method overloading example(not on return type,only on parameters)
    public String hello(int a){
        System.out.println(a);
        return "Hello from elephant in method overloading";
    }

    int ears = 4;
}
