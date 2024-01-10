1)
Rotate Array
Rotate an array to the right by k steps, where k is non-negative.
Input: [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]

Ans :-

package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);	
	public static void main(String[] args) {
		int k=sc.nextInt();
		int [] arr= {1, 2, 3, 4, 5, 6, 7};
		 while(k!=0) {
			 for(int i=arr.length-k; i>=1; i--) {
				      int x=arr[i];
				      arr[i]=arr[i-1];
				      arr[i-1]=x;
			   }
			 k--;
		 }
		System.out.print(Arrays.toString(arr));
		  
   }
}



2)
the product of 1 * 2 * 3 = 6
Approach:
To solve this problem efficiently, we can use two auxiliary arrays: leftProducts and
rightProducts. These arrays will store the products of elements to the left and right of each
element, respectively.
a)Compute leftProducts:
Initialize an array leftProducts of the same length as nums and set leftProducts[0] = 1 since
there are no elements to the left of the first element.
Iterate from left to right through nums, updating leftProducts[i] as the product of all elements
to the left of nums[i].

b)Compute rightProducts:
Initialize an array rightProducts of the same length as nums and set rightProducts[n-1] = 1
since there are no elements to the right of the last element.
Iterate from right to left through nums, updating rightProducts[i] as the product of all
elements to the right of nums[i].

c)Compute the final result output:
For each index i, the product of all elements except nums[i] is given by leftProducts[i] *
rightProducts[i].
Populate the output array accordingly.


Ans :-
   
 import java.util.*;

public class Main {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // call
        Main solution = new Main();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = solution.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}



3)
Problem: Find Peak Element
Problem Description:
A peak element in an array is an element that is greater than or equal to its neighbors. Given
an input array nums, find a peak element and return its index. If there are multiple peaks,
return any peak index.
Example:
Input: [1,2,3,1]
Output: 2
Explanation: In this example, 3 is a peak element, and its index is 2.


package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);	
	public static void main(String[] args) {
		 int [] arr= {1,2,3,1};
	     for(int i=1; i<arr.length-1; i++) {
	    	   if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
	    		   System.out.print(i);
	    		   break;
	    	   }
	     } 
   }
}


4)
Selection of MPCS exams include a fitness test which is conducted on ground. There will be
a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record
their oxygen level after every round. After trainee are finished with all rounds, calculate for
each trainee his average oxygen level over the 3 rounds and select one with highest oxygen
level as the most fit trainee. If more than one trainee attains the same highest average level,
they all need to be selected.
Display the most fit trainee (or trainees) and the highest average oxygen level.
Note:
a)The oxygen value entered should not be accepted if it is not in the range between 1 and
100.
b)If the calculated maximum average oxygen value of trainees is below 70 then declare the
trainees as unfit with meaningful message as “All trainees are unfit.
c)Average Oxygen Values should be rounded.
Example 1:
INPUT VALUES
95
92
95
92
90
92
90
92
90
OUTPUT VALUES
Trainee Number : 1
Trainee Number : 3
Note:
Input should be 9 integer values representing oxygen levels entered in order as
Round 1
a)Oxygen value of trainee 1
b)Oxygen value of trainee 2
c)Oxygen value of trainee 3
Round 2
a)Oxygen value of trainee 1
b)Oxygen value of trainee 2

c)Oxygen value of trainee 3
Round 3
a)Oxygen value of trainee 1
b)Oxygen value of trainee 2
c)Oxygen value of trainee 3
Output must be in given format as in above example. For any wrong input final output should
display “INVALID INPUT”

Ans:-

