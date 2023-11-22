package JavaProgram;

import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter numerator: ");
            int numerator = sc.nextInt();
            System.out.println("Enter denominator: ");
            int denominator = sc.nextInt();
            try {
                int result = numerator / denominator;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by 0");
            
        }
        System.out.println("program at the end");

    }
}