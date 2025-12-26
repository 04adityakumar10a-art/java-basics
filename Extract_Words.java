import java.util.*;
public class Extract_Words
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words");
        String s = sc.nextLine();
        String lowerCase = s;
        int count = 1;
        for (int i = 0; i < lowerCase.length(); i++)
        {  if(lowerCase.charAt(i)==' ')
            count++;
        }
         System.out.println(count);
        /*int t=0;
       int  start=0;
        String Arr[]= new String[count];
        for(int i=0;i<lowerCase.length();i++)
        {  if(lowerCase.charAt(i)==' ')
            { Arr[t]=lowerCase.substring(start,i);
             start=i+1;
             t++;}
            else if(i==lowerCase.length()-1)
        {Arr[t]=lowerCase.substring(start);         }
        }
       for(int i=0;i<count;i++)
       {  System.out.println(Arr[i]); }
    }*/StringTokenizer st = new StringTokenizer(s," .");
    while(st.hasMoreTokens())
        System.out.println(st.nextToken());
}}
