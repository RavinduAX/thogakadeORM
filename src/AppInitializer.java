import lk.ijse.thogakade.entity.Customer;
import lk.ijse.thogakade.entity.Item;
import lk.ijse.thogakade.entity.OrderDetail;
import lk.ijse.thogakade.entity.Orders;
import lk.ijse.thogakade.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setCustId("C001");
        c1.setCustName("Amal");

        Customer c2 = new Customer();
        c2.setCustId("C002");
        c2.setCustName("Nimal");

        Customer c3 = new Customer();
        c3.setCustId("C003");
        c3.setCustName("Bandara");

        Item i1 = new Item();
        i1.setCode("I001");

        Item i2 = new Item();
        i2.setCode("I002");

        Item i3 = new Item();
        i3.setCode("I003");

        Orders o1 = new Orders();
        o1.setoId("O001");

        Orders o2 = new Orders();
        o2.setoId("O002");

        OrderDetail od1 = new OrderDetail();
        od1.setId("OD001");
        od1.setItem(i1);
        od1.setOrder(o1);
        od1.setQty(5);

        OrderDetail od2 = new OrderDetail();
        od2.setId("OD002");
        od2.setItem(i2);
        od2.setOrder(o1);
        od2.setQty(2);

        OrderDetail od3 = new OrderDetail();
        od3.setId("OD003");
        od3.setItem(i3);
        od3.setOrder(o2);
        od3.setQty(8);

        ArrayList<OrderDetail> odList = new ArrayList<>();
        odList.add(od1);
        odList.add(od2);
        odList.add(od3);

        i1.setOrderDetails(odList);
        i2.setOrderDetails(odList);
        i3.setOrderDetails(odList);

        o1.setOrderDetails(odList);
        i2.setOrderDetails(odList);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(c1);
        session.save(c2);

        session.save(i1);
        session.save(i2);
        session.save(i3);

        session.save(o1);
        session.save(o2);

        session.save(od1);
        session.save(od2);
        session.save(od3);

        session.save(c3);
        session.update(c3);

        Customer c = session.get(Customer.class, "C001");
        System.out.println(c.getCustId()+c.getCustName());

        Customer c4 = session.get(Customer.class, "C003");
        session.delete(c4);

        transaction.commit();
        session.close();

    }
}
