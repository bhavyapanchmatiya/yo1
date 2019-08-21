import java.util.Scanner;

public class Q15ReverseFiveDigit {

public static void main(String[]args){


    Scanner scanner = new Scanner(System.in);


    System.out.println("Enter Five digit number = ");

    int A = scanner.nextInt();

    int reversedNumber = 0;

    int temp;

    while(A>0){

        temp = A%10;

        reversedNumber = reversedNumber * 10 + temp;

        A = A/10;


    }
    System.out.println("The Reverse is = " + reversedNumber);





}








}