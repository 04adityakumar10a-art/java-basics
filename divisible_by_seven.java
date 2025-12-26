import java.util.*;
public class divisible_by_seven {
public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int x=n/7;
    if((x*7-n)==0)
        System.out.println("Yes");
    else
        System.out.println("No");


}




}