import java.util.*;
public class Main
{  
	static Scanner sc=new Scanner (System.in);	
	public static void main(String[] args) {
		 int [][]arr= {{95,92,95},{92,90,92},{90,92,90}}; 
		 int max=0;
		 int sum=0;
		 int avg=0;
		    for(int i=0;i<arr.length; i++) {
		    	for(int j=0; j<arr[i].length; j++) {
		    		if(arr[i][j]>max) {
		    			max=arr[i][j];
		    		}
		    	}
		    	 
		    }
		    for(int i=0;i<arr.length; i++) {
		    	for(int j=0; j<arr.length; j++) {
		     
		    		    sum+=arr[j][i];
		    		 
		    	}
		    	
		    	 if(sum/arr.length>avg) {
		    		 avg=sum/arr.length;
		    	 }
		    	 sum=0;
		    }
		    if(avg>max) {
		    	max=avg;
		    }
		    for(int i=0;i<arr.length; i++) {
		    	for(int j=0; j<arr.length; j++) {
		    		if(arr[j][i]==max) {
		    			 System.out.print(i+1+" ");
		    		}
		    	}
		    	 
		    }  
   }
}


6)
Program to check if two given matrices are identical

Ans :-

package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);	
	public static void main(String[] args) {
		     int [][] arr= {{1,1,1},{2,2,2},{3,3,3}};
		     int [][] arr1= {{1,1,1},{2,2,2},{3,3,3}};
		     int f=0; 
		     for(int i=0; i<arr.length; i++) {
		    	 for(int j=0; j<arr.length; j++) {
		    		   if(arr[i][j]!=arr1[i][j]) {
		    			   f=1;
		    			   System.out.print("not identical");
		    			   break;
		    		   }
		    	 }
		     }
		     if(f==0) {
		    	  System.out.print("identical");
		     }
		     
	    
   }
}


7)
Given a 2D array, print it in spiral form. See the following examples.
NOTE:- Please comment down the code in other languages as well below .
Input:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

Ans :- 

package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);	
	public static void main(String[] args) {
		      int [][] arr= {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
		        int n=arr.length*arr.length;
		        int c=0;
		        int r=0;
		        int maxc=arr.length-1;
		        int maxr=arr.length-1;
		        while(n!=0) {
		        	   for(int i=c; i<=maxc; i++) {
		        		   System.out.print(arr[r][i]+" ");
		        		   n--;
		        	   }
		        	 
		        	   for(int i=r+1; i<=maxr; i++) {
		        		   System.out.print(arr[i][maxc]+" ");
		        		   n--;
		        	   }
		        	   for(int i=maxc-1; i>=c; i--) {
		        		   System.out.print(arr[maxr][i]+" ");
		        		   n--;
		        	   }
		        	   for(int i=maxr-1; i>r; i--) {
		        		   System.out.print(arr[i][c]+" ");
		        		   n--;
		        	   }
		        	   c++;
		        	   r++;
		        	   maxr--;
		        	   maxc--;
		        }
	    
   }
}


10)Problem: Set Matrix Zeroes
Problem Description:
Given a matrix matrix, modify it in-place such that if an element is 0, set its entire row and
column to 0. Do it in such a way that modifies the matrix in constant space.
Example:
Input:
[
[1, 2, 3],
[4, 0, 6],
[7, 8, 9]
]
Output:
[
[1, 0, 3],
[0, 0, 0],
[7, 0, 9]
]
Explanation: In the input matrix, the element at position (1,1) is 0. Hence, its entire row and
column are set to 0 in the output matrix

Ans :-


package p;
import java.util.*;
public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);	
	public static void main(String[] args) {
		      int [][] arr= {{1,2,3},{4, 0, 6},{7, 8, 9}};
		        int r=0;
		        int c=0;
		      for(int i=0; i<arr.length; i++) {
		    	  for(int j=0; j<arr[i].length; j++) {
		    		       if(arr[i][j]==0) {
		    		    	  r=i;
		    		    	  c=j;
		    		    	    break;
		    		       }
		    	  }
		      }
		      int k=0; 
	    	    while(k!=arr.length) {
	    	    	arr[r][k]=0;
	    	    	arr[k][c]=0;
	    	    	k++;
	    	    }
		      
		      for(int i=0; i<arr.length; i++) {
		    	  for(int j=0; j<arr[i].length; j++) {
		    		       System.out.print(arr[i][j]);
		    	  }
		    	  System.out.println( );
		      }
		      
	    
   }
}


