package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Work_detal_Service extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;byte t=0;
    byte ctr,a,b,c,d; String str,url="";
    public Work_detal_Service() {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        this.getRootPane().setDefaultButton(search_butt);
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cmb = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        eno_lb = new javax.swing.JLabel();
        update_eno = new javax.swing.JTextField();
        ename_cb = new javax.swing.JCheckBox();
        intime_cb = new javax.swing.JCheckBox();
        outtime_cb = new javax.swing.JCheckBox();
        tf1 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        all_cb = new javax.swing.JCheckBox();
        tf3 = new lu.tudor.santec.jtimechooser.JTimeChooser();
        tf4 = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteeno_tf = new javax.swing.JTextField();
        delete_bt = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Work Details Service Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee No", "Employee name" }));

        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(search_butt)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(search_butt)
                .addGap(83, 83, 83))
        );

        tab.addTab("SEARCH", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        eno_lb.setText("Employee No");

        ename_cb.setText("Employee name");
        ename_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ename_cbActionPerformed(evt);
            }
        });

        intime_cb.setText("Intime");
        intime_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intime_cbActionPerformed(evt);
            }
        });

        outtime_cb.setText("Outtime");
        outtime_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outtime_cbActionPerformed(evt);
            }
        });

        tf1.setEditable(false);

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        all_cb.setText("ALL");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(eno_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intime_cb)
                                    .addComponent(ename_cb)
                                    .addComponent(outtime_cb)
                                    .addComponent(all_cb))))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(update_eno)
                            .addComponent(tf3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(update)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(eno_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(update_eno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ename_cb))
                                        .addGap(18, 18, 18)
                                        .addComponent(intime_cb))
                                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(outtime_cb))
                            .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(all_cb))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addComponent(update)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        tab.addTab("UDATE", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Employee No");

        delete_bt.setBackground(new java.awt.Color(255, 255, 255));
        delete_bt.setText("DELETE");
        delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(delete_bt)))
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteeno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(delete_bt)
                .addGap(64, 64, 64))
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
         byte t=0;
         if(search_tf.getText().length()==0)
             JOptionPane.showMessageDialog(this,"please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
         else
         {
             url="select * from working_details where ";
             if(str.equals("Employee No")){
                 t=1;
                 url=url+"upper(eno)=?";}
             else
                 url=url+"upper(ename)=?";
             try {
                 stmt=con.prepareStatement(url,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                 stmt.setString(1,search_tf.getText().toUpperCase());
                 rs=stmt.executeQuery();
                 if(rs.next()){
                     rs.first();
                     new WorkingRecord(rs,t).setVisible(true);}
                 else
                     JOptionPane.showMessageDialog(this,"Record not found","warning",JOptionPane.ERROR_MESSAGE);
             } catch (SQLException ex) {
                 Logger.getLogger(Work_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
             }    
         }        
    }//GEN-LAST:event_search_buttActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        byte i=0,a=0,b=0,c=0,d=0;url="update working_details set ";
        if(ename_cb.isSelected())
        {
            if(i==0)
                url=url+" ename=?";
            else
                url=url+",ename=?";
            
            i++;
            a=i;
        } 
        if(intime_cb.isSelected())
        {
            if(i==0)
                url=url+" intime=?";
            else
                url=url+",intime=?";
           
            i++;
            b=i;
        }    
        if(outtime_cb.isSelected())
        {
            if(i==0)
                url=url+" outtime=?";
            else
                url=url+",outtime=?";
            i++;
            c=i;
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
                    stmt.setString(a,tf1.getText());
                if(b>0)
                    stmt.setString(b,tf3.getFormatedTime());
                if(c>0)
                    stmt.setString(c,tf4.getFormatedTime());
                stmt.setString(i+1,update_eno.getText().toUpperCase());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Work_detal_Service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }//GEN-LAST:event_updateActionPerformed

    private void delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btActionPerformed
        if(deleteeno_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input employee no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from working_details where upper(eno)=?";
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

    private void ename_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ename_cbActionPerformed
 if(ename_cb.isSelected())
        {    
            t++;
               if(t==3)
                   all_cb.setSelected(true);
               tf1.setEditable(true);
               tf1.requestFocus();
        }
        else
        {
            t--;
            tf1.setEditable(false);
            all_cb.setSelected(false);
        }  
    }//GEN-LAST:event_ename_cbActionPerformed

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed
        if(all_cb.isSelected())
        {
            t=3;
            ename_cb.setSelected(true);
            intime_cb.setSelected(true);
            outtime_cb.setSelected(true);
            tf1.setEditable(true);
        }
        else
        {
            t=0;
            ename_cb.setSelected(false);
            intime_cb.setSelected(false);
            outtime_cb.setSelected(false);
            tf1.setEditable(false);
        }
    }//GEN-LAST:event_all_cbActionPerformed

    private void outtime_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outtime_cbActionPerformed
         if(outtime_cb.isSelected())
        {    
               t++;
                if(t==3)
               {
                   all_cb.setSelected(true);
               }
               tf4.requestFocus();
        }
        else
        { 
            t--;
            all_cb.setSelected(false);
        }
    }//GEN-LAST:event_outtime_cbActionPerformed

    private void intime_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intime_cbActionPerformed
if(intime_cb.isSelected())
        {    
               t++;
               if(t==3)
                   all_cb.setSelected(true);
               tf3.requestFocus();
        }
        else
        {
            t--;
            all_cb.setSelected(false);
        } 
    }//GEN-LAST:event_intime_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JButton delete_bt;
    private javax.swing.JTextField deleteeno_tf;
    private javax.swing.JCheckBox ename_cb;
    private javax.swing.JLabel eno_lb;
    private javax.swing.JCheckBox intime_cb;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox outtime_cb;
    private javax.swing.JButton search_butt;
    private javax.swing.JComboBox<String> search_cmb;
    private javax.swing.JTextField search_tf;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField tf1;
    private lu.tudor.santec.jtimechooser.JTimeChooser tf3;
    private lu.tudor.santec.jtimechooser.JTimeChooser tf4;
    private javax.swing.JButton update;
    private javax.swing.JTextField update_eno;
    // End of variables declaration//GEN-END:variables
}
