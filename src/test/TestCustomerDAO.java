package test;
import dao.CustomerDAO;
import java.util.ArrayList;
import model.Customer;
/**
 *
 * @author PC
 */
public class TestCustomerDAO {
    public static void main(String[] args) {
//        Customer cus1 = new Customer(0, "Kevin DE Bruyne", "Belgium", "0987506867", true);
//        Customer cus2 = new Customer(1, "Emeric Laport", "Portugal", "0987654321", true);
//        Customer cus3 = new Customer(2, "Phil Foden", "England", "0981234567", true);
//        Customer cus4 = new Customer(3, "Ederson", "Brazil", "0967853421", true);
//        Customer cus5 = new Customer(4, "Bernardo", "Portugal", "0897564321", true);
//        Customer cus6 = new Customer(5, "Pep", "Spain", "0987506867", true);
//
//        CustomerDAO.getInstance().insert(cus1);
//        CustomerDAO.getInstance().insert(cus2);
//        CustomerDAO.getInstance().insert(cus3);
//        CustomerDAO.getInstance().insert(cus4);
//        CustomerDAO.getInstance().insert(cus5);
//        CustomerDAO.getInstance().insert(cus6);

//        Customer cus = CustomerDAO.getInstance().selectById(5);
//        System.out.println(cus);
//        Customer cus3 = new Customer(0, "Alvalres", "England", "0981234567", true);
//        CustomerDAO.getInstance().insert(cus3);
//        CustomerDAO.getInstance().update(cus3);
//        CustomerDAO.getInstance().delete(cus3);
//        ArrayList<Customer> arr = CustomerDAO.getInstance().selectAll();
//        for(Customer c : arr){
//            System.out.println(c);
//        }
        for(Object[] objects : CustomerDAO.getInstance().select_history("12")){
            System.out.println(objects[0]);
            System.out.println(objects[1]);
        }
        
    }
}
