package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class payment_detal_Service extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;byte t=0;
    String str,url="";
    public payment_detal_Service() {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(search_butt);
        search_tf.requestFocus();
        con=Conn.conLink();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cmb = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        eno_lb = new javax.swing.JLabel();
        update_eno = new javax.swing.JTextField();
        pamt_cb = new javax.swing.JCheckBox();
        ramt_cb = new javax.swing.JCheckBox();
        pmode_cb = new javax.swing.JCheckBox();
        update_pamt = new javax.swing.JTextField();
        update_ramt = new javax.swing.JTextField();
        update_pmode = new javax.swing.JTextField();
        update_bt = new javax.swing.JButton();
        pdate_cb = new javax.swing.JCheckBox();
        all_cb = new javax.swing.JCheckBox();
        update_pdate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteeno_tf = new javax.swing.JTextField();
        delete_bt = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("payment_service");
        setResizable(false);

        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee No" }));

        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(search_butt)))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(search_butt)
                .addGap(105, 105, 105))
        );

        tab.addTab("SEARCH", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        eno_lb.setText("Employee No");

        pamt_cb.setText("Paid Amount");
        pamt_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pamt_cbActionPerformed(evt);
            }
        });

        ramt_cb.setText("Rest Amount");
        ramt_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramt_cbActionPerformed(evt);
            }
        });

        pmode_cb.setText("Payment Mode");
        pmode_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmode_cbActionPerformed(evt);
            }
        });

        update_pamt.setEditable(false);

        update_ramt.setEditable(false);

        update_pmode.setEditable(false);

        update_bt.setText("UPDATE");
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });

        pdate_cb.setText("Payment Date");
        pdate_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdate_cbActionPerformed(evt);
            }
        });

        all_cb.setText("ALL");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
            }
        });

        update_pdate.setEditable(false);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(eno_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(pamt_cb))
                                        .addGap(92, 92, 92)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(update_pamt, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(update_eno)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ramt_cb)
                                            .addComponent(pmode_cb)
                                            .addComponent(pdate_cb)
                                            .addComponent(all_cb))
                                        .addGap(96, 96, 96)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(update_pmode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(update_ramt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(update_pdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(update_bt)))
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eno_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_eno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_pamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pamt_cb))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_ramt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ramt_cb))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_pmode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pmode_cb))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_pdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdate_cb))
                .addGap(18, 18, 18)
                .addComponent(all_cb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update_bt)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        tab.addTab("UDATE", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Employee No");

        delete_bt.setText("DELETE");
        delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(delete_bt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(delete_bt)
                .addGap(72, 72, 72))
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
             try {
                 String str=search_tf.getText().toUpperCase();
                 new PaymentRecord(str).setVisible(true);
             } catch (SQLException ex) {
                 Logger.getLogger(payment_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }//GEN-LAST:event_search_buttActionPerformed

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed
        byte i=0,a=0,b=0,c=0,d=0;url="update payment_details set ";
        if(pdate_cb.isSelected())
        {
            if(i==0)
                url=url+" pdate=?";
            else
                url=url+",pdate=?";
            
            i++;
            a=i;
        } 
        if(pamt_cb.isSelected())
        {
            if(i==0)
                url=url+" pamt=?";
            else
                url=url+",pamt=?";
           
            i++;
            b=i;
        }    
        if(ramt_cb.isSelected())
        {
            if(i==0)
                url=url+" rest_amt=?";
            else
                url=url+",rest_amt=?";
            i++;
            c=i;
        }      
        if(pmode_cb.isSelected())
        {
            if(i==0)
                url=url+" pmode=?";
            else
                url=url+",pmode=?";
            i++;
            d=i;
        }      
        if(i==0)
            JOptionPane.showMessageDialog(this,"Select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
        else if(update_eno.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Insert employee no","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url=url+" where upper(eno)=?";
            try {
                stmt=con.prepareStatement(url);
                if(a>0)
                    stmt.setString(a,update_pdate.getText());
                if(b>0)
                    stmt.setString(b,update_pamt.getText());
                if(c>0)
                    stmt.setString(c,update_ramt.getText());
                if(d>0)
                    stmt.setString(d,update_pmode.getText());
                stmt.setString(i+1,update_eno.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Work_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                                        

    }//GEN-LAST:event_update_btActionPerformed

    private void pamt_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pamt_cbActionPerformed
        if(pamt_cb.isSelected())
        {    
               t++;
               if(t==4)
                   all_cb.setSelected(true);
               update_pamt.setEditable(true);
               update_pamt.requestFocus();
        }
        else
        {
            t--;
             all_cb.setSelected(false);
             update_pamt.setEditable(false);
        }
    }//GEN-LAST:event_pamt_cbActionPerformed

    private void ramt_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramt_cbActionPerformed
         if(ramt_cb.isSelected())
        {   
               t++;
               if(t==4)
                   all_cb.setSelected(true);
               update_ramt.setEditable(true);
               update_ramt.requestFocus();
        }
        else
         {
             t--;
            all_cb.setSelected(false);
            update_ramt.setEditable(false);
         }
    }//GEN-LAST:event_ramt_cbActionPerformed

    private void pmode_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmode_cbActionPerformed
         if(pmode_cb.isSelected())
        {    
               t++;
               if(t==4)
                   all_cb.setSelected(true);
               update_pmode.setEditable(true);
               update_pmode.requestFocus();
        }
        else
         {
             t--;
            all_cb.setSelected(false);
            update_pmode.setEditable(false);
         }
    }//GEN-LAST:event_pmode_cbActionPerformed

    private void pdate_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdate_cbActionPerformed
         if(pdate_cb.isSelected())
        {    
             t++;
               if(t==4)
                   all_cb.setSelected(true);
               update_pdate.setEditable(true);
               update_pdate.requestFocus();
        }
        else
         {
             t--;
            all_cb.setSelected(false);
            update_pdate.setEditable(false);
         }
    }//GEN-LAST:event_pdate_cbActionPerformed

    private void delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btActionPerformed
         if(deleteeno_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input employee no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from payment_details where upper(eno)=?";
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

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        update_eno.requestFocus();
    }//GEN-LAST:event_tabMouseClicked

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed
        if(all_cb.isSelected())
        {
            t=4;
            pamt_cb.setSelected(true);
            ramt_cb.setSelected(true);
            pmode_cb.setSelected(true);
            pdate_cb.setSelected(true);
            update_pamt.setEditable(true);
            update_ramt.setEditable(true);
            update_pmode.setEditable(true);
            update_pdate.setEditable(true);
        }
        else
        {
            t=0;
            pamt_cb.setSelected(false);
            ramt_cb.setSelected(false);
            pmode_cb.setSelected(false);
            pdate_cb.setSelected(false);
            update_pamt.setEditable(false);
            update_ramt.setEditable(false);
            update_pmode.setEditable(false);
            update_pdate.setEditable(false);
        }        
    }//GEN-LAST:event_all_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JButton delete_bt;
    private javax.swing.JTextField deleteeno_tf;
    private javax.swing.JLabel eno_lb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox pamt_cb;
    private javax.swing.JCheckBox pdate_cb;
    private javax.swing.JCheckBox pmode_cb;
    private javax.swing.JCheckBox ramt_cb;
    private javax.swing.JButton search_butt;
    private javax.swing.JComboBox<String> search_cmb;
    private javax.swing.JTextField search_tf;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JButton update_bt;
    private javax.swing.JTextField update_eno;
    private javax.swing.JTextField update_pamt;
    private javax.swing.JTextField update_pdate;
    private javax.swing.JTextField update_pmode;
    private javax.swing.JTextField update_ramt;
    // End of variables declaration//GEN-END:variables
}
