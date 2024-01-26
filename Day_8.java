1)
1)Create a Student class:

Define a Java class called Student with attributes studentId, firstName, lastName, age, and coursesEnrolled. Implement the necessary constructor and getter methods.

2)Implement a StudentManager class:

Create a Java class called StudentManager to manage a list of students. Include methods to add a student, remove a student by ID, and retrieve a list of students.

3)Usage Example:

Demonstrate how to use the Student and StudentManager classes by adding students, removing one by ID, and retrieving the list of students

Ans :-


package p;
import java.util.*;

class  StudentManager{
	  ArrayList<Student> al=new ArrayList<Student>();

	  public void add(Student st) {
		    al.add(st);
	  }
	 public Student remove(int id) {
		 Student st= al.remove(id);
		  return st;
	 }

	 public void retrieving() {
		  for(Student s :al) {
	        	 System.out.println(s.getId()+" "+s.getlastName()+" "+s.getlastName()+" "+s.getAge()+" "+s.getcoursesEnrolled());
	        }
	 }
}

class Student extends StudentManager{
	 int studentId;
	 String firstName;
	 String lastName;
	 int age;
	 String coursesEnrolled;

   public  Student( int studentId,String firstName, String lastName, int age,String coursesEnrolled){
		    this.studentId=studentId;
		    this.firstName=firstName;
		    this.lastName=lastName;
		    this.age=age;
		    this.coursesEnrolled=coursesEnrolled;
	 }
       public int getId() {
    	   return studentId;
       }

       public String getfirstName() {
    	   return firstName;
       }

       public String getlastName() {
    	   return lastName;
       }

       public int getAge() {
    	   return age;
       }

       public String getcoursesEnrolled() {
    	   return coursesEnrolled;
       }
}

public class P implements implement
{  
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		StudentManager sm=new StudentManager();
		Student st= new Student(0,"vikas","jain",25,"java full stack");
		Student st1= new Student(1,"vk","jain",30,"java full");
		 sm.add(st);
		 sm.add(st1);
		 sm.remove(1);
		 sm.retrieving();


   }
}



 2)
Transaction History:

Enhance the BankAccount class to keep a transaction history. Implement a method to record each deposit and withdrawal with a timestamp. Add a method to retrieve the transaction history for an account.


Ans :-

package p;

import java.util.*;

class Bank {
	ArrayList<Coustmer> al = new ArrayList<Coustmer>();
	ArrayList<Integer> count = new ArrayList<Integer>();
	ArrayList<Double> am = new ArrayList<Double>();

	public void deposite(Coustmer c) {
		al.add(c);
	}

	public void withdrawal(int id, double amount) {
		double sum = 0;
		int x = 0;
		int c = 0;
		for (Coustmer z : al) {
			if (z.id == id) {
				sum += z.amount;
				c = x;
			}
			x++;
		}

		sum = sum - amount;
		if (sum > 0) {
			System.out.println("withdrawal amount : " + amount);
			count.add(id);
			am.add(amount);

		} else {
			System.out.println("insuficetion amount : ");

		}

	}

	public void retrieve(int i) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int x = 0;
		for (Coustmer z : al) {
			if (z.id == i) {
				arr.add(x);
			}
			x++;
		}
		Collections.sort(arr);
		for (int z : arr) {

			System.out.println(al.get(z).id + " " + al.get(z).amount + " " + al.get(z).date);
		}
		System.out.println("withdrawal amount :- ");
		for (int j = 0; j < count.size(); j++) {
			if (count.get(j) == i) {
				System.out.println(am.get(j));
			}
		}

	}

}

class Coustmer extends Bank {
	double amount;
	int id;
	String date;

	public Coustmer(int id, double amount, Date d) {
		this.amount = amount;
		this.id = id;
		this.date = d.toLocaleString();
	}
}

public class P implements implement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Date d = new Date();

		Coustmer x = new Coustmer(0, 10000.00, d);
		Coustmer x1 = new Coustmer(1, 15000.00, d);
		Coustmer x2 = new Coustmer(2, 20000.50, d);
		Coustmer x3 = new Coustmer(1, 5000.00, d);

		Bank bank = new Bank();
		bank.deposite(x);
		bank.deposite(x1);
		bank.deposite(x2);
		bank.deposite(x3);

		bank.withdrawal(1, 10000);
		bank.withdrawal(1, 5000);
		bank.withdrawal(2, 5000);
		bank.retrieve(1);

	}
}


3)
Case Study: Simple Library System

You are tasked with creating a Java program for a simple library system. You need to design classes for books and library patrons.
a)Create a Book class:

Define a Java class called Book with attributes such as title, author, isbn, and available (to track if the book is available for checkout). Implement the necessary constructor and getter methods.


Ans :-

package p;

import java.util.*;

class Book{
	String title ,author;
	int isbn ;
	Book(String title,String author,int isbn){
		this.author=author;
		this.title=title;
		this.isbn=isbn;
	}
	Book(){

	}

	public String getAuthor() {
		return author;
	}
	public String gettitle() {
		return title;
	}
	public int getisbn() {
		return isbn;
	}
}

public class P implements implement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Book b=new Book("java","gosling",1234);
		Book n=new Book("Data","nk",1564);
		Book d=new Book("mearn","nmk",8964);

		       System.out.println(b.getAuthor());
		       System.out.println(b.gettitle());
		       System.out.println(b.getisbn());
	}
}


5)
Zoo Management System
Develop a zoo management system with various animals and their behaviors. Utilize polymorphism to represent common behaviors shared among different animal types (e.g., walking, eating). How would you handle unique behaviors for specific animals?

Ans :-

package p;

import java.util.*;

class Animal {
	public void walking() {

	}

	public void eating() {

	}
}

class Dog extends Animal {
	public void walking() {
		System.out.println("Dog is walking");
	}

	public void eating() {
		System.out.println("Dog is eating");
	}
}

class Caml extends Animal {
	public void walking() {
		System.out.println("Caml is walking");
	}

	public void eating() {
		System.out.println("Caml is eating");
	}
}

public class P implements implement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal Caml = new Caml();
		dog.walking();
		dog.eating();
		Caml.walking();
		Caml.eating();
	}
}
