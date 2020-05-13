/*
Types of Constructors
 
Now you know to create an object and use getters and setters. Next, we move on to another method of object creation, using Constructors. We are going to use the default and parameterized constructor here.

Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, attribute names and method names should be the same as specified in the problem statement.

Create a class named StallCategory with following private attributes,
Attribute 	 Datatype
name 	       String
detail 	     String

Include appropriate getters and setters for the attributes of the StallCategory class.

Include the following methods in the StallCategory class.
Method                                        	Description
StallCategory() 	                              Default constructor to initialize the default values
StallCategory(String name, String detail) 	    Parameterized constructor to assign values to its attributes in the order.
void display()                                	This method used to display the details of the StallCategory

as per the specification provided in the Sample Input and Output

Create a driver class called Main. In the main method, obtain input from the user in the console and create objects for the class StallCategory class using both the constructor and find that there is no difference between them.

Input and Output format:
Refer to sample Input and Output for formatting specifications.

Sample Input and Output 1:
[All Texts in bold corresponds to the input and rest are output]

Enter the name of the stall category:
Book
Enter the details of the stall category:
All latest books are available under this category
Using Default Constructor
Details of the stall category:
Name:Book
Detail:All latest books are available under this category
Using Parameterised Constructor
Details of the stall category:
Name:Book
Detail:All latest books are available under this category
*/

//StallCategory.java


public class StallCategory {
    //Write your code here
    private String name;
    private String detail;
    
  public StallCategory(){
        
    }
    
  public StallCategory(String name, String detail){
     this.name=name;
     this.detail=detail;
    }
    
  public String getName() {
    return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
   public String getDetail() {
    return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
    
    void display() {
        System.out.println("Using Parameterised Constructor");
        System.out.println("Details of the stall category:");
    		System.out.println("Name:" + this.name);
		    System.out.println("Detail:" + this.detail);

	}
}

//Main.java

import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws Exception{
		//write your code here
        Scanner input = new Scanner(System.in);
        StallCategory object = new StallCategory();

        System.out.println("Enter the name of the stall category:");
        object.setName(input.nextLine());

        System.out.println("Enter the details of the stall category:");
        object.setDetail(input.nextLine());
        System.out.println("Using Default Constructor");
        System.out.println("Details of the stall category:");
        System.out.println("Name:" + object.getName());
        System.out.println("Detail:" + object.getDetail());
        System.out.println("Using Parameterised Constructor");
        System.out.println("Details of the stall category:");
      	System.out.println("Name:" + object.getName());
	    	System.out.println("Detail:" + object.getDetail());

	}
}
