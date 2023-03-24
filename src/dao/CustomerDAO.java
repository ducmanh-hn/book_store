package dao;

import java.util.ArrayList;
import model.Customer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author PC
 */
public class CustomerDAO implements InterfaceDAO<Customer>{

    public static CustomerDAO getInstance(){
        return new CustomerDAO();
    }
    @Override
    public int insert(Customer t) {
        int check = -1;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "Insert into customer(Name,Address,Phone,Status)\nValues (?,?,?,?);";
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, t.getName());
            pst.setString(2, t.getAddress());
            pst.setString(3, t.getPhone());
            pst.setBoolean(4, t.isStatus());

            
            // step 3: execute statement
            check = pst.executeUpdate();
            
            // step 4: handle output;
            System.out.println("check");
            
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
//            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Primary key");
        }
        return check;
    }

    @Override
    public int update(Customer t) {
        int check = -1;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "UPDATE customer\n"
                        +"SET Name = ? ,"
                        +"Address = ? ,"
                        +"Phone = ? ,"
                        +"Status = ?"
                        +"\nWHERE Customer_id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, t.getName());
            pst.setString(2, t.getAddress());
            pst.setString(3, t.getPhone());
            pst.setBoolean(4, t.isStatus());
            pst.setInt(5, t.getCustomer_id());

            
            // step 3: execute statement
            check = pst.executeUpdate();
            
            // step 4: handle output;
            System.out.println("check");
            
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    @Override
    public int delete(Customer t) {
        int check = -1;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "DELETE FROM customer\n"
                        +"WHERE Customer_id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, t.getCustomer_id());

            
            // step 3: execute statement
            check = pst.executeUpdate();
            
            // step 4: handle output;
            System.out.println("check");
            
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    @Override
    public Customer selectById(int id) {
        Customer customer=null;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "SELECT * FROM customer WHERE Customer_id = ? ";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, id);

            
            // step 3: execute statement

            ResultSet resultSet = pst.executeQuery();


            // step 4: handle output;
            while(resultSet.next()){
                int Customer_id = resultSet.getInt("Customer_id");
                String Name = resultSet.getString("Name");
                String Address = resultSet.getString("Address");
                String Phone = resultSet.getString("Phone");
                Boolean Status = resultSet.getBoolean("Status");

                customer = new Customer(Customer_id, Name, Address, Phone, Status);
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    }

    @Override
    public ArrayList<Customer> selectAll() {
        ArrayList<Customer> CustomerList = new ArrayList<>();
        Customer customer=null;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "SELECT * FROM customer";

            PreparedStatement pst = connection.prepareStatement(sql);         

            
            // step 3: execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4: handle output;
            while(resultSet.next()){
                int Customer_id = resultSet.getInt("Customer_id");
                String Name = resultSet.getString("Name");
                String Address = resultSet.getString("Address");
                String Phone = resultSet.getString("Phone");
                Boolean Status = resultSet.getBoolean("Status");

                customer = new Customer(Customer_id, Name, Address, Phone, Status);
                CustomerList.add(customer);
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CustomerList;
    }
    
    
    public ArrayList<Customer> search(String str){
        ArrayList<Customer> CustomerList = new ArrayList<>();
        Customer customer=null;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "SELECT * FROM customer WHERE Customer_id Like '%"+str+"%' OR Name LIKE '%"+str+"%' OR Address LIKE '%"+str+"%'";

            PreparedStatement pst = connection.prepareStatement(sql);         

            
            // step 3: execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4: handle output;
            while(resultSet.next()){
                int Customer_id = resultSet.getInt("Customer_id");
                String Name = resultSet.getString("Name");
                String Address = resultSet.getString("Address");
                String Phone = resultSet.getString("Phone");
                Boolean Status = resultSet.getBoolean("Status");

                customer = new Customer(Customer_id, Name, Address, Phone, Status);
                CustomerList.add(customer);
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CustomerList;
    }
    
    public ArrayList<Customer> filter(String bool){
        ArrayList<Customer> CustomerList = new ArrayList<>();
        Customer customer=null;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "SELECT * FROM customer WHERE Status = "+bool ;

            PreparedStatement pst = connection.prepareStatement(sql);         

            
            // step 3: execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4: handle output;
            while(resultSet.next()){
                int Customer_id = resultSet.getInt("Customer_id");
                String Name = resultSet.getString("Name");
                String Address = resultSet.getString("Address");
                String Phone = resultSet.getString("Phone");
                Boolean Status = resultSet.getBoolean("Status");

                customer = new Customer(Customer_id, Name, Address, Phone, Status);
                CustomerList.add(customer);
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CustomerList;
    }
    public ArrayList<Object [] > select_history(String customer_id){
        ArrayList<Object[]> history = new ArrayList<>();
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "select o.Order_id, c.Name, c.Phone, o.CreateDate, b.Name as book_name, od.Quantity, od.Price, od.Total\n" +
                        "from orderdetail od inner join orders o on od.Order_id = o.Order_id\n" +
                                            "inner join customer c on o.Customer_id = c.Customer_id\n" +
                                            "inner join book b on od.Book_id = b.Book_id\n" +
                        "where c.Customer_id= "+customer_id ;

            PreparedStatement pst = connection.prepareStatement(sql);         

            
            // step 3: execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4: handle output;
            while(resultSet.next()){
                Object [] sub = new Object [8];
                sub[0] = resultSet.getObject("Order_id");
                sub[1] = resultSet.getObject("Name");
                sub[2] = resultSet.getObject("Phone");
                sub[3] = resultSet.getObject("CreateDate");
                sub[4] = resultSet.getObject("book_name");
                sub[5] = resultSet.getObject("Quantity");
                sub[6] = resultSet.getObject("Price");
                sub[7] = resultSet.getObject("Total");
                
                history.add(sub);
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return history;
    }
    
}
