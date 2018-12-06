import java.util.*;
import java.lang.*;
import java.io.*;

public class ChatRoom{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String s = in.next();
        Character[] hello = {'h', 'e', 'l', 'l', 'o'};
		int index = 0;
		char lookingFor = hello[index];
		for (char c : s.toCharArray()) {
			if (c == lookingFor && index == 4) {
				System.out.println("YES");
				return;
			} else if (c == lookingFor) {
				index++;
				lookingFor = hello[index];
			}
		}

		System.out.println("NO");  
        
    }
}
