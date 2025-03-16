// Base Class: Course
class Course {
    protected String courseName;
    protected int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No") +
                ", Fee: ₹" + fee + ", Discount: " + discount + "%, Final Fee: ₹" + getFinalFee());
    }
}

// Main Class
public class CourseManagementSystem {
    public static void main(String[] args) {
        Course basicCourse = new Course("C Programming", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Java Full Stack", 12, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("React Developer Bootcamp", 8, "Coursera", false, 5000, 20);

        // Display course details
        basicCourse.displayCourseInfo();
        onlineCourse.displayCourseInfo();
        paidCourse.displayCourseInfo();
    }
}
