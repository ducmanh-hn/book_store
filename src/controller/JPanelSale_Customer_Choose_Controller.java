package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.JPanelSale_Customer_Choose;
/**
 *
 * @author PC
 */
public class JPanelSale_Customer_Choose_Controller implements ActionListener{
    private JPanelSale_Customer_Choose jPanelSale_Customer_Choose;
    
    public JPanelSale_Customer_Choose_Controller(JPanelSale_Customer_Choose j){
        this.jPanelSale_Customer_Choose = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Chọn")){
            this.jPanelSale_Customer_Choose.select();
            this.jPanelSale_Customer_Choose.setCustomer();
            this.jPanelSale_Customer_Choose.setVisible(false);
        }
        if(src.equals("Thêm")){
            this.jPanelSale_Customer_Choose.add();
        }
        if(src.equals("Tìm kiếm")){
            this.jPanelSale_Customer_Choose.search();
        }
    }
    
}
