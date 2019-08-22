import java.util.Scanner;

public class Q12UpperLowerCase {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Letter to change into upper case = ");

       String changeCase = scanner.next();


        String result;

        result =  changeCase.toUpperCase();

        System.out.println(result);





    }


}
