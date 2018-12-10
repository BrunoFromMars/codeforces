import java.util.*;
import java.lang.*;
import java.io.*;

public class VanyaAndLanterns{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = in.nextInt();
        
        Arrays.sort(a);
        
        double d = Math.max(a[0],l-a[n-1])*2;
        
        
        for(int i =0;i<n-1;i++){
            d = Math.max(d,a[i+1]-a[i]);
        }
        System.out.printf("%.10f",d/2.0);
    }
    
}
