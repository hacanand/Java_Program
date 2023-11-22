package JavaProgram;

public class coding {

    coding() {
        System.out.println("I Like Java");
    }

    coding(String a) {
        System.out.println(a);

    }

    coding(String d, int b) {
        int stringsize = d.length();
        System.out.println(stringsize + b);

    }

    public static void main(String[] args) {
        coding obj1 = new coding();
        coding obj2 = new coding("rama is God");
        coding obj3 = new coding("lord is allmighty", 50);
    }
}
