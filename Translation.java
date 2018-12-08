import java.util.*;
import java.lang.*;
import java.io.*;

public class Translation{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        StringBuilder srev = new StringBuilder(s);
        srev = srev.reverse();
        System.out.println( (srev.toString()).equals(t) ? "YES" : "NO"  );
        
    }
    
}
