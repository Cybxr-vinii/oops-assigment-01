package cams;

public class Application {

    private int applicationId;
    private Applicant applicant;
    private Course course;
    private String status;

    public Application(
            int applicationId,
            Applicant applicant,
            Course course) {

        this.applicationId = applicationId;
        this.applicant = applicant;
        this.course = course;
        this.status = "Pending";
    }

    public int getApplicationId() {
        return applicationId;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public Course getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    public boolean verifyEligibility() {

        if (course.checkEligibility(applicant.getMarks())) {

            status = "Eligible";

            applicant.updateStatus("Eligible");

            System.out.println(
                    "Applicant is eligible."
            );

            return true;
        }

        status = "Rejected";

        applicant.updateStatus("Rejected");

        System.out.println(
                "Applicant is not eligible."
        );

        return false;
    }

    public boolean allocateSeat() {

        if (status.equals("Eligible")) {

            if (course.allocateSeat()) {

                status = "Seat Allocated";

                applicant.updateStatus(
                        "Seat Allocated"
                );

                System.out.println(
                        "Seat allocated successfully."
                );

                return true;
            }

            System.out.println(
                    "No seats available."
            );

            status = "Waiting List";

            return false;
        }

        System.out.println(
                "Eligibility verification required first."
        );

        return false;
    }

    public void updateStatus(String status) {

        this.status = status;

        applicant.updateStatus(status);
    }

    public void displayApplication() {

        System.out.println(
                "\n----- APPLICATION DETAILS -----"
        );

        System.out.println(
                "Application ID : " + applicationId
        );

        System.out.println(
                "Applicant      : "
                + applicant.getName()
        );

        System.out.println(
                "Course         : "
                + course.getCourseName()
        );

        System.out.println(
                "Status         : " + status
        );
    }
}