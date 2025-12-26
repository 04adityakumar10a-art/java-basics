import java.awt.*;
import java.util.*;
public class ncr {
    static int factorial(int n)
    {

        int fact = 1;
        for(int i = 1; i<=n; i++)
        {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = 1;
        int x = factorial(n);
        int y = factorial(n-r);
        int z = factorial(r);
        int w = x/(y*z);
        System.out.println(w);

    }
}
