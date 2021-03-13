/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Abhishek
 */
public class CustomerInformation extends javax.swing.JFrame {
       Connection cn;
       Statement stat;
       ResultSet rs; 
       int count=0,save=0;
       
    /**
     * Creates new form CustomerInformation
     */
    public CustomerInformation() {
        try{
        //this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Hotel Management System");
        this.add(new JLabel(new ImageIcon("")));
        //jLabel7.setLayout(new FlowLayout());
        
         initComponents();
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
        stat=cn.createStatement();
        rs=stat.executeQuery("select c_id from customer order by c_id desc");
        int id=0;
        if(rs.first())
        {
            id=rs.getInt(1);
            id++;
            jTextField1.setText(""+id);
        }
        else
        {
            jTextField1.setText("1");
        }
    }catch(Exception e){}
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton3.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER INFORMATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(790, 170, 480, 43);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CUSTOMER ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 400, 200, 32);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CUSTOMER NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 450, 200, 34);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AADHAR NUMBER");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 510, 200, 32);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PHONE NUMBER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(640, 670, 200, 37);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADDRESS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(640, 560, 192, 36);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(840, 560, 572, 100);

        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(640, 770, 120, 40);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 770, 107, 40);

        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(900, 770, 103, 40);

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("DISPLAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1020, 770, 111, 40);

        jButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton6.setText("RESET");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1150, 770, 113, 40);

        jButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(1280, 770, 138, 40);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(840, 400, 571, 32);

        jTextField2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(840, 670, 421, 37);

        jTextField3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(840, 450, 571, 32);

        jTextField5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(840, 510, 571, 32);

        jButton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton8.setText("SAVE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1280, 670, 138, 37);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HOTEL MANAGEMENT SYSTEM");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 70, 760, 56);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_management/apartment-architectural-design-architecture-323780.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 1930, 1110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{
        if(save!=0)
        {
            String s="Customer Added Successfully";

           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
           jTextField5.setText("");
           jTextArea1.setText("");
           count=0;
           this.dispose();
           new CustomerInformation().setVisible(true);
           JOptionPane.showMessageDialog(this, s);
           this.repaint();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Press Save Button First","Insertion Error",JOptionPane.ERROR_MESSAGE);
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    this.dispose();
    MainMenu mm=new MainMenu();
    mm.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
       jTextField4.setText("");
       jTextField5.setText("");
       jTextArea1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    try{
    String smt,c_id,c_name,c_aadhar,c_address;
    String mob=new String(jTextField2.getText());
    if(count==0)
    {
        if(mob.trim().length()==10)
        {
        c_id=new String(jTextField1.getText());
        c_name=new String(jTextField3.getText());
        c_aadhar=new String(jTextField5.getText());
        c_address=new String(jTextArea1.getText());
        if(c_id.trim().length()==0||c_name.trim().length()==0||c_aadhar.trim().length()==0||c_address.trim().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Enter all information","Login Error",JOptionPane.ERROR_MESSAGE);
            this.dispose();
            new CustomerInformation().setVisible(true);
        }
        else
        {
            if(c_aadhar.trim().length()!=12)
                JOptionPane.showMessageDialog(null,"Enter Valid Aadhar Id","Login Error",JOptionPane.ERROR_MESSAGE);    
            else{
            stat=cn.createStatement();
            smt="insert into customer values('"+c_id+"','"+c_name+"','"+c_aadhar+"','"+c_address+"')";
            stat.executeUpdate(smt);
            smt="insert into c_phone_no values((select c_id from customer where c_id="+c_id+"),'"+mob+"')";
            stat.executeUpdate(smt); 
            count=1;save=1;
            jTextField2.setText("");
            }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Mobile Number","Login Error",JOptionPane.ERROR_MESSAGE);
            jTextField2.setText("");
        }
    }
    else
    {
    if(mob.trim().length()==10)
    {
    stat=cn.createStatement(); 
    c_id=new String(jTextField1.getText());
    smt="insert into c_phone_no values((select c_id from customer where c_id="+c_id+"),'"+mob+"')";
    stat.executeUpdate(smt); 
    jTextField2.setText("");
    save=1;
    }
    else
        JOptionPane.showMessageDialog(null,"Enter Valid Mobile Number","Login Error",JOptionPane.ERROR_MESSAGE);
    }
    }catch(SQLIntegrityConstraintViolationException e){JOptionPane.showMessageDialog(null,"Customer Already Exists!","Existing Customer",JOptionPane.ERROR_MESSAGE);
    jTextField1.setText("");}
    catch(Exception e){ JOptionPane.showMessageDialog(null,e); 
    }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    if(count>0)
        JOptionPane.showMessageDialog(null,"Press Add Button First!");
    else
        {
               this.dispose();
              DeleteCus dc=new DeleteCus();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     if(count>0)
        JOptionPane.showMessageDialog(null,"Press Add Button First!");
    else
     {
         this.dispose(); 
        new ShowCustomers().setVisible(true);
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
    char z=evt.getKeyChar();
    String x;
    if(evt.getKeyCode()==10||evt.getKeyCode()==8||evt.getKeyCode()==16||evt.getKeyCode()==32)
    {
    }
    else if(z>='a'&&z<='z'||z>='A'&&z<='Z')
    {
        x=jTextField3.getText();
        jTextField3.setText(x);
    }
    else
    {
         JOptionPane.showMessageDialog(null,"Only Character Input");
         jTextField3.setText("");        // TODO add your handling code here:
    }
            // TODO add your handling code here:
            
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
    char z=evt.getKeyChar();
    String x;
    if(evt.getKeyCode()==10||evt.getKeyCode()==8||evt.getKeyCode()==16||evt.getKeyCode()==32)
    {
    }
    else if(z>='0'&&z<='9')
    {
        x=jTextField5.getText();
        jTextField5.setText(x);
    }
    else
    {
         JOptionPane.showMessageDialog(null,"Only Number Input");
         jTextField5.setText("");        // TODO add your handling code here:
    }    // TODO add your handling code here:
    
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
     char z=evt.getKeyChar();
    String x;
    if(evt.getKeyCode()==10||evt.getKeyCode()==8||evt.getKeyCode()==16||evt.getKeyCode()==32)
    {
    }
    else if(z>='0'&&z<='9')
    {
        x=jTextField2.getText();
        jTextField2.setText(x);
    }
    else
    {
         JOptionPane.showMessageDialog(null,"Only Number Input");
         jTextField2.setText("");        // TODO add your handling code here:
    }   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(count>0)
        JOptionPane.showMessageDialog(null,"Press Add Button First!");
    else
    {
        this.dispose();
        new UpdateCustomer();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}