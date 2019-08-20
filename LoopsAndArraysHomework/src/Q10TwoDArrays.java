public class Q10TwoDArrays {

public static void main(String[]args){

    int[][] A = {{1,1,1},{3,3,3},{9,9,9}};

    int transpose[][]=new int[3][3];

    for(int i = 0;i<3 ; i++){

        for(int j = 0; j<3; j++){

            transpose[i][j]=A[j][i];
        }


    }
    System.out.println("Original Matrix");

    for(int i =0;i<3;i++){

        for (int j =0;j<3;j++) {



            System.out.print((A[i][j]) + "  ");


        }
        System.out.println();
    }


        System.out.println("Transpose Matrix");

        for(int i = 0;i<3;i++){

            for(int j = 0;j<3;j++){

                System.out.print(transpose[i][j] + "  ");



            }
            System.out.println();
        }






    }






}















