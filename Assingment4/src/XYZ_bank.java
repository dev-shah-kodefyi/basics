import java.util.Scanner;

public class XYZ_bank {

	public static void c1(Customer_details customers[], int i)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the custom ID");
		int custId = sc.nextInt();
		System.out.println("Enter the customer's name ");
		String custName = sc.next();
		System.out.println("Enter the customer's address");
		String custAddress = sc.next();
		customers[i] = new Customer_details(custId, custName, custAddress);

	}

	public static void c2(Customer_details customers[], int i) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the custom ID");
		int custId = sc.nextInt();
		System.out.println("Enter the customer's name ");
		String custName = sc.next();
		customers[i] = new Customer_details(custId, custName);
	}

	public static void c3(Customer_details customers[], int i) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the custom ID");
		int custId = sc.nextInt();
		System.out.println("Enter the customer's name ");
		String custName = sc.next();
		System.out.println("Enter the custoner's address");
		String custAddress = sc.next();
		System.out.println("Enter the account type ");
		String acntType = sc.next();
		System.out.println("Enter the balance ");
		double balance = sc.nextDouble();
		customers[i] = new Customer_details(custId, custName, custAddress, acntType, balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer_details[] customers = new Customer_details[10];
		int i = 0;
		String ch = "y";

		while (ch.equals("y")) {
			for (i = 0; i < 10; i++) {

				System.out.println(
						"Enter your choice\n 1 Registering by customer id,name and address\n 2 Registering by customer ID,name\n  3 Registering by customer ID,name,address and balance");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					c1(customers, i);
					System.out.println("CUSTOMER ADDED NOW DISPLAYYING THE DETAILS");
					customers[i].disp();

					i++;
					break;
				case 2:
					c2(customers, i);
					System.out.println("CUSTOMER ADDED NOW DISPLAYYING THE DETAILS");
					customers[i].disp();
					i++;

					break;
				case 3:
					c3(customers, i);
					System.out.println("CUSTOMER ADDED NOW DISPLAYYING THE DETAILS");
					customers[i].disp();

					i++;
					break;
				default:
					System.out.println("wrong choice");
					System.exit(0);
				}

			}
			System.out.println("enter your choice do you want to continue \n press y to continue and n to stop");
			ch = sc.next();
		}
	}
}
