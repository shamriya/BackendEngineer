package java1.abstraction;

public abstract  class AbstractCheck {

    //public  void run();

    public  abstract  void run1(); // abstarct class with nobody should have abstract keyword to declare it abstract


    // A class can or cannot have the abstract method can be a abstract class
    //If a class have abstract methods then it should necessarily be a abstract class
    public   void run(){
        System.out.println("abstract class can have the non - abstarct method");
    }
}
