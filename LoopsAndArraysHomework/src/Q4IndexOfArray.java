import java.util.Scanner;

public class Q4IndexOfArray {



    public static void main(String[]args){

        int[] T = {54,87897,564,8,65,35,5454};

        System.out.println("Enter Value ");

        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();

        for(int i=0; i<=T.length; i++)
        {

        if (P==T[i]){

            System.out.println("The index of the value is " + (i++) );
        }



    }}
}
