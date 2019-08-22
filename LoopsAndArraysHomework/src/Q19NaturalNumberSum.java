import java.util.Scanner;

public class Q19NaturalNumberSum {


    public static void main(String[]args){

    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter  seventh number");
    int a=scanner.nextInt();
    int sum=0;
    for(int i=1;i<=a;i++){
        sum+=i;
    }
    System.out.println("The sum if first seven natural number is:"+sum);
}
}