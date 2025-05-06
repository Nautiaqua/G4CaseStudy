
package hotelcasestudy;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Asus
 */
public class ADMIN_usermanagement extends connect {
    DefaultTableModel tbModel = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
        return false; 
    }
};
    int x=0;
   
    public ADMIN_usermanagement() {
        initComponents();
        DoConnect();
        Select();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/images/LOGO_favicon.png")));
        
        if ("What is your favorite thing?".equals(secquesbox.getSelectedItem().toString())) {
            System.out.println("OWRKING");
            sec_sq.setText("What is your favorite thing?");
        }
        if ("What is your mother's maiden name?".equals(secquesbox.getSelectedItem().toString())) {
            System.out.println("OWRKING");
            sec_sq.setText("What is your mother's maiden name?");
        }
        if ("Where did you graduate (high school / college)?".equals(secquesbox.getSelectedItem().toString())) {
            System.out.println("OWRKING");
            sec_sq.setText("Where did you graduate (high school / college)?");
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        user1 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        user3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        user2 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        user4 = new javax.swing.JLabel();
        sec_sq = new javax.swing.JTextField();
        secquesbox = new javax.swing.JComboBox<>();
        user5 = new javax.swing.JLabel();
        sec_a = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        logout_btn2 = new javax.swing.JButton();
        return_btn913 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(237, 234, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(105, 73, 50));
        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(105, 73, 50));
        jLabel10.setText("User Management");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 330, -1));

        user.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(105, 73, 50));
        user.setText("Security Question Answer:");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 240, 20));

        fname.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 20));

        user1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user1.setForeground(new java.awt.Color(105, 73, 50));
        user1.setText("First Name:");
        jPanel1.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 155, 20));

        lname.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 20));

        user3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user3.setForeground(new java.awt.Color(105, 73, 50));
        user3.setText("Last Name:");
        jPanel1.add(user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 155, 20));

        email.setBackground(new java.awt.Color(217, 217, 217));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, 20));

        user2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user2.setForeground(new java.awt.Color(105, 73, 50));
        user2.setText("Email:");
        jPanel1.add(user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 155, 20));

        pass.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 150, 20));

        user4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user4.setForeground(new java.awt.Color(105, 73, 50));
        user4.setText("Password:");
        jPanel1.add(user4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 155, 20));

        sec_sq.setBackground(new java.awt.Color(237, 234, 233));
        sec_sq.setForeground(new java.awt.Color(237, 234, 233));
        sec_sq.setBorder(null);
        sec_sq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_sqActionPerformed(evt);
            }
        });
        jPanel1.add(sec_sq, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 310, 50));

        secquesbox.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        secquesbox.setForeground(new java.awt.Color(105, 73, 50));
        secquesbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favorite thing?", "What is your mother's maiden name?", "Where did you graduate (high school / college)?" }));
        secquesbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secquesboxItemStateChanged(evt);
            }
        });
        secquesbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secquesboxActionPerformed(evt);
            }
        });
        jPanel1.add(secquesbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 320, 20));

        user5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user5.setForeground(new java.awt.Color(105, 73, 50));
        user5.setText("Security Question:");
        jPanel1.add(user5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 155, 20));

        sec_a.setBackground(new java.awt.Color(217, 217, 217));
        sec_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_aActionPerformed(evt);
            }
        });
        jPanel1.add(sec_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 310, 20));

        jButton3.setBackground(new java.awt.Color(134, 97, 72));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE USER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 170, 50));

        jButton4.setBackground(new java.awt.Color(134, 97, 72));
        jButton4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("EDIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 110, 50));

        jTable2.setModel(tbModel);
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 940, 560));

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
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 940, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1350, 750));

        jPanel6.setBackground(new java.awt.Color(140, 100, 75));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(1344, 70));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(226, 165, 79));

        logout_btn2.setBackground(new java.awt.Color(140, 100, 75));
        logout_btn2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        logout_btn2.setForeground(new java.awt.Color(255, 255, 255));
        logout_btn2.setText("Log Out");
        logout_btn2.setBorder(null);
        logout_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn2ActionPerformed(evt);
            }
        });

        return_btn913.setBackground(new java.awt.Color(140, 100, 75));
        return_btn913.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        return_btn913.setForeground(new java.awt.Color(255, 255, 255));
        return_btn913.setText("Return to Dashboard");
        return_btn913.setBorder(null);
        return_btn913.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_btn913ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/LOGO_topleft.png"))); // NOI18N
        jLabel9.setText("jLabel2");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/TITLELOGO_whitesmall.png"))); // NOI18N
        jLabel11.setText("jLabel1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(570, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(return_btn913)
                        .addGap(18, 18, 18)
                        .addComponent(logout_btn2)
                        .addGap(17, 17, 17))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(logout_btn2)
                            .addComponent(return_btn913)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1360, 765));
        setLocationRelativeTo(null);
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
    if (option == JOptionPane.OK_OPTION && (email.getText().contains("@gmail.com") || email.getText().contains("@yahoo.com") || email.getText().contains("@ue.edu.ph"))) {
        if ("@gmail.com".equals(email.getText()) || "@yahoo.com".equals(email.getText()) || "@ue.edu.ph".equals(email.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
        } else {
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
        JOptionPane.showMessageDialog(null, "Invalid input.");
    }
} else {
    JOptionPane.showMessageDialog(null, "Please select a row to edit.");
}






    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void sec_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sec_aActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
     DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
TableRowSorter<DefaultTableModel>obj=new TableRowSorter<>(model);
jTable2.setRowSorter(obj);
obj.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void secquesboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secquesboxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_secquesboxItemStateChanged

    private void secquesboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secquesboxActionPerformed
        // TODO add your handling code here:
        if ("What is your favorite thing?".equals(secquesbox.getSelectedItem().toString())) {
            System.out.println("OWRKING");
            sec_sq.setText("What is your favorite thing?");
        }
        if ("What is your mother's maiden name?".equals(secquesbox.getSelectedItem().toString())) {
            System.out.println("OWRKING");
            sec_sq.setText("What is your mother's maiden name?");
        }
        if ("Where did you graduate (high school / college)?".equals(secquesbox.getSelectedItem().toString())) {
            System.out.println("OWRKING");
            sec_sq.setText("Where did you graduate (high school / college)?");
        }
    }//GEN-LAST:event_secquesboxActionPerformed

    private void sec_sqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec_sqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sec_sqActionPerformed

    private void logout_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn2ActionPerformed
        // TODO add your handling code here:
        USER_login_menu userloginmenu = new USER_login_menu();
        this.setVisible(false);
        userloginmenu.setVisible(true);
    }//GEN-LAST:event_logout_btn2ActionPerformed

    private void return_btn913ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_btn913ActionPerformed
        ADMIN_Dashboard admindashboard = new ADMIN_Dashboard();
        this.dispose();
        admindashboard.setVisible(true);
    }//GEN-LAST:event_return_btn913ActionPerformed

    public static void main(String args[]) {
     
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
            
            java.awt.EventQueue.invokeLater(() -> {
                new ADMIN_usermanagement().setVisible(true);
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ADMIN_usermanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ADMIN_usermanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ADMIN_usermanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ADMIN_usermanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lname;
    private javax.swing.JButton logout_btn2;
    private javax.swing.JTextField pass;
    private javax.swing.JButton return_btn913;
    private javax.swing.JTextField sec_a;
    private javax.swing.JTextField sec_sq;
    private javax.swing.JComboBox<String> secquesbox;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    private javax.swing.JLabel user5;
    // End of variables declaration//GEN-END:variables
}
