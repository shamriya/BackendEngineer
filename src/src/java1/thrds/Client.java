package java1.thrds;

public class Client {

    public static void main(String... args){

        System.out.println("I am the main class");

        Adder adder = new Adder();

        ScalarThread scalarThread = new ScalarThread(adder);

        scalarThread.start();

        Substract substract = new Substract();
        ScalarThread subThread = new ScalarThread(substract);
        subThread.start();
    }
}
