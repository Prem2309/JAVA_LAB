//package sample;

class Run extends Thread {
    public void running() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Running....." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Running1 {
    public static void main(String[] args) {
        Run r = new Run();
        r.start();
        r.running();
    }
}
