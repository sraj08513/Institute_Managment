package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class PaymentDetails extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    byte r,h=0,ctr=0,count=0;
    int total = 0, net = 0, i = 0;
    ResultSet rs;
    boolean flag=true;
    String mnth = "",check="";
    String[] str = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    
    public PaymentDetails() {
        initComponents();
        Conn.conLink();
        ImageIcon img = new ImageIcon("d:/ims project/ims/src/ims/rayslogo.png");
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(submit);
        Calendar c = Calendar.getInstance();
        date.setText("" + c.get(Calendar.DATE) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bdues = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eno_tf = new javax.swing.JTextField();
        pamt_tf = new javax.swing.JTextField();
        bdues_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        payment = new javax.swing.JComboBox<>();
        date = new javax.swing.JTextField();
        month_cb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        sal_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ramt_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Payment Form");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Employee No.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Paid Amount");

        bdues.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bdues.setText("Back Dues");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Mode of Payment");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Date");

        eno_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        eno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eno_tfFocusLost(evt);
            }
        });

        pamt_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pamt_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pamt_tfKeyReleased(evt);
            }
        });

        bdues_tf.setEditable(false);
        bdues_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bdues_tf.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("PAYMENT DETAILS");

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHEQUE", "CASH", "NEFT", "ONLINE" }));

        date.setEditable(false);

        month_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month_cbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("SALARY");

        sal_tf.setEditable(false);
        sal_tf.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Rest Ammount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bdues, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(4, 4, 4)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pamt_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(eno_tf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bdues_tf))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sal_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ramt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(month_cb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(submit)
                                        .addGap(76, 76, 76))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel8)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ramt_tf, sal_tf});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sal_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pamt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bdues)
                        .addComponent(bdues_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ramt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit))
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bdues_tf, date, eno_tf, pamt_tf, payment});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ramt_tf, sal_tf});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {            
            con = Conn.conLink();
            stmt = con.prepareStatement("insert into payment_details values(?,?,?,?,?,?)");
            stmt.setString(1, eno_tf.getText());
            Calendar c = Calendar.getInstance();
            stmt.setString(2, "" + c.get(Calendar.DATE) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
            stmt.setInt(3, Integer.parseInt(pamt_tf.getText()));
            stmt.setInt(4, Integer.parseInt(ramt_tf.getText()));
            stmt.setString(5, (String) payment.getSelectedItem());
            stmt.setString(6, mnth);
            r = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!", "ims", JOptionPane.YES_NO_OPTION);
            if (r == 0) {                
                stmt.executeUpdate();
                byte t = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert another record!", "ims", JOptionPane.YES_NO_OPTION);
                if (t == 0) {
                    eno_tf.setText("");
                    pamt_tf.setText("");
                    ramt_tf.setText("");
                    sal_tf.setText("");
                    bdues_tf.setText("");
                    net=0;
                    mnth="";
                } else {
                    this.dispose();
                }
                con.close();
            } else if (r == 1) {
            }
        } catch (Exception e) {
            System.out.print("connection problem,try again!");
        }        
    }//GEN-LAST:event_submitActionPerformed

    private void eno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eno_tfFocusLost
        ctr=0;  
        byte t = 0;
        check ="";
        count=0;
        con = Conn.conLink();
                try {
                    stmt = con.prepareStatement("select upper(eno) from member_details");
                    rs = stmt.executeQuery();
                    while (rs.next()) {
                        String str2 = rs.getString(1);
                        if (eno_tf.getText().toUpperCase().equals(str2)) {
                            t = 1;
                            break;
                        }
                     }
                    if (t == 0) {
                        JOptionPane.showMessageDialog(this, "please insert valid employee no");
                        eno_tf.requestFocus();
                        ctr=1;
                    }
                if(!(ctr==1))
                {
                stmt = con.prepareStatement("select month from payment_details where eno=?");
                stmt.setString(1, eno_tf.getText());
                rs = stmt.executeQuery();
                while (rs.next()) {
                    check = check+rs.getString(1);
                }
                Calendar c = Calendar.getInstance();
                    for (i = 0; i <12; i++) {
                    if (check.contains(str[i])) 
                        count++;
                }
                if(count==c.get(Calendar.MONTH))
                        flag=false;
                for(i=count;i<c.get(Calendar.MONTH);i++)
                    {
                        month_cb.addItem(str[i]);
                        flag=false;
                    }
                if(flag){
                    for(i=count;i<=11;i++)
                        month_cb.addItem(str[i]);
                    for(i=0;i<c.get(Calendar.MONTH);i++)
                        month_cb.addItem(str[i]);
                }
            stmt = con.prepareStatement("select rest_amt from payment_details where eno=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1, eno_tf.getText());
            rs = stmt.executeQuery();
            if(rs.next()){
            rs.last();
            bdues_tf.setText(rs.getString(1));
            }
          }
                con.close();
            } catch (SQLException ex) {
            Logger.getLogger(PaymentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eno_tfFocusLost

    private void month_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month_cbActionPerformed
        if (h==1) {
            int sal = 0;
            con = Conn.conLink();
            try {
                String str = (String) month_cb.getSelectedItem();
                if(mnth.equals(""))
                mnth = mnth+str;
                else
                    mnth = mnth+","+str;
                stmt = con.prepareStatement("select esalary from member_details where upper(eno)=?");
                stmt.setString(1, eno_tf.getText().toUpperCase());
                rs = stmt.executeQuery();
                if (rs.next()) {
                    sal = rs.getInt(1);
                    net = net + sal;
                    sal_tf.setText("" + net);
                    //System.out.print(sal);
                }
                month_cb.removeItem(str);

            } catch (SQLException ex) {
                Logger.getLogger(PaymentDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            h=1;
        }
    }//GEN-LAST:event_month_cbActionPerformed

    private void pamt_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pamt_tfKeyReleased
       int sal=Integer.parseInt(sal_tf.getText())+Integer.parseInt(bdues_tf.getText());
       ramt_tf.setText(""+(sal-(Integer.parseInt(pamt_tf.getText()))));
    }//GEN-LAST:event_pamt_tfKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bdues;
    private javax.swing.JTextField bdues_tf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField date;
    private javax.swing.JTextField eno_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> month_cb;
    private javax.swing.JTextField pamt_tf;
    private javax.swing.JComboBox<String> payment;
    private javax.swing.JTextField ramt_tf;
    private javax.swing.JTextField sal_tf;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
