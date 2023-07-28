package demo_1;

import java.util.Scanner;
//create class for stater
public class Starter {
	public String item ="";
	public int Starter() {
		//Initialized the value and choice
		
		int choice1,val = 0;
		   System.out.println("starter");
		//use scanner for given value from user
		   Scanner dp=new Scanner(System.in);
		System.out.println("1:dry manchurian  100 rs\n2:masala papad    50rs\n3:cheese balls    70rs\n4:chiily        80rs");
		System.out.println("\n\nselect item from starter");
		//store variable
	choice1=dp.nextInt();
	//using switch case for multiple choice
	
	switch(choice1) {
	case 1:
	    item+="\ndry manchurian 100rs" ;
		val=100;
		break;
	case 2:
		item+="\nmasala papad   50rs" ;
		val=50;
		break;
	case 3:
		item+="\ncheese balls   70rs " ;
		 val=70;
		
		break;
	case 4:
	     item+="\nchiily     80rs" ;
		 val=80;
		break;

	}
	//return value of val
	return val;
	
		
	}
	

}
	


