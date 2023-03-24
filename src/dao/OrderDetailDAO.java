package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OrderDetail;
import java.sql.ResultSet;
/**
 *
 * @author PC
 */
public class OrderDetailDAO implements InterfaceDAO<OrderDetail>{
    public static OrderDetailDAO getInstance(){
        return new OrderDetailDAO();
    }

    @Override
    public int insert(OrderDetail t) {
        int check = -1;
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "INSERT INTO orderdetail (OrderDetail_id, Order_id, Book_id, Quantity, Price, Total)\n"+
                    "VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            pst.setInt(1, t.getOrderDetail_id());
            pst.setInt(2, t.getOrder_id());
            pst.setInt(3, t.getBook_id());
            pst.setInt(4, t.getQuantity());
            pst.setInt(5, t.getPrice());
            pst.setInt(6, t.getTotal());
            
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
    public int update(OrderDetail t) {
        return 0;
    }

    @Override
    public int delete(OrderDetail t) {
        int check = -1;
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "DELETE FROM orderdetail where OrderDetail_id = ? ;";
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            pst.setInt(1, t.getOrderDetail_id());

            
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
    public OrderDetail selectById(int id) {
        OrderDetail orderDetail = null;
        
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "Select * FROM orders WHERE OrderDetail_id = "+id;
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4 : handle output
            while(resultSet.next()){
                int orderDetail_id = resultSet.getInt("OrderDetail_id");
                int order_id = resultSet.getInt("Order_id");
                int book_id = resultSet.getInt("Book_id");
                int quantity = resultSet.getInt("Quantity");
                int price = resultSet.getInt("Price");
                int total = resultSet.getInt("Total");
                orderDetail = new OrderDetail(orderDetail_id, order_id, book_id, quantity, price, total);
                
            }
            // step 5 : close connection
            DBConnect.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderDetail;
    }

    @Override
    public ArrayList<OrderDetail> selectAll() {
        ArrayList<OrderDetail> arr = new ArrayList<>();
        
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "Select * FROM orders";
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4 : handle output
            while(resultSet.next()){
                int orderDetail_id = resultSet.getInt("OrderDetail_id");
                int order_id = resultSet.getInt("Order_id");
                int book_id = resultSet.getInt("Book_id");
                int quantity = resultSet.getInt("Quantity");
                int price = resultSet.getInt("Price");
                int total = resultSet.getInt("Total");
                OrderDetail orderDetail = new OrderDetail(orderDetail_id, order_id, book_id, quantity, price, total);
                arr.add(orderDetail);
            }
            // step 5 : close connection
            DBConnect.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public int last_insert_id(){
        int id = -1;
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "SELECT Order_id FROM orders ORDER BY Order_id DESC LIMIT 1 ;";
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement

            
            // step 4 : handle output
            ResultSet resultSet = pst.executeQuery();
            while(resultSet.next()){
                id = resultSet.getInt("Order_id");
            }
            // step 5 : close connection
            DBConnect.closeConnection(con);
                
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public ArrayList<OrderDetail> select_by_order_id(int order_id){
        ArrayList<OrderDetail> arr = new ArrayList<>();
        
        try {
            // step 1 : create connection
            Connection con = DBConnect.getConnection();
            
            // step 2 : create statement
            String sql = "Select * FROM orderdetail where Order_id = "+order_id ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            // step 3 : execute statement
            ResultSet resultSet = pst.executeQuery();
            
            // step 4 : handle output
            while(resultSet.next()){
                int orderDetail_id = resultSet.getInt("OrderDetail_id");
//                int order_id = resultSet.getInt("Order_id");
                int book_id = resultSet.getInt("Book_id");
                int quantity = resultSet.getInt("Quantity");
                int price = resultSet.getInt("Price");
                int total = resultSet.getInt("Total");
                OrderDetail orderDetail = new OrderDetail(orderDetail_id, order_id, book_id, quantity, price, total);
                arr.add(orderDetail);
            }
            // step 5 : close connection
            DBConnect.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
}
