package ims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Branch_detal_Service extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;byte t=0;
    String str,url="";
    public Branch_detal_Service() {
        initComponents();
        this.getRootPane().setDefaultButton(search_butt);
        this.setLocationRelativeTo(null);
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        con=Conn.conLink();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cmb = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        update_bcode = new javax.swing.JTextField();
        bname_cb = new javax.swing.JCheckBox();
        bcontperson_cb = new javax.swing.JCheckBox();
        cno_cb = new javax.swing.JCheckBox();
        email_id_cb = new javax.swing.JCheckBox();
        update_bname = new javax.swing.JTextField();
        update_cperson = new javax.swing.JTextField();
        update_cno = new javax.swing.JTextField();
        update_emailid = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        badress_cb = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        update_badress = new javax.swing.JTextArea();
        all_cb = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteeno_tf = new javax.swing.JTextField();
        delete_bt = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabFocusLost(evt);
            }
        });
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_cmb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        search_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branch Code", "Branch Name", "Email_id" }));

        search_butt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(search_butt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(search_butt)
                .addGap(62, 62, 62))
        );

        tab.addTab("SEARCH", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Branch Code");

        bname_cb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bname_cb.setText("Branch Name");
        bname_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bname_cbActionPerformed(evt);
            }
        });

        bcontperson_cb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bcontperson_cb.setText("Branch contact Person");
        bcontperson_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcontperson_cbActionPerformed(evt);
            }
        });

        cno_cb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cno_cb.setText("Cont_No");
        cno_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cno_cbActionPerformed(evt);
            }
        });

        email_id_cb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email_id_cb.setText("Email_id");
        email_id_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_id_cbActionPerformed(evt);
            }
        });

        update_bname.setEditable(false);

        update_cperson.setEditable(false);

        update_cno.setEditable(false);

        update_emailid.setEditable(false);

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        badress_cb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        badress_cb.setText("Branch Adress");
        badress_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badress_cbActionPerformed(evt);
            }
        });

        update_badress.setEditable(false);
        update_badress.setColumns(20);
        update_badress.setRows(5);
        jScrollPane1.setViewportView(update_badress);

        all_cb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        all_cb.setText("All");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bname_cb))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(update_bcode, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(update_bname)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bcontperson_cb)
                                    .addComponent(cno_cb)
                                    .addComponent(email_id_cb)
                                    .addComponent(badress_cb)
                                    .addComponent(all_cb))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(update_emailid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(update_cno, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(update_cperson, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(update)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_bcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_bname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bname_cb))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcontperson_cb)
                    .addComponent(update_cperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cno_cb)
                    .addComponent(update_cno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_id_cb)
                    .addComponent(update_emailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(badress_cb)
                        .addGap(18, 18, 18)
                        .addComponent(all_cb))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(update)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tab.addTab("UPDATE", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Employee No");

        deleteeno_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        delete_bt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        delete_bt.setText("DELETE");
        delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(delete_bt)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(delete_bt)
                .addGap(59, 59, 59))
        );

        tab.addTab("DELETE", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttActionPerformed
         str=(String)search_cmb.getSelectedItem();
         if(search_tf.getText().length()==0)
             JOptionPane.showMessageDialog(this,"please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
         else
         {
             url="select * from branch_details where ";
             if(str.equals("Branch Code"))
                 url=url+"upper(bcode)=?";
             else if(str.equals("Branch Name"))
                 url=url+"upper(bname)=?";
             else
                 url=url+"upper(bemail_id)=?";
             try {
                 stmt=con.prepareStatement(url);
                 stmt.setString(1,search_tf.getText().toUpperCase());
                 rs=stmt.executeQuery();
                 if(rs.next())
                     new BranchRecord(rs).setVisible(true);
                 else
                     JOptionPane.showMessageDialog(this,"Record not found","warning",JOptionPane.ERROR_MESSAGE);
             } catch (SQLException ex) {
                 Logger.getLogger(Branch_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
             }    
         }        
    }//GEN-LAST:event_search_buttActionPerformed

    private void delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btActionPerformed
         if(deleteeno_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input employee no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from branch_details where upper(bcode)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,deleteeno_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Work_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_delete_btActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         byte i=0,a=0,b=0,c=0,d=0,e=0;url="update branch_details set ";
        if(bname_cb.isSelected())
        {
            if(i==0)
                url=url+" bname=?";
            else
                url=url+",bname=?";
            
            i++;
            a=i;
        } 
        if(bcontperson_cb.isSelected())
        {
            if(i==0)
                url=url+" bcont_person=?";
            else
                url=url+",bcont_person=?";
           
            i++;
            b=i;
        }    
        if(cno_cb.isSelected())
        {
            if(i==0)
                url=url+" bcont_no=?";
            else
                url=url+",bcont_no=?";
            i++;
            c=i;
        }      
        if(email_id_cb.isSelected())
        {
            if(i==0)
                url=url+" bemail_id=?";
            else
                url=url+",bemail_id=?";
            i++;
            d=i;
        }      
        if(badress_cb.isSelected())
        {
            if(i==0)
                url=url+" baddress=?";
            else
                url=url+",baddress=?";
            i++;
            e=i;
        }      
        if(i==0)
            JOptionPane.showMessageDialog(this,"Select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(update_bcode.getText().length()==0){
            JOptionPane.showMessageDialog(this,"Insert branch code","Entry problem",JOptionPane.ERROR_MESSAGE);
            update_bcode.requestFocus();}
        else
        {
            url=url+" where upper(bcode)=?";
            try {
                stmt=con.prepareStatement(url);
                if(a>0)
                    stmt.setString(a,update_bname.getText());
                if(b>0)
                    stmt.setString(b,update_cperson.getText());
                if(c>0)
                    stmt.setString(c,update_cno.getText());
                if(d>0)
                    stmt.setString(d,update_emailid.getText());
                if(e>0)
                    stmt.setString(e,update_badress.getText());
                stmt.setString(i+1,update_bcode.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Work_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                                        
    }//GEN-LAST:event_updateActionPerformed

    private void bname_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bname_cbActionPerformed
         if(bname_cb.isSelected())
        {    
             t++;
               if(t==5)
                   all_cb.setSelected(true);
               update_bname.setEditable(true);
               update_bname.requestFocus();
        }
        else
         {
              t--;
             all_cb.setSelected(false);
            update_bname.setEditable(false);
         }
    }//GEN-LAST:event_bname_cbActionPerformed

    private void bcontperson_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcontperson_cbActionPerformed
 if(bcontperson_cb.isSelected())
        {    
             t++;
               if(t==5)
                   all_cb.setSelected(true);
               update_cperson.setEditable(true);
               update_cperson.requestFocus();
        }
        else
          {
             t--;
             all_cb.setSelected(false);
            update_cperson.setEditable(false);   
          }// TODO add your handling code here:
    }//GEN-LAST:event_bcontperson_cbActionPerformed

    private void cno_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cno_cbActionPerformed
 if(cno_cb.isSelected())
        { 
             t++;
               if(t==5)
                   all_cb.setSelected(true);
               update_cno.setEditable(true);
               update_cno.requestFocus();
        }
        else
         {
             t--;
             all_cb.setSelected(false);
            update_cno.setEditable(false);   
         }
    }//GEN-LAST:event_cno_cbActionPerformed

    private void email_id_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_id_cbActionPerformed
 if(email_id_cb.isSelected())
        {  
             t++;
               if(t==5)
                   all_cb.setSelected(true);
               update_emailid.setEditable(true);
               update_emailid.requestFocus();
        }
        else
           {
             t--;
             all_cb.setSelected(false);
            update_emailid.setEditable(false);
           }// TODO add your handling code here:
    }//GEN-LAST:event_email_id_cbActionPerformed

    private void badress_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badress_cbActionPerformed
 if(badress_cb.isSelected())
        {    
             t++;
               if(t==5)
                   all_cb.setSelected(true);
               update_badress.setEditable(true);
               update_badress.requestFocus();
        }
        else
            {
             t--;
             all_cb.setSelected(false);
            update_badress.setEditable(false);
            }// TODO add your handling code here:
    }//GEN-LAST:event_badress_cbActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        update_bcode.requestFocus();
    }//GEN-LAST:event_tabMouseClicked

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed
        if(all_cb.isSelected())
        {
            t=5;
            bname_cb.setSelected(true);
            bcontperson_cb.setSelected(true);
            cno_cb.setSelected(true);
            email_id_cb.setSelected(true);
            badress_cb.setSelected(true);
            update_bname.setEditable(true);
            update_cperson.setEditable(true);
            update_cno.setEditable(true);
            update_emailid.setEditable(true);
            update_badress.setEditable(true);
        }
        else
        {
            t=0;
            bname_cb.setSelected(false);
            bcontperson_cb.setSelected(false);
            cno_cb.setSelected(false);
            email_id_cb.setSelected(false);
            badress_cb.setSelected(false);
            update_bname.setEditable(false);
            update_cperson.setEditable(false);
            update_cno.setEditable(false);
            update_emailid.setEditable(false);
            update_badress.setEditable(false);
        }
    }//GEN-LAST:event_all_cbActionPerformed

    private void tabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabFocusLost
        search_tf.setText("");
        update_bcode.setText("");
        bname_cb.setSelected(false);
            bcontperson_cb.setSelected(false);
            cno_cb.setSelected(false);
            email_id_cb.setSelected(false);
            badress_cb.setSelected(false);
            update_bname.setEditable(false);
            update_cperson.setEditable(false);
            update_cno.setEditable(false);
            update_emailid.setEditable(false);
            update_badress.setEditable(false);
            update_bname.setText("");
            update_cperson.setText("");
            update_cno.setText("");
            update_emailid.setText("");
            update_badress.setText("");
    }//GEN-LAST:event_tabFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JCheckBox badress_cb;
    private javax.swing.JCheckBox bcontperson_cb;
    private javax.swing.JCheckBox bname_cb;
    private javax.swing.JCheckBox cno_cb;
    private javax.swing.JButton delete_bt;
    private javax.swing.JTextField deleteeno_tf;
    private javax.swing.JCheckBox email_id_cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search_butt;
    private javax.swing.JComboBox<String> search_cmb;
    private javax.swing.JTextField search_tf;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JButton update;
    private javax.swing.JTextArea update_badress;
    private javax.swing.JTextField update_bcode;
    private javax.swing.JTextField update_bname;
    private javax.swing.JTextField update_cno;
    private javax.swing.JTextField update_cperson;
    private javax.swing.JTextField update_emailid;
    // End of variables declaration//GEN-END:variables
}
