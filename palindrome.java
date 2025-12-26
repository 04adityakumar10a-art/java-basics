import java.util.*;
public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String s = sc.next();
        s=s.toLowerCase();
        String str2="";
        for(int i=s.length()-1;i>=0;i--)
        {    str2+=s.charAt(i);}
        if(s.equals(str2))
        {System.out.println("Palindrome");}
        else {
            System.out.println("Not a palindrome");
        }


    }
}
