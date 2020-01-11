import java.util.Scanner;

public class Saving_accnt {

	double balance;
	int rate;
	int accNo;

	public Saving_accnt(double balance, int rate, int accNo) {
		super();
		this.balance = balance;
		this.rate = rate;
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void withDraw(double amount, double balance) {
		if (amount > balance) {
			System.out.println("your balance is low");
		} else {
			System.out.println("Amount withdawn" + amount);
			System.out.println("Amount left" + (balance - amount));
		}
	}

	public void disp() {
		System.out.println("Customer's Account no " + accNo);
		System.out.println("Customer's Balance " + balance);
		System.out.println("Customer's Rate " + rate);
//System.out.println("Customer's Inetrest"
	}

	public void calculateInterest(double amount) {
		balance = amount + (amount * rate * 4) / 100;
		System.out.println("The balance after finding simple inerest" + balance);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Customer_details[] customers = new Customer_details[10];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the balance");
			double balance = sc.nextDouble();
			System.out.println("Enter the rate");
			int rate = sc.nextInt();
			System.out.println("Enter the account no");
			int accNo = sc.nextInt();
			System.out.println("Enter the amount to withdraw");
			double amount = sc.nextDouble();
			Saving_accnt a = new Saving_accnt(balance, rate, accNo);
			a.disp();
			a.withDraw(amount, balance);
			a.calculateInterest(amount);
		}
	}

}