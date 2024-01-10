1)Instructions: You are required to write the code. You can click on compile and run
anytime to check compilation/execution status. The code should be
logically/syntactically correct.

Question: Write a program in C such that it takes a lower limit and upper limit as
inputs and print all the intermediate palindrome numbers.

Test Cases:

TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.

Ans :-

package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);
  public static void pali(int a, int b) {
	    for(int i=a+1; i<b; i++) {
	    	  int x=i;
	    	  int add=0;
	    	  while(x!=0) {
	    		  int r=x%10;
	    		  add=r+(add*10);
	    		  x=x/10;
	    	  }
	    	  if(add==i) {
	    		  System.out.print(add+" ");	    	  }
	    }
  }
 
	public static void main(String[] args) {
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    pali(a,b);
   }
}


4)Problem statement :
Ratan is a crazy rich person. And he is blessed with luck, so he always made the best
profit possible with the shares he bought. That means he bought a share at a low
price and sold it at a high price to maximize his profit. Now you are an income tax
officer and you need to calculate the profit he made with the given values of stock
prices each day. You have to calculate only the maximum profit Ratan earned.
Note that:
Ratan never goes into loss.
Example 1 :

Price=[1,6,2]
Ratan buys it on the first day and sells it on the second.
Example 2 :
Price=[9,8,6]

The Price always went down, Ratan never bought it.

Input Format:
First line with an integer n, denoting the number days with the value of the stack
Next n days, telling the price of the stock on that very day.

Output Format:
Maximum profit done by Ratan in a single line.
Constraints:
Number of days <=10^8
Sample Input for Custom Testing

STDIN
———–
7
1
9
2
11
1
9
2

Sample Output

10

Explanation

The maximum profit possible is when Ratan buys it in 1 rupees and sells it in 11.


Ans :-

package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);
  public static void profit(int []arr) {
	        int max=Integer.MIN_VALUE; 
	        int min=Integer.MAX_VALUE;
	        
	        for(int i=0; i<arr.length ; i++) {
	        	if(max<arr[i]) {
	        		max=arr[i];
	        	}
	        	if(min>arr[i]) {
	        		min=arr[i];
	        	}
	        	
	        }
	       System.out.print(max-min);
  }
 
	public static void main(String[] args) {
	     int [] arr= {7,1,9,2,11,1,9,2};
	    profit(arr);
   }
}


6)Device Name System

Problem statement: Rocky is a software engineer and he is creating his own operating
system called “myFirst os”. myFirst os is a GUI (Graphical user interface) based operating
system where everything is stored in files and folders. He is facing issues on creating
unique folder names for the operating system . Help rocky to create the unique folder name
for it’s os.If folder name already exists in the system and integer number is added at the
name to make it unique. The integer added starts with 1 and is incremented by 1 for each
new request of an existing folder name. Given a list of folder names , process all requests
and return an array of corresponding folder names.
Example
n=5
foldername= [‘home’ , ‘myfirst’ ,’downloads’, ‘myfirst’, ‘myfirst’]
Foldername[0] = ‘home’ is unique.
Foldername[1] = ‘myfirst’ is unique.
foldername [2] =’downloads’ is unique.
Foldername[3] =’myfirst’ already exists in our system. So Add1 at the end of the folder name
i.e foldername[3] =”myfirst1′′
Foldername[4 ]=’myfirst’ also already exists in our system.So add 2 at the end of the folder
name i.e. foldername[4]=”myfirst2′′.
Function description
Complete the function folderNameSystem In the editor below
folderNameSystem has the following parameters
string foldername[n]: an array of folder name string in the order requested
Returns:
String[n]: an array of strings usernames in the order assigned
Constraints
1<=n<=10^4
1<=length of foldername[i]<20
foldername[i] contains only lowercase english letter in the range ascii[a-z]
Input Format:
The first line contains an integer n , denoting the size of the array usernames Each line i of
the n subsequent lines (where i<=0<=n) contains a string usernames[i] representing a
username request in the order received.
Sample case 0
4
home
download
first
first
Sample Output 0
home
download
first
first1
Explanation 0
foldername[0] = ‘home’ is unique
foldername[1]=’download’ is unique
foldername[2]= ‘first’ is unique

foldername[3]=’first’ is already existing . so add 1 to it and it become first1

Ans :-


package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);
 
 
	public static void main(String[] args) {
		String [] arr= {"home" , "myfirst" ,"downloads", "myfirst", "myfirst"};
	        	ArrayList<String> al= new ArrayList<String>();
	        	ArrayList<String> all= new ArrayList<String>();
	        	int x=1;
	        	  for(int i=0; i<arr.length; i++) {
	        		  if(!al.contains(arr[i])) {
	        			  al.add(arr[i]);
	        		  }
	        		  else {
	        			all.add(arr[i]);
	        		  }
	        	  }
	        	  
	        	  for(int i=0; i<all.size(); i++) {
	        		  al.add((all.get(i)+x));
	        		  x++;
	        	  }
	        	  System.out.print(al);
     	
   }
}


