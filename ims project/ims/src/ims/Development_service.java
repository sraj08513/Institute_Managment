package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Development_service extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str, url="";
    byte i=0;
    public Development_service() {
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
        search_comb = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pt_tf = new javax.swing.JTextField();
        pt_cb = new javax.swing.JCheckBox();
        cname_cb = new javax.swing.JCheckBox();
        org_cb = new javax.swing.JCheckBox();
        p_cb = new javax.swing.JCheckBox();
        cno_cb = new javax.swing.JCheckBox();
        c_cb = new javax.swing.JCheckBox();
        ad_cb = new javax.swing.JCheckBox();
        dld_cb = new javax.swing.JCheckBox();
        cname_tf = new javax.swing.JTextField();
        update_tf = new javax.swing.JTextField();
        org_tf = new javax.swing.JTextField();
        p_tf = new javax.swing.JTextField();
        cno_tf = new javax.swing.JTextField();
        c_tf = new javax.swing.JTextField();
        ad_tf = new javax.swing.JTextField();
        dld_tf = new javax.swing.JTextField();
        update_butt = new javax.swing.JButton();
        all_cb = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        delete_tf = new javax.swing.JTextField();
        delete_butt = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Development service Form");
        setResizable(false);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_comb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_comb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client No", "Client Name" }));

        search_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(search_comb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_comb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        jTabbedPane1.addTab("SEARCH", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Client No");

        pt_tf.setEditable(false);

        pt_cb.setText("project title");
        pt_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_cbActionPerformed(evt);
            }
        });

        cname_cb.setText("Client Name");
        cname_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cname_cbActionPerformed(evt);
            }
        });

        org_cb.setText("Organization");
        org_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                org_cbActionPerformed(evt);
            }
        });

        p_cb.setText("Plateform");
        p_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_cbActionPerformed(evt);
            }
        });

        cno_cb.setText("Contact No");
        cno_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cno_cbActionPerformed(evt);
            }
        });

        c_cb.setText("Cost");
        c_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cbActionPerformed(evt);
            }
        });

        ad_cb.setText("Accepted Date");
        ad_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_cbActionPerformed(evt);
            }
        });

        dld_cb.setText("Dead Line Date ");
        dld_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dld_cbActionPerformed(evt);
            }
        });

        cname_tf.setEditable(false);

        org_tf.setEditable(false);

        p_tf.setEditable(false);

        cno_tf.setEditable(false);

        c_tf.setEditable(false);

        ad_tf.setEditable(false);

        update_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_butt.setText("UPDATE");
        update_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttActionPerformed(evt);
            }
        });

        all_cb.setText("All");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pt_cb)
                                    .addComponent(cname_cb)
                                    .addComponent(org_cb)
                                    .addComponent(p_cb)
                                    .addComponent(cno_cb)
                                    .addComponent(c_cb)
                                    .addComponent(ad_cb)
                                    .addComponent(dld_cb)
                                    .addComponent(all_cb))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(p_tf)
                                    .addComponent(pt_tf)
                                    .addComponent(org_tf)
                                    .addComponent(cname_tf)
                                    .addComponent(cno_tf)
                                    .addComponent(ad_tf)
                                    .addComponent(dld_tf)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(update_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(update_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pt_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_cb))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname_cb)
                    .addComponent(cname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(org_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(org_cb)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_cb)
                    .addComponent(p_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cno_cb))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cb)
                    .addComponent(c_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad_cb)
                    .addComponent(ad_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dld_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dld_tf))
                .addGap(18, 18, 18)
                .addComponent(all_cb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ad_tf, c_tf, cname_tf, cno_tf, dld_tf, org_tf, p_tf, pt_tf, update_tf});

        jTabbedPane1.addTab("UPDATE", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Client No");

        delete_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_butt.setText("DELETE");
        delete_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(delete_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(delete_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(delete_butt)
                .addGap(136, 136, 136))
        );

        jTabbedPane1.addTab("DELETE", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttActionPerformed
        str=(String)search_comb.getSelectedItem();
        if(search_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
        else
        {
             try 
            {
            url="select * from DEVELOPMENT where ";
            if(str.equals("Client No"))
            url=url+"upper(CLIENT_NO)=?";
            else 
            url=url+"upper(CLIENT_NAME)=?";
               stmt=con.prepareStatement(url);
                  stmt.setString(1,search_tf.getText().toUpperCase());
                   rs=stmt.executeQuery();
                    if(rs.next())
                 new Development_record(rs).setVisible(true);
                    else
                      JOptionPane.showMessageDialog(this,"Record not found","warning",JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Development_service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_search_buttActionPerformed

    private void update_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttActionPerformed
  
   byte i=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
 url=url+"update development set ";
 if(pt_cb.isSelected())
 {
     if(i==0)
         url=url+" PROJECT_TITLE=?";
     else
         url=url+",PROJECT_TITLE=?";
     i++;
     a=i;
 }
 if(cname_cb.isSelected())
 {
     if(i==0)
         url=url+" CLIENT_NAME=?";
     else
         url=url+",CLIENT_NAME=?";
     i++;
     b=i;
 }
 if(org_cb.isSelected())
 {
     if(i==0)
         url=url+" ORGANISATION=?";
     else
         url=url+",ORGANISATION=?";
     i++;
     c=i;
 }
 if(p_cb.isSelected())
 {
     if(i==0)
         url=url+" PLATFORM=?";
     else
         url=url+",PLATFORM=?";
     i++;
     d=i;
 }
 if(cno_cb.isSelected())
 {
     if(i==0)
         url=url+" DCONT_NO=?";
     else
         url=url+",DCONT_NO=?";
     i++;
     e=i;
 }
 if(c_cb.isSelected())
 {
     if(i==0)
         url=url+" DCOST=?";
     else
         url=url+",DCOST=?";
     i++;
     f=i;
 }
 if(ad_cb.isSelected())
 {
     if(i==0)
         url=url+" ACCEPTENCE_DATE=?";
     else
         url=url+",ACCEPTENCE_DATE=?";
     i++;
     g=i;
 }
 if(dld_cb.isSelected())
 {
     if(i==0)
         url=url+" DEAD_LINE_DATE=?";
     else
         url=url+",DEAD_LINE_DATE=?";
     i++;
     h=i;
 }
 if(i==0)
     JOptionPane.showMessageDialog(this,"select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
 else if(update_tf.getText().length()==0)
     JOptionPane.showMessageDialog(this,"insert client no","Entry problem",JOptionPane.ERROR_MESSAGE);
 else
 {
   
     url=url+" where upper(CLIENT_NO)=?";
     try {
         stmt=con.prepareStatement(url);
         if(a>0)
                    stmt.setString(a,pt_tf.getText());
         if(b>0)
                    stmt.setString(b,cname_tf.getText());
         if(c>0)
                    stmt.setString(c,org_tf.getText());
         if(d>0)
                    stmt.setString(d,p_tf.getText());
         if(e>0)
                    stmt.setString(e,cno_tf.getText());
         if(f>0)
                   stmt.setString(f,c_tf.getText());
         if(g>0)
                    stmt.setString(g,ad_tf.getText());
         if(h>0)
                    stmt.setString(h,dld_tf.getText());
          stmt.setString(i+1,update_tf.getText().toUpperCase());
          stmt.executeUpdate();
          JOptionPane.showMessageDialog(this,"Successfully updated!","Updation complete",JOptionPane.INFORMATION_MESSAGE);
    
     } catch (SQLException ex) {
         Logger.getLogger(Development_service.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
    }//GEN-LAST:event_update_buttActionPerformed

    private void delete_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttActionPerformed
      
        if(delete_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input client no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from development where upper(client_no)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,delete_tf.getText().toUpperCase());
                      
      int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
        
            } catch (SQLException ex) {
                Logger.getLogger(Development_service.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_delete_buttActionPerformed

    private void pt_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_cbActionPerformed
         if(pt_cb.isSelected())
        {    i++;
        if(i==8)
             all_cb.setSelected(true);
               pt_tf.setEditable(true);
               pt_tf.requestFocus();
        }
        else
         {i--;
          all_cb.setSelected(false);
             pt_tf.setEditable(false);
    }
    }//GEN-LAST:event_pt_cbActionPerformed

    private void cname_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cname_cbActionPerformed
          if(cname_cb.isSelected())
        {    i++;
        if(i==8)
             all_cb.setSelected(true);
               cname_tf.setEditable(true);
               cname_tf.requestFocus();
        }
        else
          {i--;
           all_cb.setSelected(false);
            cname_tf.setEditable(false);
    }
    }//GEN-LAST:event_cname_cbActionPerformed

    private void org_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_org_cbActionPerformed
          if(org_cb.isSelected())
        {  i++;
        if(i==8)
             all_cb.setSelected(true);
               org_tf.setEditable(true);
               org_tf.requestFocus();
        }
        else
          {i--;
           all_cb.setSelected(false);
            org_tf.setEditable(false);
          }
    }//GEN-LAST:event_org_cbActionPerformed

    private void p_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_cbActionPerformed
          if(p_cb.isSelected())
        {  i++;
        if(i==8)
             all_cb.setSelected(true);
               p_tf.setEditable(true);
               p_tf.requestFocus();
        }
        else
          {i--;
          
           all_cb.setSelected(false);
            p_tf.setEditable(false);
            
          }
    }//GEN-LAST:event_p_cbActionPerformed

    private void cno_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cno_cbActionPerformed
          if(cno_cb.isSelected())
        {    i++;
        if(i==8)
             all_cb.setSelected(true);
               cno_tf.setEditable(true);
               cno_tf.requestFocus();
        }
        else
          {i--;
           all_cb.setSelected(false);
              cno_tf.setEditable(false);
    }
    }//GEN-LAST:event_cno_cbActionPerformed

    private void c_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cbActionPerformed
          if(c_cb.isSelected())
        {    i++;
        if(i==8)
         all_cb.setSelected(true);
               c_tf.setEditable(true);
               c_tf.requestFocus();
        }
        else
          {i--;
           all_cb.setSelected(false);
            c_tf.setEditable(false);
    }
    }//GEN-LAST:event_c_cbActionPerformed

    private void ad_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_cbActionPerformed
          if(ad_cb.isSelected())
        {    i++;
        if(i==8)
             all_cb.setSelected(true);
               ad_tf.setEditable(true);
               ad_tf.requestFocus();
        }
        else
          {i--;
           all_cb.setSelected(false);
            ad_tf.setEditable(false);
          }
    }//GEN-LAST:event_ad_cbActionPerformed

    private void dld_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dld_cbActionPerformed
         if(dld_cb.isSelected())
        {   i++;
        if(i==8)
             all_cb.setSelected(true);
               dld_tf.setEditable(true);
               dld_tf.requestFocus();
        }
        else
         {
             i--;
              all_cb.setSelected(false);
            dld_tf.setEditable(false);
         }  
    }//GEN-LAST:event_dld_cbActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
      update_tf.requestFocus();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed
        if(all_cb.isSelected())
        {
            i=8;
            pt_cb.setSelected(true);
            pt_tf.setEditable(true);
             cname_cb.setSelected(true);
             cname_tf.setEditable(true);
             org_cb.setSelected(true);
             org_tf.setEditable(true);
              p_cb.setSelected(true);
            p_tf.setEditable(true);
             cno_cb.setSelected(true);
            cno_tf.setEditable(true);
             c_cb.setSelected(true);
            c_tf.setEditable(true);
             ad_cb.setSelected(true);
            ad_tf.setEditable(true);
             dld_cb.setSelected(true);
            dld_tf.setEditable(true);
        }
        else
        {
            i=0;
            pt_cb.setSelected(false);
            pt_tf.setEditable(false);
             cname_cb.setSelected(false);
             cname_tf.setEditable(false);
             org_cb.setSelected(false);
             org_tf.setEditable(false);
              p_cb.setSelected(false);
            p_tf.setEditable(false);
             cno_cb.setSelected(false);
            cno_tf.setEditable(false);
             c_cb.setSelected(false);
            c_tf.setEditable(false);
             ad_cb.setSelected(false);
            ad_tf.setEditable(false);
             dld_cb.setSelected(false);
            dld_tf.setEditable(false);
        }
    }//GEN-LAST:event_all_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ad_cb;
    private javax.swing.JTextField ad_tf;
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JCheckBox c_cb;
    private javax.swing.JTextField c_tf;
    private javax.swing.JCheckBox cname_cb;
    private javax.swing.JTextField cname_tf;
    private javax.swing.JCheckBox cno_cb;
    private javax.swing.JTextField cno_tf;
    private javax.swing.JButton delete_butt;
    private javax.swing.JTextField delete_tf;
    private javax.swing.JCheckBox dld_cb;
    private javax.swing.JTextField dld_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox org_cb;
    private javax.swing.JTextField org_tf;
    private javax.swing.JCheckBox p_cb;
    private javax.swing.JTextField p_tf;
    private javax.swing.JCheckBox pt_cb;
    private javax.swing.JTextField pt_tf;
    private javax.swing.JButton search_butt;
    private javax.swing.JComboBox<String> search_comb;
    private javax.swing.JTextField search_tf;
    private javax.swing.JButton update_butt;
    private javax.swing.JTextField update_tf;
    // End of variables declaration//GEN-END:variables
}
