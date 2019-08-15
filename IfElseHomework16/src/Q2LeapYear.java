import java.util.Scanner;

public class Q2LeapYear {

    public static void main (String[]args){

       /* int year = 2035;

        if(((year%4==0) && (year%100!=0))||(year%400==0)){
            System.out.println("Its a Leap Year");
        }else{
            System.out.println("Its not a Leap Year");

        }*/

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Year");
        int B= scanner.nextInt();

        System.out.println("This Year is " + (((B%4==0) && (B%100!=0) || (B%400==0))? "leap year": "not a leap year"));



    }
}
