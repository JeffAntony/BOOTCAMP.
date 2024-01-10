1)
Problem Statement – Chaman planned to choose a four digit lucky number for his car. His
lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by 3 or 5 or
7. Provide a valid car number, Fails to provide a valid input then display that number is not a
valid car number.
Note : The input other than 4 digit positive number[includes negative and 0] is considered as
invalid.
Refer the samples, to read a	nd display the data.
Sample Input 1:
Enter the car no:1234
Sample Output 1:
Lucky Number
Sample Input 2:
Enter the car no:1214
Sample Output 2:
Sorry its not my lucky number
Sample Input 3:
Enter the car no:14
Sample Output 3:
14 is not a valid car number


Ans:-  
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int sum=0;
	    String n=String.valueOf(x);
	       if(n.length()==4){
	           while(x!=0){
	               int s=x%10;
	               sum+=s;
	               x=x/10;
	           }
	           if(sum%3==0||sum%5==0||sum%7==0){
	               System.out.println("Lucky Number");
	           }else{
	               System.out.println("Sorry its not my lucky number");
	           }
	           
	       }else{
	           System.out.print( x+" is not a valid car number");
	       }
	}
}


2)
XYZ Technologies is in the process of increment the salary of the employees. This
increment is done based on their salary and their performance appraisal rating.
If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
If the appraisal rating is between 3.1 and 4, the increment is 25% of the salary.
If the appraisal rating is between 4.1 and 5, the increment is 30% of the salary.
Help them to do this, by writing a program that displays the incremented salary. Write a
class “IncrementCalculation.java” and write the main method in it.
Note : If either the salary is 0 or negative (or) if the appraisal rating is not in the range 1 to
5 (inclusive), then the output should be “Invalid Input”.
Sample Input 1 :
Enter the salary
8000

Enter the Performance appraisal rating
3
Sample Output 1 :
8800
Sample Input 2 :
Enter the salary
7500
Enter the Performance appraisal rating
4.3
Sample Output 2 :
9750
Sample Input 3 :
Enter the salary
-5000
Enter the Performance appraisal rating
6
Sample Output 3 :
Invalid Input


Ans :- 
 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    System.out.println("enter salary...");
	    int s=sc.nextInt();
	    System.out.println("enter rating..");
	    int r=sc.nextInt();
	    int x=0;
	    
	    if(s>0&&r<=5&&r>=1){
	    if(r>=1&&r<=3){
	         x=(s*10)/100;
	         x+=s;
	        System.out.println(x);
	    }
	    else if(r>3&&r<=4){
	           x=(s*25)/100;
	           x+=s;
	        System.out.println(x);
	    }
	     else if(r>4&&r<=5){
	           x=(s*30)/100;
	           x+=s;
	        System.out.println(x);
	    }
	    }else{
	        System.out.println("Invalid Input");
	    }
	    
	       
	}
}


3)
Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a number
to Tanul. Tanul should first reverse the number and check if it is same as the original. If yes,
Tanul should say “Palindrome”. If not, he should say “Not a Palindrome”. If the number is
negative, print “Invalid Input”. Help Tanul by writing a program.
Sample Input 1 :
21212
Sample Output 1 :
Palindrome
Sample Input 2 :
6186

Sample Output 2 :
Not a Palindrome


Ans :-

 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    System.out.println("enter number...");
	    int s=sc.nextInt();
	    
	    if(s>0){
	        int x=s;
	        int t=0;
	       while(x!=0){
	           int n=x%10;
	           t=n+(t*10);
	           x=x/10;
	       }
	       if(t==s){
	           System.out.println("Palindrome");
	       }
	       else{
	           System.out.println("Not a Palindrome");
	       }
	        
	    }
	    else{
	        System.out.println("Invalid Number");
	    }
	}
}


4)
Problem Statement – To speed up his composition of generating unpredictable rhythms,
Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help
him out?
Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).
Note
Input 1 should be lesser than Input 2. Both the inputs should be positive.
Range must always be greater than zero.
If any of the condition mentioned above fails, then display “Provide valid input”
Use a minimum of one for loop and one while loop
Sample Input 1:
2
15
Sample Output 1:
2 3 5 7 11 13
Sample Input 2:
8
5
Sample Output 2:
Provide valid input

Ans :-

 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    System.out.println("enter Starting number...");
	    int s=sc.nextInt();
	    System.out.println("enter ending number...");
	    int e=sc.nextInt();
	    int flag=0;
	    if(s<e&&s>0&&e>0){
	       Outer: while(s!=e){
	           Inner: for(int i=2; i<=s/2; i++){
	                if(s%i==0){
	                    flag=1;
	                }
	            }
	            if(flag==0){
	                System.out.print(" "+s);
	                s++;
	            }
	            else{
	                flag=0;
	                s++;
	            }
	        }
	        
	    }else{
	        System.out.println("Provide valid input");
	    }
	 
	}
}

5)
Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the
lesson on seasons. When her teacher tells a month, she needs to say the season
corresponding to that month. Write a program to solve the above task.
Spring – March to May,
Summer – June to August,
Autumn – September to November and,
Winter – December to February.
Month should be in the range 1 to 12. If not the output should be “Invalid month”.

Sample Input 1:
Enter the month:11
Sample Output 1:
Season:Autumn
Sample Input 2:
Enter the month:13
Sample Output 2:
Invalid month

Ans :-

 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    System.out.println("enter months number...");
	    int s=sc.nextInt();
	     
	    if(s>=3&&s<=5){
	        System.out.println("Spring");
	    }
	    else if(s>=6&&s<=8){
	        System.out.println("Summer");
	    }
	    else if(s>=9&&s<=11){
	        System.out.println("Autumn");
	    }
	    else if(s==12||s==1||s==20){
	        System.out.println("Winter");
	     }
	    else{
	        System.out.println("Invalid month");
	    }
	 
	}
}
