package JavaProgram;
import java.util.*;
 class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 integer values: ");
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Non-integer value entered. Assigning rest of values to 0.");
                for (int j = i; j < arr.length; j++) {
                    arr[j] = 0;
                }
                break;
            }
        }
        System.out.println("Array values: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Enter 6 integer values: ");
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Non-integer value entered. Assigning value to 0.");
                arr[i] = 0;
                sc.next();
            }
        }
        System.out.println("Array values: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}