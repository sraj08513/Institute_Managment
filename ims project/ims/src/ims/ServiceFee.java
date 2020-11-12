package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ServiceFee extends javax.swing.JFrame {

    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str,url="";
    byte t=0;
    public ServiceFee() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        ureg_tf.setEditable(false);
        uform_tf.setEditable(false);
        upmode_tf.setEditable(false);
        update_tf.setEditable(false);
        udis_tf.setEditable(false);
        unfee_tf.setEditable(false);
        upamt_tf.setEditable(false);
        ubal_tf.setEditable(false);
        uidate_tf.setEditable(false);
        this.getRootPane().setDefaultButton(search);
        this.getRootPane().setDefaultButton(update);
        this.getRootPane().setDefaultButton(delete);
        search_tf.requestFocus();
        urecno_tf.requestFocus();
        drec_tf.requestFocus();
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cob = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        urecno_tf = new javax.swing.JTextField();
        ureg_ch = new javax.swing.JCheckBox();
        uform_ch = new javax.swing.JCheckBox();
        upmode_ch = new javax.swing.JCheckBox();
        update_ch = new javax.swing.JCheckBox();
        udis_ch = new javax.swing.JCheckBox();
        unfee_ch = new javax.swing.JCheckBox();
        upamt_ch = new javax.swing.JCheckBox();
        ubal_ch = new javax.swing.JCheckBox();
        idate_ch = new javax.swing.JCheckBox();
        update = new javax.swing.JButton();
        ureg_tf = new javax.swing.JTextField();
        uform_tf = new javax.swing.JTextField();
        upmode_tf = new javax.swing.JTextField();
        update_tf = new javax.swing.JTextField();
        udis_tf = new javax.swing.JTextField();
        unfee_tf = new javax.swing.JTextField();
        upamt_tf = new javax.swing.JTextField();
        ubal_tf = new javax.swing.JTextField();
        uidate_tf = new javax.swing.JTextField();
        all_ch = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        drec_tf = new javax.swing.JTextField();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Money Receipt Service Form");
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_cob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_cob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registration No", "Form No", "Receipt No" }));

        search.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(search)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(search_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(76, 76, 76))
        );

        jTabbedPane1.addTab("SEARCH", jPanel1);

        jLabel1.setText("Reciept No");

        ureg_ch.setText("Registration No");
        ureg_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureg_chActionPerformed(evt);
            }
        });

        uform_ch.setText("Form No");
        uform_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uform_chActionPerformed(evt);
            }
        });

        upmode_ch.setText("Mode of Pay");
        upmode_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upmode_chActionPerformed(evt);
            }
        });

        update_ch.setText("Date of Pay");
        update_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_chActionPerformed(evt);
            }
        });

        udis_ch.setText("Discount");
        udis_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udis_chActionPerformed(evt);
            }
        });

        unfee_ch.setText("Net Fee");
        unfee_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unfee_chActionPerformed(evt);
            }
        });

        upamt_ch.setText("Pade Amount");
        upamt_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upamt_chActionPerformed(evt);
            }
        });

        ubal_ch.setText("Balance");
        ubal_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubal_chActionPerformed(evt);
            }
        });

        idate_ch.setText("Installment Date");
        idate_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idate_chActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        all_ch.setText("All");
        all_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_chActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ureg_ch)
                            .addComponent(uform_ch)
                            .addComponent(upmode_ch)
                            .addComponent(update_ch)
                            .addComponent(udis_ch)
                            .addComponent(unfee_ch)
                            .addComponent(upamt_ch)
                            .addComponent(ubal_ch)
                            .addComponent(idate_ch)
                            .addComponent(all_ch))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(urecno_tf)
                            .addComponent(ureg_tf)
                            .addComponent(uform_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(upmode_tf)
                            .addComponent(update_tf)
                            .addComponent(udis_tf)
                            .addComponent(unfee_tf)
                            .addComponent(upamt_tf)
                            .addComponent(ubal_tf)
                            .addComponent(uidate_tf)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(update)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(urecno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ureg_ch)
                    .addComponent(ureg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uform_ch)
                    .addComponent(uform_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upmode_ch)
                    .addComponent(upmode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_ch)
                    .addComponent(update_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(udis_ch)
                    .addComponent(udis_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unfee_ch)
                    .addComponent(unfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upamt_ch)
                    .addComponent(upamt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubal_ch)
                    .addComponent(ubal_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idate_ch)
                    .addComponent(uidate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(all_ch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update)
                .addContainerGap())
        );

        jTabbedPane1.addTab("UPDATE", jPanel2);

        jLabel2.setText("Reciept No");

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)
                        .addGap(141, 141, 141)
                        .addComponent(drec_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(delete)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(drec_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("DELETE", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        byte p;
        str=(String)search_cob.getSelectedItem();
        url=search_tf.getText().toUpperCase();
        if(url.length()==0)
            JOptionPane.showMessageDialog(this,"Please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
        else {
            if(str.equals("Registration No"))
                p=1;
            else if(str.equals("Form No"))
                p=2;
            else
                p=3;
            try {
                new SearchFee(url,p).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceFee.class.getName()).log(Level.SEVERE, null, ex);
            }      
        } 
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        byte i=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,k=0;
        url="update fee_details set ";
        if(ureg_ch.isSelected())
        {
            if(i==0)
                url=url+" reg_no=?";
            else
                url=url+",reg_no=?";
            
            i++;
            a=i;
        } 
        if(uform_ch.isSelected())
        {
            if(i==0)
                url=url+" adm_form_no=?";
            else
                url=url+",adm_form_no=?";
           
            i++;
            b=i;
        }    
        if(upmode_ch.isSelected())
        {
            if(i==0)
                url=url+" pmode=?";
            else
                url=url+",pmode=?";
            i++;
            c=i;
        }
        if(update_ch.isSelected())
        {
            if(i==0)
                url=url+" pdate=?";
            else
                url=url+",pdate=?";
            i++;
            d=i;
        }
         if(udis_ch.isSelected())
        {
            if(i==0)
                url=url+" discount=?";
            else
                url=url+",discount=?";
            i++;
            e=i;
        }
        if(unfee_ch.isSelected())
        {
            if(i==0)
                url=url+" net_fee=?";
            else
                url=url+",net_fee=?";
            i++;
            f=i;
        }
        if(upamt_ch.isSelected())
        {
            if(i==0)
                url=url+" pamt=?";
            else
                url=url+",pamt=?";
            i++;
            g=i;
        }
         if(ubal_ch.isSelected())
        {
            if(i==0)
                url=url+" balance=?";
            else
                url=url+",balance=?";
            i++;
            h=i;
        }
        if(idate_ch.isSelected())
        {
            if(i==0)
                url=url+" installment_date=?";
            else
                url=url+",installment_date=?";
            i++;
            k=i;
        }
        if(i==0)
            JOptionPane.showMessageDialog(this,"Select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(urecno_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Insert Reciept no","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url=url+" where upper(reciept_no)=?";
            try {
                stmt=con.prepareStatement(url);
                if(a>0)
                    stmt.setString(a,ureg_tf.getText());
                if(b>0)
                    stmt.setString(b,uform_tf.getText());
                if(c>0)
                    stmt.setString(c,upmode_tf.getText());
                if(d>0)
                    stmt.setString(d,update_tf.getText());
                if(e>0)
                    stmt.setString(e,udis_tf.getText());
                if(f>0)
                    stmt.setString(f,unfee_tf.getText());
                if(g>0)
                    stmt.setString(g,upamt_tf.getText());
                if(h>0)
                    stmt.setString(h,ubal_tf.getText());
                if(k>0)
                    stmt.setString(k,uidate_tf.getText());
                stmt.setString(i+1,urecno_tf.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceFee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void ureg_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureg_chActionPerformed
        if(ureg_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            ureg_tf.setEditable(true);
            ureg_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             ureg_tf.setEditable(false);   
         }
    }//GEN-LAST:event_ureg_chActionPerformed

    private void uform_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uform_chActionPerformed
       if(uform_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            uform_tf.setEditable(true);
            uform_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             uform_tf.setEditable(false);   
         }
    }//GEN-LAST:event_uform_chActionPerformed

    private void upmode_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upmode_chActionPerformed
        if(upmode_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            upmode_tf.setEditable(true);
            upmode_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             upmode_tf.setEditable(false);   
         }
    }//GEN-LAST:event_upmode_chActionPerformed

    private void update_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_chActionPerformed
        if(update_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            update_tf.setEditable(true);
            update_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             update_tf.setEditable(false);   
         }
    }//GEN-LAST:event_update_chActionPerformed

    private void udis_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udis_chActionPerformed
        if(udis_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            udis_tf.setEditable(true);
            udis_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             udis_tf.setEditable(false);   
         }
    }//GEN-LAST:event_udis_chActionPerformed

    private void unfee_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unfee_chActionPerformed
        if(unfee_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            unfee_tf.setEditable(true);
            unfee_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             unfee_tf.setEditable(false);   
         }
    }//GEN-LAST:event_unfee_chActionPerformed

    private void upamt_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upamt_chActionPerformed
        if(upamt_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            upamt_tf.setEditable(true);
            upamt_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             upamt_tf.setEditable(false);   
         }
    }//GEN-LAST:event_upamt_chActionPerformed

    private void ubal_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubal_chActionPerformed
        if(ubal_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            ubal_tf.setEditable(true);
            ubal_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             ubal_tf.setEditable(false);   
         }
    }//GEN-LAST:event_ubal_chActionPerformed

    private void idate_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idate_chActionPerformed
       if(idate_ch.isSelected())
        {  
            t++;
            if(t==9)
                all_ch.setSelected(true);
            uidate_tf.setEditable(true);
            uidate_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             uidate_tf.setEditable(false);   
         }
    }//GEN-LAST:event_idate_chActionPerformed

    private void all_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_chActionPerformed
         if(all_ch.isSelected())
        {
         t=9;
         ureg_tf.setEditable(true);
         uform_tf.setEditable(true);
         upmode_tf.setEditable(true);
         update_tf.setEditable(true);
         udis_tf.setEditable(true);
         unfee_tf.setEditable(true);
         upamt_tf.setEditable(true);
         ubal_tf.setEditable(true);
         uidate_tf.setEditable(true);
         ureg_tf.requestFocus();
         ureg_ch.setSelected(true);
         uform_ch.setSelected(true);
         upmode_ch.setSelected(true);
         update_ch.setSelected(true);
         udis_ch.setSelected(true);
         unfee_ch.setSelected(true);
         upamt_ch.setSelected(true);
         ubal_ch.setSelected(true);
         idate_ch.setSelected(true);
         
        }
        else
        {
         t=0;
         ureg_tf.setEditable(false);
         uform_tf.setEditable(false);
         upmode_tf.setEditable(false);
         update_tf.setEditable(false);
         udis_tf.setEditable(false);
         unfee_tf.setEditable(false);
         upamt_tf.setEditable(false);
         ubal_tf.setEditable(false);
         uidate_tf.setEditable(false);
         ureg_ch.setSelected(false);
         uform_ch.setSelected(false);
         upmode_ch.setSelected(false);
         update_ch.setSelected(false);
         udis_ch.setSelected(false);
         unfee_ch.setSelected(false);
         upamt_ch.setSelected(false);
         ubal_ch.setSelected(false);
         idate_ch.setSelected(false);
        }
    }//GEN-LAST:event_all_chActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(drec_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input Reciept no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from fee_details where upper(reciept_no)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,drec_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceFee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_ch;
    private javax.swing.JButton delete;
    private javax.swing.JTextField drec_tf;
    private javax.swing.JCheckBox idate_ch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> search_cob;
    private javax.swing.JTextField search_tf;
    private javax.swing.JCheckBox ubal_ch;
    private javax.swing.JTextField ubal_tf;
    private javax.swing.JCheckBox udis_ch;
    private javax.swing.JTextField udis_tf;
    private javax.swing.JCheckBox uform_ch;
    private javax.swing.JTextField uform_tf;
    private javax.swing.JTextField uidate_tf;
    private javax.swing.JCheckBox unfee_ch;
    private javax.swing.JTextField unfee_tf;
    private javax.swing.JCheckBox upamt_ch;
    private javax.swing.JTextField upamt_tf;
    private javax.swing.JButton update;
    private javax.swing.JCheckBox update_ch;
    private javax.swing.JTextField update_tf;
    private javax.swing.JCheckBox upmode_ch;
    private javax.swing.JTextField upmode_tf;
    private javax.swing.JTextField urecno_tf;
    private javax.swing.JCheckBox ureg_ch;
    private javax.swing.JTextField ureg_tf;
    // End of variables declaration//GEN-END:variables
}
