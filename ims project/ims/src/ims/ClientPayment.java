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
public class ClientPayment extends javax.swing.JFrame {
     Connection con;
     PreparedStatement stmt;
      Calendar c;int total=0;
      ResultSet rs;
    byte t,r,n,i;
    public ClientPayment() {
        initComponents();
       this.setLocationRelativeTo(null);
       con=Conn.conLink();
        this.getRootPane().setDefaultButton(submit);
        c=Calendar.getInstance();
        d_tf.setText(""+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cn_tf = new javax.swing.JTextField();
        pa_tf = new javax.swing.JTextField();
        b_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        d_tf = new javax.swing.JTextField();
        tamt_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Client Payment Entry Form");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Client No.");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Paid Amount");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Dues");

        cn_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cn_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cn_tfFocusLost(evt);
            }
        });

        pa_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pa_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pa_tfFocusLost(evt);
            }
        });
        pa_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pa_tfKeyReleased(evt);
            }
        });

        b_tf.setEditable(false);
        b_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        b_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                b_tfFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CLIENT PAYMENT");

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        d_tf.setEditable(false);

        tamt_tf.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total amt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pa_tf)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cn_tf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tamt_tf))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d_tf))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 142, Short.MAX_VALUE)
                        .addComponent(b_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b_tf, cn_tf, d_tf, pa_tf});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pa_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(b_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(d_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(52, 52, 52))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {b_tf, cn_tf, d_tf, pa_tf});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(cn_tf.getText().length()==0)
        {
            cn_tf.requestFocus();
            t=1;
        }
         else  if(pa_tf.getText().length()==0)
        {
            pa_tf.requestFocus();
            t=1;
        }
         else  if(d_tf.getText().length()==0)
        {
            d_tf.requestFocus();
            t=1;
        }
         else  if(b_tf.getText().length()==0)
        {
            b_tf.requestFocus();
            t=1;
        }
         else t=0;  
        if(t==1)
          JOptionPane.showMessageDialog(this,"Please Fill Blank Space","insertion",JOptionPane.INFORMATION_MESSAGE);
        else if(t==0)
     try
        {
            con=Conn.conLink();
           stmt=con.prepareStatement("insert into CLIENT_PAYMENT values(?,?,?,?,?)");
           stmt.setString(1,cn_tf.getText());
           stmt.setString(2,tamt_tf.getText());
           stmt.setInt(3,Integer.parseInt(pa_tf.getText()));
           stmt.setInt(4,Integer.parseInt(b_tf.getText()));
           stmt.setString(5, d_tf.getText());
        r = (byte)  JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION);
                if(r==0)
                { 
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"sucessfully record inserted!");
                    cn_tf.setText("");
                    pa_tf.setText("");
                    b_tf.setText("");
                    tamt_tf.setText("");
                    cn_tf.requestFocus();
                    con.close();
                }
                else if(r==1)
                {
                    b_tf.requestFocus();
                }
      }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,"sorry","Connection problem",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void pa_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pa_tfFocusLost
       byte n=(byte)pa_tf.getText().length();
        for(byte i=0;i<n;i++)
        {
            char ch=pa_tf.getText().charAt(i);
            if(!(ch>=48&&ch<=58||ch=='+'||ch=='-'))
            {
                pa_tf.setText("");
                JOptionPane.showMessageDialog(this,"amount cannot contains a alphabet!","insertion",JOptionPane.INFORMATION_MESSAGE);
                pa_tf.requestFocus();
                break;
            }
        }
        total=0;
        total=((Integer.parseInt(tamt_tf.getText())+Integer.parseInt(b_tf.getText()))-Integer.parseInt(pa_tf.getText()));

    }//GEN-LAST:event_pa_tfFocusLost

    private void cn_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cn_tfFocusLost
       con=Conn.conLink();
        String str="";
          byte l=0;
        try {
            stmt=con.prepareStatement("select CLIENT_NO from development");
            rs=stmt.executeQuery();
            while(rs.next())
            {
                str=rs.getString(1);
                if(cn_tf.getText().toUpperCase().equals(str))
                {
                    l=1;
                    break;
                }
            }
             if(l==0)
            { 
                 cn_tf.requestFocus();
                 JOptionPane.showMessageDialog(this,"please insert valid client no");
            }
             else
             {
            stmt=con.prepareStatement("select dcost from development where client_no=?");
            stmt.setString(1,cn_tf.getText().toUpperCase());
            rs=stmt.executeQuery(); 
            rs.next();
            tamt_tf.setText(rs.getString(1));
            stmt=con.prepareStatement("select dues from client_payment where client_no=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    stmt.setString(1,cn_tf.getText().toUpperCase());
                    rs=stmt.executeQuery();
                    int p = 0;
                    if(rs.last())
                      p=rs.getRow();
                    System.out.print(p);
                    if(p==0)
                        b_tf.setText("");
                    else{
                        rs.absolute(p-1);
                        tamt_tf.setText(rs.getString(1));
                    }
                      int s=Integer.parseInt(tamt_tf.getText());
                      if(s<=0)
                      {
                          tamt_tf.setText("");
                           byte h = (byte)  JOptionPane.showConfirmDialog(null, "Do you want to pay another client!","FULL PAID", JOptionPane.YES_NO_OPTION);
                       if(h==0)
                           cn_tf.requestFocus();
                       else
                           this.setVisible(false);
                      }
                      else
                        pa_tf.requestFocus();   
             }
                  con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cn_tfFocusLost

    private void pa_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pa_tfKeyReleased
        int damt=0,pamt=0; 
         n=(byte)pa_tf.getText().length();
         for(i=0;i<n;i++)
         {
             char ch=pa_tf.getText().charAt(i);
             if(!(ch>=48&&ch<=58))
             {  r=1;
             JOptionPane.showMessageDialog(this,"It contains digit only !");
                 // pa_tf.requestFocus();
                  break;
             }
         }
        pamt=Integer.parseInt(pa_tf.getText());
        damt=Integer.parseInt(tamt_tf.getText());
        if(r==0)
        
        b_tf.setText(""+(damt-pamt));
        
       if(Integer.parseInt(b_tf.getText())<0)
        {
            JOptionPane.showMessageDialog(this, "payble amount must be less than or equal to total amount");
            pa_tf.setText("");
            pa_tf.requestFocus();
        }
        
    }//GEN-LAST:event_pa_tfKeyReleased

    private void b_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b_tfFocusLost

        byte n=(byte)b_tf.getText().length();
        for(byte i=0;i<n;i++)
        {
            char ch=b_tf.getText().charAt(i);
            if(!(ch>=48&&ch<=58||ch=='+'||ch=='-'))
            {
                b_tf.setText("");
                JOptionPane.showMessageDialog(this,"Balance cannot contains a alphabet!","insertion",JOptionPane.INFORMATION_MESSAGE);
                b_tf.requestFocus();
                break;
            }
        }
    }//GEN-LAST:event_b_tfFocusLost

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_tf;
    private javax.swing.JTextField cn_tf;
    private javax.swing.JTextField d_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pa_tf;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tamt_tf;
    // End of variables declaration//GEN-END:variables
}
