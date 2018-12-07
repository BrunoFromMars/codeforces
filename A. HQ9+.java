import java.util.*;
import java.lang.*;
import java.io.*;

public class HQ9{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String hq9 = "HQ9+";
        int[] ahq9 = new int[hq9.length()];
        for(int i=0;i<hq9.length();i++){
            ahq9[i] = (int)hq9.charAt(i);
        }
        int p=0;
        String s = in.next();
        int[] as = new int[s.length()];
        for(int i=0;i<s.length();i++){
            as[i] = (int)s.charAt(i);
            if(as[i]==72 || as[i]==81 || as[i]==57){
                p++;
                break;
            }
            
        }
        
        System.out.println(p>0 ? "YES" : "NO");
        
        
        
        
        
        
    }
    
}
