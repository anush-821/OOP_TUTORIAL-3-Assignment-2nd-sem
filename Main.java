public class Main {
    public static void main(String[] args) {
        // Test 1 & 9: Student creation & Unique ID generation
        System.out.println("--- Student Profiles ---");
        Student s1 = new Student("Pratik", 101, "Engineering");
        Student s2 = new Student("Pragyan", 102, "Management");
        s1.displayProfile();
        s2.displayProfile();

        // Test 2: Employee Hierarchy
        System.out.println("\n--- Employee Details ---");
        Employee teacher = new Teacher("Dr. Smith", "E001", "Computer Science");
        Employee admin = new AdminStaff("Jane Doe", "A002", "Registrar Office");
        teacher.displayDetails();
        admin.displayDetails();

        // Test 3: Course Registration
        System.out.println("\n--- Course Registration ---");
        EnrolledStudent s3 = new EnrolledStudent("Charlie", 103, "Information Technology");
        Course c1 = new Course("CS101", "Object Oriented Programming");
        Course c2 = new Course("CS102", "Data Structures");
        s3.registerCourse(c1);
        s3.registerCourse(c2);
        s3.displayRegisteredCourses();

        // Test 5: Grading System (Interface)
        System.out.println("\n--- Grading System ---");
        ResultProcessor engDept = new EngineeringDepartment();
        ResultProcessor mgmtDept = new ManagementDepartment();
        System.out.println("Eng 85 Marks: " + engDept.processGrade(85));
        System.out.println("Mgmt 70 Marks: " + mgmtDept.processGrade(70));

        // Test 8: Notification System (Interface)
        System.out.println("\n--- Notifications ---");
        Notification emailSys = new EmailNotification();
        Notification smsSys = new SMSNotification();
        emailSys.sendNotification("anush@university.edu", "Welcome to the semester!");
        smsSys.sendNotification("9765991378", "Your fee is due.");
    }
}