import java.util.*;
public class rightmatrix {
    public static void transpose(int arr[][], int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reversematrix(int arr[][], int n)
    {
        for(int i=0;i<n;i++)
        {
            int start = 0;
            int end = n-1;
            while(start<end)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of matrix");
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    System.out.println("Enter the elements of the matrix");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j--)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    transpose(arr,n);
    reversematrix(arr, n);
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }







    }
}
