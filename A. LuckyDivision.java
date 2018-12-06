import java.util.*;
import java.lang.*;
import java.io.*;

public class LuckyDivision{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = {4,7,44,47,74,77,444,447,474,744,477,747,774,777 };
        for(int i =0;i<arr.length;i++){
            arr[i] = n%arr[i];
        }
        int zero =0;
        
        for(int c: arr){
            if(c==0){
                zero++;
                break;
            }
        }
        System.out.println(zero==1 ? "YES" : "NO");
    }
    
}
