public class Employee {
    protected String name;
    protected String empId;

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}

class Teacher extends Employee {
    private String subject;

    public Teacher(String name, String empId, String subject) {
        super(name, empId);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher ID: " + empId + ", Name: " + name + ", Subject: " + subject);
    }
}

class AdminStaff extends Employee {
    private String department;

    public AdminStaff(String name, String empId, String department) {
        super(name, empId);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin Staff ID: " + empId + ", Name: " + name + ", Dept: " + department);
    }
}