package com.company;

import java.util.Scanner;

public class Main {

	private static Scanner scanner=new Scanner(System.in);
	private static TodoCompany myTodoList=new TodoCompany();
	
    public static void main(String[] args)
	{
		int command=0;
		boolean exit=false;
		
		printCommand();
		 
		while(!exit) {
			System.out.println("Enter your command/choice: ");
			command=scanner.nextInt();
			scanner.nextLine();
			
			switch (command) {
			case 0:
				printCommand();
				break;
			case 1:
				myTodoList.printTodoList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				updateItem();
				break;
			case 4:
				removeItem();
			    break;
			case 5:
				searchItem();
				break;
			case 6:
				exit=true;
				break;
				
				default:
					System.out.println("Please pick only from gven commands");
			}
		}
		}
		
	
    public static void printCommand()
    {
    	System.out.println("\n commands: " +
    "\n press 0 : To print instructions" + 
    "\n press 1 : To print all lists" + 
    "\n press 1 : To print all lists" + 
    "\n press 2 : To add list in Todo" + 
    "\n press 3 : To modift items in Todo" + 
    "\n press 4 : To remove item from Todo" + 
    "\n press 5 : To search an item from Todo" + 
    "\n press 6 : To exit the app");
    }
    
    public static void addItem() {
    	System.out.println("Enter item to be added in list: ");
    	myTodoList.addItem(scanner.nextLine());
    }
    public static void updateItem() {
    	
    	System.out.println("Enter the item number: ");
    	int index=scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Enter new idea to be added: ");
    	String myNewItem=scanner.nextLine();
    	myTodoList.updateTodo(index -1,myNewItem);
    }
    	
    public 	 static void removeItem() {
    	System.out.println("Enter the item number to be deleted: ");
    	int index = scanner.nextInt();
    	scanner.nextLine();
    	myTodoList.removeItem(index -1);
    }
    
    public 	 static void searchItem() {
    	System.out.println("Enter a string to be searched");
    	String searchItem = scanner.nextInt();
    	
    	if(myTodoList.findItem(searchItem)== null) {
    		System.out.println(" Ite not founf in your To do list");
    	}
    	else
    	{
    		System.out.println(searchItem + "was found in your List");
    	}
    	
      }
  }



