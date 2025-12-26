import java.util.*;
public class number_diamond {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;
        for (int i = 0; i < n; i++) {
            int x = n - i-1;
            while (x > 0) {
                System.out.print("  ");
                x--;
            }
            int y = 2 * i + 1;
            while (y > 0) {
                System.out.print(t +" ");
                t++;
                y--;
            }

            System.out.println();
        }
        t--;
        for (int i = 0; i < n; i++) {
            int x = i;
            while (x > 0) {
                System.out.print("  ");
                x--;
            }
            int y = 2 *(n-i)-1;
            while (y > 0) {
                System.out.print(t +" ");
                t--;
                y--;
                int x = 2* (n-1) -1}:
            while (y< 0){
            System.out.println();
        }
    }


}