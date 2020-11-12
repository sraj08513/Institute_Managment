package ims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class service_services extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str,url="";
    byte k=0;
    public service_services() {
        initComponents();
        con=Conn.conLink();
        this.setLocationRelativeTo(null);
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
         this.getRootPane().setDefaultButton(search_butt);
          this.getRootPane().setDefaultButton(update);
           this.getRootPane().setDefaultButton(delete_bt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cmb = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteeno_tf = new javax.swing.JTextField();
        delete_bt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        eno_update = new javax.swing.JTextField();
        cn_cb = new javax.swing.JCheckBox();
        f_cb = new javax.swing.JCheckBox();
        st_cb = new javax.swing.JCheckBox();
        cn_tf = new javax.swing.JTextField();
        f_tf = new javax.swing.JTextField();
        st_tf = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        all_cb = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Service services Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_cmb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee No", "Cont Name" }));

        search_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
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
                        .addGap(59, 59, 59)
                        .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        tab.addTab("SEARCH", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employee No");

        delete_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_bt.setText("DELETE");
        delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btActionPerformed(evt);
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
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(delete_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(delete_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        tab.addTab("DELETE", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("EMPLOYEE NO");

        cn_cb.setText("Cont Name");
        cn_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cn_cbActionPerformed(evt);
            }
        });

        f_cb.setText("Facility");
        f_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_cbActionPerformed(evt);
            }
        });

        st_cb.setText("Service Type");
        st_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_cbActionPerformed(evt);
            }
        });

        cn_tf.setEditable(false);
        cn_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cn_tfActionPerformed(evt);
            }
        });

        f_tf.setEditable(false);
        f_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_tfActionPerformed(evt);
            }
        });

        st_tf.setEditable(false);
        st_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_tfActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        all_cb.setText("All");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
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
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cn_cb))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(eno_update, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f_cb)
                                    .addComponent(st_cb)
                                    .addComponent(all_cb))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(f_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(update)))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eno_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn_cb))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_cb))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_cb))
                .addGap(18, 18, 18)
                .addComponent(all_cb)
                .addGap(21, 21, 21)
                .addComponent(update)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        tab.addTab("UPDATE", jPanel2);

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
       byte p=0;
        str=(String)search_cmb.getSelectedItem();
        if(search_tf.getText().length()==0)
        JOptionPane.showMessageDialog(this,"please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
        else
        {
             if(str.equals("Employee No"))
                 p=1;
             else if(str.equals("Cont Name"))
                 p=2;
            try {
                String cn=search_tf.getText().toUpperCase();
                new servicerecord(cn,p).setVisible(true);
                /*url="select * from services where ";
                if(str.equals("Employee No"))
                url=url+"upper(eno)=?";
                else if(str.equals("Cont name"))
                url=url+"cont_name=?";
                else
                url=url+"cont_name=?";
                try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,search_tf.getText().toUpperCase());
                rs=stmt.executeQuery();
                if(rs.next())
                new servicerecord(rs).setVisible(true);
                else
                JOptionPane.showMessageDialog(this,"Record not found","warning",JOptionPane.ERROR_MESSAGE);
                String cn=search_tf.getText().toUpperCase();
                new servicerecord(cn).setVisible(true);
                
                } catch (SQLException ex) {
                Logger.getLogger(service_services.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            } catch (SQLException ex) {
                Logger.getLogger(service_services.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_search_buttActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       byte i=0,a=0,b=0,c=0;
       url="update services set ";
       if(cn_cb.isSelected())
       {
           if(i==0)
               url=url+" cont_name=?";
           else
               url=url+",cont_name=?";
           i++;
           a=i;
       }
       if(f_cb.isSelected())
       {
           if(i==0)
               url=url+" facility=?";
           else
               url=url+",facility=?";
           i++;
           b=i;
       }
       if(st_cb.isSelected())
       {
           if(i==0)
               url=url+" servicetype=?";
           else
               url=url+",servicetype=?";
           i++;
           c=i;
       }
        if(i==0)
            JOptionPane.showMessageDialog(this,"select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(eno_update.getText().length()==0)
            JOptionPane.showMessageDialog(this,"insert Registration no","Entry Problem",JOptionPane.ERROR_MESSAGE);
      else
        {
            url=url+" where upper(eno)=?";
           try {
               stmt=con.prepareStatement(url);
               if(a>0)
                   stmt.setString(a,cn_tf.getText());
               if(b>0)
                   stmt.setString(b,f_tf.getText());
               if(c>0)
                   stmt.setString(c,st_tf.getText());
                stmt.setString(i+1,eno_update.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","updation complete",JOptionPane.ERROR_MESSAGE);
                
           } catch (SQLException ex) {
               Logger.getLogger(service_services.class.getName()).log(Level.SEVERE, null, ex);
           }
      
        }
       
    }//GEN-LAST:event_updateActionPerformed

    private void cn_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cn_cbActionPerformed
        if(cn_cb.isSelected())
        {
            k++;
             if(k==3)
                all_cb.setSelected(true);
            cn_tf.setEditable(true);
            cn_tf.requestFocus();
        }
        else
        {
            k--;
        all_cb.setSelected(false);
            cn_tf.setEditable(false);
        }
    }//GEN-LAST:event_cn_cbActionPerformed

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed
      if(all_cb.isSelected())
      {
           k=3;
    cn_cb.setSelected(true);
    cn_tf.setEditable(true);
    cn_tf.requestFocus();
    f_cb.setSelected(true);
    f_tf.setEditable(true);
    st_cb.setSelected(true);
    st_tf.setEditable(true);
    
      }
      else
      {  k=0;
           cn_cb.setSelected(false);
           cn_tf.setEditable(false);
           f_cb.setSelected(false);
           f_tf.setEditable(false);
           st_cb.setSelected(false);
           st_tf.setEditable(false);

   
      } 
    }//GEN-LAST:event_all_cbActionPerformed

    private void f_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_tfActionPerformed
       
    }//GEN-LAST:event_f_tfActionPerformed

    private void st_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_tfActionPerformed
       
    }//GEN-LAST:event_st_tfActionPerformed

    private void f_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_cbActionPerformed
         if(f_cb.isSelected())
        {
            k++;
            if(k==3)
                all_cb.setSelected(true);
            f_tf.setEditable(true);
            f_tf.requestFocus();
        }
        else
         {   k--;
        all_cb.setSelected(false);
            f_tf.setEditable(false);
         }
    }//GEN-LAST:event_f_cbActionPerformed

    private void st_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_cbActionPerformed
         if(st_cb.isSelected())
        {
            k++;
            if(k==3)
                all_cb.setSelected(true);
            st_tf.setEditable(true);
            st_tf.requestFocus();
        }
        else
         {  k--;
        all_cb.setSelected(false);
            st_tf.setEditable(false);
         }
    }//GEN-LAST:event_st_cbActionPerformed

    private void cn_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cn_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cn_tfActionPerformed

    private void delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btActionPerformed
         if(deleteeno_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input employee no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from services where upper(eno)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,deleteeno_tf.getText().toUpperCase());
                int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(service_services.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_delete_btActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JCheckBox cn_cb;
    private javax.swing.JTextField cn_tf;
    private javax.swing.JButton delete_bt;
    private javax.swing.JTextField deleteeno_tf;
    private javax.swing.JTextField eno_update;
    private javax.swing.JCheckBox f_cb;
    private javax.swing.JTextField f_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton search_butt;
    private javax.swing.JComboBox<String> search_cmb;
    private javax.swing.JTextField search_tf;
    private javax.swing.JCheckBox st_cb;
    private javax.swing.JTextField st_tf;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
