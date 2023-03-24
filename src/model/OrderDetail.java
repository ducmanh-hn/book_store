package model;

import dao.BookDAO;

/**
 *
 * @author PC
 */
public class OrderDetail {
    private int orderDetail_id;
    private int order_id;
    private int book_id;
    private int quantity;
    private int price;
    private int total;

    public OrderDetail() {
    }

    public OrderDetail(int orderDetail_id, int order_id, int book_id, int quantity, int price, int total) {
        this.orderDetail_id = orderDetail_id;
        this.order_id = order_id;
        this.book_id = book_id;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }
    
    public OrderDetail(int order_id, int book_id, int quantity, int price, int total) {
        this.order_id = order_id;
        this.book_id = book_id;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOrderDetail_id() {
        return orderDetail_id;
    }

    public void setOrderDetail_id(int orderDetail_id) {
        this.orderDetail_id = orderDetail_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "orderDetail_id=" + orderDetail_id + ", order_id=" + order_id + ", book_id=" + book_id + ", quantity=" + quantity + ", price=" + price + ", total=" + total + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.orderDetail_id;
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
        final OrderDetail other = (OrderDetail) obj;
        return this.orderDetail_id == other.orderDetail_id;
    }
    
    public Object [] getToTable(){
        Object[] objects = new Object[6];
        objects[0] = this.order_id;
        objects[1] = this.book_id;
        objects[2] = BookDAO.getInstance().selectById(this.book_id).getName();
        objects[3] = this.price +" 000 VND";
        objects[4] = this.quantity;
        objects[5] = this.total+" 000 VND";
        
        return objects;
    }
    
    
}

