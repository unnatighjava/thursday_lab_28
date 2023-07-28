package demo_1;

import java.util.Scanner;
//create class for main course
public class Main_course {
	String item ="";
	public int main_course() {
		//Initialized the value and choice
		int choice2,val=0;
		 System.out.println("main course");
		//use scanner for given value from user
			Scanner cd=new Scanner(System.in);
			System.out.println("1:veg biryani  150 rs\n2:panner handi   250rs\n3:roti    20rs\n4:veg kolhapuri   180rs");
			System.out.println("\nselect item from main course");
			//store variable
		choice2=cd.nextInt();
		//using switch case for multiple choice
		switch(choice2) {
		case 1:
			item+="\n veg biryani  150 rs";
		     val=150;
			break;
		case 2:
			item+="\n panner handi   250rsrs";
			val=250;
			break;
		case 3:
			item+="\n roti    20rs  rs";
			val=20;
			break;
		case 4:
			item+="\n veg kolhapuri   180rs";
		    val=180;
			break;
		}
		//return value of val
		return val;
	 }
 }

	


