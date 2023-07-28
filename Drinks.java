package demo_1;

import java.util.Scanner;
//create class for drinks

public class Drinks {
	 String item ="";
		 public  int drink() {
			//Initialized the value and choice
		int choice3,val=0;
		 System.out.println("drinks");
		//use scanner for given value from user
			Scanner md=new Scanner(System.in);
			System.out.println("1:mojito  100 rs\n2:fruit smash   150rs\n3:margarita     180rs\n4:cold drink     50rs");
			System.out.println("\nselect item from drinks");
			//store variable
		choice3=md.nextInt();
		//using switch case for multiple choice
		switch(choice3) {
		case 1:
			item+="\n mojito  100 rs";
			val=100;
			break;
		case 2:
			item+="\n fruit smash   150rs";
			val=150;
			break;
		case 3:
			item+="\n margarita     180rs\"";
			val=180;
			break;
		case 4:
			item+="\n cold drink     50rs";
			val=50;
			break;
		}
		//return value of val
		return val;
	 }
	 }


