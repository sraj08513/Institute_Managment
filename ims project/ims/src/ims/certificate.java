package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class certificate extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    byte t;
    public certificate() {
        initComponents();
        con=Conn.conLink();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(submit);
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rn_tf = new javax.swing.JTextField();
        sn_tf = new javax.swing.JTextField();
        fn_tf = new javax.swing.JTextField();
        sub_tf = new javax.swing.JTextField();
        dur_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        dob_dcc = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Certificate Entry Form");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Registration No.");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Student Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Father's Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("D.O.B.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Subject");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Duration");

        rn_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        sn_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sn_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sn_tfFocusLost(evt);
            }
        });

        fn_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fn_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fn_tfFocusLost(evt);
            }
        });

        sub_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sub_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sub_tfFocusLost(evt);
            }
        });

        dur_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("CERTIFICATE");

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        dob_dcc.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
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
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(sub_tf, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dur_tf, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rn_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addComponent(sn_tf)
                .addComponent(fn_tf)
                .addComponent(dob_dcc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(26, 26, 26))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(jLabel7))
                .addGroup(layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7)
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(sn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(dob_dcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sub_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dur_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addComponent(submit)
            .addGap(24, 24, 24))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(rn_tf.getText().length()==0)
        {
            rn_tf.requestFocus();
            t=1;
        }
       
         else if(sn_tf.getText().length()==0)
        {
            sn_tf.requestFocus();
            t=1;
        }
         else if(fn_tf.getText().length()==0)
        {
            fn_tf.requestFocus();
            t=1;
        }
         else if(sub_tf.getText().length()==0)
        {
            sub_tf.requestFocus();
            t=1;
        }
         else if(dur_tf.getText().length()==0)
        {
            dur_tf.requestFocus();
            t=1;
        }
         else t=0;
        if(t==1)
            JOptionPane.showMessageDialog(this,"Please Fill Blank Space","insertion",JOptionPane.INFORMATION_MESSAGE);
        
       if(t==0)
        try
      {
          con=Conn.conLink();
        stmt=con.prepareStatement("insert into CERTIFICATE values(?,?,?,?,?,?)");
        stmt.setString(1,rn_tf.getText());
        stmt.setString(2,sn_tf.getText());
        stmt.setString(3,fn_tf.getText());
        Calendar c=dob_dcc.getSelectedDate();
        stmt.setString(4,""+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
        stmt.setString(5,sub_tf.getText());
        stmt.setString(6,dur_tf.getText());
        byte r = (byte)  JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION); 
             if(r==0)
            {
               stmt.executeUpdate();  
             JOptionPane.showMessageDialog(this,"Successfully inserted!","insertion",JOptionPane.INFORMATION_MESSAGE);
                rn_tf.setText("");
                sn_tf.setText("");
                fn_tf.setText("");
                sub_tf.setText("");
                //dob_tf.setText(null);
                dur_tf.setText("");
                rn_tf.requestFocus();
            }
             else if(r==1)
             {
                 dur_tf.requestFocus();
             }
             con.close();
      }
         catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,"sorry","Connection problem",JOptionPane.ERROR_MESSAGE);   
      }
    }//GEN-LAST:event_submitActionPerformed

    private void sn_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sn_tfFocusLost
         byte i,n=(byte)sn_tf.getText().length();
          for(i=0;i<n;i++)
          {
              char ch=sn_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))   
          {
          JOptionPane.showMessageDialog(this,"student name must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          sn_tf.requestFocus();
          break;
          }
      }
    }//GEN-LAST:event_sn_tfFocusLost

    private void fn_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fn_tfFocusLost
        byte i,n=(byte)fn_tf.getText().length();
          for(i=0;i<n;i++)
          {
              char ch=fn_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
              
          {
          
          JOptionPane.showMessageDialog(this,"father's name must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          fn_tf.requestFocus();
          break;
          }
      }
    }//GEN-LAST:event_fn_tfFocusLost

    private void sub_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sub_tfFocusLost
      byte i,n=(byte)sub_tf.getText().length();
          for(i=0;i<n;i++)
          {
              char ch=sub_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)||(ch=='+')))
              
          {
          
          JOptionPane.showMessageDialog(this," Subject name must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          sub_tf.requestFocus();
          break;
          }
      }
    }//GEN-LAST:event_sub_tfFocusLost
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dob_dcc;
    private javax.swing.JTextField dur_tf;
    private javax.swing.JTextField fn_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField rn_tf;
    private javax.swing.JTextField sn_tf;
    private javax.swing.JTextField sub_tf;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
