1)
Problem Statement –A chocolate factory is packing chocolates into the packets. The
chocolate packets here represent an array of N number of integer values. The task is to find
the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
Example 1 :
N=8 and arr = [4,5,0,1,9,0,5,0] There are 3 empty packets in the given set. These 3 empty
packets represented as O should be pushed towards the end of the array
Input :
8 – Value of N
[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by
newline
Output:
4 5 1 9 5 0 0 0

Ans:-
package p;
import java.util.*;
public class P implements implement
{
 

	public static void main(String[] args) {
		 int [] arr= {4,5,0,1,9,0,5,0};
		 int c=0;
		 for(int i=0; i<arr.length-1; i++) {
			 if(arr[i]!=0) {
				 arr[c++]=arr[i];
			 }
		 }
		 for(int i=c; i<arr.length; i++) {
			 arr[i]=0;
		 }
		 System.out.print(Arrays.toString(arr));
	}

}

2)
Given an integer array Arr of size N the task is to find the count of elements whose value is
greater than all of its prior elements.
Note : 1st element of the array should be considered in the count of the result.
For example,
Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
Since total of 3 elements is present in the array that meets the condition.
Hence the output = 3.
Example 1:
Input
5 -> Value of N, represents size of Arr
7-> Value of Arr[0]
4 -> Value of Arr[1]
8-> Value of Arr[2]
2-> Value of Arr[3]

9-> Value of Arr[4]
Output :
3

Ans :-

package p;
import java.util.*;
public class P implements implement
{
 

	public static void main(String[] args) {
		 int [] arr={7,4,8,2,9};
		    int c=1;
		 for(int i=1; i<arr.length; i++) {
			 if(arr[i-1]<arr[i]) {
				 c++;
			 }
		 }
		 System.out.print(c);
	}
}




3)
An international round table conference will be held in india. Presidents from all over the
world representing their respective countries will be attending the conference. The task is to
find the possible number of ways(P) to make the N members sit around the circular table
such that.
The president and prime minister of India will always sit next to each other.
Example 1:
Input :
4 -> Value of N(No. of members)
Output :
12 -> Possible ways of seating the members
Explanation:
2 members should always be next to each other.
So, 2 members can be in 2!ways

Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously
selected two members will be considered as single members now).
So total possible ways 4 members can be seated around the circular table 2*6= 12.
Hence, output is 12.


Ans :-

package p;
import java.util.*;
public class P implements implement
{  
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   int x=sc.nextInt();
	   long n=1;
	   if(2<=x&&x<=50) {
		   for(int i=1; i<=x-1; i++) {
			   n*=i;
		   }
		   long t=n*2;
		   System.out.print(t);
	   }
	   else {
		   System.out.print("Invalid Input");
	   }
}
}


4)
An intelligence agency has received reports about some threats. The reports consist of
numbers in a mysterious method. There is a number “N” and another number “R”. Those
numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are
summed up and this action is performed ‘R’ number of times. The resultant is also a single
digit that is yet to be deciphered. The task here is to find the single-digit sum of the given
number ‘N’ by repeating the action ‘R’ number of times.
If the value of ‘R’ is 0, print the output as ‘0’.
Example 1:
Input :
99 -> Value of N
3 -> Value of R
Output :
9 -> Possible ways to fill the cistern.
Explanation:
Here, the number N=99
1)Sum of the digits N: 9+9 = 18
2)Repeat step 2 ‘R’ times i.e. 3 tims (9+9)+(9+9)+(9+9) = 18+18+18 =54
3)Add digits of 54 as we need a single digit 5+4
Hence , the output is 9

Ans :-

package p;
import java.util.*;
public class P implements implement
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   int d=sc.nextInt();
	   int n=sc.nextInt();
	   int sum=0;
		 for(int i=0; i<n; i++) {
			while(d!=0) {
				int x=d%10;
				sum+=x;
				d=d/10;
			}
			d=sum;
			sum=0;
			
		 }
		 System.out.print(d);
	}
}


5)
Problem Statement
Particulate matters are the biggest contributors to Delhi pollution. The main reason behind
the increase in the concentration of PMs include vehicle emission by applying Odd Even
concept for all types of vehicles. The vehicles with the odd last digit in the registration
number will be allowed on roads on odd dates and those with even last digit will on even
dates.
Given an integer array a[], contains the last digit of the registration number of N vehicles
traveling on date D(a positive integer). The task is to calculate the total fine collected by the
traffic police department from the vehicles violating the rules.
Note : For violating the rule, vehicles would be fined as X Rs.
Example 1:
Input :
4 -> Value of N
{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line
12 -> Value of D, i.e. date

200 -> Value of x i.e. fine
Output :
600 -> total fine collected

package p;
import java.util.*;
public class P implements implement
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   int [] arr={5,2,3,7};
	   int d=sc.nextInt();
	   int n=sc.nextInt();
	   int c=0;
		 if(d%2==0){
			 for(int i=0; i<arr.length; i++) {
				 if(arr[i]%2!=0) {
					 c++;
					 
				 }
			 }	 
		 }
		 else {
			 for(int i=0; i<arr.length; i++) {
				 if(arr[i]%2==0) {
					 c++;
				 }
			 }
		 }
		 System.out.print(n*c);
	}
}


