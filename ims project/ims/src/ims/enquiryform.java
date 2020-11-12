package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class enquiryform extends javax.swing.JFrame {
   Connection con;
   PreparedStatement stmt;
    byte i,n,t;
    public enquiryform() {
        initComponents();
        con=Conn.conLink();
        this.getRootPane().setDefaultButton(submit);
        this.setLocationRelativeTo(null);
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        n_tf = new javax.swing.JTextField();
        fn_tf = new javax.swing.JTextField();
        cn_tf = new javax.swing.JTextField();
        c_tf = new javax.swing.JTextField();
        cno_tf = new javax.swing.JTextField();
        ei_tf = new javax.swing.JTextField();
        dt_tf = new javax.swing.JTextField();
        r_tf = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add_ta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enquiry Entry Form");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Father's Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("College Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Course");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Cont No.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Email_id");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Desired Time");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("References");

        n_tf.setToolTipText("");
        n_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                n_tfFocusLost(evt);
            }
        });

        fn_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fn_tfFocusLost(evt);
            }
        });

        cn_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cn_tfFocusLost(evt);
            }
        });

        cno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cno_tfFocusLost(evt);
            }
        });

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("ENQUIRY DETAILS");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Address");

        add_ta.setColumns(20);
        add_ta.setRows(5);
        jScrollPane1.setViewportView(add_ta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(n_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addComponent(fn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ei_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(c_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ei_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(r_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submit)
                        .addGap(37, 37, 37))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel11, jLabel2, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {c_tf, cn_tf, cno_tf, dt_tf, ei_tf, fn_tf, n_tf, r_tf});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       if(n_tf.getText().length()==0)
       { 
           n_tf.requestFocus();
             t=1;
       }  
       else if(fn_tf.getText().length()==0)
       { fn_tf.requestFocus();
             t=1;
       }  
       else if(cn_tf.getText().length()==0)
       { cn_tf.requestFocus();
             t=1;
       }  
       else if(c_tf.getText().length()==0)
       { c_tf.requestFocus();
             t=1;
       }  
          else  if(cno_tf.getText().length()==0)
       { cno_tf.requestFocus();
             t=1;
       }  
            else if(ei_tf.getText().length()==0)
       {  ei_tf.requestFocus();
             t=1;
       } 
          else   if(dt_tf.getText().length()==0)
       { dt_tf.requestFocus();
             t=1;
       }  
          else if(r_tf.getText().length()==0)
       {  r_tf.requestFocus();
             t=1;
       } 
          
          else if(add_ta.getText().length()==0)
       { add_ta.requestFocus();
             t=1;
       }
               else t=0;
               if(t==1)
                   JOptionPane.showMessageDialog(this,"Please Fill Blank Space","insertion",JOptionPane.INFORMATION_MESSAGE);
             if(t==0) try
        {
            con=Conn.conLink();
            stmt=con.prepareStatement("insert into ENQUIRY values(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,n_tf.getText());
            stmt.setString(2,fn_tf.getText());
            stmt.setString(3,cn_tf.getText());
            stmt.setString(4,c_tf.getText());
            stmt.setString(5,cno_tf.getText());
            stmt.setString(6,ei_tf.getText());
            stmt.setString(7,dt_tf.getText());
            stmt.setString(8,r_tf.getText());
            stmt.setString(9,add_ta.getText());
             byte r = (byte)  JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION); 
                 if(r==0)
                 {
             JOptionPane.showMessageDialog(this,"Successfully inserted!","insertion",JOptionPane.INFORMATION_MESSAGE);
             stmt.executeUpdate();
                 n_tf.setText("");
                 fn_tf.setText("");
                 cn_tf.setText("");
                 c_tf.setText("");
                 cno_tf.setText("");
                 ei_tf.setText("");
                dt_tf.setText("");
                r_tf.setText("");
                add_ta.setText("");
                n_tf.requestFocus();
                 }
                 else if(r==1)
                 {
                     add_ta.requestFocus();
                 }
                 con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"sorry","Connection problem",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void n_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n_tfFocusLost
      n=(byte)n_tf.getText().length();
          for(i=0;i<n;i++)
          {
              char ch=n_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))         
          {
          JOptionPane.showMessageDialog(this,"name must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          n_tf.requestFocus();
          break;
          }
          }
    }//GEN-LAST:event_n_tfFocusLost
    
    private void fn_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fn_tfFocusLost
       n=(byte)fn_tf.getText().length();
          for(i=0;i<n;i++)
          {
              char ch=fn_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
          {
          JOptionPane.showMessageDialog(this," father's name must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          fn_tf.requestFocus();
          break;
          }
          }
    }//GEN-LAST:event_fn_tfFocusLost
    
    private void cno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cno_tfFocusLost
          
        n=(byte)cno_tf.getText().length();
            if(n==10)
            {
           for(byte i=0;i<n;i++)
            {
              char ch=cno_tf.getText().charAt(i);
            if(!(ch>=48&&ch<=58))
        
            {
                 cno_tf.setText("");
                JOptionPane.showMessageDialog(this,"It contains only digit!","invalid contact no",JOptionPane.INFORMATION_MESSAGE);
                  cno_tf.requestFocus();
                  break;
            }
            }
            }
            else
            {
             JOptionPane.showMessageDialog(this,"It contains only 10 digit!","invalid contact no",JOptionPane.INFORMATION_MESSAGE);
                
            cno_tf.requestFocus();
           }
    }//GEN-LAST:event_cno_tfFocusLost

    private void cn_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cn_tfFocusLost
        n=(byte)cn_tf.getText().length();
        for(i=0;i<n;i++)
        {
            char ch=cn_tf.getText().charAt(i);
            if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
            {
                JOptionPane.showMessageDialog(this,"College name must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
                cn_tf.requestFocus();
                break;
            }
        }
    }//GEN-LAST:event_cn_tfFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add_ta;
    private javax.swing.JTextField c_tf;
    private javax.swing.JTextField cn_tf;
    private javax.swing.JTextField cno_tf;
    private javax.swing.JTextField dt_tf;
    private javax.swing.JTextField ei_tf;
    private javax.swing.JTextField fn_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n_tf;
    private javax.swing.JTextField r_tf;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
