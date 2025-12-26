import java.util.*;
public class leaderelement
{  public static void main(String[] args)
{Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++) {
        boolean flag = true;
        for (int j = i+1; j < n; j++) {
            if (arr[i] < arr[j])
                flag=false;
        }
        if(flag)
        System.out.println("leader element :"+arr[i]);
    }


}
}
