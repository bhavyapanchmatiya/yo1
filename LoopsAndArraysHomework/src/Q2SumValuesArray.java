import java.util.Arrays;

public class Q2SumValuesArray {

    public static void main(String[]args){

        int [] T = {3443,4343,4344,434,1};

        int sum = Arrays.stream(T).sum();

        System.out.println("The Total Value is " + sum);


    }
}
