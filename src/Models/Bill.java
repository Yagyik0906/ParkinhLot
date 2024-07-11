package Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    Ticket token;
    private double amount;
    private Gate exitGate;
    private BillStatus billStatus;
    List<Payment> paymentMethods;

    public Ticket getToken() {
        return token;
    }

    public void setToken(Ticket token) {
        this.token = token;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payment> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<Payment> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
