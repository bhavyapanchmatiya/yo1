import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first digit");
        int a=scanner.nextInt();
        System.out.println((a%2==0)?"This is  Even no":"This is Odd no");

        System.out.println("Enter Second digit");
        int b=scanner.nextInt();
        System.out.println((b%2==0)?"This is  Even no":"This is Odd no");


    }
}
