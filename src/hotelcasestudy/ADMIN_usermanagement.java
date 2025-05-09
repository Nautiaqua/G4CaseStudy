
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

        email = new javax.swing.JTextField();
        user2 = new javax.swing.JLabel();
        user3 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        user4 = new javax.swing.JLabel();
        user5 = new javax.swing.JLabel();
        secquesbox = new javax.swing.JComboBox<>();
        user = new javax.swing.JLabel();
        sec_a = new javax.swing.JTextField();
        sec_sq = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        email_label3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        logout_btn2 = new javax.swing.JButton();
        return_btn913 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        email.setBackground(new java.awt.Color(217, 217, 217));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        user2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user2.setForeground(new java.awt.Color(105, 73, 50));
        user2.setText("Email:");

        user3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user3.setForeground(new java.awt.Color(105, 73, 50));
        user3.setText("Last Name:");

        user1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user1.setForeground(new java.awt.Color(105, 73, 50));
        user1.setText("First Name:");

        fname.setBackground(new java.awt.Color(217, 217, 217));

        lname.setBackground(new java.awt.Color(217, 217, 217));

        pass.setBackground(new java.awt.Color(217, 217, 217));

        user4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user4.setForeground(new java.awt.Color(105, 73, 50));
        user4.setText("Password:");

        user5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user5.setForeground(new java.awt.Color(105, 73, 50));
        user5.setText("Security Question:");

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

        user.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(105, 73, 50));
        user.setText("Security Question Answer:");

        sec_a.setBackground(new java.awt.Color(217, 217, 217));
        sec_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_aActionPerformed(evt);
            }
        });

        sec_sq.setBackground(new java.awt.Color(237, 234, 233));
        sec_sq.setForeground(new java.awt.Color(237, 234, 233));
        sec_sq.setBorder(null);
        sec_sq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_sqActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(237, 234, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(105, 73, 50));
        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(105, 73, 50));
        jLabel10.setText("Users");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 330, -1));

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(tbModel);
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1300, 560));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 410, 20));

        email_label3.setBackground(new java.awt.Color(105, 73, 50));
        email_label3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        email_label3.setForeground(new java.awt.Color(105, 73, 50));
        email_label3.setText("Search:");
        jPanel1.add(email_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, -1));

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
    private javax.swing.JLabel email_label3;
    private javax.swing.JTextField fname;
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
