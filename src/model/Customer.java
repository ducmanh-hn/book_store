package model;

/**
 *
 * @author PC
 */
public class Customer {
    private int customer_id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    public Customer() {
    }

    public Customer(String name, String address, String phone, boolean status) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public Customer(int customer_id, String name, String address, String phone, boolean status) {
        this.customer_id = customer_id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" + "customer_id=" + customer_id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", status=" + status + '}';
    }
    public Object[] getToTable(){
        Object[] objects = new Object[5];
        objects[0] = customer_id;
        objects[1] = name;
        objects[2] = phone;
        objects[3] = address;
        objects[4] = status==true ?"Đang hoạt động" : "Ngưng hoạt động";
        return objects;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.customer_id;
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
        final Customer other = (Customer) obj;
        return this.customer_id == other.customer_id;
    }
    
    
    
    
}
