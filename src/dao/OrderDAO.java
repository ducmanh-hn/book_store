package dao;
import java.sql.Date;
import java.util.ArrayList;
import model.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author PC
 */
public class OrderDAO implements InterfaceDAO<Order>{
    public static OrderDAO getInstance(){
        return new OrderDAO();
    }
    
    @Override
    public int insert(Order t) {
        int check = -1;
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "INSERT INTO orders (Customer_id, CreateDate, TotalPrice, Payment, Delivery, Note)\n"+
                    "VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            pst.setInt(1, t.getCustomer_id());
            pst.setDate(2, t.getCreateDate());
            pst.setInt(3, t.getTotalPrice());
            pst.setString(4, t.getPayment());
            pst.setString(5, t.getDelivery());
            pst.setString(6, t.getNote());
            
            // step 4 : handle output
            check = pst.executeUpdate();
            
            // step 5 : close connection
            DBConnect.closeConnection(con);
                
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    @Override
    public int update(Order t) {
        int check = -1;
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "UPDATE orders \n"
                        +"SET Customer_id = ?, "
                        +"CreateDate = ?, "
                        +"TotalPrice = ?, "
                        +"Payment = ?, "
                        +"Delivery = ?, "
                        +"Note = ? \n"
                        +"Where Order_id = ? ;";
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            pst.setInt(1, t.getCustomer_id());
            pst.setDate(2, t.getCreateDate());
            pst.setInt(3, t.getTotalPrice());
            pst.setString(4, t.getPayment());
            pst.setString(5, t.getDelivery());
            pst.setString(6, t.getNote());
            pst.setInt(7, t.getOrder_id());
            
            // step 4 : handle output
            check = pst.executeUpdate();
            
            // step 5 : close connection
            DBConnect.closeConnection(con);
            
            return 0;      
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    @Override
    public int delete(Order t) {
        int check = -1;
//        try {
//            // step 1 : create connection
//            Connection con = DBConnect.getConnection();
//            
//            // step 2 : create statement
//            String sql = "DELETE FROM orders \n"
//                        +"Where Order_id = ? ;";
//            PreparedStatement pst = con.prepareStatement(sql);
//            
//            // step 3 : execute statement
//            pst.setInt(1, t.getOrder_id());
//
//            
//            // step 4 : handle output
//            check = pst.executeUpdate();
//            
//            // step 5 : close connection
//            DBConnect.closeConnection(con);
//               
//        } catch (SQLException ex) {
//            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return check;      
    }

    @Override
    public Order selectById(int id) {
        
        Order order = null;
        
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "Select * FROM orders WHERE Order_id = "+id;
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4 : handle output
            while(resultSet.next()){ 
                int order_id = resultSet.getInt("Order_id");
                int customer_id = resultSet.getInt("Customer_id");
                Date creatDate = resultSet.getDate("CreateDate");
                int totalPrice = resultSet.getInt("TotalPrice");
                String payment = resultSet.getString("Payment");
                String delivery = resultSet.getString("Delivery");
                String note = resultSet.getString("Note");
                order = new Order(order_id, customer_id, creatDate, totalPrice, payment, delivery, note);
            }
            // step 5 : close connection
            DBConnect.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return order;             
    }

    @Override
    public ArrayList<Order> selectAll() {
        
        ArrayList<Order> arrayList = new ArrayList<>();
        
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "Select * FROM orders ;";
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4 : handle output
            while(resultSet.next()){
                int order_id = resultSet.getInt("Order_id");
                int customer_id = resultSet.getInt("Customer_id");
                Date creatDate = resultSet.getDate("CreateDate");
                int totalPrice = resultSet.getInt("TotalPrice");
                String payment = resultSet.getString("Payment");
                String delivery = resultSet.getString("Delivery");
                String note = resultSet.getString("Note");
                Order order = new Order(order_id, customer_id, creatDate, totalPrice, payment, delivery, note);
                arrayList.add(order);
            }
            // step 5 : close connection
            DBConnect.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
    
    public ArrayList<Order> search(String info){
        ArrayList<Order> arrayList = new ArrayList<>();
        
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "select o.Order_id,o.Customer_id,o.CreateDate,o.TotalPrice,o.Payment,o.Delivery,o.Note\n"
                    +"from orders o inner join customer c on o.Customer_id = c.Customer_id\n"
                    +"where Order_id LIKE '%"+info+"%' or o.Customer_id LIKE '%"+info+"%' or Name LIKE '%"+info+"%';";
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4 : handle output
            while(resultSet.next()){
                int order_id = resultSet.getInt("Order_id");
                int customer_id = resultSet.getInt("Customer_id");
                Date creatDate = resultSet.getDate("CreateDate");
                int totalPrice = resultSet.getInt("TotalPrice");
                String payment = resultSet.getString("Payment");
                String delivery = resultSet.getString("Delivery");
                String note = resultSet.getString("Note");
                Order order = new Order(order_id, customer_id, creatDate, totalPrice, payment, delivery, note);
                arrayList.add(order);
            }
            // step 5 : close connection
            DBConnect.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
    
    public ArrayList<Order> filter(String isPayment, String isDelivery, String isMonth, String isYear){
        if(isPayment.equals("All")){
            isPayment="";
        }else{
            isPayment = " AND Payment = '" +isPayment+"'";
        }
        if(isDelivery.equals("All")){
            isDelivery="";
        }else{
            isDelivery = " AND Delivery = '" +isDelivery+"'";
        }
        if(isMonth.equals("All")){
            isMonth="";
        }else{
            isMonth = " AND month(CreateDate) = " +isMonth;
        }
        if(isYear.equals("All")){
            isYear="";
        }else{
            isYear = " AND year(CreateDate) = " +isYear;
        }
        ArrayList<Order> arrayList = new ArrayList<>();
        
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "SELECT * FROM orders WHERE Order_id > 0 "+isPayment+isDelivery+isMonth+isYear;
//            System.out.println(sql);
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4 : handle output
            while(resultSet.next()){
                int order_id = resultSet.getInt("Order_id");
                int customer_id = resultSet.getInt("Customer_id");
                Date creatDate = resultSet.getDate("CreateDate");
                int totalPrice = resultSet.getInt("TotalPrice");
                String payment = resultSet.getString("Payment");
                String delivery = resultSet.getString("Delivery");
                String note = resultSet.getString("Note");
                Order order = new Order(order_id, customer_id, creatDate, totalPrice, payment, delivery, note);
                arrayList.add(order);
            }
            // step 5 : close connection
            DBConnect.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }

}
