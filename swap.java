
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();
        
        System.out.println("enter a number");
        int b = sc.nextInt();

        System.out.println("before swap : a = "+ a + ",b = +b");

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap : a = "+ a + ",b = +b");

    }
    
}
