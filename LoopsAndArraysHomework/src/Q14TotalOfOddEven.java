import java.util.Scanner;

public class Q14TotalOfOddEven {

    public static void main(String[] args ){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a 5-digit number.");
        int num= scanner.nextInt();
        int sum = 0;
        int last_digit;
        int even=0;
        int odd=0;
        int sum1=0;
        int sum2=0;
        while(num!=0) {
            last_digit = num % 10;//any number modulo 10 is actually equal to the last digit of the number.
            sum = sum + last_digit;//adding the last digit to sum to get a new sum value (eg. 0+last digit)
            num = num / 10;//to get the new number after the last digit is removed.
            if (last_digit % 2 == 0) {
                even = even + 1;//to get even numbers in the number
                sum1=sum1+last_digit;//to get the sum of even numbers

            } else {
                odd = odd + 1;//to get odd numbers in the number
                sum2=sum2+last_digit;//to get the sum of odd numbers

            }
        }
        System.out.println("Sum of 5 digits is : " + sum);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Sum of even numbers: " + sum1);
        System.out.println("Number of odd numbers: " + odd );
        System.out.println("Sum of odd numbers: " + sum2);







    }
}