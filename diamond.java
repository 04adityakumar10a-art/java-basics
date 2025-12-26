import java.util.*;
public class diamond {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;
        for (int i = 0; i < n; i++) {
          for(int j=0;j<n-i-1;j++) {
                System.out.print("  ");}
              int y = 2 * i + 1;
              while (y > 0) {
                  System.out.print('*' +" ");
                  y--;
            }
            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            int x = i+1;
            while (x > 0) {
                System.out.print("  ");
                x--;
            }
            int y = 2 *(n-i-1)-1;
            while (y > 0) {
                System.out.print('*' +" ");

                y--;
            }
            System.out.println();
        }
    }


}