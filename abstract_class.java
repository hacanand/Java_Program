package JavaProgram;

abstract class creature {
    boolean fly;
    boolean tail;

    abstract void no_of_legs();
}

class human extends creature {
    boolean fly = false;
    boolean tail = false;

    void no_of_legs() {
        System.out.println("human cannot fly" + " " + "and has no tail");
        System.out.println("number of  legs: 2");
    }
}

class dog extends creature {
    boolean fly = false;
    boolean tail = true;

    void no_of_legs() {
        System.out.println("dog cannot fly" + " " + " and has a tail");
        System.out.println("number of legs: 4");
    }

}

class pigeon extends creature {
    boolean fly = true;
    boolean tail = false;

    void no_of_legs() {
        System.out.println("pigeon can fly" + " " + "and has no tail");
        System.out.println("number of  legs: 2");
    }

}

public class abstract_class {
    public static void main(String[] args) {
        human obj1 = new human();
        obj1.no_of_legs();
        dog obj2 = new dog();
        obj2.no_of_legs();
        pigeon obj3 = new pigeon();
        obj3.no_of_legs();

    }

}
