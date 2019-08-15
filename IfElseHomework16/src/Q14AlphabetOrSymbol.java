import java.util.Scanner;

public class Q14AlphabetOrSymbol {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value");



        char c = scanner.next().charAt(0);

        if(c >= 'a' && c <= 'z'){

            System.out.println(" is an alphabet !!");
        }else if (c >= 0 || c <= 9){

            System.out.println(" is a Number");
        }else{

            System.out.println(" is a Symbol");
        }



    }
}
