import java.util.Scanner;
public class Vending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int choose,choice;
		int amount ;
		int pay;
		int price;
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello and welcome to the Machakos University Ice cream vending machine");
		System.out.println("\nFor the selections below the cost will beKsh.60.\nPlease make the payment in order to continue");
		System.out.println("WARNING:PAYMENTS CAN ONLY BE DONE IN DENOMINATIONS OF KSH.20 AND KSH.40 AND A NON-REFUNDABLE CHANGE");
		System.out.println("\nPlease enter the amount and pay and price:");
		amount=sc.nextInt();
		pay=sc.nextInt();
		price=sc.nextInt();
		if (amount + pay + price < 60){
		System.out.println(" Please Top Up the amount for you to continue");
		}
		if(amount==20 && pay==40 && price==0 || amount==40 && pay==20 && price==0 || amount==20 && pay==20 && price==20 || amount + pay + price>=60) {
		//System.out.println(amount+amount);
		System.out.println("Transaction accepted");
		System.out.println("Please choose the type of ice cream you desire");
		System.out.println("1.Ice pop \n2.Ice dish (small) \n3.Ice ball (small) ");
		choose=sc.nextInt();
		if(choose==1) {
		System.out.println("Ice pop");
		System.out.println("You have chosen ice pop as your desired ice cream which flavour would you like?");
		System.out.println("1.Vanilla \n2.Strawberry\n3.Choclate");
		choice=sc.nextInt();
		if (choice==1) {
		System.out.println("Your pick is the vanilla flavour");
		vending();
		}
		else if(choice==2) {
		System.out.println("Your pick is Strawberry");
		vending();
		}
		else if(choice==3) {
		System.out.println("Your pick is Choclate");
		vending();
		}
		else {
		System.out.println("This is an invalid input please try again");
		}
		}
		else if (choose==2) {
		System.out.println("Ice dish (small)");
		System.out.println("You have chosen Ice dish as your desired ice cream which flavour would you like?");
		System.out.println("1.Vanilla \n2.Strawberry\n3.Choclate");
		choice=sc.nextInt();
		if (choice==1) {
		System.out.println("Your pick is the vanilla flavour");
		vending();
		}
		else if(choice==2) {
		System.out.println("Your pick is Strawberry");
		vending();
		}
		else if(choice==3) {
		System.out.println("Your pick is Choclate");
		vending();
		}
		else {
		System.out.println("This is an invalid input please try again");
		}
		}
		else if (choose==3) {
		System.out.println("Ice ball (small)");
		System.out.println("You have chosen Ice ball as your desired ice cream which flavour would you like?");
		System.out.println("1.Vanilla \n2.Strawberry\n3.Choclate");
		choice=sc.nextInt();
		if (choice==1) {
		System.out.println("Your pick is the vanilla flavour");
		vending();
		}
		else if(choice==2) {
		System.out.println("Your pick is Strawberry");
		vending();
		}
		else if(choice==3) {
		System.out.println("Your pick is Choclate");
		vending();
		}
		else {
		System.out.println("This is an invalid input please try again");
		}
		}
		}
		else if(amount + pay + price>=60) {
			System.out.println("This machine does not give change.");
		}
		}
		public static void vending() {
		// TODO Auto-generated method stub
		System.out.println("Have a good day.");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


