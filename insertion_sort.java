import java.util.*;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++)
        {     int temp=arr[i+1];
            int j=i;
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }

}
