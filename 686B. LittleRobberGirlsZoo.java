import java.util.*;
import java.lang.*;
import java.io.*;

public class LittleRobberGirlsZoo{
    
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++)
            a[i] = in.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    System.out.println((j+1) + " " +(j+2));
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
    }
    
    
    
}
