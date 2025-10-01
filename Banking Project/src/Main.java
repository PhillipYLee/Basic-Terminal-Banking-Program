import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {		
		double balance = 0;
		boolean isRunning = true;
		int choice;
		
		while(isRunning){
			System.out.println("**************");
			System.out.println("PHILLIP'S BANK");
			System.out.println("**************");
			System.out.println("1.SHOW BALANCE");
			System.out.println("2.DEPOSIT");
			System.out.println("3.WITHDRAW");
			System.out.println("4.EXIT BANK");
			System.out.println("**************");
			System.out.print("SELECT INPUT (1-4): ");
			choice = scanner.nextInt();
			switch(choice){
				case 1 -> showBalance(balance);
				case 2 -> balance += deposit();
				case 3 -> balance -= withdraw(balance);
				case 4 -> isRunning = false;
				default -> System.out.println("INVALID CHOICE");
			}
		}
		System.out.println("**************************");
		System.out.println("THANK YOU HAVE A NICE DAY!");
		System.out.println("**************************");

		scanner.close();
	}
	
	static void showBalance(double balance){
		System.out.println("**************");
		System.out.printf("$%.2f\n", balance);
	}
	
	static double deposit(){
		double amount;
		System.out.print("DEPOSIT AMOUNT: ");
		amount = scanner.nextDouble();
		
		if(amount < 0) {
			System.out.println("INVALID AMOUNT");
			return 0;
		}
		else {
			return amount;
		}
	}
	
	static double withdraw(double balance){
		double amount;
		
		System.out.print("WITHDRAW AMOUNT: ");
		amount = scanner.nextDouble();
		
		if(amount > balance) {
			System.out.println("INSUFFICENT FUNDS");
			return 0;
		}
		else if(amount < 0) {
			System.out.println("INVALID AMOUNT");
			return 0;
		}
		else {
			return amount;
		}
	}
}












