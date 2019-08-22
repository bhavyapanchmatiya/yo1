import java.util.Scanner;

public class Q7AverageFiveNumbers {

    public static void main (String[]args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");

        int Firstnumber = scanner.nextInt();

        System.out.println("Enter Second Number");

        int Secondnumber = scanner.nextInt();

        System.out.println("Enter Third number");

        int Thirdnumber = scanner.nextInt();

        System.out.println("Enter Fourth Number");

        int Fourthnumber = scanner.nextInt();

        System.out.println("Enter Fifth Number");

        int Fifthnumber = scanner.nextInt();

        System.out.println("The Average is " + (Fifthnumber + Firstnumber + Secondnumber + Thirdnumber + Fourthnumber)/5);




    }
}
