package hotelcasestudy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class User_Checkout extends connect  {
      
   public User_Checkout() {
    
    initComponents();
    DoConnect();
    
    

 
}

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cardnum = new javax.swing.JTextField();
        seccode = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        billadd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(237, 234, 233));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(105, 73, 50));
        jLabel16.setText("Check Out");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cardnum.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        cardnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnumActionPerformed(evt);
            }
        });
        jPanel4.add(cardnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 255, -1));

        seccode.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        seccode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccodeActionPerformed(evt);
            }
        });
        jPanel4.add(seccode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 115, -1));

        pin.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel4.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 120, -1));

        billadd.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        billadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billaddActionPerformed(evt);
            }
        });
        jPanel4.add(billadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, -1));

        jButton1.setBackground(new java.awt.Color(134, 97, 72));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Complete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 140, 40));

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(105, 73, 50));
        jLabel20.setText("PIN");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(105, 73, 50));
        jLabel21.setText("Card Number");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(105, 73, 50));
        jLabel22.setText("Billing Address");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(105, 73, 50));
        jLabel23.setText("Security Code");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(105, 73, 50));
        jCheckBox1.setText("Cash Payment");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(318, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cardnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnumActionPerformed

    private void seccodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seccodeActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void billaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billaddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int resID = 1;
boolean emailExists = false;
newEmail = USER_login_screen.acc;
newcheckout = User_room_selection.co;
newcheckin = User_room_selection.ci;
newchild = (int) User_room_selection.chi.getValue();
newadult = (int) User_room_selection.adu.getValue();
int newroomid = User_room_selection.id;
int newtotal = User_room_selection.rm;
// newdate = new java.sql.Date(USER_booking.datetoday.getTime()); // okay i admit i fucked this up, i dont wanna change it too much so i'll leave this errored for now ~ jose
try {
    con.setAutoCommit(false);
    stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    rs = stmt.executeQuery("SELECT RESERVATION_ID FROM RESERVATIONS");
    HashSet<Integer> existingIds = new HashSet<>();
    while (rs.next()) {
        existingIds.add(rs.getInt("RESERVATION_ID"));
    }
    rs.close();
    while (existingIds.contains(resID)) {
        resID++;
    }
    rs = stmt.executeQuery("SELECT * FROM RESERVATIONS");
    rs.moveToInsertRow();
    rs.updateInt("RESERVATION_ID", resID);
    rs.updateString("USER_EMAIL", newEmail);
    rs.updateString("CHECKIN", newcheckin);
    rs.updateString("CHECKOUT", newcheckout);
    rs.updateString("STATUS", "payed");
    rs.updateInt("CHILDREN", newchild);
    rs.updateInt("ADULTS", newadult);
    rs.updateInt("ROOM_ID", newroomid);     
    rs.updateInt("TOTAL_PRICE", newtotal);           
    rs.updateDate("DATE_RES", newdate);
    rs.updateTimestamp("CREATED_ON", new Timestamp(System.currentTimeMillis()));
    rs.insertRow();
    con.commit();
    Refresh_RS_STMT();
    System.out.println("Reservation inserted with ID: " + resID);
    User_Checkout_complete userlogin = new User_Checkout_complete();
    this.setVisible(false);
    userlogin.setVisible(true);
} catch (SQLException e) {
    System.out.println("SQL Error: " + e);
    if (con != null) {
        try { con.rollback(); } catch (SQLException rollbackEx) {
            System.out.println("Rollback failed: " + rollbackEx);
        }
    }
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        // TODO add your handling code here:
        if (jCheckBox1.isSelected() == true) {
            cardnum.setText(null);
            seccode.setText(null);
            pin.setText(null);
            billadd.setText(null);
            cardnum.setEnabled(false);
            seccode.setEnabled(false);
            pin.setEnabled(false);
            billadd.setEnabled(false);
        }
        if (jCheckBox1.isSelected() == false) {
            cardnum.setEnabled(true);
            seccode.setEnabled(true);
            pin.setEnabled(true);
            billadd.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
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
                java.util.logging.Logger.getLogger(User_Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(User_Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(User_Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(User_Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                User_Checkout checkoutScreen = new User_Checkout();
                checkoutScreen.setVisible(true);
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(User_Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(User_Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(User_Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billadd;
    private javax.swing.JTextField cardnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField seccode;
    // End of variables declaration//GEN-END:variables
}
