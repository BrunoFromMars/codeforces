import java.util.*;
import java.lang.*;
import java.io.*;

public class TwoCakes{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        
        
        if(a>b){
            int temp =a;
            a = b;
            b = temp;
        }
        
        int m=0;
        for(int i=1;i<=n-1;i++){
            int j = a/i;
            int k = b/(n-i);
            
            if(j>=1 && k>=1){
                m = Math.max(m,Math.min(j,k));
            }
        }
        System.out.println(m);
        
        
    }
    
    
}
