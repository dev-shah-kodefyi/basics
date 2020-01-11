
public class Student {

	int studentId;
	String studentName;
	float marks;
	boolean second_chance;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Student(int studentId, String studentName, boolean second_chance) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		// this.marks = marks;
		this.second_chance = second_chance;
	}

	public Student(int studentId, String studentName, float marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;

	}
}
