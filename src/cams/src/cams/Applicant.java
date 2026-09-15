package cams;

public class Applicant extends User {

    private int applicantId;
    private double marks;
    private String category;
    private String documents;
    private String applicationStatus;

    public Applicant(
            int userId,
            int applicantId,
            String name,
            String email,
            String password,
            double marks,
            String category) {

        super(userId, name, email, password);

        this.applicantId = applicantId;
        this.marks = marks;
        this.category = category;
        this.applicationStatus = "Not Applied";
    }

    public int getApplicantId() {
        return applicantId;
    }

    public double getMarks() {
        return marks;
    }

    public String getCategory() {
        return category;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void uploadDocument(String documents) {
        this.documents = documents;
        System.out.println("Documents uploaded successfully.");
    }

    public void submitApplication() {
        applicationStatus = "Submitted";
        System.out.println("Application submitted successfully.");
    }

    public void updateStatus(String status) {
        this.applicationStatus = status;
    }

    public void trackStatus() {
        System.out.println("Application Status: " + applicationStatus);
    }

    public void displayApplicantDetails() {

        System.out.println("\n----- APPLICANT DETAILS -----");

        displayUserDetails();

        System.out.println("Applicant ID : " + applicantId);
        System.out.println("Marks        : " + marks);
        System.out.println("Category     : " + category);
        System.out.println("Documents    : " +
                (documents == null ? "Not uploaded" : documents));
        System.out.println("Status       : " + applicationStatus);
    }
}