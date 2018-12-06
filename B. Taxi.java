import java.util.*;
import java.lang.*;
import java.io.*;

public class Taxi{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        
       
        int ones = 0;
        int twos = 0;
        int threes=0;
        int fours =0;
        
        for(int i=0;i<n;i++){
            
            int a = in.nextInt();
            if(a==1)
                ones++;
            if(a==2)
                twos++;
            if(a==3)
                threes++;
            if(a==4)
                fours++;
            
        }
        int count =fours;
        count += twos/2;
        twos = twos%2;
        if(threes!=0){
            if(threes>=ones){
                count += threes + twos;    
            }else{
                ones -= threes;
                count +=threes;
                while(twos> 0){
		            count++;
		            ones -=2;
		            twos--;
		        }
		        while(ones > 0){
		            count++;
		            ones -=4;
		        }
            }
        }else{
            while(twos> 0){
		        count++;
		        ones -=2;
		        twos--;
		    }
		    while(ones > 0){
		        count++;
		        ones -=4;
		    }
            
        }
        
       
        
        System.out.println(count);
        
        
    }    
}
