package lk.ijse.thogakade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn
    private Item item;
    @ManyToOne
    @JoinColumn
    private Orders order;

    private int qty;

    public OrderDetail() {
    }

    public OrderDetail(String id, Item item, Orders order, int qty) {
        this.id = id;
        this.item = item;
        this.order = order;
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
