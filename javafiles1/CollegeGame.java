import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private String course;
    private int year;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
        this.year = 1; // Start at first year
    }

    public void progressYear() {
        if (year < 4) { // Assuming a 4-year course
            year++;
        }
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name + " is studying " + course + " and is in year " + year;
    }
}

class Course {
    private String name;
    private int duration; // Duration in years

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
}

class College {
    private List<Student> students;
    private List<Course> courses;

    public College() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void progressStudents() {
        for (Student student : students) {
            student.progressYear();
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class CollegeGame {
    public static void main(String[] args) {
        College college = new College();
        Scanner scanner = new Scanner(System.in);

        // Adding courses
        college.addCourse(new Course("Computer Science", 4));
        college.addCourse(new Course("Business Administration", 4));
        college.addCourse(new Course("Mechanical Engineering", 4));

        // Adding students
        college.addStudent(new Student("Alice", "Computer Science"));
        college.addStudent(new Student("Bob", "Business Administration"));
        college.addStudent(new Student("Charlie", "Mechanical Engineering"));

        // Game loop
        while (true) {
            System.out.println("\nCurrent Students:");
            college.displayStudents();

            System.out.println("\nProgress students to the next year? (yes/no)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                college.progressStudents();
            } else {
                break; // Exit the game
            }
        }

        scanner.close();
        System.out.println("Thank you for playing the College Management Game!");
    }
}