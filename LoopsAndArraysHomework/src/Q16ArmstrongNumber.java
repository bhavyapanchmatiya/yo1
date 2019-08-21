import java.util.Scanner;

public class Q16ArmstrongNumber {


public static void main(String[]args){

    int a,arm=0,n,temp;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number = ");

    n= sc.nextInt();

    temp=n;

    for(;n!=0;n/=10){
        a=n%10;
        arm=arm+(a*a*a);

    }if(arm==temp)
        System.out.println(temp+ " = Is an Armstrong Number");
    else System.out.println(temp+ " = is Not an Armstrong Number");





}








}