import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();

        long fact = 1;
        for (int i =1 ; i <= num; i++) {
            fact *=1;


        }
    System.err.println("fact is"+fact);


    }
    
}
