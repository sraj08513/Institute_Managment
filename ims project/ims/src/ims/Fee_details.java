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

public class Fee_details extends javax.swing.JFrame {
    Connection con;
    Calendar c;
    byte n,i,t=0;
    PreparedStatement stmt;
    ResultSet rs;short p;char s;
    String regno="REPL/17";
    public Fee_details() throws SQLException {
        initComponents();
        ptype_cb.requestFocus();
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        bdues_tf.setText("0");
        tfpdate.setEditable(false);
        ctotal_tf.setEditable(false);
        dues_tf.setEditable(false);
        nfee_tf.setEditable(false);
        dis_tf.setEditable(false);
        bdues_tf.setEditable(false);
        cfno_tf.setEditable(false);
        pfno_tf.setEditable(false);
        this.getRootPane().setDefaultButton(submit);
        c=Calendar.getInstance();
        tfpdate.setText(""+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        stmt=con.prepareStatement("select aregno,ch from automatic_rec");
        rs=stmt.executeQuery();
        rs.next();
        p=rs.getShort(1);
        s=rs.getString(2).charAt(0);
        p++;
        if(p<10)

            tfrecno.setText(regno+s+"00"+p);
        else if(p<100)
            tfrecno.setText(regno+s+"0"+p);
        else if(p<1000)
            tfrecno.setText(regno+s+p);
        else
        {
            s++;
            p=1;
            regno=regno+s+"00"+p;
        }
        tfrecno.setEditable(false);
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        regno_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfrecno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cfno_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfpdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dis_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dues_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nfee_tf = new javax.swing.JTextField();
        pamt_tf = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pmode_cob = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        pfno_tf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bdues_tf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ctotal_tf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ptype_cb = new javax.swing.JComboBox<>();
        idate_dp = new datechooser.beans.DateChooserCombo();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entry Form Fee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Registration Number");

        regno_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        regno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regno_tfFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Receipt Number");

        tfrecno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Current Form No.");

        cfno_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Pay Mode");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Pay Date");

        tfpdate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Discount");

        dis_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dis_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dis_tfFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Dues");

        dues_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Net Fee");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Paid Amount");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Installment Date");

