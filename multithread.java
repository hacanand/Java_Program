package JavaProgram;

class demo extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + ",");
            }
        } catch (Exception e) {
            System.out.println("something weent wrong");
        }
    }
}

public class multithread {
    public static void main(String[] args) throws InterruptedException {
        Thread obj = new Thread(new demo());
        // // int n=10;
        // // while (n > 0) {
        obj.start();
        // obj.start();
         //obj.sleep(10000);
        // System.out.println("\n");
        // obj.run();
        // n--;
        //Thread.s;
        // }
    }
}