
public class Customer_details {

		public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getAcntType() {
		return acntType;
	}

	public void setAcntType(String acntType) {
		this.acntType = acntType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

		int custId;
		String custName;
		String custAddress;
		String acntType;
		double balance;
		public Customer_details(int custId, String custName) {
			super();
			this.custId = custId;
			this.custName = custName;
			
		}

		
		public Customer_details(int custId, String custName, String custAddress) {
			super();
			this.custId = custId;
			this.custName = custName;
			this.custAddress = custAddress;
			
		}
      public void disp()
     {System.out.println("Customer's ID"+custId);
	 System.out.println("Customer's name"+custName);
	 System.out.println("Customer's address"+custAddress);
	 System.out.println("Customer's Account type"+acntType);
	 System.out.println("Customer's balance"+balance);
     }

	public Customer_details(int custId, String custName, String custAddress, String acntType, double balance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.acntType = acntType;
		this.balance = balance;
	}}
