import java.util.*;

public class MYFood {
	static Scanner sc=new Scanner(System.in);
	
	public static void hotel(Map<String,Integer> dish) throws InterruptedException {
		System.out.println();
		System.out.println("The Available Dishes Are ");
		System.out.println();
		int i=1;
		for(String d: dish.keySet()) {
			System.out.println(i+"."+d);
			i++;
		}
		System.out.println();
		System.out.print("Enter the \"DISH NAME\" you want to Order : ");
		String food=sc.next();	
		payment(food,dish.get(food));
	}
	
	public static void paymentMethod(String method,double bill) throws InterruptedException{
		System.out.println("Connecting to "+method+" server.....");
  	  	Thread.sleep(2000);
  	   	System.out.print("Enter the bill amount :");
  	  	int user_enter_amount=sc.nextInt();
  	  	if (user_enter_amount==bill)
  	  	{
  			int sys_otp=(int)(Math.random()*9999+9999);
  		  	System.out.println();
  		   	System.out.println("\t\t\tEnter the OTP :"+sys_otp);
  		   
  		   	int user_otp=sc.nextInt();
  		   	if (user_otp==sys_otp)
  		   	{
  			  	System.out.println("\t\t------------------------------------");
 			 	 System.out.println("\t\t\t\"ORDER CONFIRMED!!!\"");
 			 	 System.out.println("\t\t------------------------------------");
  		   	}
  		   	else {
  			  	System.out.println("\t\t-------------------------------------------------------");
  		   	 	 System.out.println("\t\t\tEnterd the wrong otp \"ORDER CANCELLED\"");
  		   	  	System.out.println("\t\t-------------------------------------------------------");
  		  	 }	  
  	   	}
  	  	 else
  			   System.out.println("Entered the wrong amount");
		}
	
	public static void payment(String food,int amount) throws InterruptedException {
		
		System.out.println();
		System.out.println("You have selected "+ food);
	        System.out.print("Please enter the quantity :");
	        int quantity=sc.nextInt();
	        double bill=quantity*amount;
	        System.out.println();
	        System.out.println("Your total bill amount "+bill);
	        System.out.println();
	        System.out.println("Select the payment method\n--------------------------- ");
	        System.out.println("1.Google pay\n2.Phone pay");
	        System.out.println("---------------------------");
	        System.out.print("Payment Method option here:");
        
        
       		 int selected_payment=sc.nextInt();
       		 System.out.println();
        
        	switch (selected_payment)
        	{
        	   case 1://Google pay
        	
     	   		paymentMethod("Google_Pay",bill); 
     	  		break;  	   
        
       	   	   case 2://phone pay
        	
           		paymentMethod("Phone_Pay",bill);
     	  		break;    	   
        
        	}
   	 }
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("\t\t\t-------------------------");
		System.out.println("\t\t\t WELCOME TO MY_FOODS.COM");
		System.out.println("\t\t\t-------------------------");
		int input=1;
		while(input==1) {
			
			System.out.println();
			System.out.println("Select The Hotel");
			System.out.println();
			System.out.println("1.Buhari\n2.A2B\n3.SS Hyderabad Briyani\n4.Star Briyani\n");
			int selected_hotel=sc.nextInt();
			switch(selected_hotel) {
			case 1:
        	
				System.out.println("\t\t\t Welcome to Buhari");
				Map<String,Integer> dish1=new LinkedHashMap<>();
				dish1.put("Mutton_briyani",200 );
				dish1.put("Chicken_briyani",130 );
				dish1.put("Chicken65_briyani",120 );
				hotel(dish1);
				break;
        	
			case 2:	
        	
				System.out.println("\t\t\t Welcome to A2B");
				Map<String,Integer> dish2=new LinkedHashMap<>();
				dish2.put("Idly_set",40 );
				dish2.put("Special_dosa",40 );
		        	dish2.put("Puri_set",50 );
		        	hotel(dish2);
		        	break;
	        	
	        	case 3:
	        	
		        	System.out.println("\t\t\t Welcome to SS Hyderabad Briyani");
		        	Map<String,Integer> dish3=new LinkedHashMap<>();
		        	dish3.put("Grilled_chicken",240 );
		        	dish3.put("Chicken_briyani",130 );
		        	dish3.put("Thandoori",240 );
		        	dish3.put("Chicken_tikka",200 );
		        	hotel(dish3);
		        	break;
	        	
	        	case 4:
	        	
		        	System.out.println("\t\t\t Welcome to Star Briyani");
		        	Map<String,Integer> dish4=new LinkedHashMap<>();
		        	dish4.put("Chettinadu_chicken_masala",150 );
		        	dish4.put("Pepper_chicken",130 );
		        	dish4.put("Mutton_kaima",180 );
		        	hotel(dish4);
		        	break;
					
			default:
                                System.out.println();
				System.out.println("Please enter a valid Hotel Option");
				break;
		        }
			System.out.println();
			System.out.println("Enter 1 to \'ORDER AGAIN\' \nEnter 2 to \'EXIT\'");
			input=sc.nextInt();
		}  
	}

}
