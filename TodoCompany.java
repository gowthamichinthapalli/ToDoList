package com.company;

import java.util.ArrayList;

public class TodoCompany 
{

		private ArrayList<String> todoList = new ArrayList<String>();
	

		public void addItem(String item)
		{
        todoList.add(item);
	    }
	
	
	//remove  list item
	
        public void removeItem(int index)
        {
        	//String myItem=todoList.get(index);
        	todoList.remove(index);
        }
	//print the entire list
        
        public void printTodoList()
        {
        	System.out.println("Todo List consists of:" + todoList.size() + "items");
        	
        	for(int i=0;i< todoList.size();i++)
        	{
        		System.out.println("Item at position " + (i+1) + " is " + todoList.get(i));
        	}
        }
        
        //update the list
        
        public void updateTodo(int index,String List)
        {
        	todoList.set(index,List);
        	System.out.println("Updation completed at position" + index + 1);
        }
        
        //search feature for user
        
        public String findItem(String searchItem)
        {
        	int index=todoList.indexOf(searchItem);
        	
        	if(index== -1)
        	{
        		return null;
        		
        	}else
        		return todoList.get(index);
        }
	
}



