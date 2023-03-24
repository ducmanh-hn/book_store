package test;
import dao.OrderDAO;
import model.Order;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author PC
 */
public class TestOrderDAO {
    public static void main(String[] args) {
        Date date = Date.valueOf("2022-11-25");
        Order order1 = new Order( 1,7, date, 123, "x", "y", "y");
//        Order order2 = new Order( 2, date, 1000, "a", "b", "c");
//        Order order3 = new Order( 6, date, 1000, "a", "b", "c");
//        Order order4 = new Order( 4, date, 1000, "a", "b", "c");
//        OrderDAO.getInstance().insert(order1);
//        OrderDAO.getInstance().insert(order2);
//        OrderDAO.getInstance().insert(order3);
//        OrderDAO.getInstance().insert(order4);
//        OrderDAO.getInstance().update(order1);
        ArrayList<Order> arr = OrderDAO.getInstance().selectAll();
        for(Order order : arr){
            System.out.println(order);
        }
//        Order order2 = OrderDAO.getInstance().selectById(1);
//        System.out.println(order2);
//        ArrayList<Order> arr = OrderDAO.getInstance().selectAll();
//        for(Order order : arr){
//            OrderDAO.getInstance().delete(order);
//        }
        System.out.println(date.toLocalDate().getDayOfMonth());
        System.out.println(date.toLocalDate().getMonthValue());
        System.out.println(date.toLocalDate().getYear());

    }
}
