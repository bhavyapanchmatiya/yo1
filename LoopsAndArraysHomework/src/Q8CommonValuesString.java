public class Q8CommonValuesString {

public static void main(String[]args){


    String[] A = {"Mane","Salah","Firmino","Fabino","Milner"};

    String[] B = {"Salah","Van Dijk","Fabino","Milner","Alisson",};

    System.out.println("The Common String elements are = ");

    for(int i =0;i<A.length;i++){

        for(int j=0;j<B.length;j++){

            if(A[i].equals(B[j])){

            System.out.println(A[i]);
        }
    }}






}



}
