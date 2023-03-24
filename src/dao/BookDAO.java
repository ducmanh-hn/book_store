package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;


/**
 *
 * @author PC
 */
public class BookDAO implements InterfaceDAO<Book>{
    public static BookDAO getInstance(){
        return new BookDAO();
    }
    @Override
    public int insert(Book t) {
        int check = -1;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "Insert into book(Name, Author, Price, Amount, Status)\nValues (?,?,?,?,?);";
            PreparedStatement pst = connection.prepareStatement(sql);
            
//            pst.setInt(1, t.getBook_id());
            pst.setString(1, t.getName());
            pst.setString(2, t.getAuthor());
            pst.setInt(3, t.getPrice());
            pst.setInt(4, t.getAmount());
            pst.setBoolean(5, t.isStatus());

            
            // step 3: execute statement
            check = pst.executeUpdate();
            
            // step 4: handle output;
//            System.out.println(check);
            
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    @Override
    public int update(Book t) {
        int check = -1;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "UPDATE book\n"
                        +"SET Name = ? ,"
                        +"Author = ? ,"
                        +"Price = ? ,"
                        +"Amount = ? ,"
                        +"Status = ?"
                        +"\nWHERE Book_id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            
//            pst.setInt(1, t.getBook_id());
            pst.setString(1, t.getName());
            pst.setString(2, t.getAuthor());
            pst.setInt(3, t.getPrice());
            pst.setInt(4, t.getAmount());
            pst.setBoolean(5, t.isStatus());
            pst.setInt(6, t.getBook_id());

            
            // step 3: execute statement
            check = pst.executeUpdate();
            
            // step 4: handle output;
//            System.out.println("check");
            
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    @Override
    public int delete(Book t) {
        int check = -1;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "DELETE FROM book\n"
                        +"WHERE Book_id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, t.getBook_id());

            
            // step 3: execute statement
            check = pst.executeUpdate();
            
            // step 4: handle output;
//            System.out.println("check");
            
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    @Override
    public Book selectById(int id) {
        Book book = null;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "SELECT * FROM book WHERE Book_id = ? ";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, id);

            
            // step 3: execute statement

            ResultSet resultSet = pst.executeQuery();


            // step 4: handle output;
            while(resultSet.next()){
                int Book_id = resultSet.getInt("Book_id");
                String Name = resultSet.getString("Name");
                String Author = resultSet.getString("Author");
                int Price = resultSet.getInt("Price");
                int Amount = resultSet.getInt("Amount");
                Boolean Status = resultSet.getBoolean("Status");

                book = new Book(Book_id, Name, Author, Price, Amount, Status);
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    @Override
    public ArrayList<Book> selectAll() {
        ArrayList<Book> BookList = new ArrayList<>();
        Book book = null;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "SELECT * FROM book ";
            
            PreparedStatement pst = connection.prepareStatement(sql);

            
            // step 3: execute statement

            ResultSet resultSet = pst.executeQuery();


            // step 4: handle output;
            while(resultSet.next()){
                int Book_id = resultSet.getInt("Book_id");
                String Name = resultSet.getString("Name");
                String Author = resultSet.getString("Author");
                int Price = resultSet.getInt("Price");
                int Amount = resultSet.getInt("Amount");
                Boolean Status = resultSet.getBoolean("Status");

                book = new Book(Book_id, Name, Author, Price, Amount, Status);
                BookList.add(book);
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return BookList;
    }
    
    public ArrayList<Book> search(String str) {
        ArrayList<Book> BookList = new ArrayList<>();
        Book book = null;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "SELECT * FROM book WHERE Book_id LIKE '%"+str+"%' OR Name LIKE '%"+str+"%' OR Author LIKE '%"+str+"%'";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            

            
            // step 3: execute statement

            ResultSet resultSet = pst.executeQuery();


            // step 4: handle output;
            while(resultSet.next()){
                int Book_id = resultSet.getInt("Book_id");
                String Name = resultSet.getString("Name");
                String Author = resultSet.getString("Author");
                int Price = resultSet.getInt("Price");
                int Amount = resultSet.getInt("Amount");
                Boolean Status = resultSet.getBoolean("Status");

                book = new Book(Book_id, Name, Author, Price, Amount, Status);
                BookList.add(book);
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return BookList;
    }
    
    public ArrayList<Book> filter(int from, int to) {
        ArrayList<Book> BookList = new ArrayList<>();
        Book book = null;
        try {
            // step 1: create connection
            Connection connection = DBConnect.getConnection();
            
            // step 2: create statement
            String sql = "SELECT * FROM book WHERE Price BETWEEN ? AND ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, from);
            pst.setInt(2, to);

            
            // step 3: execute statement

            ResultSet resultSet = pst.executeQuery();


            // step 4: handle output;

            while(resultSet.next()){
                int Book_id = resultSet.getInt("Book_id");
                String Name = resultSet.getString("Name");
                String Author = resultSet.getString("Author");
                int Price = resultSet.getInt("Price");
                int Amount = resultSet.getInt("Amount");
                Boolean Status = resultSet.getBoolean("Status");

                book = new Book(Book_id, Name, Author, Price, Amount, Status);
                BookList.add(book);
                
            }
            // step 5: close connection
            DBConnect.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return BookList;
    }
    
}
