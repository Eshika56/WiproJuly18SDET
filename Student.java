package college;

public class Student {
	private String studentName;
	private String studentId;
	private String studentDepartment;
	public Student(String name, String id, String department) {
		studentName = name;
		studentId = id;
		studentDepartment = department;
		
	}
	public void displayInfo() {
		System.out.println("Student Name:" + studentName);
		System.out.println("Student Id:" + studentId);
		System.out.println("Student Department:" + studentDepartment);
		
		
		
	}
	public class Main {
		public static void main(String[] args) {
			Student s = new Student("Eshika Bose", "2904", "Information Technology");
			s.displayInfo();
		}
	}

}
