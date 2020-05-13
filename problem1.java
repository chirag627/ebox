/*Getters and Setters
Your City council has decided to organize a Fair in your city. The city Mayor has announced a coding contest for creating the application for the Fair. The Best application would be used for the fair and the developer gets a cash prize. You are a well versed and aspiring Programmer in your city. Many programmers have enrolled themselves for the contest and you are one of them. Every contestant is provided with a Schema diagram of the Fair. Get yourself acquainted with Schema and brace yourself for the challenge!!!.

A part of the Application requires a user prompt to create a new Item Type.

Strictly adhere to the object Oriented specifications given in the problem statement. All class names, attribute names and method names should be the same as specified in the problem statement.

Create a class named ItemType with the following private attributes.

Attribute 	Datatype
name 	      String
deposit 	  Double
costPerDay 	Double
 
Include appropriate Getters and Setters for the ItemType class.

The naming convention for Getters and Setters should be in Camel case.
Include the following methods in the ItemType class.


Method                    	Description
void display() 	            This method displays the details of the ItemType as per the specification
                            provided in the Sample Input and Output


Create a driver class called Main. In the Main method, obtain input from the user in the console and create a new ItemType object and assign the values to the object's members using setters. Display the details by calling the display method.

Input and Output format:
Refer to Sample Input and Output for formatting specifications.
Note: Display the value of deposit amount and cost per day correct to 1 decimal place.

Sample Input and Output:
[All text in bold corresponds to the input and rest corresponds to output]

Enter the Item Type Name
Electronics
Enter the Deposit Amount
2500
Enter the Cost per day of the Item Type
125
Item Name:Electronics
Deposit Amount:2500.0
Cost Per Day:125.0 */

//ItemType.java


public class ItemType {
    private String name;
    private double  deposit;
    private double costPerDay;
    
    public ItemType(){
        
    }
    
    public ItemType(String name,double deposit,double costPerDay)
    {
        this.name=name;
        this.deposit=deposit;
        this.costPerDay=costPerDay;
    }
    
    public String getName()
    {
        return name;
    }

     public double getDeposit()
    {
        return deposit;
    }

    public double getcostPerDay()
    {
        return costPerDay;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setDeposit(double deposit)
    {
        this.deposit=deposit;
    }
    
    public void setcostPerDay(double costPerDay)
    {
        this.costPerDay=costPerDay;
    }
    
    void display(){
        System.out.println("Item Name:" + this.name);
       	System.out.println("Deposit Amount:" + this.deposit);
    		System.out.println("Cost Per Day:" + this.costPerDay);
    }
}


//Main.java

import java.util.Scanner; 
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ItemType object = new ItemType();

        System.out.println("Enter the Item Type Name");
      	object.setName(input.nextLine());

        System.out.println("Enter the Deposit Amount");
        object.setDeposit(input.nextDouble());
        
        System.out.println("Enter the Cost per day of the Item Type");
        object.setcostPerDay(input.nextDouble());
                
        System.out.println("Item Name:" + object.getName());
       	System.out.println("Deposit Amount:" + object.getDeposit());
	    	System.out.println("Cost Per Day:" + object.getcostPerDay());
  }
}










