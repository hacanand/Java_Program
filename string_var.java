package JavaProgram;

//import java.util.*;

public class string_var {
    public static void main(String[] args) {

        String name = "Amrit_Anand";
        int roll_no = 2102003;
        String dob = "13/04/2003";
        String na_roll = name + String.valueOf(roll_no);
        System.out.println(na_roll);

        System.out.println("character at 5th and 15th indeex is\n" + na_roll.charAt(5) + " " + na_roll.charAt(15));

        System.out.println(na_roll.length());

        System.out.println(na_roll.substring(6, 11));
        String capname = "AMRIT";
        // boolean s = na_roll.contains(capname);
        // String s = "amrit", v = "amrit";
        // System.out.println(s.compareTo(v));
        System.out.println(na_roll.contains(capname));
        System.out.println(dob);
        System.out.println(na_roll + dob);
    }
}
