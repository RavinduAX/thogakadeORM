package lk.ijse.thogakade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Item {
    @Id
    private String code;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    public Item() {
    }

    public Item(String code, List<OrderDetail> orderDetails) {
        this.code = code;
        this.orderDetails = orderDetails;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
