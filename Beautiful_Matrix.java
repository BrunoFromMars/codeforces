import java.util.*;
import java.lang.*;
import java.io.*;

public class Beautiful_Matrix{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[][] a = new int[5][5];
        int k=0,l=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                a[i][j]=in.nextInt();
                if(a[i][j]==1){
                    k=i;
                    l=j;
                    break;
                }
            }
        }
        
        
       
        
        System.out.println(Math.abs(k-2)+Math.abs(l-2));
        
        
    }    
}