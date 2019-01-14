import java.util.*;
import java.lang.*;
import java.io.*;

public class WeirdSubstractionProcess{
    
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        
        while(true){
            if(a==0 || b==0)
                break;
            if(a>=2*b){
                a %=2*b;
                continue;
            }
            if(b>=2*a){
                b %=2*a;
                continue;
            }else{
                break;
            }
        }
        System.out.println(a + " " + b);
    }
    
    
    
}
