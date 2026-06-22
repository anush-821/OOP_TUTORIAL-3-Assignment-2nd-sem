public class Student {
    private static int idCounter = 1001;
    private String uniqueID;
    private String name;
    private int rollNumber;
    private String faculty;

    public Student(String name, int rollNumber, String faculty) {
        this.uniqueID = "STU" + idCounter++;
        this.name = name;
        this.rollNumber = rollNumber;
        this.faculty = faculty;
    }

    public String getUniqueID() { return uniqueID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public void displayProfile() {
        System.out.println("ID: " + uniqueID + ", Name: " + name +
                ", Roll: " + rollNumber + ", Faculty: " + faculty);
    }
}