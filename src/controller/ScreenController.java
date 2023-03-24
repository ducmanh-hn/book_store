package controller;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import view.View;

/**
 *
 * @author PC
 */
public class ScreenController implements MouseListener{
    private View view;
    
    public ScreenController(View v){
        this.view = v;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel jLabel = (JLabel) e.getSource();
        this.view.changeScreen(jLabel);
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
