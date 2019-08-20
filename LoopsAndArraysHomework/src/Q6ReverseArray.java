

public class Q6ReverseArray {


    public static void main(String[] args){


       int [] A = {10,17,25,32,35,54};

        for (int value : A) {

            System.out.println("The original order is " + value);

        }
        for(int b = A.length -1; b>=0; b--) System.out.println("The reverse is " + A[b]);


    }






}