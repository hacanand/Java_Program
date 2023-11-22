package JavaProgram;

public class method {
    static void print_name() {
        System.out.println("static function call");

    }

    public void print_name2() {
        System.out.println("public function call");

    }
    public static void main(String[] args) {
        print_name();
        method obj = new method();
        obj.print_name2();

    }
}
