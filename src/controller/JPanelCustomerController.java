package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.JPanelCustomer;

/**
 *
 * @author PC
 */
public class JPanelCustomerController implements ActionListener, ChangeListener,MouseListener{
    private JPanelCustomer jPanelCustomer;

    public JPanelCustomerController(JPanelCustomer jPanelCustomer) {
        this.jPanelCustomer = jPanelCustomer;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if(src.equals("Thêm")){
            this.jPanelCustomer.insert();
        }
        if(src.equals("Sửa")){
            this.jPanelCustomer.update();  
        }
        if(src.equals("Save")){
            int check = JOptionPane.showConfirmDialog(this.jPanelCustomer, "Lưu chỉnh sửa!");
            if(check == 0)
                this.jPanelCustomer.save();
        }
        if(src.equals("Làm mới")){
            this.jPanelCustomer.reset();
        }
        if(src.equals("Xóa"  )){
            int check = JOptionPane.showConfirmDialog(this.jPanelCustomer, "Bạn có chắc muốn xóa không!");
            if(check == 0)
                this.jPanelCustomer.delete();
        }
        if(src.equals("Tìm kiếm")){
            this.jPanelCustomer.search();
            
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        this.jPanelCustomer.filter();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println(e.getClickCount());
        if(e.getClickCount() == 2){
            this.jPanelCustomer.select_history();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }


    
}
