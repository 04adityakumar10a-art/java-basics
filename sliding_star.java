import java.util.*;
public class sliding_star {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =0 ; i < n; i++) {
            int x = i;
            while (x > 0) {
                System.out.print("  ");
                x--;
            }
            int y = n;
            while (y > 0) {
                System.out.print('*'+" ");
                y--;
            }

            int p = (n-i-1)*2;
            while (p > 0) {
                System.out.print("  ");
                p--;
            }
            int z = n;
            while (z > 0) {
                System.out.print('*'+" ");
                z--;
            }

            System.out.println();
        }
        for (int i =0 ; i < n; i++) {
            int x = n-i-1;
            while (x > 0) {
                System.out.print("  ");
                x--;
            }
            int y = n;
            while (y > 0) {
                System.out.print('*'+" ");
                y--;
            }

            int p = i*2;
            while (p > 0) {
                System.out.print("  ");
                p--;
            }
            int z = n;
            while (z > 0) {
                System.out.print('*'+" ");
                z--;
            }

            System.out.println();
        }

    }


}