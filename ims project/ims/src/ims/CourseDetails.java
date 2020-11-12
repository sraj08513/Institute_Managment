package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CourseDetails extends javax.swing.JFrame {
    Connection con;
    byte n,i,t=0;
    public CourseDetails() {
        initComponents();
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
        tfccode = new javax.swing.JTextField();
        tfcname = new javax.swing.JTextField();
        tfsduration = new javax.swing.JTextField();
        tflduration = new javax.swing.JTextField();
        tfcfee = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entry Form Course");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Course Code ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Course Name ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Fee   ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Short Duration ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Long Duration ");

        tfccode.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tfcname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tfsduration.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tflduration.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tfcfee.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfcfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfcfeeFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("COURSE DETAILS");

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(tfccode, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tflduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfsduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfccode, tfcfee, tfcname, tflduration, tfsduration});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfccode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfsduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tflduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfcfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(19, 19, 19))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfccode, tfcfee, tfcname, tflduration, tfsduration});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
         if(tfccode.getText().length()==0)
        {
          tfccode.requestFocus();
          t=1;
        }
        else if(tfcname.getText().length()==0)
        {
          tfcname.requestFocus();
          t=1;
        }
        else if(tfsduration.getText().length()==0)
        {
          tfsduration.requestFocus();
          t=1;
        }
        else if(tflduration.getText().length()==0)
       {
         tflduration.requestFocus();
         t=1;
       }
        else if(tfcfee.getText().length()==0)
       {
         tfcfee.requestFocus();
         t=1;
       }
        else
          t=0;  
        if(t==1)
        JOptionPane.showMessageDialog(this,"Please Fill Blank Space","insertion",JOptionPane.INFORMATION_MESSAGE);
        if(t==0)
        {
        try {
            con=Conn.conLink();
            PreparedStatement stmt=con.prepareStatement("insert into course_details values(?,?,?,?,?)");
            stmt.setString(1,tfccode.getText().toUpperCase());
            stmt.setString(2,tfcname.getText().toUpperCase());
            stmt.setString(3,tfsduration.getText().toUpperCase());
            stmt.setString(4,tflduration.getText().toUpperCase());
            stmt.setInt(5,Integer.parseInt(tfcfee.getText()));
            byte d = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION);
                if(d==0)
                { 
                     stmt.executeUpdate();
                     tfccode.setText("");
                     tfcname.setText("");
                     tfsduration.setText("");
                     tflduration.setText("");
                     tflduration.setText("");
                     tfcfee.setText("");
                     tfccode.requestFocus();
                     con.close();
                }
                else if(d==1)
                {}
        } catch (SQLException ex) {
            Logger.getLogger(CourseDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void tfcfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfcfeeFocusLost
        n=(byte)tfcfee.getText().length();
           for(i=0;i<n;i++)
           {
              char ch=tfcfee.getText().charAt(i);
              if(!(ch>=48&&ch<=58))
              {   
              JOptionPane.showMessageDialog(this,"It contains digits only !","Invalid ",JOptionPane.INFORMATION_MESSAGE);    
              tfcfee.requestFocus();
              break;
              }       
           } 
    }//GEN-LAST:event_tfcfeeFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tfccode;
    private javax.swing.JTextField tfcfee;
    private javax.swing.JTextField tfcname;
    private javax.swing.JTextField tflduration;
    private javax.swing.JTextField tfsduration;
    // End of variables declaration//GEN-END:variables
}