7)Make It Palindrome
Problem Statement :
You’re given a string, you’ve to print additional characters needed to make that string a
palindrome.
A Palindrome is a sequence of characters that has the property of reading the same in either
direction.
Input :
abede
Output :
ba
Sample Input :
abcfe
Sample output :
fcba

Ans :-

package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);
 
 
	public static void main(String[] args) {
		      String s=sc.nextLine();
		       String n="";
		       String a="";
		       int x=0;
		        	    for(int i=s.length()-1; i>=s.length()-1; i--) {
		        	    	    for(int j=s.length()-2; j>=0; j--) {
		        	    	    	for(int k=i; k>=j; k--) {
		        	    	    		   n+=s.charAt(k);
		        	    	    	}
		        	    	    	 for(int k=n.length()-1;k>=0; k--) {
		        	    	    		 a+=n.charAt(k);
		        	    	    	 }
		        	    	    	 
		        	    	    	 if(n.equals(a)) {
		        	    	    		 x=j;
		        	    	    		 n="";
		        	    	    		 a="";
		        	    	    	 }else {
		        	    	    		 n="";
		        	    	    		 a="";
		        	    	    	 }
		        	    	    }   
		        	    	       
		        	    }
		        	    
		        	    if(x!=0) {
		        	    	for(int i=(s.length()-1)-x-1 ; i>=0; i--) {
		        	    		System.out.print(s.charAt(i));
		        	    	}
		        	    }else {
		        	    	for(int i=s.length()-2 ; i>=0; i--) {
		        	    		System.out.print(s.charAt(i));
		        	    	}
		        	    }
		        
   }
}



8)Median of Two Sorted Arrays
There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the
median of the two sorted arrays.
nums1 = [1, 3]
nums2 = [2]
Median = 2.0


Ans :-

package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);
 
 
	public static void main(String[] args) {
		        int [] num= {1,3};
		        int [] num1= {2,5,7};
		        int x=0;
		          int [] arr=new int [num.length+num1.length];
		         for(int i=0; i<num.length; i++) {
		        	 arr[x++]=num[i];
		         }
		         for(int i=0; i<num1.length; i++) {
		        	 arr[x++]=num1[i];
		         }
		        
		         Arrays.sort(arr);
		         
		         
		        if(arr.length%2==0) {
		        	 int k=arr.length/2;
		        	 double a=(arr[k]+arr[k-1])/2;
		        	 System.out.print(a);
		        }else {
		        	double d=arr[(arr.length/2)];
		             System.out.print(d);
		        }
   }
}

9)
Momentum LinkedList
Problem Statement :
Ratul made a linked list, a list made of n nodes, where every node has two variables, the
velocity and the mass of a particle.
Since all the particles have the velocity in the same direction, find the total momentum of the
entity made by the particles from the linked list.
Constraints :
1<=n<=10000
1<=m,v<=100
Input format:

First line containing n, number of nodes
Then n lines containing the mass and the velocity space separated.
Output Format:
Single integer denoting the momentum
Sample Input:
4
1 3
2 4
2 3
4 5
Sample Output:
37


Ans :-

package p;
import java.util.*;
class Node {
	Node node;
	int mass;
	int val;
	
	Node(int m,int v){
		mass=m;
		val=v;
	}
}
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		           int  n=sc.nextInt();
		          int sum=0; 
		           Node arr=new Node (sc.nextInt(),sc.nextInt());
		            Node ll=arr;
		           while(n!=1) {
		        	   Node nn=new Node(sc.nextInt(),sc.nextInt());
		        	      nn.node=null;
		        	       ll.node=nn;
		        	       ll=ll.node;
		        	       n--;
		        	    		   
		           }
		           ll=arr;
		           while(ll!=null) {
		        	  sum+=ll.mass*ll.val;
		        	       ll=ll.node;  		   
		           }
		           System.out.print(sum);
		           
   }
}

10)Lazy String
Problem Statement :
Anish is the laziest person you can ever see. He is tasked to write the name of the winner in
a game where two people take part. And he just writes the longest common subsequence
over there, so that with minimum chane or no backspace he can edit the name to the
winner’s name.
For two given names, you have to predict what Anish will write in his computer before the
start of the name. If there are more than two longest subsequences possible,write the one
with less lexicographic value.
Input Format:
Two lines including two strings of name(All with capital letters)
Output Format:
A single line with the lexicographically smallest possible longest common subsequence.
Sample Input:
ABCD
BACD
Sample Output:
ACD
Exclamation:
ACD and BCD these are the two possible biggest substring

Ans :-

package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
             String s=sc.nextLine();
             String n=sc.nextLine();
              String x="";
              String y="";
               for(int i=1; i<s.length(); i++) {
            	   x+=s.charAt(i);
            	   y+=n.charAt(i);
            	   
               }
               if(x.compareTo(y)<0) {
            	   System.out.print(x);
               }
               else {
            	   System.out.print(y);
               }
		           
   }
}






