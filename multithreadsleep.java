package JavaProgram;

class NewThread implements Runnable {
     String name="my name";
    // Thread a;
    // a.setname("name");

    // NewThread(String threadname) {
    //     name = threadname;
    //     t = new Thread(this, name);
    //     System.out.println("New thread: " + t);
    //     t.start();
    // }

    public void run() {
        try

        {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new NewThread());
       // t.setName("hi");
       t.start();
     t.start();
    }
}

// class MultiThreadDemo {
//     public static void main(String args[]) {
//         NewThread obj = new NewThread("1Mr");
//         obj.run();
//         new NewThread("2amrit");
//         new NewThread("3anand");
//         try {

//             Thread.sleep(11000);
//         } catch (InterruptedException e) {
//             System.out.println("Main thread Interrupted");
//         }
//         System.out.println("Main thread exiting.");
        
//     }
// }