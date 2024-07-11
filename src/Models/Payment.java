package Models;

import java.util.Date;

public class Payment extends BaseModel {

    private String referenceId;
    private double amount;
    private Mode mode;
    private Date currenDate;
    private PaymentStatus paymentStatus;
    Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
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
