package JavaProgram;

final class base {
    int d = 8;

    final int diff(int x, int y) {
        return (x - y);
    }
}

class child extends base {
    final int x = 9;

    final int diff(int x, int y) {
        return x - y;
    }
}

public class final_class {
    public static void main(String[] args) {
        child obj = new child();

        obj.x = 10;
        // obj.d = 29;
        System.out.println(obj.x);
        System.out.println(obj.diff(45, 56));
        // System.out.println(obj.d + 10);
    }
}
