
package giaodien;


public class bai72a extends javax.swing.JFrame {

    /**
     * Creates new form bai72a
     */
   
    public bai72a() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtChiSoCu = new javax.swing.JTextField();
        txtChiSoMoi = new javax.swing.JTextField();
        txtTongSoDien = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnTinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tính tiền điện theo chỉ số đồng hồ");

        jLabel2.setText("Chỉ Số Cũ");

        jLabel3.setText("Chỉ Số Mới");

        jLabel4.setText("Tổng Số Điện");

        jLabel5.setText("Thành Tiền");

        txtTongSoDien.setEnabled(false);

        txtThanhTien.setEnabled(false);

        jLabel6.setText("VNĐ");

        btnTinh.setText("Tính");
        btnTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnTinh))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtChiSoCu)
                                    .addComponent(txtChiSoMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtTongSoDien)
                                    .addComponent(txtThanhTien))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtChiSoCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtChiSoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTongSoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnTinh)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnTinhActionPerformed(java.awt.event.ActionEvent evt) {
      int ChiSoCu = Integer.parseInt(txtChiSoCu.getText());
      int ChiSoMoi = Integer.parseInt(txtChiSoMoi.getText());
      float tongSoDien=ChiSoMoi-ChiSoCu;
      txtTongSoDien.setText(tongSoDien+" ");
     txtThanhTien.setText(TinhTien(tongSoDien)+" ");
    }//GEN-LAST:event_btnTinhActionPerformed
       private Float TinhTien(float tongSoDien)
       {
       float iTongSoDien = tongSoDien;
            float iThanhTien = 0f;
            
                if(iTongSoDien>300)
                {
                    iThanhTien+=(iTongSoDien-300)*4000;
                    iTongSoDien = 300;
                }
                if(iTongSoDien>200)
                {
                    iThanhTien+=(iTongSoDien-200)*2500;
                    iTongSoDien =200;        
                }
                if(iTongSoDien>100)
                {
                    iThanhTien+=(iTongSoDien -100)*2000;
                    iTongSoDien =100; 
                }
                if(iTongSoDien>50)
                {
                    iThanhTien+=(iTongSoDien-50)*1000;
                    iTongSoDien=50;
                }
                iThanhTien+=iTongSoDien*500;
                
               return iThanhTien;
    }        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bai72a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai72a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai72a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai72a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai72a().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton btnTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtChiSoCu;
    private javax.swing.JTextField txtChiSoMoi;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtTongSoDien;
    

    
}
