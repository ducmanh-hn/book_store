package controller;

import dao.OrderDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.JPanelOrder;

/**
 *
 * @author PC
 */
public class JPanelOrderController implements ActionListener, ChangeListener{
    private JPanelOrder jPanelOrder;
    
    public JPanelOrderController(JPanelOrder jPanelOrder){
        this.jPanelOrder = jPanelOrder;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("All")){
            this.jPanelOrder.table_order(OrderDAO.getInstance().selectAll());
        }
        if(src.equals("Hóa đơn chi tiết")){
            this.jPanelOrder.select_orderDetail();
        }
        if(src.equals("Tìm kiếm")){
            this.jPanelOrder.search();
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        this.jPanelOrder.filter();
    }
    
}
