import java.util.Scanner;

public class Q10CityNames {

    public static void main(String[]args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Alphabet = ");

        char i = scanner.next().charAt(0);

        if(i== 'a' || i== 'A'){

            System.out.println("Auckland"); }

        else if(i== 'b' || i== 'B'){

            System.out.println("Berlin");


        }                  else if(i=='c' || i=='C'){

            System.out.println("Chandigarh");
        }
        else if(i=='d' || i=='D'){

            System.out.println("Dumfries");

        }else if(i=='e' || i=='E'){

            System.out.println("El Paso");

        }else if(i=='f' || i=='F'){

            System.out.println("Faridabad");
        }
        else{

            System.out.println("INVALID"); }




    }}