6)
Problem Statement – An automobile company manufactures both a two wheeler (TW) and a
four wheeler (FW). A company manager wants to make the production of both types of
vehicle according to the given data below:
a)1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
b)2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as
per the given data.
Example :
Input :
200 -> Value of V
540 -> Value of W
Output :
TW =130 FW=70
Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels
Constraints :
a)2<=W
b)W%2=0
c)V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.


package p;
import java.util.*;
public class P implements implement
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   int v=sc.nextInt();
	   int w=sc.nextInt();
	   int x=w/2;
	    x=x-v;
	    int t=x;
	    System.out.println("F - "+x);
	    t=t*4;
	    x=v-x;
	    System.out.println("T - "+x);
	    x=x*2;
	    System.out.println(t+x);
	}
}


7)
A party has been organised on cruise. The party is organised for a limited time(T). The
number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as
elements of the array. The task is to find the maximum number of guests present on the
cruise at any given instance within T hours.
Example 1:
Input :
a)5 -> Value of T
b)[7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by
new line
c)[1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new
line.
Output :
8 -> Maximum number of guests on cruise at an instance.
Explanation:
1st hour:
Entry : 7 Exit: 1
No. of guests on ship : 6
2nd hour :
Entry : 0 Exit : 2
No. of guests on ship : 6-2=4
Hour 3:
Entry: 5 Exit: 1
No. of guests on ship : 4+5-1=8
Hour 4:
Entry : 1 Exit : 3
No. of guests on ship : 8+1-3=6
Hour 5:
Entry : 3 Exit: 4
No. of guests on ship: 6+3-4=5
Hence, the maximum number of guests within 5 hours is 8.


package p;
import java.util.*;
public class P implements implement
{
	public static void main(String[] args) {
	   int [] arr= {3,5,2,0};
	   int [] arr1= {0,2,4,4};
	   int x=0;
	   int c=0;
	  x=arr[0]-arr1[0];
	  for(int i=1; i<arr.length; i++) {
	        x=x+arr[i];
	        x=x-arr1[i];
	        if(x>c) {
	        c=x;
	        }
	  }
	  System.out.print(c);

	}
}


8)
There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR
can contain maximum N candies when JAR is full. At any point of time. JAR can have M
number of Candies where M<=N. Candies are served to the customers. JAR is never remain
empty as when last k candies are left. JAR if refilled with new candies in such a way that
JAR get full.
Write a code to implement above scenario. Display JAR at counter with available number of
candies. Input should be the number of candies one customer can order at point of time.
Update the JAR after each purchase and display JAR at Counter.

Output should give number of Candies sold and updated number of Candies in JAR.
If Input is more than candies in JAR, return: “INVALID INPUT”
Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is number of minimum candies that must be inside JAR ever.
Example 1:(N = 10, k =< 5)
Input Value
3
Output Value
NUMBER OF CANDIES SOLD : 3
NUMBER OF CANDIES AVAILABLE : 7
Example : (N=10, k<=5)
Input Value
0
Output Value
INVALID INPUT NUMBER OF
CANDIES LEFT : 10


package p;
import java.util.*;
public class P implements implement
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   int x=sc.nextInt();
	   int n=10;
	   if(x<=n&&x<=5&&x!=0) {
		   System.out.println("NUMBER OF CANDIES SOLD : "+x);
		   System.out.println("NUMBER OF CANDIES AVAILABLE : "+(n-x));
	   }
	   else {
		   System.out.print("INVALID INPUT NUMBER OF\r\n"
		   		+ "CANDIES LEFT : 10");
	   }

	}
}

9)
Problem Statement
We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per
sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet
If a user enters zero as the number of walls then skip Surface area values as User may
don’t want to paint that wall.
Calculate and display the total cost of painting the property


package p;
import java.util.*;
public class P implements implement
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   int z=sc.nextInt();
	   int coust=0;
	   if(z!=0) {
		    coust=((x*18)*4)+(y*12);
		   System.out.print(coust);
	   }
	   else {
		    coust=(x*18)+(y*12);
		   System.out.print(coust);
	   }
	}
}

10)
Ques. Write a code to check whether no is prime or not. Condition use function check() to
find whether entered no is positive or negative ,if negative then enter the no, And if yes pas
no as a parameter to prime() and check whether no is prime or not?
a)Whether the number is positive or not, if it is negative then print the message “please enter
the positive number”
b)It is positive then call the function prime and check whether the take positive number is
prime or not.


package p;
import java.util.*;
public class P implements implement
{  
	public static void check(int x) {
		int f=0;
		if(x==1||x==2) {
			 System.out.print("prime");
		}
		else {
		 for(int i=2; i<x/2; i++) {
			 if(x%i==0) {
				 f=1;
			 }
		 }
		 if(f==0) {
			 System.out.print("prime");
		 }
		 else {
			 System.out.print("not prime");
		 }
		}
	}

	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   int x=sc.nextInt();
	   if(x<=0) {
		   System.out.print("please enter the positive number");
	   }
	   else {
		   check(x);
	   } 
}
}
