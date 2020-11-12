package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ServiceCourse extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str,url="";
    byte t=0;

    public ServiceCourse() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        ccode_tf.setEditable(false);
        cname_tf.setEditable(false);
        sduration_tf.setEditable(false);
        lduration_tf.setEditable(false);
        fee_tf.setEditable(false);
        this.getRootPane().setDefaultButton(search);
        this.getRootPane().setDefaultButton(update);
        this.getRootPane().setDefaultButton(delete);
        search_tf.requestFocus();
        uccode_tf.requestFocus();
        uccode_tf.requestFocus();
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
         ImageIcon im=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(im.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cob = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ccode_ch = new javax.swing.JCheckBox();
        cname_ch = new javax.swing.JCheckBox();
        sduration_ch = new javax.swing.JCheckBox();
        lduration_ch = new javax.swing.JCheckBox();
        fee_ch = new javax.swing.JCheckBox();
        all_ch = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        uccode_tf = new javax.swing.JTextField();
        ccode_tf = new javax.swing.JTextField();
        cname_tf = new javax.swing.JTextField();
        sduration_tf = new javax.swing.JTextField();
        lduration_tf = new javax.swing.JTextField();
        fee_tf = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dccode_tf = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Course Service Form");
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        search_cob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_cob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Code", "Course Name" }));

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(search_cob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(search)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(76, 76, 76))
        );

        jTabbedPane1.addTab("SEARCH", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ccode_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ccode_ch.setText("Course code");
        ccode_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccode_chActionPerformed(evt);
            }
        });

        cname_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cname_ch.setText("Course Name");
        cname_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cname_chActionPerformed(evt);
            }
        });

        sduration_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sduration_ch.setText("Short Duration");
        sduration_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sduration_chActionPerformed(evt);
            }
        });

        lduration_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lduration_ch.setText("Long Duration");
        lduration_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lduration_chActionPerformed(evt);
            }
        });

        fee_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fee_ch.setText("Fee");
        fee_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee_chActionPerformed(evt);
            }
        });

        all_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        all_ch.setText("All");
        all_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_chActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Course Code");

        uccode_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ccode_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cname_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sduration_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lduration_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        fee_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(all_ch)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(ccode_ch)
                                    .addComponent(cname_ch)
                                    .addComponent(sduration_ch)
                                    .addComponent(lduration_ch)
                                    .addComponent(fee_ch))
                                .addGap(134, 134, 134)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uccode_tf)
                                    .addComponent(ccode_tf)
                                    .addComponent(cname_tf)
                                    .addComponent(sduration_tf)
                                    .addComponent(lduration_tf)
                                    .addComponent(fee_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(update)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uccode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccode_ch)
                    .addComponent(ccode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname_ch)
                    .addComponent(cname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sduration_ch)
                    .addComponent(sduration_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lduration_ch)
                    .addComponent(lduration_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fee_ch)
                    .addComponent(fee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(all_ch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UPDATE", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Course Code");

        dccode_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)
                        .addGap(114, 114, 114)
                        .addComponent(dccode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(delete)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dccode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(71, 71, 71))
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
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
          byte p=0;
          String ptr;
         str=(String)search_cob.getSelectedItem();
         ptr=search_tf.getText().toUpperCase();
         if(ptr.length()==0)
             JOptionPane.showMessageDialog(this,"Please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
         else
         {
             if(str.equals("Course Code"))
                p=1;
             else
                p=2;
              try {
                  new SearchCourse(ptr,p).setVisible(true);
              } catch (SQLException ex) {
                  Logger.getLogger(ServiceCourse.class.getName()).log(Level.SEVERE, null, ex);
              }
         } 
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        byte i=0,a=0,b=0,c=0,d=0,e=0;
        url="update course_details set ";
        if(ccode_ch.isSelected())
        {
            if(i==0)
                url=url+" ccode=?";
            else
                url=url+",ccode=?";
            
            i++;
            a=i;
        } 
        if(cname_ch.isSelected())
        {
            if(i==0)
                url=url+" cname=?";
            else
                url=url+",cname=?";
           
            i++;
            b=i;
        }    
        if(sduration_ch.isSelected())
        {
            if(i==0)
                url=url+" short_duration=?";
            else
                url=url+",short_duration=?";
            i++;
            c=i;
        }
        if(lduration_ch.isSelected())
        {
            if(i==0)
                url=url+" long_duration=?";
            else
                url=url+",long_duration=?";
            i++;
            d=i;
        }
         if(fee_ch.isSelected())
        {
            if(i==0)
                url=url+" fee=?";
            else
                url=url+",fee=?";
            i++;
            e=i;
        }
        if(i==0)
            JOptionPane.showMessageDialog(this,"Select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(uccode_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Insert course code","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url=url+" where upper(ccode)=?";
            try {
                stmt=con.prepareStatement(url);
                if(a>0)
                    stmt.setString(a,ccode_tf.getText());
                if(b>0)
                    stmt.setString(b,cname_tf.getText());
                if(c>0)
                    stmt.setString(c,sduration_tf.getText());
                if(d>0)
                    stmt.setString(d,lduration_tf.getText());
                if(e>0)
                    stmt.setString(e,fee_tf.getText());
                stmt.setString(i+1,uccode_tf.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceCourse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         if(dccode_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input Course Code!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from course_details where upper(ccode)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,dccode_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceCourse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void ccode_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccode_chActionPerformed
         if(ccode_ch.isSelected())
        {  
            t++;
            if(t==5)
                all_ch.setSelected(true);
            ccode_tf.setEditable(true);
            ccode_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             ccode_tf.setEditable(false);   
         }
            
    }//GEN-LAST:event_ccode_chActionPerformed

    private void cname_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cname_chActionPerformed
          if(cname_ch.isSelected())
        {  
            t++;
            if(t==5)
                all_ch.setSelected(true);
            cname_tf.setEditable(true);
            cname_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             cname_tf.setEditable(false);   
         }
    }//GEN-LAST:event_cname_chActionPerformed

    private void sduration_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sduration_chActionPerformed
        if(sduration_ch.isSelected())
        {  
            t++;
            if(t==5)
                all_ch.setSelected(true);
            sduration_tf.setEditable(true);
            sduration_tf.requestFocus();
        }
        else
         {
             t--;    
             all_ch.setSelected(false);
             sduration_tf.setEditable(false);   
         }
    }//GEN-LAST:event_sduration_chActionPerformed

    private void lduration_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lduration_chActionPerformed
          if(lduration_ch.isSelected())
        {  
            t++;
            if(t==5)
                all_ch.setSelected(true);
            lduration_tf.setEditable(true);
            lduration_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             lduration_tf.setEditable(false);   
         }
    }//GEN-LAST:event_lduration_chActionPerformed

    private void fee_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee_chActionPerformed
         if(fee_ch.isSelected())
        {  
            t++;
            if(t==5)
                all_ch.setSelected(true);
            fee_tf.setEditable(true);
            fee_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             fee_tf.setEditable(false);   
         }
    }//GEN-LAST:event_fee_chActionPerformed

    private void all_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_chActionPerformed
        if(all_ch.isSelected())
        {
         t=5;   
         ccode_tf.setEditable(true);
         cname_tf.setEditable(true);
         sduration_tf.setEditable(true);
         lduration_tf.setEditable(true);
         fee_tf.setEditable(true);
         ccode_ch.setSelected(true);
         cname_ch.setSelected(true);
         sduration_ch.setSelected(true);
         lduration_ch.setSelected(true);
         fee_ch.setSelected(true);
         ccode_tf.requestFocus();
        }
        else
        {
         t=0;   
         ccode_tf.setEditable(false);
         cname_tf.setEditable(false);
         sduration_tf.setEditable(false);
         lduration_tf.setEditable(false);
         fee_tf.setEditable(false);
         ccode_ch.setSelected(false);
         cname_ch.setSelected(false);
         sduration_ch.setSelected(false);
         lduration_ch.setSelected(false);
         fee_ch.setSelected(false);
        }
    }//GEN-LAST:event_all_chActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_ch;
    private javax.swing.JCheckBox ccode_ch;
    private javax.swing.JTextField ccode_tf;
    private javax.swing.JCheckBox cname_ch;
    private javax.swing.JTextField cname_tf;
    private javax.swing.JTextField dccode_tf;
    private javax.swing.JButton delete;
    private javax.swing.JCheckBox fee_ch;
    private javax.swing.JTextField fee_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox lduration_ch;
    private javax.swing.JTextField lduration_tf;
    private javax.swing.JCheckBox sduration_ch;
    private javax.swing.JTextField sduration_tf;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> search_cob;
    private javax.swing.JTextField search_tf;
    private javax.swing.JTextField uccode_tf;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
