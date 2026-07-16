import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        return (n == 0 || n == 1) ? 1 : n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + fact(n));
        sc.close();
    }
}