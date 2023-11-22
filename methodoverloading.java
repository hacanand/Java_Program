/*retail stores has the requirement of printing many report .All the reports have diffrent headers .
The headers of different stores contain the following 
  
1.a line containig a character printed 50 times or
2.a title of a report or 
3.a line containing a character for specified number of times
pointin of heade is required to be done for allthe reports ,but what is printed in the header differs based on the 
specification given above .write the java program using method overloading

*/
package JavaProgram;

public class methodoverloading {
    void retailreport() {
        char a = 'R';
        for (int i = 0; i <= 50; i++)
            System.out.println(a);

        System.out.println("character " + a + " printed 50 number of times\n");
    }

    void retailreport(String a) {
        System.out.println(a);
        System.out.println(a + " is printed \n");
    }

    void retailreport(char a, int b) {
        for (int i = 0; i < b; i++)
            System.out.println(a);
        System.out.println("Character " + a + " printed " + b + " number of times \n");
    }

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        obj.retailreport();
        obj.retailreport("Lord is great");
        obj.retailreport('P', 5);
    }
}
