import java.util.Scanner;

public class Q11VoteEligibilty {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Age = ");

        int Age = scanner.nextInt();

        System.out.println((Age >=18) ? "Eligible to Vote" : "Too Young to Vote");


    }
}
