import java.util.Scanner;

public class Q15DayOfWeek {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number from 1 to 7 ");

        int a= scanner.nextInt();

        if(a==1)
        { System.out.println("Monday"); }

        else if(a==2)
        {
            System.out.println("Tuesday"); }


           else if(a==3)
            { System.out.println("Wednesday"); }


                          if(a==4){

            System.out.println("Thursday");
        }

                             if(a==5){

            System.out.println("Friday");
        }
         if(a==6){

            System.out.println("Saturday");
        }
            if(a==7){

            System.out.println("Sunday");
        }else{

                System.out.println("INVALID");
            }


    }
}
