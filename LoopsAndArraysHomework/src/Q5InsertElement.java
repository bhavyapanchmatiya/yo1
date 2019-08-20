import java.util.Arrays;
import java.util.Scanner;

public class Q5InsertElement {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int[] A = {5,18,23,35,43,65};

        System.out.println("Enter Element ");

        int ele = scanner.nextInt();

        System.out.println("Enter the desired position " + A.length);

        int pos = scanner.nextInt();

        if (A.length - 1 - pos - 1 >= 0) System.arraycopy(A, pos - 1, A, pos, A.length - 1 - pos - 1);
        A[pos-1]=ele;

        System.out.println(Arrays.toString(A));




    }


}