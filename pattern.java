package backtracking;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int rows=sc.nextInt();
        int rows=5;

        String arr[][]=new String[rows][2*rows-1];
        for(int i=0;i<rows;i++ )
        {for(int j=0;j<2*rows-1;j++)
            { arr[i][j]=" ";
            }}
        for(int i=0;i<rows;i++) {
            for (int j=rows-1-i; j<rows+i-1; j += 2) {
                arr[i][j] = "* ";
            }
        }
       for(int i=0;i<rows;i++) {
           for (int j = 0; j < 2*rows-1; j++) {
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }

    }


}
