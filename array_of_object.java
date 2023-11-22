package JavaProgram;

public class array_of_object {

    int b;

    int setter(int a) {
        b = a;
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        array_of_object[] obj = new array_of_object[2];
        obj[0] = new array_of_object();
        obj[1] = new array_of_object();
        int a = obj[0].setter(10);
        int b = obj[1].setter(490);
        System.out.println(a + " " + b);
    }

}
