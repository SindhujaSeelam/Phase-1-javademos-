package projectpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class FilesProject {
public static void main(String[] args) {
	
	//Scanner sc=new Scanner(System.in);
	System.out.println("Welcome To The Apllication \nThis application is used to manage the files \n");
	System.out.println(".....Developed by Seelam Sindhuja\n\n");
	LinkedList<String> list= new LinkedList<>();
	list.add("File1");
	list.add("File2");
	menu(list);
	
}

static void menu(LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		String input;
		try {
		
		System.out.println("Enter any one of the below option to continue");
		System.out.println("1.List out the files");
		System.out.println("2.Add a new file");
		System.out.println("3.Delete a file");
		System.out.println("4.Search a file");
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
static void inputdis(String input,LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		switch(input) {
		case "1":
			display(list);
			break;
		case "2":
			add(list);
			break;
		case "3":
			delete(list);
			break;
		case "4":
			search(list);
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
		for(String file:list) {
		System.out.println(file);}
		System.out.println("Press 0 to exit to menu\n");
		String option;
		option=s.next();
		while(true) {
		if(option.equals("0")) {
			menu(list);
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
				for(String file:list) {
					System.out.println(file);}
				addmore(list);
			}}}
		}
	
	
 }

 static void addmore(LinkedList<String> list) {
	 String n;
	 try (Scanner s = new Scanner(System.in)) {
		System.out.println("Want to add more files ?");
			System.out.println("1.Add file");
			System.out.println("2.Exit to main menu\n");
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
			for(String file:list) {
				System.out.println(file);}
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
		System.out.println("Want to delete more files ?");
			System.out.println("1.Delete file");
			System.out.println("2.Exit to main menu\n");
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
		}
		else {
			System.out.println("File not found");
			System.out.println("Files which are present are ");
			for(String file:list) {
				System.out.println(file);}
			searchmore(list);


		}}
	}
}
static void searchmore(LinkedList<String> list) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("Want to search more files?");
		System.out.println("1.Search file");
		System.out.println("2.Menu\n");
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


