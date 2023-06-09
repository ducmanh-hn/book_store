package view;

import controller.ScreenController;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        act();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ListJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel_san_pham = new javax.swing.JPanel();
        jLabel_san_pham = new javax.swing.JLabel();
        jPanel_hoa_don = new javax.swing.JPanel();
        jLabel_hoa_don = new javax.swing.JLabel();
        jPanel_khach_hang = new javax.swing.JPanel();
        jLabel_khach_hang = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton_exit = new javax.swing.JButton();
        jPanel_ban_hang = new javax.swing.JPanel();
        jLabel_ban_hang = new javax.swing.JLabel();
        JPanel_show = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý bán hàng");

        ListJPanel.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Books.png"))); // NOI18N
        jLabel1.setText("Book Store");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_san_pham.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_san_pham.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel_san_pham.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_san_pham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_san_pham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        jLabel_san_pham.setText("Sản phẩm");

        javax.swing.GroupLayout jPanel_san_phamLayout = new javax.swing.GroupLayout(jPanel_san_pham);
        jPanel_san_pham.setLayout(jPanel_san_phamLayout);
        jPanel_san_phamLayout.setHorizontalGroup(
            jPanel_san_phamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_san_pham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_san_phamLayout.setVerticalGroup(
            jPanel_san_phamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_san_pham, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel_hoa_don.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_hoa_don.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel_hoa_don.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_hoa_don.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_hoa_don.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Receipt.png"))); // NOI18N
        jLabel_hoa_don.setText("Hóa đơn");

        javax.swing.GroupLayout jPanel_hoa_donLayout = new javax.swing.GroupLayout(jPanel_hoa_don);
        jPanel_hoa_don.setLayout(jPanel_hoa_donLayout);
        jPanel_hoa_donLayout.setHorizontalGroup(
            jPanel_hoa_donLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_hoa_don, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_hoa_donLayout.setVerticalGroup(
            jPanel_hoa_donLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_hoa_don, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel_khach_hang.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_khach_hang.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel_khach_hang.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_khach_hang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_khach_hang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N
        jLabel_khach_hang.setText("Khách hàng");

        javax.swing.GroupLayout jPanel_khach_hangLayout = new javax.swing.GroupLayout(jPanel_khach_hang);
        jPanel_khach_hang.setLayout(jPanel_khach_hangLayout);
        jPanel_khach_hangLayout.setHorizontalGroup(
            jPanel_khach_hangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_khach_hang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_khach_hangLayout.setVerticalGroup(
            jPanel_khach_hangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_khach_hang, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jButton_exit.setBackground(new java.awt.Color(204, 204, 204));
        jButton_exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_exit.setForeground(new java.awt.Color(0, 0, 0));
        jButton_exit.setText("Exit");
        jButton_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_ban_hang.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_ban_hang.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_ban_hang.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel_ban_hang.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_ban_hang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ban_hang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart-icon.png"))); // NOI18N
        jLabel_ban_hang.setText("Bán hàng");

        javax.swing.GroupLayout jPanel_ban_hangLayout = new javax.swing.GroupLayout(jPanel_ban_hang);
        jPanel_ban_hang.setLayout(jPanel_ban_hangLayout);
        jPanel_ban_hangLayout.setHorizontalGroup(
            jPanel_ban_hangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_ban_hang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_ban_hangLayout.setVerticalGroup(
            jPanel_ban_hangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_ban_hang, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ListJPanelLayout = new javax.swing.GroupLayout(ListJPanel);
        ListJPanel.setLayout(ListJPanelLayout);
        ListJPanelLayout.setHorizontalGroup(
            ListJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_san_pham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_khach_hang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_hoa_don, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_ban_hang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ListJPanelLayout.setVerticalGroup(
            ListJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel_ban_hang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_san_pham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel_hoa_don, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_khach_hang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanel_showLayout = new javax.swing.GroupLayout(JPanel_show);
        JPanel_show.setLayout(JPanel_showLayout);
        JPanel_showLayout.setHorizontalGroup(
            JPanel_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
        );
        JPanel_showLayout.setVerticalGroup(
            JPanel_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ListJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanel_show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_exitMouseClicked
        int check = JOptionPane.showConfirmDialog(rootPane, "Exit App!");
        if(check ==0)
            System.exit(0);
    }//GEN-LAST:event_jButton_exitMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_show;
    private javax.swing.JPanel ListJPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_ban_hang;
    private javax.swing.JLabel jLabel_hoa_don;
    private javax.swing.JLabel jLabel_khach_hang;
    private javax.swing.JLabel jLabel_san_pham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_ban_hang;
    private javax.swing.JPanel jPanel_hoa_don;
    private javax.swing.JPanel jPanel_khach_hang;
    private javax.swing.JPanel jPanel_san_pham;
    // End of variables declaration//GEN-END:variables


    public void act(){
        changeJPanel(new JPanelSale());
        MouseListener sc = new ScreenController(this);
        jLabel_ban_hang.addMouseListener(sc);
        jLabel_hoa_don.addMouseListener(sc);
        jLabel_khach_hang.addMouseListener(sc);
        jLabel_san_pham.addMouseListener(sc);

    }
    public void changeScreen(JLabel jlabel){
        switch(jlabel.getText()){
            case "Bán hàng":
                changeJPanel(new JPanelSale());
                break;
            case "Sản phẩm":
                changeJPanel(new JPanelProduct());                
                break;
            case "Hóa đơn":
                changeJPanel(new JPanelOrder());
                break;
            case "Khách hàng":
                changeJPanel(new JPanelCustomer());
                break;
            default:
                changeJPanel(new JPanelOrder());
                break;
        }
    }
    public void changeJPanel(JPanel jPanel){
        JPanel_show.removeAll();
        JPanel_show.setLayout(new BorderLayout());
        JPanel_show.add(jPanel);
        JPanel_show.validate();
        JPanel_show.repaint();
    }
}
