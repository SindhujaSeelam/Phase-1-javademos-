package projectpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class FilesProject {
public static void main(String[] args) {
	
	//Scanner sc=new Scanner(System.in);
	System.out.println("Welcome To The Apllication \nThis application is used to manage the files \n");
	System.out.println(".....Developed by Seelam Sindhuja[EmpId:10840]\n\n");
	LinkedList<String> list= new LinkedList<>();
	list.add("File1");
	list.add("File2");
	mainmenu(list);
	
}

static void menu(LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		String input;
		try {
		
		System.out.println("Enter any one of the below option to continue");
		System.out.println("1.Add a new file");
		System.out.println("2.Delete a file");
		System.out.println("3.Search a file");
		System.out.println("4.Main menu");
		input=s.next();
		inputdis(input,list);
		}
		catch(Exception e) {
			System.out.println("Enter valid input ");
		}
		System.out.println("");
		input=s.next();
		inputdis(input,list);
	}
}
static void mainmenu(LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("1.Retreive files in ascending order");
		System.out.println("2.File handling menu");
		System.out.println("3.Exit application");
		String input=s.next();
		inpdis(input,list);
	}
}
static void inpdis(String input,LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		switch(input) {
		case "1":
			display(list);
			break;
		case "2":
			menu(list);
			break;
		case "3":
			System.exit(0);
			
		default :		
			System.out.println("Enter valid input");
			String input1=s.next();
			inputdis(input1,list);
			break;
		}
	}
}
static void inputdis(String input,LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		switch(input) {
		case "1":
			add(list);
			break;
		case "2":
			delete(list);
			break;
		case "3":
			search(list);
			break;
		case "4":
			mainmenu(list);
			break;
		default :		
			System.out.println("Enter valid input");
			String input1=s.next();
			inputdis(input1,list);
			break;
		}
	}
}
static void display(LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		Collections.sort(list);
		for(String file:list) {
		System.out.println(file);}
		System.out.println("Press 0 to exit to menu\n");
		String option;
		option=s.next();
		while(true) {
		if(option.equals("0")) {
			mainmenu(list);
		}
		else {
			//System.out.println(option);
			
			System.out.println("Enter valid input");
			option=s.next();
		}}
	}
}
 static void add(LinkedList<String> list) {
	 
	    try (Scanner s = new Scanner(System.in)) {
			System.out.println("Adding a new file");
			System.out.println("Enter name of the file");
			String name;
			
			while(true) {
				name=s.next();
			if(list.contains(name)) {
				System.out.println("Speciefied name of file is already present \nEnter a different name");
				

			}else {
			if(list.add(name)) {
				System.out.println("File added successfully....\n");
				Collections.sort(list);
				addmore(list);
			}}}
		}
	
	
 }

 static void addmore(LinkedList<String> list) {
	 String n;
	 try (Scanner s = new Scanner(System.in)) {
		System.out.println("\nWant to add more files ?");
			System.out.println("1.Add file");
			System.out.println("2.Exit to File handling menu\n");
			while(true) {
		    n=s.next();
		    if(n.equals("1")) {
		    	add(list);
		    }
		    else if(n.equals("2")){
		    	menu(list);
		    }
		    else {
		    	System.out.println("Enter a valid input");
		    	n=s.next();
		    }}
	}
 }
 
static void delete(LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("Deleting a file");
		System.out.println("Enter name of the file");
		String name;
		while(true) {
			name=s.next();

		if(list.remove(name)) {
			System.out.println("File deleted successfully...\n");
			deletemore(list);
		}
		else {
			System.out.println("Given file is not present");
			System.out.println("Enter a existing file name to delete");
		}}
	}

}
static void deletemore(LinkedList<String> list) {
	 String n;
	 try (Scanner s = new Scanner(System.in)) {
		System.out.println("\nWant to delete more files ?");
			System.out.println("1.Delete file");
			System.out.println("2.Exit to File handling menu\n");
			while(true) {
		    n=s.next();
		    if(n.equals("1")) {
		    	delete(list);
		    }
		    else if(n.equals("2")){
		    	menu(list);
		    }
		    else {
		    	System.out.println("Enter a valid input");
		    	//n=s.next();
		    }}
	}
	 
}
static void search(LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("Searching a file");
		System.out.println("Enter the name of the file");
		String name;
		while(true) {
		name=s.next();
		if(list.contains(name)) {
			System.out.println("File is present\n");
			//display(list);
			searchmore(list);
		}
		else {
			System.out.println("File not found\n");
			searchmore(list);


		}}
	}
}
static void searchmore(LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("Want to search more files?");
		System.out.println("1.Search file");
		System.out.println("2.Exit to File handling menu \n");
		String n;
		while(true) {
			n=s.next();
		if(n.equals("1")) {
			search(list);
		}
		else if(n.equals("2")) {
			menu(list);
		}
		else {
			System.out.println("Enter valid input");
			//n=s.next();
		}	}
	}
}
}


