import java.util.*;
import java.lang.*;
import java.io.*;

public class AProsperousLot{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int k = in.nextInt();
        
        loop(k);
            
    }
    public static void loop (int k){
        if(k > 36){
            System.out.println(-1);
            return;
        }    
        else{
        if(k==0){
            System.out.println(1);
            return;
        }
        if(k==1){
            System.out.println(4);
            return;
        }
        int i;
        for( i=k;i>1;i-=2)
            System.out.print(8);
        if(i==1)
            System.out.println(4);
            
        }
        
    }
    
}
