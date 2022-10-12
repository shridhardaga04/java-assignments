package dip.success;

import OCP.Success.DebitCard;
import OCP.Success.PaymentType;

public class DIPMain {
    public static void main(String[] args) {
        Payment pay = new Payment();
        PaymentType mode = new DebitCard(); // loosely coupled
        pay.paymentProcessing(mode); // depend upon abstraction
    }
}
