//Threads in Java:
package sample;

class Parent{

}
class Child extends Thread{ //Child class
    public void run(){
        System.out.println("This is Run Method");
    }

}
public class Main_Thread {

    public static void main(String[] args) {
        Child c = new Child();
        c.start();
        c.run();

    }
}