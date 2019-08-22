import java.util.Scanner;

public class Q9SalesAmount {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id =");

        int Id = scanner.nextInt();

        System.out.println("Enter Name = ");

        String Name = scanner.next();

        System.out.println("Enter Sales Amount = ");

        int S = scanner.nextInt();

        System.out.println("Enter Basic Salary = ");

        int Basicsalary = scanner.nextInt();

        if( S>=50000)
        {

            System.out.println("SalesCom is " + (S*35/100)); }

        else if((S>=30000) && (S<=49999))
        {

            System.out.println("SalesCom is " + (S*20/100)); }

        else if((S>=20000) && (S<=29999))
        {

            System.out.println("SalesCom is " + (S*10/100)); }

        else if ((S>=10000) && (S<=19999));
        {

            System.out.println("SalesCom is " + (S*5/100)); }





        }




    }

