
package giaodien;


public class bai69 extends javax.swing.JFrame {

    /**
     * Creates new form bai69
     */
    public bai69() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        lblSoNguyenThuNhat = new javax.swing.JLabel();
        lblSoNguyenThuHai = new javax.swing.JLabel();
        lblKQ = new javax.swing.JLabel();
        btnTong = new javax.swing.JButton();
        txtSoNguyenThuNhat = new javax.swing.JTextField();
        txtSoNguyenThuHai = new javax.swing.JTextField();
        txtKQ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tổng 2 Số Nguyên");

        lblSoNguyenThuNhat.setText("Số Nguyên Thứ Nhất");

        lblSoNguyenThuHai.setText("Số Nguyên Thứ Hai");

        lblKQ.setText("Kết Quả");

        btnTong.setText("Tổng");
        btnTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongActionPerformed(evt);
            }
        });

        txtKQ.setEditable(false);

        jLabel1.setText("Tính Tổng Hai Số Nguyên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKQ)
                            .addComponent(lblSoNguyenThuHai)
                            .addComponent(lblSoNguyenThuNhat))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSoNguyenThuNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtSoNguyenThuHai)
                            .addComponent(txtKQ)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnTong))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoNguyenThuNhat)
                    .addComponent(txtSoNguyenThuNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoNguyenThuHai)
                    .addComponent(txtSoNguyenThuHai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKQ)
                    .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnTong)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnTongActionPerformed(java.awt.event.ActionEvent evt) {
        int SoNguyenThuNhat = Integer.parseInt(txtSoNguyenThuNhat.getText());
        int SoNguyenThuHai = Integer.parseInt(txtSoNguyenThuHai.getText());
        int KetQua = SoNguyenThuNhat+SoNguyenThuHai;
        txtKQ.setText(KetQua+" ");
         
    }

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bai69.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai69.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai69.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai69.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai69().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton btnTong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblKQ;
    private javax.swing.JLabel lblSoNguyenThuHai;
    private javax.swing.JLabel lblSoNguyenThuNhat;
    private javax.swing.JTextField txtKQ;
    private javax.swing.JTextField txtSoNguyenThuHai;
    private javax.swing.JTextField txtSoNguyenThuNhat;
    
}
