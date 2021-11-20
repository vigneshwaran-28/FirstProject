/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author vignesh
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
    }
     
  int MyAccNum;

    public FastCash(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
    //     AccNumBt.setText(""+AccNum);
        GetBalance();      
    }
   Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
int OldBalance;
    private void GetBalance() {
        String Query = "Select * from accounttb where AccNum= '" +MyAccNum+"'";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "");
            st = con.createStatement();
            rs = st.executeQuery(Query);
            if (rs.next()) {
              OldBalance=rs.getInt(9);
              BalBt.setText("Rs."+OldBalance);
            } else {
               // JOptionPane.showMessageDialog(this, "Wrong Account Number or Pin !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DepositBt9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DepositBt = new javax.swing.JButton();
        DepositBt2 = new javax.swing.JButton();
        DepositBt3 = new javax.swing.JButton();
        DepositBt4 = new javax.swing.JButton();
        DepositBt5 = new javax.swing.JButton();
        DepositBt6 = new javax.swing.JButton();
        DepositBt7 = new javax.swing.JButton();
        DepositBt8 = new javax.swing.JButton();
        BalBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VIGNESH  BANK");

        DepositBt9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt9.setForeground(new java.awt.Color(255, 0, 51));
        DepositBt9.setText("X");
        DepositBt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBt9MouseClicked(evt);
            }
        });
        DepositBt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBt9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299)
                .addComponent(DepositBt9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepositBt9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("FAST CASH");

        DepositBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt.setForeground(new java.awt.Color(0, 51, 255));
        DepositBt.setText("Rs 500");
        DepositBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBtMouseClicked(evt);
            }
        });
        DepositBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBtActionPerformed(evt);
            }
        });

        DepositBt2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt2.setForeground(new java.awt.Color(0, 51, 255));
        DepositBt2.setText("Rs 1000");
        DepositBt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBt2MouseClicked(evt);
            }
        });
        DepositBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBt2ActionPerformed(evt);
            }
        });

        DepositBt3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt3.setForeground(new java.awt.Color(0, 51, 255));
        DepositBt3.setText("Rs 100");
        DepositBt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBt3MouseClicked(evt);
            }
        });
        DepositBt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBt3ActionPerformed(evt);
            }
        });

        DepositBt4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt4.setForeground(new java.awt.Color(0, 51, 255));
        DepositBt4.setText("RS 2000");
        DepositBt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBt4MouseClicked(evt);
            }
        });
        DepositBt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBt4ActionPerformed(evt);
            }
        });

        DepositBt5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt5.setForeground(new java.awt.Color(0, 51, 255));
        DepositBt5.setText("Rs 10000");
        DepositBt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBt5MouseClicked(evt);
            }
        });
        DepositBt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBt5ActionPerformed(evt);
            }
        });

        DepositBt6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt6.setForeground(new java.awt.Color(0, 51, 255));
        DepositBt6.setText("VIGNESH BANK");
        DepositBt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBt6ActionPerformed(evt);
            }
        });

        DepositBt7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt7.setForeground(new java.awt.Color(255, 0, 51));
        DepositBt7.setText("LOG OUT");
        DepositBt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBt7MouseClicked(evt);
            }
        });
        DepositBt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBt7ActionPerformed(evt);
            }
        });

        DepositBt8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DepositBt8.setForeground(new java.awt.Color(0, 51, 255));
        DepositBt8.setText("Rs 5000");
        DepositBt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBt8MouseClicked(evt);
            }
        });
        DepositBt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBt8ActionPerformed(evt);
            }
        });

        BalBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BalBt.setForeground(new java.awt.Color(0, 51, 255));
        BalBt.setText("BALANCE");
        BalBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepositBt2)
                            .addComponent(DepositBt3)
                            .addComponent(DepositBt8))
                        .addGap(244, 244, 244)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepositBt)
                            .addComponent(DepositBt5)
                            .addComponent(DepositBt4))
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(369, 369, 369))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepositBt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BalBt)
                                    .addComponent(DepositBt7))
                                .addGap(84, 84, 84)))
                        .addGap(292, 292, 292))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositBt3)
                    .addComponent(DepositBt))
                .addGap(93, 93, 93)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositBt2)
                    .addComponent(DepositBt4)
                    .addComponent(BalBt))
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositBt8)
                    .addComponent(DepositBt5))
                .addGap(31, 31, 31)
                .addComponent(DepositBt7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DepositBt6)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DepositBt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBt9ActionPerformed

    private void DepositBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBtActionPerformed

    private void DepositBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBt2ActionPerformed

    private void DepositBt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBt3ActionPerformed

    private void DepositBt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBt4ActionPerformed

    private void DepositBt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBt5ActionPerformed

    private void DepositBt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBt6ActionPerformed

    private void DepositBt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBt7ActionPerformed

    private void DepositBt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBt8ActionPerformed

    private void BalBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalBtActionPerformed

    private void DepositBt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBt3MouseClicked
         if(OldBalance<100){
        JOptionPane.showMessageDialog(this, "No Enough Balance !");
      }
      else{
          try {
              String Query="Update accounttb set Balance =? where AccNum =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1, OldBalance-100);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                  JOptionPane.showMessageDialog(this, "Balance Updated !");
                    new MainMenu(MyAccNum).setVisible(true);
       this.dispose();
                }
                else{
                JOptionPane.showMessageDialog(this, "Missing Information !");
                }
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_DepositBt3MouseClicked

    private void DepositBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBtMouseClicked
         if(OldBalance<500){
        JOptionPane.showMessageDialog(this, "No Enough Balance !");
      }
      else{
          try {
              String Query="Update accounttb set Balance =? where AccNum =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1, OldBalance-500);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                  JOptionPane.showMessageDialog(this, "Balance Updated !");
                    new MainMenu(MyAccNum).setVisible(true);
       this.dispose();
                }
                else{
                JOptionPane.showMessageDialog(this, "Missing Information !");
                }
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_DepositBtMouseClicked

    private void DepositBt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBt2MouseClicked
           if(OldBalance<1000){
        JOptionPane.showMessageDialog(this, "No Enough Balance !");
      }
      else{
          try {
              String Query="Update accounttb set Balance =? where AccNum =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1, OldBalance-1000);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                  JOptionPane.showMessageDialog(this, "Balance Updated !");
                    new MainMenu(MyAccNum).setVisible(true);
       this.dispose();
                }
                else{
                JOptionPane.showMessageDialog(this, "Missing Information !");
                }
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_DepositBt2MouseClicked

    private void DepositBt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBt4MouseClicked
         if(OldBalance<2000){
        JOptionPane.showMessageDialog(this, "No Enough Balance !");
      }
      else{
          try {
              String Query="Update accounttb set Balance =? where AccNum =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1, OldBalance-2000);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                  JOptionPane.showMessageDialog(this, "Balance Updated !");
                    new MainMenu(MyAccNum).setVisible(true);
       this.dispose();
                }
                else{
                JOptionPane.showMessageDialog(this, "Missing Information !");
                }
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_DepositBt4MouseClicked

    private void DepositBt8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBt8MouseClicked
          if(OldBalance<5000){
        JOptionPane.showMessageDialog(this, "No Enough Balance !");
      }
      else{
          try {
              String Query="Update accounttb set Balance =? where AccNum =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1, OldBalance-5000);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                  JOptionPane.showMessageDialog(this, "Balance Updated !");
                    new MainMenu(MyAccNum).setVisible(true);
       this.dispose();
                }
                else{
                JOptionPane.showMessageDialog(this, "Missing Information !");
                }
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_DepositBt8MouseClicked

    private void DepositBt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBt5MouseClicked
         if(OldBalance<10000){
        JOptionPane.showMessageDialog(this, "No Enough Balance !");
      }
      else{
          try {
              String Query="Update accounttb set Balance =? where AccNum =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "");
                PreparedStatement ps=con.prepareStatement(Query);
                ps.setInt(1, OldBalance-10000);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                  JOptionPane.showMessageDialog(this, "Balance Updated !");
                    new MainMenu(MyAccNum).setVisible(true);
       this.dispose();
                }
                else{
                JOptionPane.showMessageDialog(this, "Missing Information !");
                }
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_DepositBt5MouseClicked

    private void DepositBt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBt7MouseClicked
          new MainMenu(MyAccNum).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_DepositBt7MouseClicked

    private void DepositBt9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBt9MouseClicked
       System.exit(0);
    }//GEN-LAST:event_DepositBt9MouseClicked

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BalBt;
    private javax.swing.JButton DepositBt;
    private javax.swing.JButton DepositBt2;
    private javax.swing.JButton DepositBt3;
    private javax.swing.JButton DepositBt4;
    private javax.swing.JButton DepositBt5;
    private javax.swing.JButton DepositBt6;
    private javax.swing.JButton DepositBt7;
    private javax.swing.JButton DepositBt8;
    private javax.swing.JButton DepositBt9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
