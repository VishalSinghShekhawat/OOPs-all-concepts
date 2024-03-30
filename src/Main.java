//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal();

        //a.setEars(5);
       // a.getEars();

//        Animal b = new Animal(5);
//        b.getEars();

//        Elephant e = new Elephant();
//        //e.getEars();
//        System.out.println(e.hello(5));
//        Animal a = new Elephant();
//        System.out.println(a.hello());
//
//        System.out.println(a.ears); // no concept of variable overriding or reference of Animal so
//                                   // it's value will be printed

        Abstract2 a = new Abstract1();
        a.running();
        Interface1 i = new Abstract1();
        i.eat();

    }
}