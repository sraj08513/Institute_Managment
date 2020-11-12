package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class service extends javax.swing.JFrame {
     Connection con;
    PreparedStatement stmt;
    byte n,i,t=0;
    public service() {
        initComponents();
         con=Conn.conLink();
         this.setLocationRelativeTo(null);
       this.getRootPane().setDefaultButton(submit);
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        en_tf = new javax.swing.JTextField();
        cn_tf = new javax.swing.JTextField();
        f_tf = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        st_tf = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Service entry  Form");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Employee No.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Contact Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Facility");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Service Type");

        en_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        en_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                en_tfFocusLost(evt);
            }
        });

        cn_tf.setEditable(false);
        cn_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cn_tf.setText(" ");
        cn_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cn_tfFocusLost(evt);
            }
        });

        f_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        f_tf.setText("\n");
        f_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_tfFocusLost(evt);
            }
        });

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("SERVICE_TYPE");

        st_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        st_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                st_tfFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(en_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(cn_tf)
                    .addComponent(st_tf)
                    .addComponent(f_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(en_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cn_tf, en_tf, f_tf, st_tf});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(en_tf.getText().length()==0)
        {
             t=1;
            en_tf.requestFocus();
           
        }
        else if(cn_tf.getText().length()==0)
               {   
                    t=1;
                   cn_tf.requestFocus();
                     
               }
        else if(f_tf.getText().length()==0)
               {    
                    t=1;
                   f_tf.requestFocus();
                     
               }
        else if(st_tf.getText().length()==0)
              {
                   t=1;
                  st_tf.requestFocus();
                 
              }
        else 
            t=0;
        if(t==1)
           JOptionPane.showMessageDialog(this,"please fill blank filled!","insertion",JOptionPane.INFORMATION_MESSAGE);
        if(t==0)
           {
             try 
             {
                 con=Conn.conLink();
             stmt=con.prepareStatement("insert into services values(?,?,?,?)");
             stmt.setString(1,en_tf.getText());
             stmt.setString(2,cn_tf.getText());
             stmt.setString(3,st_tf.getText());
             stmt.setString(4,f_tf.getText());
             byte r=(byte)JOptionPane.showConfirmDialog(this, "Are you sure to want to insert record?","confirmation",JOptionPane.YES_NO_OPTION);
             if(r==0)
             {
             stmt.executeUpdate();
             JOptionPane.showMessageDialog(this,"sucessfully record inserted!");
             en_tf.setText("");
            cn_tf.setText("");
        f_tf.setText("");
        st_tf.setText("");
        con.close();
        en_tf.requestFocus();
             }
             else if(r==1)
             {
                 st_tf.requestFocus();
             }
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(service.class.getName()).log(Level.SEVERE, null, ex);
         }
       }
    }//GEN-LAST:event_submitActionPerformed

    private void cn_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cn_tfFocusLost
         n=(byte)cn_tf.getText().length();
          for(i=0;i<n;i++)
          { char ch=cn_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
          {
          JOptionPane.showMessageDialog(this," contact name must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          cn_tf.requestFocus();
          break;
          }
          }
    }//GEN-LAST:event_cn_tfFocusLost

    private void f_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_tfFocusLost
         n=(byte)f_tf.getText().length();
          for(i=0;i<n;i++)
          { char ch=f_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
          {
          JOptionPane.showMessageDialog(this," Facility must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          f_tf.requestFocus();
          break;
          }
          }
    }//GEN-LAST:event_f_tfFocusLost

    private void st_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_st_tfFocusLost
         n=(byte)st_tf.getText().length();
          for(i=0;i<n;i++)
          { char ch=st_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
          {
          JOptionPane.showMessageDialog(this," service Type must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          st_tf.requestFocus();
          break;
          }
          }
    }//GEN-LAST:event_st_tfFocusLost

    private void en_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_en_tfFocusLost
             con=Conn.conLink();
             String str="";
             byte l=0;
             try
             {
             stmt=con.prepareStatement("select eno from member_details");
             ResultSet rs=stmt.executeQuery();
             while(rs.next())
             {
                 str=rs.getString(1).toUpperCase();
                 if(en_tf.getText().toUpperCase().equals(str))
                 {
                     l=1;
                     break;
                 }
             }
             if(l==0)
             {  JOptionPane.showMessageDialog(this,"please insert valid employee no");
                     en_tf.requestFocus();
             }
             else
             {
                 stmt=con.prepareStatement("select ename from member_details where eno=?");
                stmt.setString(1,en_tf.getText().toUpperCase());
                rs=stmt.executeQuery();
                rs.next();
                cn_tf.setText(rs.getString(1));
             }
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(service.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_en_tfFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cn_tf;
    private javax.swing.JTextField en_tf;
    private javax.swing.JTextField f_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField st_tf;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
