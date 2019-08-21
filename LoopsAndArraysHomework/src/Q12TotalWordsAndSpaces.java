import java.util.Scanner;

public class Q12TotalWordsAndSpaces {


    public static void main(String[]args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sentence = ");

        String M = scanner.nextLine();

        int a = 1;

        for(int i = 0;i<M.length();i++){

            if(M.charAt(i)==' '){
                a++;



            }


        }
        System.out.println("The total number of spaces = " + (a-1));

        System.out.println("The total number of words = " + a);




    }



    }






