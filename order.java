package demo_1;

import java.util.Scanner;
//create a class for order
public class order {
	

//main method
public static void main(String args[]) {
	
}

	public static void main_order() {
		//create a object for each menu
		 Starter obj=new Starter();
		 Main_course obj1=new Main_course();
		 Drinks obj2=new Drinks();
		 Desert obj3=new Desert();
		 //Initialized the variables
		 int choice,repeat ,order;
		 int total = 0;
		 //use scanner for given value from user
		Scanner sc=new Scanner(System.in);
		 System.out.println("**************welcom to hotel***********");
		 //using do while loop for repetition
		 do {
			 System.out.println("\n1:starter\n2:main course\n3:drinks\n4:desert");

				System.out.println("\nselect your choice");
				//store value
				choice=sc.nextInt();
				//using switch case for multiple choice
         switch(choice) {
         case 1:
         int val = obj.Starter();
         System.out.println("item id :"+obj.item);
       	 total+=val;
       	  
          break;
         case 2:
       	  int val1 =obj1.main_course();
       	System.out.println("item id :"+obj1.item);
      	 total+=val1;
       	  
       	  
       	 break;
         case 3:
       	  int val2 =obj2.drink();
       	System.out.println("item id :"+obj2.item);
     	 total+=val2;
       	  break;
       	 
         case 4:
       	  int val3=obj3.desert();
       	System.out.println("item id :"+obj3.item);
     	 total+=val3;
       	  break;
         }
         
		 System.out.println("\n\nDo you want to order any other item...(y / n):");
		 repeat = sc.next().charAt(0);
			
		//end of the do while loop	
	 }while(repeat == 'Y' || repeat == 'y');
		 //creating bill
            System.out.println("****************************************");
            System.out.println("your bill is");
			System.out.println("\nselected item from starter \n"+obj.item);
			System.out.println("--------------------------------------------");
			System.out.println("\nselected item from main menu \n"+obj1.item);
			System.out.println("--------------------------------------------");
			System.out.println("\nselected item from drinks \n"+obj2.item);
			System.out.println("--------------------------------------------");
			System.out.println("\nselected item from desert \n"+obj3.item);
			System.out.println("--------------------------------------------");
			System.out.println("\nyour bill is......."+total);
			System.out.println("\nthank you for chosoing our serivice");
		
	 }
}


