/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

/**
 *
 * @author Sajith Reshan
 */
public class Supplier_Registration extends javax.swing.JFrame {

    /**
     * Creates new form cusomer_registration
     */
    public Supplier_Registration() {
        initComponents();
            
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        rfemale = new javax.swing.JRadioButton();
        rmale = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(1376, 1259));
        jPanel1.setPreferredSize(new java.awt.Dimension(1386, 1414));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Supplier Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("NIC                        :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 210, 32));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Last Name             :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 210, 29));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Adress                  :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 440, 210, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Email                  :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 200, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Contact Number   :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 390, 210, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 244, 32));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 244, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 244, 33));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 190, 30));

        jButton1.setText("Cancel");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, 140, 63));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 150, 63));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 152, 63));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 244, 33));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 630, 100, 110));

        rfemale.setText("Female");
        rfemale.setOpaque(false);
        jPanel1.add(rfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, -1, -1));

        rmale.setText("Male");
        rmale.setOpaque(false);
        jPanel1.add(rmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setText("Gender               :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 200, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Hiline.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 610, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/18032.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    String Gender="";
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
                 //making of variables
            if (rmale.isSelected()) {
                Gender="1";
            }if (rfemale.isSelected()) {
                Gender="2";
            }
            String password = String.valueOf(Tpass.getPassword());
            String accountStatus="active";
            String userRole="admin";
            String userName =Tusername.getText();
            String adress[] =Tadress.getText().split(",");
            String email = Temail.getText();
            String picPath="abc/123";
            String JoinedTime="2015-2-3 5:40:11";
       
            //making foreighn key variables
            String FRpassid="";
            String FRaccountstatusid="";
            String FRroleid="";
            String FRusernameid="";
            String FRGender="";
            String FRemeil="";
            String FRadress="";
            String FRpic="";
           //Saving the values to DB
            
            Model.queries.subssave("user_account_status","USER_ACCOUNT_STATUS_STATUS",accountStatus);
            Model.queries.subssave("user_role","USER_ROLE_TYPE",userRole);
            Model.queries.subssave("gender","GENDER_TYPE",Gender);
            Model.queries.subssave("user_password","USER_PASSWORD_POWESWORD",password);
            
            Model.queries.AdressSave("address",adress);
            Model.queries.subssave("email","EMAIL_MAIL",email);
            Model.queries.subssave("picture","PICTURE_PATH" ,picPath);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supplier_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rmale;
    // End of variables declaration//GEN-END:variables
}
