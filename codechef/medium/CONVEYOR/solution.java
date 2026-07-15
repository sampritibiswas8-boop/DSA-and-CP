import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int n =sc.nextInt();
		    int p = sc.nextInt();
		    String s = sc.next();
		    
		    int l = 0;
		    for(int i = 0;i<p-1;i++){
		        if(s.charAt(i)=='R')
		        l++;
		    }
		
		    int r =0;
		    for(int i = p;i<n;i++){
		        if(s.charAt(i)=='L')
		        r++;
		    }
		    System.out.println(Math.min(l,r));
		}

	}
}
