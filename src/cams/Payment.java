package cams;

public class Payment {

    private int paymentId;
    private Application application;
    private double amount;
    private String paymentStatus;

    public Payment(
            int paymentId,
            Application application,
            double amount) {

        this.paymentId = paymentId;
        this.application = application;
        this.amount = amount;
        this.paymentStatus = "Pending";
    }

    public void processPayment() {

        paymentStatus = "Paid";

        application.updateStatus("Admitted");

        System.out.println(
                "\nPayment successful."
        );

        System.out.println(
                "Admission confirmed."
        );
    }

    public void generateReceipt() {

        System.out.println(
                "\n----- PAYMENT RECEIPT -----"
        );

        System.out.println(
                "Payment ID      : " + paymentId
        );

        System.out.println(
                "Application ID  : "
                + application.getApplicationId()
        );

        System.out.println(
                "Applicant       : "
                + application.getApplicant().getName()
        );

        System.out.println(
                "Amount          : Rs. " + amount
        );

        System.out.println(
                "Payment Status  : " + paymentStatus
        );
    }
}