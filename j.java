package secondrepo;
import java.util.Scanner;
public class j {
    public static void main(String[] args) {
        System.out.println("Second Repository");
        Scanner input =new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter Number1: ");
        num1=input.nextInt();
        System.out.print("Enter Number2: ");
        num2=input.nextInt();
        sum=num1+num2;
        
        System.out.println("Sum of two Numbers: "+sum);
        
    }
}
