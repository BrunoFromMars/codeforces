import java.util.*;
import java.lang.*;
import java.io.*;

public class OhanaCleanUp{
    
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        String[] room = new String[n];
        for(int i=0;i<n;i++){
            room[i] = in.next(); 
        }
        long count,ans=0;
        for(int i=0;i<n;i++){
            String s=room[i];
            count =1;
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(s.equals(room[j]))
                    count++;
            }
            ans = Math.max(ans,count);
        }
        
        System.out.println(ans);
        
       
    }
    
    
    
}
