import java.util.Scanner;

public class Employee {
	int empid;
	String empName;
	String empDesig;
	String empDept;

	Employee(int empid, String empName, String empDesig, String empDept) {
		this.empid = empid;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empDept = empDept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
		if (empName == "" || empName == null) {
			System.out.println("The String is empty");
		}

	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
		if (empDesig.equalsIgnoreCase("tester") || empDesig.equalsIgnoreCase("lead")
				|| empDesig.equalsIgnoreCase("manager") || empDesig.equalsIgnoreCase("developer")) {
			// System.out.println(empDesig);
		} else {
			System.out.println("INVALID DESIGNATION");
			System.exit(0);

		}
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
		if (empDept.equalsIgnoreCase("ttm") || empDept.equalsIgnoreCase("rcm") || empDept.equalsIgnoreCase("didital")
				|| empDept.equalsIgnoreCase("devops")) {
			// System.out.println(empDept);
		} else {
			System.out.println("INVALID DEPARTMENT");
			System.exit(0);

		}
	}

	void disp() {
		System.out.println("The empployee ID is" + " " + empid);
		System.out.println("The empployee name is" + " " + empName);
		System.out.println("The employee designation is" + " " + empDesig);
		System.out.println("The empployee department is" + " " + empDept);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int empid = sc.nextInt();
		System.out.println("Enter the employee name");
		String empName = sc.next();
		System.out.println("Enter the employee Designation");
		String empDesig = sc.next();
		System.out.println("Enter the employee Department");
		String empDept = sc.next();

		Employee emp1 = new Employee(empid, empName, empDesig, empDept);
		emp1.setEmpDesig(empDesig);
		emp1.setEmpDept(empDept);
		emp1.disp();

	}

}
