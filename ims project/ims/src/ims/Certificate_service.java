package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Certificate_service extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str,url="";
    boolean slc;
    byte i=0;
    public Certificate_service() {
        initComponents();
        con=Conn.conLink();
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(search_butt);
        this.getRootPane().setDefaultButton(update_butt);
        this.getRootPane().setDefaultButton(delete_butt);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sn_cb = new javax.swing.JCheckBox();
        fn_cb = new javax.swing.JCheckBox();
        dob_cb = new javax.swing.JCheckBox();
        s_cb = new javax.swing.JCheckBox();
        d_cb = new javax.swing.JCheckBox();
        sn_tf = new javax.swing.JTextField();
        fn_tf = new javax.swing.JTextField();
        dob_tf = new javax.swing.JTextField();
        s_tf = new javax.swing.JTextField();
        d_tf = new javax.swing.JTextField();
        update_butt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        update_tf = new javax.swing.JTextField();
        all_cb = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        delete_tf = new javax.swing.JTextField();
        delete_butt = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Certificate Service Form");
        setResizable(false);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Registration No");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("SEARCH", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        sn_cb.setText("Student Name");
        sn_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn_cbActionPerformed(evt);
            }
        });

        fn_cb.setText("Father's Name");
        fn_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn_cbActionPerformed(evt);
            }
        });

        dob_cb.setText("D.O.B");
        dob_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_cbActionPerformed(evt);
            }
        });

        s_cb.setText("Subject");
        s_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_cbActionPerformed(evt);
            }
        });

        d_cb.setText("Duration");
        d_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_cbActionPerformed(evt);
            }
        });

        sn_tf.setEditable(false);

        fn_tf.setEditable(false);

        dob_tf.setEditable(false);

        s_tf.setEditable(false);

        d_tf.setEditable(false);

        update_butt.setText("UPDATE");
        update_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttActionPerformed(evt);
            }
        });

        jLabel1.setText("Registration No");

        all_cb.setText("All");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(all_cb)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(sn_cb)
                                                .addGap(95, 95, 95))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(fn_cb)
                                                .addGap(93, 93, 93)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(dob_cb)
                                            .addGap(10, 10, 10)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(s_cb)
                                            .addComponent(d_cb))
                                        .addGap(121, 121, 121)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(s_tf)
                                    .addComponent(dob_tf)
                                    .addComponent(sn_tf)
                                    .addComponent(fn_tf)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(update_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGap(93, 93, 93))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(update_butt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sn_cb)
                    .addComponent(sn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn_cb)
                    .addComponent(fn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob_cb)
                    .addComponent(dob_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_cb)
                    .addComponent(s_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_cb)
                    .addComponent(d_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(all_cb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(update_butt)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("UPDATE", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Registration No");

        delete_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_butt.setText("DELETE");
        delete_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(delete_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(delete_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(delete_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttActionPerformed
        String ptr=search_tf.getText().toUpperCase();
        if(ptr.length()==0)
            JOptionPane.showMessageDialog(this,"please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
        else {
            try {
                new certificate_record(ptr).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Certificate_service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_search_buttActionPerformed

    private void update_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttActionPerformed
        byte i=0,a=0,b=0,c=0,d=0,e=0;
        url="update certificate set ";
        if(sn_cb.isSelected()) {
            if(i==0)
                url=url+" name=?";
            else
                url=url+",name=?";
            i++;
            a=i;
        }
        if(fn_cb.isSelected()) {
            if(i==0)
                url=url+" FNAME=?";
            else
                url=url+",FNAME=?";
            i++;
            b=i;
        } 
        if(dob_cb.isSelected())  {
            if(i==0)
              url=url+" DOB=?";
            else
              url=url+",DOB=?";
          i++;
          c=i;
        }
         if(s_cb.isSelected())
        {
          if(i==0)
              url=url+" SUBJECT=?";
            else
              url=url+",SUBJECT=?";
          i++;
          d=i;
        }
          if(d_cb.isSelected())
        {
          if(i==0)
              url=url+" DURATION=?";
            else
              url=url+",DURATION=?";
          i++;
          e=i;
        }
        if(i==0)
            JOptionPane.showMessageDialog(this,"select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(update_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"insert Registration no","Entry Problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url=url+" where upper(REG_NO)=?";
            try {
                stmt=con.prepareStatement(url);
                if(a>0)
                    stmt.setString(a,sn_tf.getText());
                if(b>0)
                    stmt.setString(b,fn_tf.getText());
                if(c>0)
                    stmt.setString(c,dob_tf.getText());
                if(d>0)
                    stmt.setString(d,s_tf.getText());
                if(e>0)
                    stmt.setString(e,d_tf.getText());
                stmt.setString(i+1,update_tf.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","updation complete",JOptionPane.ERROR_MESSAGE);
                
            } catch (SQLException ex) {
                Logger.getLogger(Certificate_service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_update_buttActionPerformed

    private void sn_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn_cbActionPerformed
       if(sn_cb.isSelected())
       {
           i++;
           if(i==5)
               all_cb.setSelected(true);
           sn_tf.setEditable(true);
           sn_tf.requestFocus();
       }
        else 
        {
            i--;
          all_cb.setSelected(false);
          sn_tf.setEditable(false);
        }
    }//GEN-LAST:event_sn_cbActionPerformed

    private void fn_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fn_cbActionPerformed
        if(fn_cb.isSelected())
       {
           i++;
           if(i==5)
               all_cb.setSelected(true);
           fn_tf.setEditable(true);
           fn_tf.requestFocus();
       }
         else 
        {
            i--;
          all_cb.setSelected(false);
          fn_tf.setEditable(false);
        }
  
    }//GEN-LAST:event_fn_cbActionPerformed

    private void dob_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_cbActionPerformed
        if(dob_cb.isSelected())
       {
           i++;
           if(i==5)
               all_cb.setSelected(true);
           dob_tf.setEditable(true);
           dob_tf.requestFocus();
       }
         else
        {
            i--;
          all_cb.setSelected(false);
          dob_tf.setEditable(false);
        }
       
        
    }//GEN-LAST:event_dob_cbActionPerformed

    private void s_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_cbActionPerformed
     if(s_cb.isSelected())
       {
           i++;
           if(i==5)
               all_cb.setSelected(true);
           s_tf.setEditable(true);
           s_tf.requestFocus();
       }
      else
        {
            i--;
          all_cb.setSelected(false);
          s_tf.setEditable(false);
        }
    }//GEN-LAST:event_s_cbActionPerformed

    private void d_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_cbActionPerformed
        if(d_cb.isSelected())
       {
           i++;
           if(i==5)
               all_cb.setSelected(true);
           d_tf.setEditable(true);
           d_tf.requestFocus();
       }
       else
        {
            i--;
          all_cb.setSelected(false);
          d_tf.setEditable(false);
        }
 
    }//GEN-LAST:event_d_cbActionPerformed

    private void delete_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttActionPerformed
        if(delete_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input employee no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from certificate where upper(REG_NO)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,delete_tf.getText().toUpperCase());                    
               int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Certificate_service.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_delete_buttActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
       update_tf.requestFocus();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed

    if(all_cb.isSelected())
  {
      i=5;
    sn_cb.setSelected(true);
    sn_tf.setEditable(true);
    sn_tf.requestFocus();
    fn_cb.setSelected(true);
    fn_tf.setEditable(true);
    dob_cb.setSelected(true);
    dob_tf.setEditable(true);
    s_cb.setSelected(true);
    s_tf.setEditable(true);
    d_cb.setSelected(true);
    d_tf.setEditable(true);
  }
  
    else
  {
     i=0;
    sn_cb.setSelected(false);
    sn_tf.setEditable(false);
    fn_cb.setSelected(false);
    fn_tf.setEditable(false);
    dob_cb.setSelected(false);
    dob_tf.setEditable(false);
    s_cb.setSelected(false);
    s_tf.setEditable(false);
    d_cb.setSelected(false);
    d_tf.setEditable(false);
  }
    }//GEN-LAST:event_all_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JCheckBox d_cb;
    private javax.swing.JTextField d_tf;
    private javax.swing.JButton delete_butt;
    private javax.swing.JTextField delete_tf;
    private javax.swing.JCheckBox dob_cb;
    private javax.swing.JTextField dob_tf;
    private javax.swing.JCheckBox fn_cb;
    private javax.swing.JTextField fn_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox s_cb;
    private javax.swing.JTextField s_tf;
    private javax.swing.JButton search_butt;
    private javax.swing.JTextField search_tf;
    private javax.swing.JCheckBox sn_cb;
    private javax.swing.JTextField sn_tf;
    private javax.swing.JButton update_butt;
    private javax.swing.JTextField update_tf;
    // End of variables declaration//GEN-END:variables
}
