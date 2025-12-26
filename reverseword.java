import java.util.*;
public class reverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String str[] = s.split(" ");
        System.out.println("Reversed string");
        String s2="";
        for(int i=s.length()-1;i>=0;i--)
        {    s2=s2+s.charAt(i);

        }
        System.out.print(s2+" ");
    }
}
