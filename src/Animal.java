public class Animal {

//       // Default Constructor
//    public Animal(){
//        System.out.println("Animal is born!!");
//    }
//
//    public Animal(int ears){
//        this.ears = ears; //this will refer to the current object created or called for
//    }
//    private int ears;
//    int legs;
//
//    // setter function to set the value of private variables outside the class and also to have better security
//    void setEars(int e){
//        // Here we can put constraints of password and other thing to upate the value of ears as shown below
//        if(e >= 2){
//            ears = e;
//        }
//    }
//
//    // getter function to access and print the value of private variable
//    void getEars(){
//        System.out.println(ears);
//    }

    public String hello(){
        return "Hello from Animal";
    }

    int ears = 6;
}
