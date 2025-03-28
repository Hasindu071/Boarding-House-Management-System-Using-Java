/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inf;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Hasindu Thirasara
 */
public class payment extends javax.swing.JFrame {
    private final String dbUrl = "jdbc:mysql://localhost:3306/bhsm";
    private final String dbUsername = "root";
    private final String dbPassword = "root";
    /**
     * Creates new form payment
     */
    public payment() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tenantidbox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statusbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        duedatabox = new javax.swing.JTextField();
        paymentidbox = new javax.swing.JTextField();
        amountbox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menubtn = new javax.swing.JButton();
        cleartn = new javax.swing.JButton();
        addbtn1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1027, 725));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(27118, 142));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel1.setText("PAYMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payment Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tenant ID : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 20));

        tenantidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenantidboxActionPerformed(evt);
            }
        });
        jPanel1.add(tenantidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 430, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Due Date : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        statusbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusboxActionPerformed(evt);
            }
        });
        jPanel1.add(statusbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 430, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Payment ID : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        duedatabox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedataboxActionPerformed(evt);
            }
        });
        jPanel1.add(duedatabox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 430, -1));
        jPanel1.add(paymentidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 430, -1));

        amountbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountboxActionPerformed(evt);
            }
        });
        jPanel1.add(amountbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 430, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Status : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        menubtn.setBackground(new java.awt.Color(0, 153, 153));
        menubtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menubtn.setText("Menu");
        menubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubtnActionPerformed(evt);
            }
        });
        jPanel1.add(menubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 190, 40));

        cleartn.setBackground(new java.awt.Color(0, 153, 153));
        cleartn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cleartn.setText("CLEAR");
        cleartn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleartnActionPerformed(evt);
            }
        });
        jPanel1.add(cleartn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, 50));

        addbtn1.setBackground(new java.awt.Color(0, 153, 153));
        addbtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbtn1.setText("Insert");
        addbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, 50));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(yyyy-mm-dd)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(823, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void statusboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusboxActionPerformed

    private void amountboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountboxActionPerformed

    private void cleartnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleartnActionPerformed
    tenantidbox.setText("");
    duedatabox.setText("");
    paymentidbox.setText("");
    amountbox.setText("");
    statusbox.setText("");        
    }//GEN-LAST:event_cleartnActionPerformed

    private void menubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubtnActionPerformed
        int msg=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to return to the menu?",
                        "Update Confirmation", JOptionPane.YES_NO_OPTION);
                
                //if they press yes then make the connection and delete it.
                if (msg==0)
                {
                Menu wid1 = new Menu();
                wid1.setVisible(true);
                this.setVisible(false);
                
    }    
    }//GEN-LAST:event_menubtnActionPerformed

    private void tenantidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenantidboxActionPerformed
    
    }//GEN-LAST:event_tenantidboxActionPerformed

    private void addbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn1ActionPerformed
        // TODO add your handling code here:
        try{
                    LocalDate inputDate = LocalDate.parse(duedatabox.getText());
                    LocalDate currentDate = LocalDate.now(); // Current date
                    
                    if (("".equals(tenantidbox.getText()))||(duedatabox.getText()=="")||(paymentidbox.getText()=="")||(amountbox.getText()==""))
                    {
                        JOptionPane.showMessageDialog(null,"Please Fill all the data");
                    }
                    
                    else if (!inputDate.isEqual(currentDate)) {
                    JOptionPane.showMessageDialog(this, "Entered date is not the current date.");
                    } 
                    else
                    {
                    int number = Integer.parseInt(amountbox.getText());
                    //open connection
                    Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                    
                    //get the values from database into array
                    java.sql.PreparedStatement pst1 = conn.prepareStatement( "INSERT INTO Payment VALUES (?,?,?,?,?)");
                    pst1.setString(1,paymentidbox.getText());
                    pst1.setString(2, amountbox.getText());
                    pst1.setString(3, statusbox.getText());
                    pst1.setString(4, duedatabox.getText());
                    pst1.setString(5, tenantidbox.getText());
                    
                    pst1.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
                    
                    tenantidbox.setText("");
                    duedatabox.setText("");
                    paymentidbox.setText("");
                    amountbox.setText("");
                    statusbox.setText("");
                    
                    conn.close();
                    
                   
                    
         }
         } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "SQL Error");
            
         }
        // handle invalid date exception
            catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please enter date in yyyy-MM-dd format.");
            }
        
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, amountbox.getText() + " is not a valid integer.");
        }
        
                
        
    
    }//GEN-LAST:event_addbtn1ActionPerformed

    private void duedataboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedataboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedataboxActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn1;
    private javax.swing.JTextField amountbox;
    private javax.swing.JButton cleartn;
    private javax.swing.JTextField duedatabox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton menubtn;
    private javax.swing.JTextField paymentidbox;
    private javax.swing.JTextField statusbox;
    private javax.swing.JTextField tenantidbox;
    // End of variables declaration//GEN-END:variables
}
