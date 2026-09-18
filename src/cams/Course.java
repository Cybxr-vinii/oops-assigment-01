package cams;

public class Course {

    private int courseId;
    private String courseName;
    private int totalSeats;
    private int availableSeats;
    private double minimumMarks;

    public Course(
            int courseId,
            String courseName,
            int totalSeats,
            double minimumMarks) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.minimumMarks = minimumMarks;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getMinimumMarks() {
        return minimumMarks;
    }

    public boolean checkEligibility(double applicantMarks) {

        return applicantMarks >= minimumMarks;
    }

    public boolean allocateSeat() {

        if (availableSeats > 0) {

            availableSeats--;

            return true;
        }

        return false;
    }

    public void updateSeatCount(int seats) {

        if (seats >= 0 && seats <= totalSeats) {

            availableSeats = seats;
        }
    }

    public void displayCourseDetails() {

        System.out.println("\n----- COURSE DETAILS -----");

        System.out.println("Course ID       : " + courseId);
        System.out.println("Course Name     : " + courseName);
        System.out.println("Total Seats     : " + totalSeats);
        System.out.println("Available Seats : " + availableSeats);
        System.out.println("Minimum Marks   : " + minimumMarks);
    }
}
