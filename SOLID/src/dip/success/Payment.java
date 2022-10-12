package dip.success;

import OCP.Success.PaymentType;

public class Payment {

    //dip
    public void paymentProcessing(PaymentType paymentType){
        paymentType.processPayment();
    }
}
