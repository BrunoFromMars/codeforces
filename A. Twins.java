import java.util.*;
import java.lang.*;
import java.io.*;

public class Twins{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int i;
        Integer[] a = new Integer[n];
        int sum = 0;
        for(i =0;i<n;i++){
            a[i] = in.nextInt();
            sum += a[i];
            
        }
        sum /=2;
        
        Arrays.sort(a,Collections.reverseOrder());
        
        int temp;
        for(i=0,temp=0;i<n;){
            temp +=a[i];
            i++;
            if(temp>sum)
                break;
        }
        System.out.println(i);
    }
    
}
