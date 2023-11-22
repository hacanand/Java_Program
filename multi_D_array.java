//write a java program to create aaray list name student that store name of six student.perform following operation
// add the name of one of your friend at position determined as 
// to display the name of student at odd position
//to perform set, add ,remove clear ,sorting operation 

package JavaProgram;

public class multi_D_array {
    public static void main(String[] args) {

        char[][][] a = new char[][][] { { { 'E', 'E' }, { 'N', 'I', 'T' }, { 'P', 'A', 'T', 'N', 'A' } },
                { { '0', '2' }, { '2', '0', '2', '3' } } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k]+" ");
                }
            }
        }

    }

}