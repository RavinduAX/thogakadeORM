package lk.ijse.thogakade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private String custId;
    private String custName;

    public Customer() {
    }

    public Customer(String custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }
}
