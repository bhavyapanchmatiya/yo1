package Arrays;

import java.util.Scanner;

public class ArraysPractising {



    public static void main(String[]args){

        int [] A = {56,898,7531,15,654,5455};

        System.out.println("Enter the Value =");

        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();

        for( int i = 0; i<A.length;i++) {

            if(B== A[i]){

                System.out.println("Value is present in Array " + i++);


            }



        }

    }






}


