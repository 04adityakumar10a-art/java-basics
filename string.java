import java.util.*;
public class string
{
    public static void main(String args[])
    {   int countv=0;
        int countc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String lowerCase = s.toLowerCase();
        System.out.println(lowerCase);
        for(int i = 0; i<lowerCase.length(); i += 1)
        {
            if(lowerCase.charAt(i)==' ')
            continue;
            else if (((lowerCase.charAt(i)) == 'a') || ('e' == lowerCase.charAt(i)) || ('i' == lowerCase.charAt(i)) || ('o' == lowerCase.charAt(i)) || ('u' == lowerCase.charAt(i)))
            {
                countv++;
            }

            else {countc++;}
        }
        System.out.println(countv);
        System.out.println(countc);

    }




}
