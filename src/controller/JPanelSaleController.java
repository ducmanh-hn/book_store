package controller;

import dao.OrderDetailDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.JPanelSale;
import view.JPanelSale_Customer_Choose;

/**
 *
 * @author PC
 */
public class JPanelSaleController implements ActionListener{
    private JPanelSale jPanelSale;
    
    public JPanelSaleController(JPanelSale jPanelSale){
        this.jPanelSale = jPanelSale;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        
        if(src.equals("Thêm sản phẩm") && this.jPanelSale.isSelected_table_product_list()){
            try{                
                String amount_string = JOptionPane.showInputDialog("Số lượng :");
                boolean check = true;
                for(int i=0;i<amount_string.length();i++){
                    if(amount_string.charAt(i)<'0' || amount_string.charAt(i)>'9'){
                        check =false;
                    }
                }
                if(check){
                    int amount = Integer.valueOf(amount_string);
                    this.jPanelSale.add_product(amount);
                }
            }catch(java.lang.NullPointerException npe){
                
            }
        }
        if(src.equals("Tìm kiếm")){
            this.jPanelSale.search();
        }
        if(src.equals("Xóa đơn hàng") && this.jPanelSale.isSelected_table_cart()){
            
            int check = JOptionPane.showConfirmDialog(jPanelSale, "Bạn có chắc muốn xóa!");
            if(check==0)
                this.jPanelSale.delete();
        }
        if(src.equals("Làm mới giỏ hàng")&& this.jPanelSale.isSelected_table_cart()){
            int check = JOptionPane.showConfirmDialog(jPanelSale, "Xóa tất cả giỏ hàng!");
            if(check==0)
                this.jPanelSale.reset();
        }
        if(src.equals("Khách hàng")){
            JPanelSale_Customer_Choose jPanelSale_Customer_Choose = new JPanelSale_Customer_Choose(this.jPanelSale);
            jPanelSale_Customer_Choose.setVisible(true);
        }
        if(src.equals("Thanh toán")){
            int check = JOptionPane.showConfirmDialog(jPanelSale, "Xác nhận thanh toán!");
            if(check == 0){
                if(this.jPanelSale.ThanhToan());
                    JOptionPane.showMessageDialog(jPanelSale, "Thanh toán thành công");
                    this.jPanelSale.reset();
//                    System.out.println(OrderDetailDAO.getInstance().last_insert_id());
            }
        }
        
    }
    
}
