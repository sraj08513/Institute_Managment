package ims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class BranchDetails extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
     ResultSet rs;
     String bcode="B";
    byte t,s=0,r;Short p;
    byte b=0;
    public BranchDetails() throws SQLException {
        
        initComponents();
        ImageIcon img = new ImageIcon("d:/ims project/ims/src/ims/rayslogo.jpg");
        this.setIconImage(img.getImage());
        this.getRootPane().setDefaultButton(submit_bt);
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        ImageIcon im=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(im.getImage());
        bname_tf.requestFocus();
        stmt=con.prepareStatement("select bno from eautomatic");
        rs=stmt.executeQuery();
        rs.next();
        p=rs.getShort(1);
        p++;
        if(p<10)
            bcode_tf.setText(bcode+"00"+p);
        else if(p<100)
            bcode_tf.setText(bcode+"0"+p);
        else if(p<1000)
            bcode_tf.setText(bcode+p);
        else
        {
            p=1;
            bcode_tf.setText(bcode+"00"+p);
        }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bcode_tf = new javax.swing.JTextField();
        bname_tf = new javax.swing.JTextField();
        conperson_tf = new javax.swing.JTextField();
        conno_tf = new javax.swing.JTextField();
        email_id_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adress_ta = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        submit_bt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        phno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("branch_detail");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Branch Code");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Branch Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Contact Person");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Mobile No.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Email_id");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Address");

        bcode_tf.setEditable(false);
        bcode_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bname_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bname_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bname_tfFocusLost(evt);
            }
        });

        conperson_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conperson_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                conperson_tfFocusLost(evt);
            }
        });

        conno_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                conno_tfFocusLost(evt);
            }
        });

        email_id_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        adress_ta.setColumns(20);
        adress_ta.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        adress_ta.setRows(5);
        jScrollPane1.setViewportView(adress_ta);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("BRANCH DETAILS");

        submit_bt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit_bt.setText("SUBMIT");
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Phone No");

        phno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phnoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bname_tf)
                            .addComponent(conperson_tf)
                            .addComponent(conno_tf)
                            .addComponent(email_id_tf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bcode_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(submit_bt)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bcode_tf, conno_tf, conperson_tf, email_id_tf, phno});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bcode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bname_tf)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(conperson_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(conno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(email_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(submit_bt)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {conno_tf, phno});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
      if(bname_tf.getText().length()==0)
      {
          s=1;
          bname_tf.requestFocus();
      }
     else if(conperson_tf.getText().length()==0)
      {
          s=1;
          conperson_tf.requestFocus();
      }
     else if(conno_tf.getText().length()==0)
      {
          s=1;
          conno_tf.requestFocus();
      }
      else if(phno.getText().length()==0)
      {
          s=1;
          phno.requestFocus();
      }
      else if(adress_ta.getText().length()==0)
      {
          s=1;
          adress_ta.requestFocus();
      }
       else if(email_id_tf.getText().length()==0)
      {
          s=1;
          email_id_tf.requestFocus();
      }
      else
          s=0;
      if(s==1)
          JOptionPane.showMessageDialog(this,"please filled blank field!");
      if(s==0)
        try
        {    
            con=Conn.conLink();
            stmt=con.prepareStatement("insert into branch_details values(?,?,?,?,?,?,?)");
            stmt.setString(1,bcode_tf.getText());
            stmt.setString(2,bname_tf.getText());
            stmt.setString(3,conperson_tf.getText());
            stmt.setString(4,conno_tf.getText());
            stmt.setString(5,email_id_tf.getText());
            stmt.setString(6,adress_ta.getText());
            stmt.setString(7,phno.getText());
            r = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION);
                if(r==0)
                { 
                    stmt.executeUpdate();
                    stmt=con.prepareStatement("update eautomatic set bno=?");
                    stmt.setShort(1,p);
                    stmt.executeUpdate();
                    byte t = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert another record!","ims", JOptionPane.YES_NO_OPTION);
                    if(t==0)
                    {
                    bcode_tf.setText("");
                    bname_tf.setText("");
                    conperson_tf.setText("");
                    conno_tf.setText("");
                    email_id_tf.setText("");
                    adress_ta.setText("");
                    phno.setText("");
                    bname_tf.requestFocus();
                    stmt=con.prepareStatement("select bno from eautomatic");
                    rs=stmt.executeQuery();
                    rs.next();
                    p=rs.getShort(1);
                    p++;
                    if(p<10)
                    bcode_tf.setText(bcode+"00"+p);
                    else if(p<100)
                     bcode_tf.setText(bcode+"0"+p);
                     else if(p<1000)
                     bcode_tf.setText(bcode+p);
                     else
                       {
                        p=1;
                        bcode_tf.setText(bcode+"00"+p);
                       }
                    }
                    else
                        this.dispose();
                    con.close();
                }
                else if(r==1)
                {}
        }
        catch(Exception e){System.out.print("connection problem,try again!");}
    }//GEN-LAST:event_submit_btActionPerformed

    private void conno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conno_tfFocusLost
        t=(byte) conno_tf.getText().length();
         for(int i=0;i<t;i++)
            {
            char ch=conno_tf.getText().charAt(i);
            if(!(ch>=48&&ch<=58))
            {
                JOptionPane.showMessageDialog(this,"please insert valid conno");   
                conno_tf.requestFocus();
                break; 
            }
            }
    }//GEN-LAST:event_conno_tfFocusLost

    private void conperson_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conperson_tfFocusLost
t=(byte) conperson_tf.getText().length();
        for(int i=0;i<t;i++)
        {
            char ch=conperson_tf.getText().charAt(i);
            if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127) ||(ch==32)))
            {
                JOptionPane.showMessageDialog(this,"please insert valid person name");
                conperson_tf.requestFocus();
                break;
            }
        }        
    }//GEN-LAST:event_conperson_tfFocusLost

    private void bname_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bname_tfFocusLost
    t=(byte) bname_tf.getText().length();
        for(int i=0;i<t;i++)
        {
            char ch=bname_tf.getText().charAt(i);
            if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127) ||(ch==32)))
            {
                JOptionPane.showMessageDialog(this,"please insert valid branch name");
                bname_tf.requestFocus();
                break;
            }
        }    
    }//GEN-LAST:event_bname_tfFocusLost

    private void phnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phnoFocusLost
      t=(byte) phno.getText().length();
         if(t<16)    for(int i=0;i<t;i++)
              {
            char ch=phno.getText().charAt(i);
            if(!((ch>=48&&ch<=58)||(ch=='-')))
            {
                JOptionPane.showMessageDialog(this,"please insert valid conno");
                phno.requestFocus();
                break;
            }
                }   
         else{
             JOptionPane.showMessageDialog(this,"it contains less than 15");
              phno.requestFocus();}
    }//GEN-LAST:event_phnoFocusLost

    private void phnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phnoFocusGained
    t=(byte) conno_tf.getText().length();
    if(!(t==10))
    {
      JOptionPane.showMessageDialog(this,"mobile number contains only 10 digits"); 
                conno_tf.requestFocus();  
    }
    }//GEN-LAST:event_phnoFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adress_ta;
    private javax.swing.JTextField bcode_tf;
    private javax.swing.JTextField bname_tf;
    private javax.swing.JTextField conno_tf;
    private javax.swing.JTextField conperson_tf;
    private javax.swing.JTextField email_id_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phno;
    private javax.swing.JButton submit_bt;
    // End of variables declaration//GEN-END:variables
}
