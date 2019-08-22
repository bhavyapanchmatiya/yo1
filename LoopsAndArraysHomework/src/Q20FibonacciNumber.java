import java.util.Scanner;

public class Q20FibonacciNumber {

public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the range limit = ");

    int n = scanner.nextInt();

    int a = 0;

    int b = 1;

    for(int i=2;i<n;i++) {

        int sum = a + b;

        a = b;

        b = sum;

        if (sum > n)

            break;

        System.out.print(sum + " ");
    }









}







}