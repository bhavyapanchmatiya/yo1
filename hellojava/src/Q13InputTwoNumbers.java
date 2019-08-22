import java.util.Scanner;

public class Q13InputTwoNumbers {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number = ");

        int a = scanner.nextInt();

        System.out.println("Enter Second Number = ");

        int b = scanner.nextInt();

        System.out.println("Enter Any one '*' '-' '+' '/' ");

        String symbol = scanner.next();

        if(symbol.equals("+")){

            System.out.println("Result =" +(a+b));
        }else if(symbol.equals("-")){

            System.out.println(a-b);
        }else if (symbol.equals("*")){

            System.out.println(a*b);


        }else if (symbol.equals("/")){

            System.out.println(a/b);
        }else{

            System.out.println("Invalid");

        }




    }


}
