public class Q9EqualityOfArrays {


    public static void main(String[] args) {

        int[] A = {65456, 61261, 56486, 156168, 1568, 48, 4, 3};

        int[] B = {64564, 64654, 48, 4, 64864, 1568, 6768, 65, 65};

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < B.length; j++) {

                if (A[i] == B[j])
                {

                    System.out.println("The equal values in Arrays A and B are = " + A[i]);
                }
            }

        }


    }


}
