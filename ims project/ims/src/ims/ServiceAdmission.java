package ims;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ServiceAdmission extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str,url="";
    byte t=0;
    public ServiceAdmission() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        course_tf.setEditable(false);
        date_tf.setEditable(false);
        fee_tf.setEditable(false);
        this.getRootPane().setDefaultButton(search);
        this.getRootPane().setDefaultButton(update);
        this.getRootPane().setDefaultButton(delete);
        search_tf.requestFocus();
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cob = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        course_ch = new javax.swing.JCheckBox();
        date_ch = new javax.swing.JCheckBox();
        fee_ch = new javax.swing.JCheckBox();
        uregno_tf = new javax.swing.JTextField();
        course_tf = new javax.swing.JTextField();
        date_tf = new javax.swing.JTextField();
        fee_tf = new javax.swing.JTextField();
        all_ch = new javax.swing.JCheckBox();
        update = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        d_tf = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admission Service Form");
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_cob.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        search_cob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registration No", "Form No" }));

        search_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        search.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(search))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(search_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(70, 70, 70))
        );

        jTabbedPane1.addTab("SEARCH", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Registration no");

        course_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        course_ch.setText("Course Name");
        course_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_chActionPerformed(evt);
            }
        });

        date_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        date_ch.setText("Date of Admission");
        date_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_chActionPerformed(evt);
            }
        });

        fee_ch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fee_ch.setText("Total Fee");
        fee_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee_chActionPerformed(evt);
            }
        });

        uregno_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        course_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        date_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        fee_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(all_ch)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fee_ch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(date_ch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(date_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(course_ch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(course_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uregno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(update)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uregno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_ch)
                    .addComponent(course_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_ch)
                    .addComponent(date_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fee_ch)
                    .addComponent(fee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(all_ch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(62, 62, 62))
        );

        jTabbedPane1.addTab("UPDATE", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        d_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Regitration No");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(d_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(delete)))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(70, 70, 70))
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
        byte p; 
        str=(String)search_cob.getSelectedItem();
        url=search_tf.getText().toUpperCase();
        if(url.length()==0)
            JOptionPane.showMessageDialog(this,"Please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
        else {
            if(str.equals("Registration No"))
                p=1;
            else
                p=2;    
            try {        
                new SearchAdmission(url,p).setVisible(true);
            } catch (SQLException | FileNotFoundException ex) {
                Logger.getLogger(ServiceAdmission.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         byte i=0,a=0,b=0,c=0;url="update admission set ";
        if(course_ch.isSelected())
        {
            if(i==0)
                url=url+" course=?";
            else
                url=url+",course=?";
            
            i++;
            a=i;
        } 
        if(date_ch.isSelected())
        {
            if(i==0)
                url=url+" adm_date=?";
            else
                url=url+",adm_date=?";
           
            i++;
            b=i;
        }    
        if(fee_ch.isSelected())
        {
            if(i==0)
                url=url+" total_fee=?";
            else
                url=url+",total_fee=?";
            i++;
            c=i;
        }
        if(i==0)
            JOptionPane.showMessageDialog(this,"Select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(uregno_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Insert Registration no","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url=url+" where upper(reg_no)=?";
            try {
                stmt=con.prepareStatement(url);
                if(a>0)
                    stmt.setString(a,course_tf.getText());
                if(b>0)
                    stmt.setString(b,date_tf.getText());
                if(c>0)
                    stmt.setString(c,fee_tf.getText());
                stmt.setString(i+1,uregno_tf.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceAdmission.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void course_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_chActionPerformed
          if(course_ch.isSelected())
        {  
            t++;
            if(t==3)
                all_ch.setSelected(true);
            course_tf.setEditable(true);
            course_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             course_tf.setEditable(false);   
         }
    }//GEN-LAST:event_course_chActionPerformed

    private void date_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_chActionPerformed
         if(date_ch.isSelected())
        {  
            t++;
            if(t==3)
                all_ch.setSelected(true);
            date_tf.setEditable(true);
            date_tf.requestFocus();
        }
        else
         {
             t--;
             all_ch.setSelected(false);
             date_tf.setEditable(false);   
         }
    }//GEN-LAST:event_date_chActionPerformed

    private void fee_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee_chActionPerformed
         if(fee_ch.isSelected())
        {  
            t++;
            if(t==3)
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
         t=3;
         course_tf.setEditable(true);
         date_tf.setEditable(true);
         fee_tf.setEditable(true);
         course_tf.requestFocus();
         course_ch.setSelected(true);
         date_ch.setSelected(true);
         fee_ch.setSelected(true);
        }
        else
        {
         t=0;
         course_tf.setEditable(false);
         date_tf.setEditable(false);
         fee_tf.setEditable(false);
         course_ch.setSelected(false);
         date_ch.setSelected(false);
         fee_ch.setSelected(false);
        }
    }//GEN-LAST:event_all_chActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(d_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input Resistration No!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from admission where upper(reg_no)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,d_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ServiceAdmission.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_ch;
    private javax.swing.JCheckBox course_ch;
    private javax.swing.JTextField course_tf;
    private javax.swing.JTextField d_tf;
    private javax.swing.JCheckBox date_ch;
    private javax.swing.JTextField date_tf;
    private javax.swing.JButton delete;
    private javax.swing.JCheckBox fee_ch;
    private javax.swing.JTextField fee_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> search_cob;
    private javax.swing.JTextField search_tf;
    private javax.swing.JButton update;
    private javax.swing.JTextField uregno_tf;
    // End of variables declaration//GEN-END:variables
}
