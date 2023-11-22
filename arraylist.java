package JavaProgram;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        Scanner my = new Scanner(System.in);
        String newName;
        name.add("amit");
        name.add("amrit");
        name.add("rahul");
        name.add("abhishek");
        name.add("ayush");

        System.out.println("Enter newname");
        newName = my.nextLine();

        System.out.println("last character of new Name : " + newName.charAt(newName.length() - 1));
        char x = newName.charAt(newName.length() - 1);

        if (x == 'a')
            name.add(0, newName);
        else if (x == 'e')
            name.add(1, newName);
        else if (x == 'i')
            name.add(2, newName);
        else if (x == 'o')
            name.add(3, newName);
        else if (x == 'u')
            name.add(4, newName);
        else
            name.add(5, newName);

        // System.out.println(name);
        System.out.println("adding newName");
        System.out.println(name);
        name.remove(2);
        System.out.println("after remove index 2");
        System.out.println(name);
        // System.out.println(name.size());
        // Collections.reverse(name);
        // System.out.println(name);
        System.out.println("on sorting");
        Collections.sort(name);
        System.out.println(name);
        System.out.println("after setting ");
        name.set(0, "ahsish");
        System.out.println(name);
        // Collections.sort(name, Collections.reverseOrder());
        // System.out.println(name);
        System.out.println("after clear");
        name.clear();
        System.out.println(name);
        // System.out.println(name.size());
    }

}
