

public class Q7DuplicateValuesArrays {


public static void main(String[]args){

    int[] Arr = {5,51,6,51,6,3,8484,321,321};

    System.out.println("The duplicate Values are = ");

    for(int i=0;i<Arr.length;i++){

        for(int j = i+1;j<Arr.length;j++){

            if(Arr[i]==Arr[j]) System.out.println(Arr[j]);
        }


    }






}







}