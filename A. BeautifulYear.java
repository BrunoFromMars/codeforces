import java.util.*;
import java.lang.*;
import java.io.*;

public class BeautifulYear{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        while(true){
            n++;
            int a = n/1000;
            int b =(n/100)%10;
            int c = (n/10)%10;
            int d = n%10;
            if( a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
                break;
                
        }
        
        System.out.println(n);
        
    }
    
}
