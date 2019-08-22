import java.util.Scanner;

public class Q8PositiveNegativeZero {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number");

        int A = scanner.nextInt();

        if (A >0){
        System.out.println("Positive Number");}
        else if(A<0){
            System.out.println("Negative Number");
        }
        else{

            System.out.println("Zero");
        }



    }
}
