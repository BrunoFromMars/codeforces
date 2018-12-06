import java.util.*;
import java.lang.*;
import java.io.*;

public class BoyorGirl{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String s = in.next();
        char[] str1 = s.toCharArray();
		
		Set<Character> set = new HashSet();
		
		for(char c : str1){
		    set.add(c);
		}
		//System.out.println(set);
		System.out.println(set.size()%2==0 ?  "CHAT WITH HER!" : "IGNORE HIM!" );
 		
    }
}
