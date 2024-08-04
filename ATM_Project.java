package Department;

import java.util.*;

public class ATM_Project {
	public static void printline() {
		System.out.println("--------------------");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 1234;
		double balance = 0.0;
		double Takeamount = 0;
		double Addamount = 0;
		String name;
		System.out.println("...Welcome to India one ATM...");
		System.out.println("Enter your name :");
		name = sc.nextLine();
		printline();
		System.out.println("Welcome " + '"' + name + '"');
		System.out.println("Enter your password(eg:1234):");

		printline();
		innerloop: while (true) {
			int password = sc.nextInt();

			if (password == pin) {

				outterloop: while (true) {
					System.out.println("Enter 1 to cheke balance ");
					System.out.println("Enter 2 to Addamount to your bank account");
					System.out.println("Enter 3 to Takeamount from your account");
					System.out.println("Enter 4 to print recipte");
					System.out.println("Enter 5 to EXIT!");
					printline();

					int opt = sc.nextInt();

					if (opt <= 5) {

						switch (opt) {
						case 1:
							System.out.println("Balance of your account: " + balance);
							printline();
							break;
						case 2:
							System.out.println("Enter amount how much did you want to add:");
							double Addamounts = sc.nextDouble();
							balance = Addamounts + balance;
							Addamount = Addamounts + Addamount;
							System.out.println("sucuessfully add your amount ....");
							printline();
							break;
						case 3:
							System.out.println("Enter amount how much did you want to take:");
							double Takeamounts = sc.nextDouble();

							if (Takeamounts > balance) {
								System.out.println("insuficient balance");
								printline();
							} else {
								balance = balance - Takeamounts;
								Takeamount = Takeamount + Takeamounts;
								System.out.println("sucuessfully taken amount");
								printline();
							}
							break;

						case 4:
							System.out.println("balance :" + balance);
							System.out.println("taken amount :" + Takeamount);
							System.out.println("added amount :" + Addamount);
							System.out.println("------Thank for coming------");
							printline();
							break;
						case 5:
							if (opt == 5) {
								System.out.println("thank you for visiting & come agine ");
								printline();
								break innerloop;
							}
							break;
						}
					}
				}

			} else {
				System.out.println("Enter a correct password:");
				printline();
				continue innerloop;

			}
		}

	}

}
