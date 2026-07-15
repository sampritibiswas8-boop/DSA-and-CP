import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    String a = sc.next();
		    
		    int zero=0;
		    for(int i =0;i<n;i++){
		        if(a.charAt(i)=='0') zero++;
		    }
		    
		    int ones = n-zero;
		    if(zero<k || ones <k){
		        System.out.println(a);
		    }
		    else {
		        StringBuilder ans = new StringBuilder();
		        
		        for(int i =0;i<zero;i++)
		          ans.append('0');
		          
		      for(int i =0;i<ones;i++)
		        ans.append('1');
		        
		        System.out.println(ans);
		        
		    }
		}

	}
}
