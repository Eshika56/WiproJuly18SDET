package customers;
import college.Student;
import company.Employee;
public class Customer {
	protected String customerName;
	protected int customerId;
	protected String customerDepartment;
	public Customer(String name, int id, String department) {
		customerName = "Ashish Dubey";
		customerId = 2326;
		customerDepartment = "designing";
		
	}
	public void displayCon() {
		System.out.println("Customer Name:" + customerName);
		System.out.println("Customer Id:" + customerId);
		System.out.println("Customer Department:" + customerDepartment);
		
		
		
	}
	
		public static void main(String[] args) {
			Customer obj2 = new Customer("Ashish Dubey", 2326, "designing");
			Student obj = new Student("Eshika Bose", 2904, "Information Technology");
			Employee obj1 = new Employee("Raha Roy", 2125, "Web Developer");
			obj2.displayCon();
			obj.displayInfo();
			obj1.display();
			
		}
	}



	


