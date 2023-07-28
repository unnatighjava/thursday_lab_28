package demo_1;

import java.util.Scanner;
//create class for desert
public class Desert {
	String item ="";
		 public int desert() {
			//Initialized the value and choice
			 int choice4,val=0;
			 System.out.println("desert");
			//use scanner for given value from user
				Scanner mn=new Scanner(System.in);
				System.out.println("1: vanilla ice cream   150 rs\n2:choclate ice cream    160rs\n3:mango ice cream    120rs\n4:gulam jamun   80rs");
				System.out.println("\nselect item from desert");
				//store variable
			choice4=mn.nextInt();
			//using switch case for multiple choice
			switch(choice4) {
			case 1:
				item+="\nvanilla ice cream   150 rs";
				val=150;
				break;
			case 2:
				item+="\n choclate ice cream    160rs";
				val=160;
				break;
			case 3:
				item+="\n mango ice cream    120rs";
				val=120;
				break;
			case 4:
				item+="\n gulam jamun   80rs";
				val=80;
				break;
			}
			//return value of val
			return val;
		 }
	 }


