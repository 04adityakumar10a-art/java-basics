import java.util.*;
public class number_dd {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = n - i-1;
            while (x > 0) {
                System.out.print("  ");
                x--;
            }
            int t = 1;
            while (t <= i+1) {
                System.out.print(t +" ");
                t++;
            }
            t-=2;
            while (t >= 1) {
                System.out.print(t +" ");
                t--;
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int x = i+1;
            while (x > 0) {
                System.out.print("  ");
                x--;
            }
            int t = 1;
            while (t <=n -i-1) {
                System.out.print(t +" ");
                t++;
            }
            t-=2;
            while (t >= 1) {
                System.out.print(t +" ");
                t--;
            }
            System.out.println();
        }
       }
    }


