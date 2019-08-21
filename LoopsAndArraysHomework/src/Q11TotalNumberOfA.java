
import java.util.Scanner;

public class Q11TotalNumberOfA {


public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter String = ");

    String B = scanner.nextLine();

    char c = 'a';

    char d = 'A';

    System.out.println("The total number A is the Sting is = ");

    int a = 0;

    for( int i = 0;i<B.length();i++){

        if((c==B.charAt(i)) || (d==B.charAt(i))){

            a++;

        }
    }System.out.println(a);




}








}

