import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int c1 = 0;
		    int c2 = 0;
		    for(int i = 0;i<n;i++){
		        int z= sc.nextInt();
		        if(i%2==0){
		            if(z%2==0)
		            c1++;
		        }
		        else{
		            if(z%2!=0) 
		            c1++;
		        }
		        if(i%2==0) {
		            if(z%2!=0) c2++;
		        }
		        else {
		            if(z%2==0)
		            c2++;
		        }
		        }
		        System.out.println(Math.min(c1,c2));
		}
	}
}
		        }
		        }
		        }
		    }
		}

	}
}
