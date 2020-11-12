package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ServiceStudent extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str,url="";
    byte t=0;
    public ServiceStudent() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        sname_tf.setEditable(false);
        fname_tf.setEditable(false);
        dob_tf.setEditable(false);
        cno_tf.setEditable(false);
        email_tf.setEditable(false);
        gender_tf.setEditable(false);
        address_tf.setEditable(false);
        this.getRootPane().setDefaultButton(search);
        this.getRootPane().setDefaultButton(update);
        this.getRootPane().setDefaultButton(delete);
        search_tf.requestFocus();
        reg_tf.requestFocus();
        dreg_tf.requestFocus();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dreg_tf = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sname_ch = new javax.swing.JCheckBox();
        fname_ch = new javax.swing.JCheckBox();
        dob_ch = new javax.swing.JCheckBox();
        cno_ch = new javax.swing.JCheckBox();
        email_ch = new javax.swing.JCheckBox();
        gender_ch = new javax.swing.JCheckBox();
        address_ch = new javax.swing.JCheckBox();
        sname_tf = new javax.swing.JTextField();
        fname_tf = new javax.swing.JTextField();
        dob_tf = new javax.swing.JTextField();
        cno_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        gender_tf = new javax.swing.JTextField();
        address_tf = new javax.swing.JTextField();
        reg_tf = new javax.swing.JTextField();
        all_ch = new javax.swing.JCheckBox();
        update = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registration Service Form");
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_cob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_cob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registration No", "Name" }));

        search_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(search_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(search)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(65, 65, 65))
        );

        jTabbedPane1.addTab("SEARCH", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Registration No");

        dreg_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(dreg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(delete)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dreg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(77, 77, 77))
        );

        jTabbedPane1.addTab("DELETE", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Registration No");

        sname_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sname_ch.setText("Student Name");
        sname_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sname_chActionPerformed(evt);
            }
        });

        fname_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fname_ch.setText("Father's Name");
        fname_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_chActionPerformed(evt);
            }
        });

        dob_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob_ch.setText("Date of Barth");
        dob_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_chActionPerformed(evt);
            }
        });

        cno_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cno_ch.setText("Contact No");
        cno_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cno_chActionPerformed(evt);
            }
        });

        email_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_ch.setText("Email_id");
        email_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_chActionPerformed(evt);
            }
        });

        gender_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender_ch.setText("gender");
        gender_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_chActionPerformed(evt);
            }
        });

        address_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address_ch.setText("Address");
        address_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_chActionPerformed(evt);
            }
        });

        sname_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        fname_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dob_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cno_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        email_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        gender_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        address_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        reg_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        all_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        all_ch.setText("All");
        all_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_chActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(all_ch)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sname_ch)
                                    .addComponent(fname_ch)
                                    .addComponent(dob_ch)
                                    .addComponent(cno_ch)
                                    .addComponent(email_ch)
                                    .addComponent(gender_ch)
                                    .addComponent(address_ch)
                                    .addComponent(jLabel1))
                                .addGap(121, 121, 121)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sname_tf)
                                    .addComponent(fname_tf)
                                    .addComponent(dob_tf)
                                    .addComponent(cno_tf)
                                    .addComponent(email_tf)
                                    .addComponent(gender_tf)
                                    .addComponent(address_tf)
                                    .addComponent(reg_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))))
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(update)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(reg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sname_ch)
                    .addComponent(sname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_ch)
                    .addComponent(fname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob_ch)
                    .addComponent(dob_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cno_ch)
                    .addComponent(cno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_ch)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_ch)
                    .addComponent(gender_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_ch)
                    .addComponent(address_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(all_ch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("UPDATE", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
          str=(String)search_cob.getSelectedItem();
         if(search_tf.getText().length()==0)
             JOptionPane.showMessageDialog(this,"Please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
         else
         {
             url="select * from student_details where ";
             if(str.equals("Registration No"))
                 url=url+"upper(reg_no)=?";
             else
                 url=url+"upper(sname)=?";
             try {
                 stmt=con.prepareStatement(url);
                 stmt.setString(1,search_tf.getText().toUpperCase());
                 rs=stmt.executeQuery();
                 if(rs.next())
                     new SearchStudent(rs).setVisible(true);
                 else
                     JOptionPane.showMessageDialog(this,"Record not found","warning",JOptionPane.ERROR_MESSAGE);
             } 
             catch (SQLException ex) {
                 Logger.getLogger(ServiceStudent
                         .class.getName()).log(Level.SEVERE, null, ex);
             }    
         } 
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         byte i=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0;url="update student_details set ";
        if(sname_ch.isSelected())
        {
            if(i==0)
                url=url+" sname=?";
            else
                url=url+",sname=?";
            
            i++;
            a=i;
        } 
        if(fname_ch.isSelected())
        {
            if(i==0)
                url=url+" fname=?";
            else
                url=url+",fname=?";
           
            i++;
            b=i;
        }    
        if(dob_ch.isSelected())
        {
            if(i==0)
                url=url+" sdob=?";
            else
                url=url+",sdob=?";
            i++;
            c=i;
        }
        if(cno_ch.isSelected())
        {
            if(i==0)
                url=url+" scont_no=?";
            else
                url=url+",scont_no=?";
            i++;
            d=i;
        }
         if(email_ch.isSelected())
        {
            if(i==0)
                url=url+" semail_id=?";
            else
                url=url+",semail_id=?";
            i++;
            e=i;
        }
        if(gender_ch.isSelected())
        {
            if(i==0)
                url=url+" gender=?";
            else
                url=url+",gender=?";
            i++;
            f=i;
        }
        if(address_ch.isSelected())
        {
            if(i==0)
                url=url+" saddress=?";
            else
                url=url+",saddress=?";
            i++;
            g=i;
        }
        if(i==0)
            JOptionPane.showMessageDialog(this,"Select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(reg_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Insert Registration no","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url=url+" where upper(reg_no)=?";
            try {
                stmt=con.prepareStatement(url);
                if(a>0)
                    stmt.setString(a,sname_tf.getText());
                if(b>0)
                    stmt.setString(b,fname_tf.getText());
                if(c>0)
                    stmt.setString(c,dob_tf.getText());
                if(d>0)
                    stmt.setString(d,cno_tf.getText());
                if(e>0)
                    stmt.setString(e,email_tf.getText());
                if(f>0)
                    stmt.setString(f,gender_tf.getText());
                if(g>0)
                    stmt.setString(g,address_tf.getText());
                stmt.setString(i+1,reg_tf.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         if(dreg_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input Registration no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from student_details where upper(reg_no)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,dreg_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void sname_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sname_chActionPerformed
         if(sname_ch.isSelected())
        {  
            t++;
            if(t==7)
                all_ch.setSelected(true);
            sname_tf.setEditable(true);
            sname_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             sname_tf.setEditable(false);   
         }
    }//GEN-LAST:event_sname_chActionPerformed

    private void fname_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_chActionPerformed
        if(fname_ch.isSelected())
        {  
            t++;
            if(t==7)
                all_ch.setSelected(true);
            fname_tf.setEditable(true);
            fname_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             fname_tf.setEditable(false);   
         }
    }//GEN-LAST:event_fname_chActionPerformed

    private void dob_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_chActionPerformed
        if(dob_ch.isSelected())
        {  
            t++;
            if(t==7)
                all_ch.setSelected(true);
            dob_tf.setEditable(true);
            dob_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             dob_tf.setEditable(false);   
         }
    }//GEN-LAST:event_dob_chActionPerformed

    private void cno_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cno_chActionPerformed
        if(cno_ch.isSelected())
        {  
            t++;
            if(t==7)
                all_ch.setSelected(true);
            cno_tf.setEditable(true);
            cno_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             cno_tf.setEditable(false);   
         }
    }//GEN-LAST:event_cno_chActionPerformed

    private void email_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_chActionPerformed
        if(email_ch.isSelected())
        {  
            t++;
            if(t==7)
                all_ch.setSelected(true);
            email_tf.setEditable(true);
            email_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             email_tf.setEditable(false);   
         }
    }//GEN-LAST:event_email_chActionPerformed

    private void gender_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender_chActionPerformed
        if(gender_ch.isSelected())
        {  
            t++;
            if(t==7)
                all_ch.setSelected(true);
            gender_tf.setEditable(true);
            gender_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             gender_tf.setEditable(false);   
         }
    }//GEN-LAST:event_gender_chActionPerformed

    private void address_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_chActionPerformed
         if(address_ch.isSelected())
        {  
            t++;
            if(t==7)
                all_ch.setSelected(true);
            address_tf.setEditable(true);
            address_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             address_tf.setEditable(false);   
         }
    }//GEN-LAST:event_address_chActionPerformed

    private void all_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_chActionPerformed
        if(all_ch.isSelected())
        {
         t=7;   
         sname_tf.setEditable(true);
         fname_tf.setEditable(true);
         dob_tf.setEditable(true);
         cno_tf.setEditable(true);
         email_tf.setEditable(true);
         gender_tf.setEditable(true);
         address_tf.setEditable(true);
         sname_tf.requestFocus();
         sname_ch.setSelected(true);
         fname_ch.setSelected(true);
         dob_ch.setSelected(true);
         cno_ch.setSelected(true);
         email_ch.setSelected(true);
         gender_ch.setSelected(true);
         address_ch.setSelected(true);
        }
        else
        {
         t=0;
         sname_tf.setEditable(false);
         fname_tf.setEditable(false);
         dob_tf.setEditable(false);
         cno_tf.setEditable(false);
         email_tf.setEditable(false);
         address_tf.setEditable(false);
         gender_tf.setEditable(false);
         sname_ch.setSelected(false);
         fname_ch.setSelected(false);
         dob_ch.setSelected(false);
         cno_ch.setSelected(false);
         email_ch.setSelected(false);
         gender_ch.setSelected(false);
         address_ch.setSelected(false);
        }
    }//GEN-LAST:event_all_chActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox address_ch;
    private javax.swing.JTextField address_tf;
    private javax.swing.JCheckBox all_ch;
    private javax.swing.JCheckBox cno_ch;
    private javax.swing.JTextField cno_tf;
    private javax.swing.JButton delete;
    private javax.swing.JCheckBox dob_ch;
    private javax.swing.JTextField dob_tf;
    private javax.swing.JTextField dreg_tf;
    private javax.swing.JCheckBox email_ch;
    private javax.swing.JTextField email_tf;
    private javax.swing.JCheckBox fname_ch;
    private javax.swing.JTextField fname_tf;
    private javax.swing.JCheckBox gender_ch;
    private javax.swing.JTextField gender_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField reg_tf;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> search_cob;
    private javax.swing.JTextField search_tf;
    private javax.swing.JCheckBox sname_ch;
    private javax.swing.JTextField sname_tf;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
