package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Enquiry_service extends javax.swing.JFrame {
Connection con;
PreparedStatement stmt;
ResultSet rs;
String str,url="";
byte i=0;
    public Enquiry_service() {
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

        jTextField2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_comb = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        search_butt = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        delete_tf = new javax.swing.JTextField();
        delete_butt = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fn_cb = new javax.swing.JCheckBox();
        cname_cb = new javax.swing.JCheckBox();
        c_cb = new javax.swing.JCheckBox();
        cno_cb = new javax.swing.JCheckBox();
        ei_cb = new javax.swing.JCheckBox();
        dt_cb = new javax.swing.JCheckBox();
        r_cb = new javax.swing.JCheckBox();
        add_cb = new javax.swing.JCheckBox();
        fn_tf = new javax.swing.JTextField();
        cname_tf = new javax.swing.JTextField();
        c_tf = new javax.swing.JTextField();
        cno_tf = new javax.swing.JTextField();
        ei_tf = new javax.swing.JTextField();
        dt_tf = new javax.swing.JTextField();
        r_tf = new javax.swing.JTextField();
        update_butt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        update_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        add_ta = new javax.swing.JTextArea();
        all_cb = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enquiry Service Form");
        setResizable(false);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        search_comb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_comb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Contact No", "Email_id" }));

        search_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_butt.setText("SEARCH");
        search_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(search_comb, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_comb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(search_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        jTabbedPane1.addTab("SEARCH", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        delete_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_butt.setText("DELETE");
        delete_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(delete_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(delete_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(delete_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jTabbedPane1.addTab("DELETE", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        fn_cb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fn_cb.setText("Father's Name");
        fn_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn_cbActionPerformed(evt);
            }
        });

        cname_cb.setText("College Name");
        cname_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cname_cbActionPerformed(evt);
            }
        });

        c_cb.setText("Course");
        c_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cbActionPerformed(evt);
            }
        });

        cno_cb.setText("Cont No");
        cno_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cno_cbActionPerformed(evt);
            }
        });

        ei_cb.setText("Email_id");
        ei_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ei_cbActionPerformed(evt);
            }
        });

        dt_cb.setText("Desired Time");
        dt_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt_cbActionPerformed(evt);
            }
        });

        r_cb.setText("References");
        r_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cbActionPerformed(evt);
            }
        });

        add_cb.setText("Address");
        add_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cbActionPerformed(evt);
            }
        });

        fn_tf.setEditable(false);

        cname_tf.setEditable(false);

        c_tf.setEditable(false);

        cno_tf.setEditable(false);
        cno_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cno_tfActionPerformed(evt);
            }
        });

        ei_tf.setEditable(false);

        dt_tf.setEditable(false);

        r_tf.setEditable(false);

        update_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_butt.setText("UPDATE");
        update_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        update_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        add_ta.setEditable(false);
        add_ta.setColumns(20);
        add_ta.setRows(5);
        jScrollPane1.setViewportView(add_ta);

        all_cb.setText("All");
        all_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_cbActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(update_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r_cb)
                            .addComponent(add_cb)
                            .addComponent(dt_cb)
                            .addComponent(all_cb)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fn_cb)
                        .addComponent(cname_cb, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c_cb, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ei_cb)
                            .addComponent(cno_cb))))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(update_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fn_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(cname_tf)
                                    .addComponent(c_tf)
                                    .addComponent(cno_tf)
                                    .addComponent(dt_tf)
                                    .addComponent(ei_tf)
                                    .addComponent(r_tf))))
                        .addContainerGap(230, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fn_cb)
                            .addComponent(fn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cname_cb))
                    .addComponent(cname_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_cb)
                            .addComponent(c_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cno_cb))
                    .addComponent(cno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ei_cb)
                    .addComponent(ei_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt_cb)
                    .addComponent(dt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_cb)
                    .addComponent(r_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(add_cb)
                        .addGap(18, 18, 18)
                        .addComponent(all_cb)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(update_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jTabbedPane1.addTab("UPDATE", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttActionPerformed
        str=(String)search_comb.getSelectedItem();
                if(search_tf.getText().length()==0)
                    JOptionPane.showMessageDialog(this,"please select and enter valid data","Validation problem",JOptionPane.ERROR_MESSAGE);
                else
                {
                    url="select * from ENQUIRY where ";
                if(str.equals("Name"))
                    url=url+"upper(NAME)=?";
                else if(str.equals("Contact No"))
                    url=url+"upper(CONT_NO)=?";
                else if(str.equals("Email_id"))
                    url=url+"upper(EMAIL_ID)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,search_tf.getText().toUpperCase());
                rs=stmt.executeQuery();
                if(rs.next())
                    new Enquiry_record(rs).setVisible(true);
                else
                    JOptionPane.showMessageDialog(this,"Record not found","warning",JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Enquiry_service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_search_buttActionPerformed

    private void dt_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt_cbActionPerformed
       if(dt_cb.isSelected())
        {i++;
        if(i==8)
             all_cb.setSelected(true);
            dt_tf.setEditable(true);
            dt_tf.requestFocus();
        }
        else
       {
           i--;
            all_cb.setSelected(false);
            dt_tf.setEditable(false);
    }
    }//GEN-LAST:event_dt_cbActionPerformed

    private void r_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cbActionPerformed
         if(r_cb.isSelected())
        {i++;
        if(i==8)
             all_cb.setSelected(true);
            r_tf.setEditable(true);
            r_tf.requestFocus();
        }
        else
         {
             i--;
              all_cb.setSelected(false);
            r_tf.setEditable(false);
    }
    }//GEN-LAST:event_r_cbActionPerformed

    private void add_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cbActionPerformed
         if(add_cb.isSelected())
        { i++;
        if(i==8)
             all_cb.setSelected(true);
            add_ta.setEditable(true);
            add_ta.requestFocus();
        }
         else
         {i--;
          all_cb.setSelected(false);
            add_ta.setEditable(false);
    }
    }//GEN-LAST:event_add_cbActionPerformed

    private void delete_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttActionPerformed
         if(delete_tf.getText().length()==0)
            JOptionPane.showMessageDialog(this,"Input employee no!","Entry problem",JOptionPane.ERROR_MESSAGE);
        else
        {
            url="delete from enquiry where upper(NAME)=?";
            try {
                stmt=con.prepareStatement(url);
                stmt.setString(1,delete_tf.getText().toUpperCase());
                 int r=stmt.executeUpdate();
                if(r>0)
                   JOptionPane.showMessageDialog(this,"successfully deleted!","deletion perform",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this,"Record not found!","deletion problem",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Enquiry_service.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_delete_buttActionPerformed

    private void update_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttActionPerformed
       byte i=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
       url="update enquiry set ";
       if(fn_cb.isSelected())
       {
           if(i==0)
               url=url+" FNAME=?";
           else
               url=url+",FNAME=?";
           i++;
           a=i;
       }
        if(cname_cb.isSelected())
       {
           if(i==0)
               url=url+" COLLEGE=?";
           else
               url=url+",COLLEGE=?";
           i++;
           b=i;
       }
         if(c_cb.isSelected())
       {
           if(i==0)
               url=url+" COURSE=?";
           else
               url=url+",COURSE=?";
           i++;
           c=i;
       }
          if(cno_cb.isSelected())
       {
           if(i==0)
               url=url+" CONT_NO=?";
           else
               url=url+",CONT_NO=?";
           i++;
           d=i;
       }
           if(ei_cb.isSelected())
       {
           if(i==0)
               url=url+" EMAIL_ID=?";
           else
               url=url+",EMAIL_ID=?";
           i++;
           e=i;
       }
            if(dt_cb.isSelected())
       {
           if(i==0)
               url=url+" DESIRED_TIME=?";
           else
               url=url+",DESIRED_TIME=?";
           i++;
           f=i;
       }
             if(r_cb.isSelected())
       {
           if(i==0)
               url=url+" REFERENCE=?";
           else
               url=url+",REFERENCE=?";
           i++;
           g=i;
       }
              if(add_cb.isSelected())
       {
           if(i==0)
               url=url+" ADDRESS=?";
           else
               url=url+",ADDRESS=?";
           i++;
           h=i;
       }
              if(i==0)
                  JOptionPane.showMessageDialog(this, "select any option for update","selection problem",JOptionPane.ERROR_MESSAGE);
              else if(update_tf.getText().length()==0)
                  JOptionPane.showMessageDialog(this,"insert Name","Entry problem",JOptionPane.ERROR_MESSAGE);
              else
              {
                  url=url+" where upper(NAME)=?";
           try {
               stmt=con.prepareStatement(url);
               if(a>0)
                   stmt.setString(a,fn_tf.getText());
               if(b>0)
                   stmt.setString(b,cname_tf.getText());
                if(c>0)
                   stmt.setString(c,c_tf.getText());
                 if(d>0)
                   stmt.setString(d,cno_tf.getText());
                  if(e>0)
                   stmt.setString(e,ei_tf.getText());
                   if(f>0)
                   stmt.setString(f,dt_tf.getText());
                    if(g>0)
                   stmt.setString(g,r_tf.getText());
                     if(h>0)
                   stmt.setString(h,add_ta.getText());
                     stmt.setString(i+1,update_tf.getText().toUpperCase());
                     stmt.executeUpdate();
                     JOptionPane.showMessageDialog(this,"Successfully updated","Updation Complete",JOptionPane.INFORMATION_MESSAGE);
           } catch (SQLException ex) {
               Logger.getLogger(Enquiry_service.class.getName()).log(Level.SEVERE, null, ex);
           }
              }
    }//GEN-LAST:event_update_buttActionPerformed

    private void fn_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fn_cbActionPerformed
        if(fn_cb.isSelected())
        {i++;
        if(i==8)
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

    private void cname_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cname_cbActionPerformed
        if(cname_cb.isSelected())
        {
            i++;
            if(i==8)
                 all_cb.setSelected(true);
            cname_tf.setEditable(true);
            cname_tf.requestFocus();
        }
        else
        {
            i--;
             all_cb.setSelected(false);
            cname_tf.setEditable(false);
    }
    }//GEN-LAST:event_cname_cbActionPerformed

    private void c_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cbActionPerformed
        if(c_cb.isSelected())
        {i++;
        if(i==8)
             all_cb.setSelected(true);
            c_tf.setEditable(true);
            c_tf.requestFocus();
        }
        else

        {
            i--;
             all_cb.setSelected(false);
            c_tf.setEditable(false);
    }
   
    }//GEN-LAST:event_c_cbActionPerformed

    private void cno_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cno_cbActionPerformed
         if(cno_cb.isSelected())
        {i++;
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

    private void ei_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ei_cbActionPerformed
             if(ei_cb.isSelected())
        {i++;
                if(i==8)
                 all_cb.setSelected(true);    
            ei_tf.setEditable(true);
            ei_tf.requestFocus();
        }
             else{
                 i--;
                 all_cb.setSelected(false);
            ei_tf.setEditable(false);
    }
    }//GEN-LAST:event_ei_cbActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        update_tf.requestFocus();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void cno_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cno_tfActionPerformed
      
    }//GEN-LAST:event_cno_tfActionPerformed

    private void all_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_cbActionPerformed
        if(all_cb.isSelected())
        {
            i=8;
            fn_cb.setSelected(true);
            fn_tf.setEditable(true);
            cname_cb.setSelected(true);
            cname_tf.setEditable(true);
            c_cb.setSelected(true);
            c_tf.setEditable(true);
            cno_cb.setSelected(true);
            cno_tf.setEditable(true);
            ei_cb.setSelected(true);
            ei_tf.setEditable(true);
            dt_cb.setSelected(true);
            dt_tf.setEditable(true);
            r_cb.setSelected(true);
            r_tf.setEditable(true);
            add_cb.setSelected(true);
            add_ta.setEditable(true);
        }
        else
        {
            i=0;
            fn_cb.setSelected(false);
            fn_tf.setEditable(false);
            cname_cb.setSelected(false);
            cname_tf.setEditable(false);
            c_cb.setSelected(false);
            c_tf.setEditable(false);
            cno_cb.setSelected(false);
            cno_tf.setEditable(false);
            ei_cb.setSelected(false);
            ei_tf.setEditable(false);
            dt_cb.setSelected(false);
            dt_tf.setEditable(false);
            r_cb.setSelected(false);
            r_tf.setEditable(false);
            add_cb.setSelected(false);
            add_ta.setEditable(false);
        }
    }//GEN-LAST:event_all_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox add_cb;
    private javax.swing.JTextArea add_ta;
    private javax.swing.JCheckBox all_cb;
    private javax.swing.JCheckBox c_cb;
    private javax.swing.JTextField c_tf;
    private javax.swing.JCheckBox cname_cb;
    private javax.swing.JTextField cname_tf;
    private javax.swing.JCheckBox cno_cb;
    private javax.swing.JTextField cno_tf;
    private javax.swing.JButton delete_butt;
    private javax.swing.JTextField delete_tf;
    private javax.swing.JCheckBox dt_cb;
    private javax.swing.JTextField dt_tf;
    private javax.swing.JCheckBox ei_cb;
    private javax.swing.JTextField ei_tf;
    private javax.swing.JCheckBox fn_cb;
    private javax.swing.JTextField fn_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox r_cb;
    private javax.swing.JTextField r_tf;
    private javax.swing.JButton search_butt;
    private javax.swing.JComboBox<String> search_comb;
    private javax.swing.JTextField search_tf;
    private javax.swing.JButton update_butt;
    private javax.swing.JTextField update_tf;
    // End of variables declaration//GEN-END:variables
}
