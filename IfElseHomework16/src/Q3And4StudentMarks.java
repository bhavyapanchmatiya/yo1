import java.util.Scanner;

public class Q3And4StudentMarks {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name");

        String StudentName = scanner.next();

        System.out.println("Enter Roll Number");

        int RollNumber = scanner.nextInt();

        System.out.println("Enter History Marks");

        int HistoryMarks = scanner.nextInt();

        System.out.println("Enter Maths Marks");

        int MathsMarks = scanner.nextInt();

        System.out.println("Enter English Marks");

        int EnglishMarks = scanner.nextInt();

        System.out.println("Total Marks are = " + (HistoryMarks + EnglishMarks + MathsMarks));

        System.out.println("Percentage = " + (MathsMarks + EnglishMarks + HistoryMarks)/3);



        if(((HistoryMarks + EnglishMarks + MathsMarks) / 3) >=90){

            System.out.println("A+ Grade");

        }else if (((HistoryMarks + EnglishMarks + MathsMarks)/3) >= 75){

            System.out.println("A Grade");

        }else if(((HistoryMarks + EnglishMarks + MathsMarks)/3) <=50){

            System.out.println("B Grade");
        }else if (((HistoryMarks + EnglishMarks + MathsMarks)/3) <=35) {

            System.out.println("C Grade");



        }else{}

        System.out.println((((HistoryMarks + EnglishMarks + MathsMarks)/3) <= 34)? "Fail":"Fail");















    }
}