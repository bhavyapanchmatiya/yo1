import java.util.Scanner;

public class Q18MultiplicationTable {


    public static void main(String[]args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter any number");

        //System.out.println("Multiplication table of " +  + ":");
        int c = 1;
        do {
            int temp=1;
            do {
                System.out.print((temp * c));
                temp++;
            }
            while (temp <=3);c++;

            System.out.println("");
        }while(c<=3);}

    {//System.out.print(""); }
    }}