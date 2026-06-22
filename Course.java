import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseName() { return courseName; }
}

class EnrolledStudent extends Student {
    private List<Course> registeredCourses;

    public EnrolledStudent(String name, int rollNumber, String faculty) {
        super(name, rollNumber, faculty);
        this.registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    public void displayRegisteredCourses() {
        System.out.println("Courses registered for " + getName() + ":");
        for (Course c : registeredCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}