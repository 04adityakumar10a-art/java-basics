import java.util.*;
public class selection_sort {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i<n; i++)
        {   arr[i] = sc.nextInt();}
        for(int i = 0; i<n; i++)
            {   System.out.print(arr[i]+" " );}
        selectionsort(arr,n);
        System.out.println();
        System.out.println("The sorted array is");
        for(int i = 0; i<n; i++)
            {   System.out.print(arr[i]+" ");}
    }
    public static void selectionsort(int arr[], int n)
    {
        for(int i = 0; i<n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(arr[i] > arr[j])
                {int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;}
            }




        }




    }



}
