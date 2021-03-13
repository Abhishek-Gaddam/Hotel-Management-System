/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.*;
import java.util.Date;
/**
 *
 * @author Abhishek
 */
public class Billing extends javax.swing.JFrame {
Connection cn;
Statement stat;
ResultSet rs;
java.util.Date d;
int c_id,mnt,day,id,submit=0;
double total;

/**
     * Creates new form Billing
     */
    public Billing() {
        try{
             this.setExtendedState(JFrame.MAXIMIZED_BOTH);
             
                this.setTitle("Hotel Management System");
                initComponents();

                Class.forName("com.mysql.cj.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
                stat=cn.createStatement();
                
                    rs=stat.executeQuery("select c_id from customer order by c_id");
                    if(rs.first())
                    {
                        this.setVisible(true);
                        rs.first();
                        jComboBox2.addItem(""+rs.getInt(1));
                    while(rs.next()) {
                        jComboBox2.addItem(""+rs.getInt(1));
                    }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "No Customers Available");
                        this.dispose();
                        new MainMenu().setVisible(true);
                    }
                d=new java.util.Date();
     
        jTextField4.setText(new SimpleDateFormat("yyyy-MM-dd").format(d));
        
        }catch(SQLException sq){}
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bill Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(850, 80, 198, 43);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bill ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(590, 170, 121, 31);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 220, 174, 37);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(1000, 420, 360, 42);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Total Amount");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 490, 174, 39);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(1000, 490, 360, 36);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Check-in-date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 350, 174, 33);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Check-out-date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(590, 420, 174, 35);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Facilities");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 560, 174, 33);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(830, 860, 133, 42);

        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1210, 860, 145, 41);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1000, 160, 360, 38);

        jComboBox2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(1000, 220, 360, 39);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Room Number");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 290, 133, 42);

        jComboBox5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox5.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox5PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox5PopupMenuWillBecomeVisible(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(1000, 290, 360, 42);

        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Swimming Pool");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(1000, 560, 185, 33);

        jCheckBox2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Laundary");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(1000, 610, 185, 34);

        jCheckBox3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Extra Bed");
        jCheckBox3.setOpaque(false);
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(1000, 660, 185, 38);

        jCheckBox4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Food");
        jCheckBox4.setOpaque(false);
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(1000, 720, 185, 37);

        jTextField2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField2.setEnabled(false);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1200, 560, 157, 33);

        jTextField3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField3.setEnabled(false);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1200, 610, 157, 34);

        jTextField6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField6.setEnabled(false);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(1200, 660, 157, 38);

        jTextField7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField7.setEnabled(false);
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(1200, 720, 157, 37);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(jTextField8);
        jTextField8.setBounds(1000, 350, 360, 44);

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Generate Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 860, 189, 42);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(jTextField9);
        jTextField9.setBounds(1000, 780, 360, 42);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Bill Amount");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(590, 780, 174, 42);

        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setText("Show Bills");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1020, 860, 130, 42);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_management/cash-credit-card-hands-1174750.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1930, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{
        submit=0;
    String c_in_d,c_out_d,sp,ly,bed,food,toamt,bb;
    String bill_id=(jTextField1.getText().trim());
    
    bb=(String)jComboBox2.getSelectedItem();
    int c_id=Integer.valueOf(bb);
    bb=(String)jComboBox5.getSelectedItem();
    int room_no=Integer.valueOf(bb);
    c_in_d=jTextField8.getText().trim();
    c_out_d=jTextField4.getText().trim();
    sp=jTextField2.getText().trim();
    ly=jTextField3.getText().trim();
    bed=jTextField6.getText().trim();
    food=jTextField7.getText().trim();
    toamt=jTextField9.getText().trim();
    stat.executeUpdate("update bill set check_out_date='"+c_out_d+"',amount="+toamt+" where c_id="+c_id+" and room_no="+room_no+"");
    stat.executeUpdate("update room set c_id=NULL,r_status='AVAILABLE' where room_no="+room_no+" and c_id="+c_id+"");
    if(sp.length()!=0)
        stat.executeUpdate("insert into facilities values("+bill_id+",'Swimming Pool',"+sp+")");
    if(ly.length()!=0)
        stat.executeUpdate("insert into facilities values("+bill_id+",'Laundary',"+ly+")");
    if(bed.length()!=0)
        stat.executeUpdate("insert into facilities values("+bill_id+",'Extra Bed',"+bed+")");
    if(food.length()!=0)
        stat.executeUpdate("insert into facilities values("+bill_id+",'Food',"+food+")");
    
    this.dispose();
    new Billing().setVisible(true);
    
    
        JOptionPane.showMessageDialog(null,"Bill Generated Successfully.");
    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(submit>0)
    {
        JOptionPane.showMessageDialog(null, "Press The Submit Button.");
    }
    else
    {
        this.dispose();
        MainMenu mm=new MainMenu();
        mm.setVisible(true);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
    try{
        
        String x=((String)jComboBox2.getSelectedItem()).trim();
        c_id=Integer.valueOf(x);
    //        jComboBox2.setEnabled(false);
        
    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}         
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void jComboBox5PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox5PopupMenuWillBecomeVisible
    try{
        jComboBox5.removeAllItems();
        rs=stat.executeQuery("select room_no from room where c_id="+c_id+" and r_status='NOTAVAILABLE'");
        if(rs.first())
        {
            jComboBox5.addItem(""+rs.getString(1));
            while(rs.next())
            {
                 jComboBox5.addItem(""+rs.getString(1));
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No Room Alloted To This Customer.");
            this.dispose();
            new Billing().setVisible(true);
        }
    }catch(SQLException sq){}
    catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jComboBox5PopupMenuWillBecomeVisible

    private void jComboBox5PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox5PopupMenuWillBecomeInvisible
    try{
        String x=(String)jComboBox5.getSelectedItem();
    rs=stat.executeQuery("select c_id,r_charges from room where room_no="+x+"");
    rs.first();
    jTextField1.setText(""+rs.getInt(1));
    Double dd=new Double(rs.getDouble(2));
    
    rs=stat.executeQuery(" select * from bill where c_id="+c_id+" and room_no="+x+" and amount IS NULL");
    rs.first();
        jTextField1.setText(""+rs.getInt(1));
        jTextField8.setText(""+rs.getString(2));
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dbs=jTextField8.getText();
        String abs=jTextField4.getText();
        Date db=sdf.parse(dbs);
        Date ab=sdf.parse(abs);
        long diff=ab.getTime()-db.getTime();
        int days=(int)(diff/(1000*60*60*24));//JOptionPane.showMessageDialog(null, days);
    if(days!=0)
    {
        jTextField5.setText(""+(dd*days));
    }
    else
    {
        jTextField5.setText(""+dd);
    }
    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jComboBox5PopupMenuWillBecomeInvisible

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
            if(jTextField2.isEnabled())
            {
                jTextField2.setEnabled(false);
            }
            else
                jTextField2.setEnabled(true);
            jTextField2.setText("");
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if(jTextField3.isEnabled())
            {
                jTextField3.setEnabled(false);
            }
            else
            jTextField3.setEnabled(true);
        jTextField3.setText("");
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if(jTextField6.isEnabled())
            {
                jTextField6.setEnabled(false);
            }
            else
        jTextField6.setEnabled(true);
        jTextField6.setText("");
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        if(jTextField7.isEnabled())
            {
                jTextField7.setEnabled(false);
            }
            else
        jTextField7.setEnabled(true);
        jTextField7.setText("");
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        char z=evt.getKeyChar();
    String x;
    if(evt.getKeyCode()==10||evt.getKeyCode()==8||evt.getKeyCode()==16||evt.getKeyCode()==32)
    {
    }
    else if(z>='0'&&z<='9')
    {
        x=jTextField3.getText();
        jTextField3.setText(x);
    }
    else
    {
         JOptionPane.showMessageDialog(null,"Only Number Input");
         jTextField3.setText("");        // TODO add your handling code here:
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        char z=evt.getKeyChar();
    String x;
    if(evt.getKeyCode()==10||evt.getKeyCode()==8||evt.getKeyCode()==16||evt.getKeyCode()==32)
    {
    }
    else if(z>='0'&&z<='9')
    {
        x=jTextField6.getText();
        jTextField6.setText(x);
    }
    else
    {
         JOptionPane.showMessageDialog(null,"Only Number Input");
         jTextField6.setText("");        // TODO add your handling code here:
    }

    }//GEN-LAST:event_jTextField6KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{submit=1;
            Double tmt,sp,ly,bed,food,to;
            tmt=sp=ly=bed=food=to=0.0;
        
            String hh=(jTextField5.getText());
            tmt=Double.valueOf(hh);
            hh=(jTextField2.getText());
            if(hh.trim().length()!=0)
                sp=new Double(hh);
            
            hh=(jTextField3.getText());
            if(hh.trim().length()!=0)
            {
                ly=new Double(hh);
            }
            hh=(jTextField6.getText());
            if(hh.trim().length()!=0)
            {
                
                bed=new Double(hh);
            }
            hh=(jTextField7.getText());
            if(hh.trim().length()!=0)
            {
                
                food=new Double(hh);
            }
        to=tmt+sp+ly+bed+food;
        jTextField9.setText(""+to);
        jButton2.setEnabled(false);
        jComboBox2.setEnabled(false);
        jComboBox5.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jButton1.setEnabled(true);
        
        }catch(NumberFormatException nex){JOptionPane.showMessageDialog(null,"Enter All Information.");}
        catch(NullPointerException nex){JOptionPane.showMessageDialog(null,"Enter All Information.");}
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
            char z=evt.getKeyChar();
    String x;
    if(evt.getKeyCode()==10||evt.getKeyCode()==8||evt.getKeyCode()==16||evt.getKeyCode()==32)
    {
    }
    else if(z>='0'&&z<='9')
    {
        x=jTextField6.getText();
        jTextField6.setText(x);
    }
    else
    {
         JOptionPane.showMessageDialog(null,"Only Number Input");
         jTextField6.setText("");        // TODO add your handling code here:
    }

    }//GEN-LAST:event_jTextField7KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    if(submit>0)
    {
        JOptionPane.showMessageDialog(null, "Press The Submit Button.");
    }
    else
    {
        this.dispose();
        new ShowBills().setVisible(true);
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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                new Billing();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}