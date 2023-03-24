package model;
import java.sql.Date;
/**
 *
 * @author PC
 */
public class Order {
    private int order_id;
    private int customer_id;
    private Date createDate;
    private int totalPrice;
    private String payment;
    private String delivery;
    private String note;

    public Order() {
    }

    public Order(int order_id, int customer_id, Date createDate, int totalPrice, String payment, String delivery, String note) {
        this.order_id = order_id;
        this.totalPrice = totalPrice;
        this.customer_id = customer_id;
        this.createDate = createDate;
        this.payment = payment;
        this.delivery = delivery;
        this.note = note;
    }
    
    public Order(int customer_id, Date createDate, int totalPrice, String payment, String delivery, String note) {
        this.totalPrice = totalPrice;
        this.customer_id = customer_id;
        this.createDate = createDate;
        this.payment = payment;
        this.delivery = delivery;
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
 
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", customer_id=" + customer_id + ", createDate=" + createDate + ", totalPrice=" + totalPrice + ", payment=" + payment + ", delivery=" + delivery + ", note=" + note + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.order_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        return this.order_id == other.order_id;
    }

    
    
    
    
}
