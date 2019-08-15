import java.util.Scanner;

public class Q16VowelOrConsonant {

    public static void main(String[]srgs){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Alphabet");

        char a = scanner.next().charAt(0);

        if((a== 'a') || (a== 'A') || (a=='e') || (a=='E') || (a=='i') ||(a=='I')
                || (a== 'O') ||(a=='o') ||  (a=='U') || (a=='u')){

            System.out.println("Its a Vowel");}

        else{

            System.out.println(" Its a Consonant");
        }






    }
}
