
package hotelcasestudy;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.*;

/**
 *
 * @author Asus
 */
public class ADMIN_usermanagement extends connect {
    DefaultTableModel tbModel=new DefaultTableModel();
    int x=0;
   
    public ADMIN_usermanagement() {
        initComponents();
        DoConnect();
        Select();
    }
    public void Select(){
        String [] columnsNames = {"FIRSTNAME","LASTNAME","EMAIL","PASSWORD","SEC_CODE","SEC_ANSWER"};
        tbModel.setColumnIdentifiers(columnsNames);
        try{
            while(rs.next()){
                i=rs.getString("FIRSTNAME");
                s=rs.getString("LASTNAME");
                n=rs.getString("EMAIL");
                u=rs.getString("PASSWORD");
                q=rs.getString("SEC_CODE");
                a=rs.getString("SEC_ANSWER");
                tbModel.addRow(new Object []{i,s,n,u,q,a});
                x++;
                        
            }
        }catch(SQLException err){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        emaill = new javax.swing.JLabel();
        rolee = new javax.swing.JLabel();
        statss = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        sec_sq = new javax.swing.JTextField();
        sec_a = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        return_btn911 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        user2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        user4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 64)); // NOI18N
        jLabel2.setText("U S E R  M A N A G E M E N T");

        emaill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emaill.setText("PASSWORD: ");

        rolee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rolee.setText("SEC_QUESTION: ");

        statss.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        statss.setText("SEC_A:");

        user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user.setText("FIRST NAME:");

        fname.setBackground(new java.awt.Color(217, 217, 217));

        pass.setBackground(new java.awt.Color(217, 217, 217));

        sec_sq.setBackground(new java.awt.Color(217, 217, 217));

