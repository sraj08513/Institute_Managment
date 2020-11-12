package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class work_details extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    byte t,s=0,r;
    public work_details() {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        this.getRootPane().setDefaultButton(submit_bt);
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eno_tf = new javax.swing.JTextField();
        ename_tf = new javax.swing.JTextField();
        submit_bt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        intime = new lu.tudor.santec.jtimechooser.JTimeChooser();
        outtime = new lu.tudor.santec.jtimechooser.JTimeChooser();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Work Details Form");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Employee Number");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Employee Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Intime");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Outtime");

        eno_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        eno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eno_tfFocusLost(evt);
            }
        });

        ename_tf.setEditable(false);
        ename_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        submit_bt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit_bt.setText("SUBMIT");
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("WORK DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eno_tf)
                            .addComponent(ename_tf)
                            .addComponent(intime, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(outtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(submit_bt)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ename_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(intime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(outtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(submit_bt)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
       con=Conn.conLink();
       try{
            stmt=con.prepareStatement("insert into working_details values(?,?,?,?)");
            stmt.setString(1,eno_tf.getText());
            stmt.setString(2,ename_tf.getText());
            stmt.setString(3, intime.getFormatedTime());
            stmt.setString(4,outtime.getFormatedTime());
            r = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION);
                if(r==0)
                { 
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"sucessfully record inserted!");
                    byte t = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert another record!","ims", JOptionPane.YES_NO_OPTION);
                    if(t==0)
                    {
                        eno_tf.setText("");
                        ename_tf.setText("");
                        eno_tf.requestFocus();
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

    private void eno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eno_tfFocusLost
        con=Conn.conLink();
        try {
            stmt=con.prepareStatement("select upper(eno),ename from member_details");
            ResultSet rs = stmt.executeQuery();
            byte t=0;
            while(rs.next())
            {
                String str=rs.getString(1);
                String name=rs.getString(2);
                if(eno_tf.getText().toUpperCase().equals(str))
                {
                    ename_tf.setText(name);
                    t=1;
                    break;
                }
            }
            if(t==0)
            { 
                 eno_tf.requestFocus();
                 JOptionPane.showMessageDialog(this,"please insert valid employee no");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(work_details.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_eno_tfFocusLost

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ename_tf;
    private javax.swing.JTextField eno_tf;
    private lu.tudor.santec.jtimechooser.JTimeChooser intime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField4;
    private lu.tudor.santec.jtimechooser.JTimeChooser outtime;
    private javax.swing.JButton submit_bt;
    // End of variables declaration//GEN-END:variables
}
