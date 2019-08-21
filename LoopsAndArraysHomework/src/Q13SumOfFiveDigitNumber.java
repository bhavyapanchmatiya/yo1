import java.util.Scanner;

public class Q13SumOfFiveDigitNumber {

public static void main(String[]args){


    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a Five Digit Number");

    int A = scanner.nextInt();

    int sum = 0;

    while(A>0){

        int add =A%10;

        sum = sum + add;

        A=A/10;

    }
    System.out.println("The total of Five digits are = " + sum );


}







}
