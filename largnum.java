import java.util.Scanner;

public class largnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a num");
        int a = sc.nextInt();
        System.err.println("enter a num");
        int b = sc.nextInt();
        System.err.println("Largest number" +Math.max(a,b));

    }
}