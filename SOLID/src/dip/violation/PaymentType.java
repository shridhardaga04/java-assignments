package dip.violation;

public class PaymentType {

    private double amount;
    private String paymentMode;

    public PaymentType(double amount, String paymentMode) {
        this.amount = amount;
        this.paymentMode = paymentMode;
    }

    // if in future new payment mode introduce, need to modify below code
    public void processPayment(){
        if(paymentMode.equalsIgnoreCase("cash")){
            //no extra amount to add
        }
        else if(paymentMode.equalsIgnoreCase(("debit card"))){
            // some 2% extra amount to add
        }
        else if(paymentMode.equalsIgnoreCase(("credit card"))){
            // some 4% extra amount to add
        }
    }
}
