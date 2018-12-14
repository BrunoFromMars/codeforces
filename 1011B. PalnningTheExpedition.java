import java.util.*;
import java.lang.*;
import java.io.*;

public class PlanningTheExpedition{
    
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[101];
        Arrays.fill(a,0);
        for(int i=0;i<m;i++)
            a[in.nextInt()]++ ;
            
        //for(int c : a)
        //    System.out.print(c + " ");
        int res =0;
        for(int i=1;i<=100;++i){
            if(can(n,i,a))
                res = i;
                
        }
        
        System.out.println(res);
        
    }
    public static boolean can(int n,int mid,int[] a){
        int need =n;
        for(int i=1;i<=100;++i){
            need -= a[i]/mid;
            
        }
        return need<=0;
        
    }
    
    
}
