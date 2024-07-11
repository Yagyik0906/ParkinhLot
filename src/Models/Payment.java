package Models;

import java.util.Date;

public class Payment {

    private int paymentId;
    private long referenceNo;
    private double amount;
    private Mode mode;
    private Date currenDate;
    private PaymentStatus paymentStatus;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public long getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(long referenceNo) {
        this.referenceNo = referenceNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public Date getCurrenDate() {
        return currenDate;
    }

    public void setCurrenDate(Date currenDate) {
        this.currenDate = currenDate;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
