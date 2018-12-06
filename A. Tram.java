import java.util.*;
import java.lang.*;
import java.io.*;

public class Tram{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            
        }
        int cap = b[0];
        int inside = b[0];
        for(int i=1;i<n;i++){
            inside -=a[i];
            inside +=b[i];
            if(inside>cap){
                cap = inside;
            }
        }
        
       
        System.out.println(cap);
        
        
    }    
}
