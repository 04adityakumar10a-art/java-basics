import java.util.*;
public class saddleelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                arr[i][j] = sc.nextInt();
        }
         for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            int m=1;
        for(int k=0;k<size;k++)
        { if(arr[i][j]<arr[i][k]||arr[i][j]<arr[k][j])
        { m=0;
            }
        }
        if(m==1)
        System.out.println("Saddle point is "+arr[i][j]+" "+"at "+i+" "+j);
          }}


    }}