        sec_a.setBackground(new java.awt.Color(217, 217, 217));
        sec_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_aActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("D E L E T E  U S E R");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(140, 100, 75));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1344, 70));

        jButton2.setBackground(new java.awt.Color(140, 100, 75));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Log Out");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        return_btn911.setBackground(new java.awt.Color(140, 100, 75));
        return_btn911.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        return_btn911.setForeground(new java.awt.Color(255, 255, 255));
        return_btn911.setText("Return to Dashboard");
        return_btn911.setBorder(null);
        return_btn911.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_btn911ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 1141, Short.MAX_VALUE)
                .addComponent(return_btn911)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(return_btn911))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("E D I T ");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("F I N D");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(217, 217, 217));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTable2.setModel(tbModel);
        jScrollPane1.setViewportView(jTable2);

        user2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user2.setText("EMAIL:");

        email.setBackground(new java.awt.Color(217, 217, 217));

        user4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user4.setText("LAST NAME :");

        lname.setBackground(new java.awt.Color(217, 217, 217));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(statss, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sec_a))
                            .addComponent(sec_sq, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rolee, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user4)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user2)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emaill)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rolee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sec_sq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statss)
                            .addComponent(sec_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
int e = jTable2.getSelectedRow();
DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
if (e >= 0) {
    String emailToDelete = ((String) model.getValueAt(e, 2)).trim().toLowerCase();
    System.out.println("Deleting email: '" + emailToDelete + "'");
    try {
        String sql = "DELETE FROM USERS WHERE LOWER(TRIM(EMAIL)) = ?";
        System.out.println("Executing SQL: " + sql + " with email: " + emailToDelete);
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, emailToDelete);
        int rowsAffected = pst.executeUpdate();
        System.out.println("Rows affected: " + rowsAffected);
        if (rowsAffected > 0) {
            model.removeRow(e);
            JOptionPane.showMessageDialog(null, "Deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "No matching email found in database.");
        }
        con.commit(); 
    } catch (SQLException a) {
        JOptionPane.showMessageDialog(null, "Database delete failed: " + a.getMessage());
        a.printStackTrace();
    }
} else {
    JOptionPane.showMessageDialog(null, "Please select a row to delete.");
}   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        USER_login_menu userloginmenu = new USER_login_menu();
        this.setVisible(false);
        userloginmenu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int e = jTable2.getSelectedRow();
if (e >= 0) {
    String fname1 = (String) jTable2.getValueAt(e, 0);  
    String lname1 = (String) jTable2.getValueAt(e, 1); 
    String email1 = (String) jTable2.getValueAt(e, 2);  
    String pass1 = (String) jTable2.getValueAt(e, 3);   
    String secsq1 = (String) jTable2.getValueAt(e, 4);  
    String seca1 = (String) jTable2.getValueAt(e, 5);   
    fname.setText(fname1);
    lname.setText(lname1);
    email.setText(email1);
    pass.setText(pass1);
    sec_sq.setText(secsq1);
    sec_a.setText(seca1);
    int option = JOptionPane.showConfirmDialog(null, new Object[] {
        "First Name:", fname,
        "Last Name:", lname,
        "Email:", email,
        "Password:", pass,
        "Security Code:", sec_sq,
        "Security Answer:", sec_a
    }, "Edit User", JOptionPane.OK_CANCEL_OPTION);
    if (option == JOptionPane.OK_OPTION) {
        String newFname = fname.getText().trim();
        String newLname = lname.getText().trim();
        String newEmail = email.getText().trim().toLowerCase();
        String newPass = pass.getText().trim();
        String newSecSq = sec_sq.getText().trim();
        String newSecA = sec_a.getText().trim();
        if (newFname.isEmpty() || newLname.isEmpty() || newEmail.isEmpty() || newPass.isEmpty() || newSecSq.isEmpty() || newSecA.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out.");
            return;
        }
        try {
            String sql = "UPDATE USERS SET FIRSTNAME = ?, LASTNAME = ?, EMAIL = ?, PASSWORD = ?, SEC_CODE = ?, SEC_ANSWER = ? WHERE LOWER(TRIM(EMAIL)) = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, newFname);
            pst.setString(2, newLname);
            pst.setString(3, newEmail);
            pst.setString(4, newPass);
            pst.setString(5, newSecSq);
            pst.setString(6, newSecA);
            pst.setString(7, email1.toLowerCase().trim());
            int rowsAffected = pst.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            if (rowsAffected > 0) {
                jTable2.setValueAt(newFname, e, 0);
                jTable2.setValueAt(newLname, e, 1);
                jTable2.setValueAt(newEmail, e, 2);
                jTable2.setValueAt(newPass, e, 3);
                jTable2.setValueAt(newSecSq, e, 4);
                jTable2.setValueAt(newSecA, e, 5);
                JOptionPane.showMessageDialog(null, "Updated successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "No matching email found in the database.");
            }
            con.commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error updating database: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
} else {
    JOptionPane.showMessageDialog(null, "Please select a row to edit.");
}






    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
TableRowSorter<DefaultTableModel>obj=new TableRowSorter<>(model);
jTable2.setRowSorter(obj);
obj.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void return_btn911ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_btn911ActionPerformed
        ADMIN_Dashboard admindashboard = new ADMIN_Dashboard();
        this.dispose();
        admindashboard.setVisible(true);
    }//GEN-LAST:event_return_btn911ActionPerformed

    private void sec_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sec_aActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
     DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
TableRowSorter<DefaultTableModel>obj=new TableRowSorter<>(model);
jTable2.setRowSorter(obj);
obj.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));
    }//GEN-LAST:event_jTextField1KeyReleased

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN_usermanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(() -> {
            new ADMIN_usermanagement().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel emaill;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField pass;
    private javax.swing.JButton return_btn911;
    private javax.swing.JLabel rolee;
    private javax.swing.JTextField sec_a;
    private javax.swing.JTextField sec_sq;
    private javax.swing.JLabel statss;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user2;
    private javax.swing.JLabel user4;
    // End of variables declaration//GEN-END:variables
}
