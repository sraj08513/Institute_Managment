package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ClientPaymentservice extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str,url="";
    byte i=0;
   public ClientPaymentservice() {
        initComponents();
        con=Conn.conLink();
        this.setLocationRelativeTo(null);
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
   
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        delete_tf = new javax.swing.JTextField();
        delete_butt = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pa_cb = new javax.swing.JCheckBox();
        d_cb = new javax.swing.JCheckBox();
        b_cb = new javax.swing.JCheckBox();
        update_butt = new javax.swing.JButton();
        pa_tf = new javax.swing.JTextField();
        d_tf = new javax.swing.JTextField();
        b_tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        update_tf = new javax.swing.JTextField();
        all_cb = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Client Payment Service Form");

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        search_butt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Client no");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel3)
                                .addGap(144, 144, 144)
                                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("SEARCH", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CLIENT NO");

        delete_butt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete_butt.setText("DELETE");
        delete_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(delete_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(delete_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel20)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(delete_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("DELETE", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        pa_cb.setText("Paid Amount");
        pa_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pa_cbActionPerformed(evt);
            }
        });

        d_cb.setText("Date");
        d_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_cbActionPerformed(evt);
            }
        });

        b_cb.setText("Balance");
        b_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cbActionPerformed(evt);
            }
        });

        update_butt.setText("UPDATE");
        update_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttActionPerformed(evt);
            }
        });

        pa_tf.setEditable(false);

        d_tf.setEditable(false);

        b_tf.setEditable(false);

        jLabel1.setText("Client No");

        all_cb.setText("All");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(update_butt)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pa_cb)
                                .addComponent(d_cb)
                                .addComponent(b_cb)
                                .addComponent(all_cb)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pa_tf)
                                .addComponent(d_tf)
                                .addComponent(update_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))))
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_cb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pa_cb)
                    .addComponent(pa_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cb)
                    .addComponent(b_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(all_cb)
                .addGap(38, 38, 38)
                .addComponent(update_butt)
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("UPDATE", jPanel3);

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

    private void search_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttActionPerformed

               if(search_tf.getText().length()==0)
                    JOptionPane.showMessageDialog(this,"please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
                else
                {
            try {
             String cn=   search_tf.getText().toUpperCase();
                    new CLIENTpayment_record(cn).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ClientPaymentservice.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
   
    }//GEN-LAST:event_search_buttActionPerformed

    private void delete_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttActionPerformed
          if(delete_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input employee no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from client_payment where upper(client_no)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,delete_tf.getText().toUpperCase());                    
               int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ClientPaymentservice.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_delete_buttActionPerformed

    private void update_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttActionPerformed
        byte i=0,a=0,b=0,c=0;
        url="update client_payment set ";
        if(d_cb.isSelected())
        {
            if(i==0)
                url=url+" PDATE=?";
            else
                url=url+",PDATE=?";
            i++;
            a=i;
        
        }
        if(pa_cb.isSelected())
        {
            if(i==0)
                url=url+" PAMT=?";
            else
                url=url+",PAMT=?";
            i++;
            b=i;
        }
        if(b_cb.isSelected())
        {
            if(i==0)
                url=url+" BALANCE=?";
            else
                url=url+",BALANCE=?";
            i++;
            c=i;
        }
        if(i==0)
            JOptionPane.showMessageDialog(this,"select any option for update ","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(update_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"insert client no","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url=url+" where upper(CLIENT_NO)=?";
            try {
                stmt=con.prepareStatement(url);
               if(a>0)
                   stmt.setString(a,d_tf.getText());
                 if(b>0)
                    stmt.setString(b,pa_tf.getText());
                  if(c>0)
                    stmt.setString(c,b_tf.getText());
                  stmt.setString(i+1,update_tf.getText().toUpperCase());
                  stmt.executeUpdate();
                   JOptionPane.showMessageDialog(this,"Successfully updated!","updation complete",JOptionPane.ERROR_MESSAGE);
                
                
            } catch (SQLException ex) {
              
                JOptionPane.showMessageDialog(this, "amount and balance must contains only digit !");
                Logger.getLogger(ClientPaymentservice.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }
    }//GEN-LAST:event_update_buttActionPerformed

    private void pa_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pa_cbActionPerformed
        if(pa_cb.isSelected())
        {i++;
        if(i==3)
             all_cb.setSelected(true);
            pa_tf.setEditable(true);
            pa_tf.requestFocus();
        }
        else
        {i--;
         all_cb.setSelected(false);
            pa_tf.setEditable(false);
        }
    }//GEN-LAST:event_pa_cbActionPerformed

    private void d_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_cbActionPerformed
            if(d_cb.isSelected())
        { i++;
         if(i==3)
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

    private void b_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cbActionPerformed
            if(b_cb.isSelected())
        {i++;
        if(i==3)
         all_cb.setSelected(true);
            b_tf.setEditable(true);
            b_tf.requestFocus();
        }
        else
            {
                i--;
             all_cb.setSelected(false);
                b_tf.setEditable(false);
            }
    }//GEN-LAST:event_b_cbActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        update_tf.requestFocus();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed
        if(all_cb.isSelected())
        {  i=3;
            d_cb.setSelected(true);
            d_tf.setEditable(true);
            pa_cb.setSelected(true);
            pa_tf.setEditable(true);
            b_cb.setSelected(true);
            b_tf.setEditable(true);
        }
        else
        {   i=0;
            d_cb.setSelected(false);
            d_tf.setEditable(false);
            pa_cb.setSelected(false);
            pa_tf.setEditable(false);
            b_cb.setSelected(false);
            b_tf.setEditable(false);
        }
    }//GEN-LAST:event_all_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JCheckBox b_cb;
    private javax.swing.JTextField b_tf;
    private javax.swing.JCheckBox d_cb;
    private javax.swing.JTextField d_tf;
    private javax.swing.JButton delete_butt;
    private javax.swing.JTextField delete_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox pa_cb;
    private javax.swing.JTextField pa_tf;
    private javax.swing.JButton search_butt;
    private javax.swing.JTextField search_tf;
    private javax.swing.JButton update_butt;
    private javax.swing.JTextField update_tf;
    // End of variables declaration//GEN-END:variables
}
