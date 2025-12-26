package backtracking;

import java.util.Scanner;

public class mazepath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count= maze(1,1,a,b);

     System.out.println(count);
        print(1,1,a,b,"");
    }
    public static int maze(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downways=maze(sr+1,sc,er,ec);
        int rightways=maze(sr,sc+1,er,ec);
        return downways+rightways;





    }
public static void print(int sr, int sc, int er, int ec, String s) {
    if(sr>er || sc>ec) return ;
    if(sr==er&& sc==ec) {
        System.out.println(s);
        return ;}
    print(sr+1,sc,er,ec,s+"D");
    print(sr,sc+1,er,ec,s+"R");

}

}

