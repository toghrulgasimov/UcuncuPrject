import java.util.Scanner;

public class Menimprogramim {
    public static void main(String[] args) {




        // int, double, float, long, String, boolean


         // <, <=, >, >=, ==, !=, &&, ||

        Scanner scan = new Scanner(System.in);

        System.out.println("Ededin 5 e bolunduyunu yoxlayan Program");

        System.out.print("Ededi Daxil et:");
        int a = scan.nextInt();

        if (a % 5 == 0) {
            System.out.println("Eded 5 e bulunur");
        }else {
            System.out.println("Eded 5 e bulounmur");
        }

    }
}