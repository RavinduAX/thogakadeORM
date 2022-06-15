package lk.ijse.thogakade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String oId;
    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderDetails;

    public Orders() {
    }

    public Orders(String oId, List<OrderDetail> orderDetails) {
        this.oId = oId;
        this.orderDetails = orderDetails;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
