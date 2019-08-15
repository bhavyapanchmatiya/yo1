import java.util.Scanner;

public class Q6GrossSalary{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID");

        int id = scanner.nextInt();

        System.out.println("Enter employee Name");

        String Name = scanner.next();

        System.out.println("Enter Basic Salary");

        int Salary = scanner.nextInt();


        System.out.println("HRA = " + (Salary*10/100));
        System.out.println("DA = " + (Salary*8/100));
        System.out.println("TA = " + (Salary*9/100));
        System.out.println("PF = " + (Salary *20/100));

        System.out.println("GrossSalary = " + ((Salary)+ (Salary*10/100) + (Salary*8/100) + (Salary*9/100) - (Salary*20/100)));



    }
}