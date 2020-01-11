import java.util.Scanner;

public class Customer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of customers ");
		int size = sc.nextInt();
		Customer[] cust = new Customer[size];
		int i = 0;
		String ch = "y";

		while (ch.equals("y")) {
			for (i = 0; i < size; i++) {
				System.out.println("enter name");
				String name = sc.next();
				System.out.println("enter  mobile number");
				int mob = sc.nextInt();
				System.out.println("enter feedback");
				double feedback = sc.nextDouble();
				cust[i] = new Customer(name, mob, feedback);

			}
			double r = avg(cust);
			System.out.println("The average is" + r);

			sort1(cust);
			sort2(cust);
			System.out.println("Press y to continue and n to exit");
			String ch1 = sc.next();
			if (ch1.equals("n")) {
				System.exit(0);
				break;
			} else {
				ch = ch1;
			}

		}
	}

	public static double avg(Customer[] cust) {
		double avg = 0;
		for (int i = 0; i < cust.length; i++) {
			avg = avg + cust[i].feedback;
		}
		avg = avg / cust.length;
		return avg;
	}

	public static void sort1(Customer[] cust) {
		double max = 0;
		cust[0].feedback = max;

		for (int i = 1; i < cust.length; i++) {
			if (cust[i].feedback > max) {
				max = cust[i].feedback;
			}
			System.out.println(cust[i].name + cust[i].mob + cust[i].feedback);
		} // System.out.println("The maximum feedback rating is "+max);
	}

	public static void sort2(Customer[] cust) {
		double min = 0;
		cust[0].feedback = min;

		for (int i = 1; i < cust.length; i++) {
			if (cust[i].feedback < min) {
				min = cust[i].feedback;
			}
			System.out.println(cust[i].name + cust[i].mob + cust[i].feedback);
		}
	}

}
