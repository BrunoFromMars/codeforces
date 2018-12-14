import java.util.*;
import java.lang.*;
import java.io.*;

public class FarRelativesProblem{
    
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int m[] = new int[367];
        int f[] = new int[367];
        Arrays.fill(m,0);
        Arrays.fill(f,0);
        for(int i=0;i<n;i++){
            char c = in.next().charAt(0);
            int from,to;
            if(c=='M'){
                from = in.nextInt();
                to = in.nextInt();
                for(int j=from;j<=to;j++){
                    m[j]++;
                }
                
            }
            if(c=='F'){
                from = in.nextInt();
                to = in.nextInt();
                for(int j=from;j<=to;j++){
                    f[j]++;
                }
            }
        }
        int count =0;
        
        
        for(int i=1;i<=366;i++){
            if(count< Math.min(m[i],f[i]))
                count = Math.min(m[i],f[i]);
            
        }
        System.out.println(2*count);
        
        
        
        
    }
    
    
    
}
