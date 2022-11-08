import java.util.Scanner;
public class Factorial {
    public long fact(long n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        Factorial obj = new Factorial();
        long factor = obj.fact(n);
        System.out.println("Factorial of "+n+ ": "+factor);
    }
}