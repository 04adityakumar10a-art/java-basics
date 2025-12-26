import java.util.*;
public class rotatearray {
 public static void main(String args[])
 {     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
     System.out.println("Enter the pt ");
    int y=sc.nextInt();

    for(int i=0;i<n-y;i++)
    {
        arr[i]=arr[y+i];
    }
   for(int i=y;i<n;i++)
       arr[i]=arr[i-y];
    for(int i=0;i<n;i++)
    { System.out.print(arr[i]+" ");    }


 }


}