        nfee_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        pamt_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pamt_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pamt_tfKeyReleased(evt);
            }
        });

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("MONEY RECEIPT");

        pmode_cob.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pmode_cob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque", "NEFT" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Previous Form No");

        pfno_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Back Dues");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Total Fee");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Pay Type");

        ptype_cb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ptype_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INSTALLMENT", "ONE TIME" }));
        ptype_cb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ptype_cbFocusLost(evt);
            }
        });

        idate_dp.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addComponent(jLabel13))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pmode_cob, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pfno_tf, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cfno_tf, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfpdate, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                    .addComponent(idate_dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(bdues_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addComponent(ctotal_tf)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pamt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dues_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(dis_tf))
            .addContainerGap(35, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(237, 237, 237)
                    .addComponent(jLabel12))
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ptype_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(145, 145, 145)
                            .addComponent(tfrecno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addGap(285, 285, 285)
            .addComponent(submit)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bdues_tf, dis_tf, dues_tf, nfee_tf, pamt_tf});

    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfrecno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel16)
                .addComponent(ptype_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(regno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cfno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15)
                .addComponent(ctotal_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 20, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdues_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 20, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dis_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pmode_cob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 20, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pamt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(idate_dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dues_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addComponent(submit)
            .addGap(20, 20, 20))
    );

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cfno_tf, ctotal_tf, dis_tf, dues_tf, idate_dp, nfee_tf, pamt_tf, pmode_cob, ptype_cb, regno_tf, tfpdate, tfrecno});

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
         try {
            con=Conn.conLink();
            stmt=con.prepareStatement("insert into fee_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,tfrecno.getText());
            stmt.setString(2,regno_tf.getText().toUpperCase());
            stmt.setString(3,cfno_tf.getText());
            stmt.setString(4,pfno_tf.getText());
            stmt.setString(5,(String) pmode_cob.getSelectedItem());
            stmt.setString(6,tfpdate.getText());
            stmt.setString(7, (String) ptype_cb.getSelectedItem());
            c=idate_dp.getSelectedDate();
            stmt.setString(8,""+c.get(Calendar.DATE)+"/"+""+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
            stmt.setString(9,ctotal_tf.getText());
            stmt.setString(10,bdues_tf.getText());
            stmt.setString(11,dis_tf.getText());
            stmt.setString(12,nfee_tf.getText());
            stmt.setString(13,pamt_tf.getText());
            stmt.setString(14,dues_tf.getText());
            
            byte d = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION);
                if(d==0)
                { 
                     stmt.executeUpdate();
                     stmt=con.prepareStatement("update automatic_rec set aregno=?,ch=?");
                     stmt.setInt(1,p);
                     stmt.setString(2,Character.toString(s));
                     stmt.executeUpdate();
                     try {
                         stmt=con.prepareStatement("select aregno,ch from automatic_rec");
                         rs=stmt.executeQuery();
                         rs.next();
                         p=rs.getShort(1);
                         s=rs.getString(2).charAt(0);
                         p++;
                         if(p<10)
                             tfrecno.setText(regno+s+"00"+p);
                         else if(p<100)
                             tfrecno.setText(regno+s+"0"+p);
                         else if(p<1000)
                             tfrecno.setText(regno+s+p);
                         else
                           {
                             s++;
                             p=1;
                             regno=regno+s+"00"+p;
                           }
                         } catch (SQLException ex) {
                      Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     regno_tf.setText("");
                     pamt_tf.setText("");
                     dis_tf.setText("");
                     nfee_tf.setText("");
                     dues_tf.setText("");
                     cfno_tf.setText("");
                     regno_tf.requestFocus();
                     con.close();
                     
                }
                else if(d==1)
                {}
        } catch (SQLException ex) {
            Logger.getLogger(Fee_details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void dis_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dis_tfFocusLost
         n=(byte)dis_tf.getText().length();
           for(i=0;i<n;i++)
           {
              char ch=dis_tf.getText().charAt(i);
              if(!(ch>=48&&ch<=58))
              {   
              JOptionPane.showMessageDialog(this,"It contains digits only !","Invalid ",JOptionPane.INFORMATION_MESSAGE);    
              dis_tf.requestFocus();
              break;
              }       
           } 
    }//GEN-LAST:event_dis_tfFocusLost

    private void pamt_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pamt_tfKeyReleased
         byte r=0; 
         n=(byte)pamt_tf.getText().length();
           for(i=0;i<n;i++)
           {
              char ch=pamt_tf.getText().charAt(i);
              if(!(ch>=48&&ch<=58))
              {
              r=1;   
              JOptionPane.showMessageDialog(this,"It contains digits only !","Invalid",JOptionPane.INFORMATION_MESSAGE);    
              pamt_tf.requestFocus();
              break;
              }       
           }
           if(r==0)
               dues_tf.setText(""+(Integer.parseInt(nfee_tf.getText())-Integer.parseInt(pamt_tf.getText()))); 
    }//GEN-LAST:event_pamt_tfKeyReleased

    private void regno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regno_tfFocusLost
        con=Conn.conLink();
        byte k=0,z=0,m=0;
        String str2="";
        try {
            stmt=con.prepareStatement("select upper(reg_no) from student_details");
            rs=stmt.executeQuery();
            byte t=0;
            while(rs.next()) {
                String str=rs.getString(1);
                if(regno_tf.getText().toUpperCase().equals(str)) {
                    t=1;
                    break; 
                }
            }
            if(t==0) {
                JOptionPane.showMessageDialog(this,"please insert valid registration no.");
                regno_tf.requestFocus();          
            } else {
                stmt=con.prepareStatement("select adm_form_no,total_fee from admission where reg_no=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                stmt.setString(1,regno_tf.getText().toUpperCase());
                rs=stmt.executeQuery();
                rs.last();
                z= (byte) rs.getRow();
                if(z==1)  {
                    cfno_tf.setText(rs.getString(1));
                    ctotal_tf.setText(rs.getString(2));
                    pfno_tf.setText("");
                    stmt=con.prepareStatement("select * from fee_details where adm_form_no=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    stmt.setString(1,cfno_tf.getText());
                    rs=stmt.executeQuery();
                    rs.last();
                    m= (byte) rs.getRow();
                    if(m==0) {
                        if(ptype_cb.getSelectedItem().equals("ONE TIME")) {
                            stmt=con.prepareStatement("select course from admission where reg_no=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                            stmt.setString(1,regno_tf.getText().toUpperCase());
                            rs=stmt.executeQuery();
                            rs.next();
                            str2= rs.getString(1);
                            if(str2.contains(","))
                            k=1;
                            if(k==0)
                                dis_tf.setText(""+(Integer.parseInt(ctotal_tf.getText()))/10);
                            else
                                dis_tf.setText(""+(Integer.parseInt(ctotal_tf.getText()))/5);   
                        } else                  
                            dis_tf.setText("0");  
                        nfee_tf.setText(""+(Integer.parseInt(ctotal_tf.getText())+Integer.parseInt(bdues_tf.getText())-Integer.parseInt(dis_tf.getText())));
                    } else {
                        stmt=con.prepareStatement("select dues from fee_details where adm_form_no=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                        stmt.setString(1,cfno_tf.getText());
                        rs=stmt.executeQuery();
                        rs.last();
                        nfee_tf.setText(rs.getString(1));
                        dis_tf.setText("0");
                    }
                } else 
                if(z>=2){
                    cfno_tf.setText(rs.getString(1));
                    ctotal_tf.setText(rs.getString(2));
                    rs.previous();
                    pfno_tf.setText(rs.getString(1));
                    stmt=con.prepareStatement("select * from fee_details where adm_form_no=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    stmt.setString(1,cfno_tf.getText());
                    rs=stmt.executeQuery();
                    rs.last();
                    m=(byte) rs.getRow();
                    if(m==0) {
                        stmt=con.prepareStatement("select dues from fee_details where adm_form_no=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                        stmt.setString(1,pfno_tf.getText());
                        rs=stmt.executeQuery();
                        rs.last();
                        bdues_tf.setText(rs.getString(1));
                        if(ptype_cb.getSelectedItem().equals("ONE TIME")) {
                            stmt=con.prepareStatement("select course from admission where reg_no=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                            stmt.setString(1,regno_tf.getText().toUpperCase());
                            rs=stmt.executeQuery();
                            rs.next();
                            str2= rs.getString(1);
                            if(str2.contains(","))
                            k=1;
                            if(k==0)
                                dis_tf.setText(""+(Integer.parseInt(ctotal_tf.getText()))/10);
                            else
                                dis_tf.setText(""+(Integer.parseInt(ctotal_tf.getText()))/5);   
                        } else
                            dis_tf.setText("0");
                        nfee_tf.setText(""+(Integer.parseInt(ctotal_tf.getText())+Integer.parseInt(bdues_tf.getText())-Integer.parseInt(dis_tf.getText())));
                    } else {
                        stmt=con.prepareStatement("select dues from fee_details where adm_form_no=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                        stmt.setString(1,cfno_tf.getText());
                        rs=stmt.executeQuery();
                        rs.last();
                        nfee_tf.setText(rs.getString(1));
                        dis_tf.setText("0");
                        bdues_tf.setText("0");
                    }
                }
                con.close();
                }
        } catch (SQLException ex) {
            Logger.getLogger(Fee_details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_regno_tfFocusLost

    private void ptype_cbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ptype_cbFocusLost
        regno_tf.requestFocus();
    }//GEN-LAST:event_ptype_cbFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bdues_tf;
    private javax.swing.JTextField cfno_tf;
    private javax.swing.JTextField ctotal_tf;
    private javax.swing.JTextField dis_tf;
    private javax.swing.JTextField dues_tf;
    private datechooser.beans.DateChooserCombo idate_dp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField nfee_tf;
    private javax.swing.JTextField pamt_tf;
    private javax.swing.JTextField pfno_tf;
    private javax.swing.JComboBox<String> pmode_cob;
    private javax.swing.JComboBox<String> ptype_cb;
    private javax.swing.JTextField regno_tf;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tfpdate;
    private javax.swing.JTextField tfrecno;
    // End of variables declaration//GEN-END:variables
}
