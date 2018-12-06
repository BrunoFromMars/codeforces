import java.util.*;
import java.lang.*;
import java.io.*;

public class SoldierandBanana{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int money =0;
        for(int i=1;i<=w;i++){
            money += i*k;
        }
        System.out.println((money-n) >0 ? (money-n) : 0 );
       
    }
    
}
