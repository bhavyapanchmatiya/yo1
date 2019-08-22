import java.util.Scanner;

public class Day_Name {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Digit from 1 to 7");
        int d=scanner.nextInt();
        if(d==1){
            System.out.println("MONDAY"); }
        else if(d==2){
            System.out.println("TUESDAY"); }
        else if(d==3){
            System.out.println("WEDNESDAY"); }
        else if(d==4){
            System.out.println("THURSDAY"); }
        else if(d==5){
            System.out.println("FRIDAY"); }
        else if(d==6){
            System.out.println("SATURDAY"); }
        else if(d==7){
            System.out.println("SUNDAY"); }
        else System.out.println("INVALID ENTRY");
    }
}
