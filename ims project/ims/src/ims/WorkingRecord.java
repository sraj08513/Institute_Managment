package ims;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class WorkingRecord extends javax.swing.JFrame {
    ResultSet s;
    int ctr;
    public WorkingRecord(ResultSet rs,byte t) throws SQLException {
        initComponents();
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        s=rs;
        ctr++;
         showData();
         if(t==1){
             pre_but.setVisible(false);
             first_but.setVisible(false);
             last_but.setVisible(false);
             next_but.setVisible(false);
             count_tf.setVisible(false);
         }
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
        intime_tf = new javax.swing.JTextField();
        outtime_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        first_but = new javax.swing.JButton();
        pre_but = new javax.swing.JButton();
        count_tf = new javax.swing.JTextField();
        next_but = new javax.swing.JButton();
        last_but = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Working Record");
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

        ename_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        intime_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        outtime_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("WORK DETAILS");

        first_but.setText("<<");
        first_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_butActionPerformed(evt);
            }
        });

        pre_but.setText("<");
        pre_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_butActionPerformed(evt);
            }
        });

        count_tf.setEditable(false);

        next_but.setText(">");
        next_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_butActionPerformed(evt);
            }
        });

        last_but.setText(">>");
        last_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_butActionPerformed(evt);
            }
        });

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
                            .addComponent(outtime_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(eno_tf)
                            .addComponent(ename_tf)
                            .addComponent(intime_tf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(first_but, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pre_but, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(count_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(next_but, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(last_but)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ename_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outtime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_but)
                    .addComponent(pre_but)
                    .addComponent(count_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next_but)
                    .addComponent(last_but))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void first_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_butActionPerformed
        try {
            if(s.isFirst())
            JOptionPane.showMessageDialog(this,"Already first record!");
            else
            {
                s.first();
                ctr=1;
                showData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MembersRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_first_butActionPerformed

    private void pre_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_butActionPerformed
        try {
            if(s.isFirst())
            JOptionPane.showMessageDialog(this,"Already first record!");
            else
            {
                s.previous();
                ctr--;
                showData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MembersRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pre_butActionPerformed

    private void next_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_butActionPerformed
        try {
            if(s.isLast())
            JOptionPane.showMessageDialog(this,"Already last record!");
            else
            {
                s.next();
                ctr++;
                showData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MembersRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_next_butActionPerformed

    private void last_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_butActionPerformed
        try {
            if(s.isLast())
            JOptionPane.showMessageDialog(this,"Already last record!");
            else
            {
                s.last();
                ctr=s.getRow();
                showData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MembersRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_last_butActionPerformed
public void showData()
   {
        try {
        eno_tf.setText(s.getString(1));
        ename_tf.setText(s.getString(2));
        intime_tf.setText(s.getString(3));
        outtime_tf.setText(s.getString(4));
        count_tf.setText("record no:"+ctr);
        } catch (SQLException ex) {
            Logger.getLogger(WorkingRecord.class.getName()).log(Level.SEVERE, null, ex);
        }      
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField count_tf;
    private javax.swing.JTextField ename_tf;
    private javax.swing.JTextField eno_tf;
    private javax.swing.JButton first_but;
    private javax.swing.JTextField intime_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton last_but;
    private javax.swing.JButton next_but;
    private javax.swing.JTextField outtime_tf;
    private javax.swing.JButton pre_but;
    // End of variables declaration//GEN-END:variables
}
