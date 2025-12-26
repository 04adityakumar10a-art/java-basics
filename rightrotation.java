import java.util.*;
public class rightrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String si=sc.nextLine();
        System.out.println("Enter the rotation");
        String s2=sc.nextLine();
        if(si.length()!=s2.length())
            System.out.println("No");
        int count =0;
        boolean b=false;
        for(int i=0;i<si.length();i++)
        {     StringBuilder s3= new StringBuilder();
            int x=si.length();
            int y=0;
            while(x>0)
            {   if(y==s2.length()-1)
                {   s3.append(s2.charAt(0));}
               else{ s3.append(s2.charAt(y + 1));}
                x--;
                y++;
            }
            count++;
            if(si.equals(s3.toString()))
            { b=true;
            break;}
            else {
                s2= s3.toString();
            }

        }
        if(b)
        {System.out.println("Yes");
         if(count<s2.length())
         {System.out.println(count+" Left shift");
         }
         else {System.out.println((count-s2.length())+" Right shift");}
        }
        else {System.out.println("No");}
    }

}
