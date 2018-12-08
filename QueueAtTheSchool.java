import java.util.*;
import java.lang.*;
import java.io.*;

public class QueueAtTheSchool{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        String x = in.next();
        StringBuilder xnew = new StringBuilder(x);
        
        for(int i=0;i<t;i++){
            for(int j=0;j<n-1;){
                if(xnew.charAt(j)=='B' && xnew.charAt(j+1)=='G'){
                    xnew.setCharAt(j,'G');
                    xnew.setCharAt(j+1, 'B');
                    j +=2;
                }else{
                    j++;
                }
            }
        }
        System.out.println(xnew);
        
    }
    
}
