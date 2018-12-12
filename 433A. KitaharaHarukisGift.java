import java.util.*;
import java.lang.*;
import java.io.*;

public class KitaharaHarukisGift{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int w[] = new int[n];
        
        int sum =0;
        for(int i=0;i<n;i++){
            w[i] = in.nextInt();
            if(w[i]== 100)
                w[i] = 1 ;
            else
                w[i] = 2;
            sum += w[i];
            
        }
        System.out.println(solve(w,sum,n) == true ? "YES" :"NO");
        
        
    }
    
    public static boolean solve(int[] w,int sum,int n){
        
        if(sum %2 != 0 )
            return false;
            
        int a =0;
        int k=0;
        Arrays.sort(w);
        while(a < sum/2 && k < n){
            a += w[k];
            k++;
        }
        if( a == sum/2){
            return true;
        }
        if(w[0]==1 && k<n){
            a-=1;
            a-=w[k];
            a+=w[n-1];
            if(a== sum/2)
                return true;
        }
        return false;
    }
    
}
