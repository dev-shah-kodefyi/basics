
public class Customer {
	String name;
	int mob;
	double feedback;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public double getFeedback() {
		return feedback;
	}

	public void setFeedback(double feedback) {
		this.feedback = feedback;
	}

	public Customer(String name, int mob, double feedback) {
		super();
		this.name = name;
		this.mob = mob;
		this.feedback = feedback;
	}

	public void disp() {
		System.out.println("Customers name  " + name);
		System.out.println("Customers mobile no   " + mob);
		System.out.println("Customers feedback " + feedback);
	}
}
