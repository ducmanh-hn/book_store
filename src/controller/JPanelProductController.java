package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import view.JPanelProduct;
/**
 *
 * @author PC
 */
public class JPanelProductController implements ActionListener{
    private JPanelProduct jPannelProduct;
    public JPanelProductController(JPanelProduct j){
        this.jPannelProduct   =  j;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Thêm")){
            this.jPannelProduct.insert();
        }
        if(src.equals("Tìm kiếm")){
            this.jPannelProduct.search();
        }
        if(src.equals("Lọc theo giá")){
            this.jPannelProduct.filter();
        }
        if(src.equals("Sửa")){
            this.jPannelProduct.update();
        }
        if(src.equals("Save")){
            int check = JOptionPane.showConfirmDialog(this.jPannelProduct, "Lưu chỉnh sửa!");
            if(check == 0){
                this.jPannelProduct.save();
            }        
        }
        if(src.equals("Xóa")){
            int check = JOptionPane.showConfirmDialog(this.jPannelProduct, "Bạn có chắc muốn xóa!");
            if(check == 0){
                this.jPannelProduct.delete();
            }  
        }
        if(src.equals("Làm mới")){
            this.jPannelProduct.reset();
        }
    }


    
}
