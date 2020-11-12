package ims;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Admission extends javax.swing.JFrame {
    Connection con;ResultSet rs;
    PreparedStatement stmt; short p;char s;
    String fno="REPL/18";
    Calendar c;
    File f;
    DefaultListModel model=new DefaultListModel();
    public Admission() throws SQLException {
        initComponents();
        con=Conn.conLink();
        this.getRootPane().setDefaultButton(submit);
        this.setLocationRelativeTo(null);
        adate_tf.setEditable(false);
        c=Calendar.getInstance();
        adate_tf.setText(""+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        stmt=con.prepareStatement("select aregno,ch from automatic_fno");
        rs=stmt.executeQuery();
        rs.next();
        p=rs.getShort(1);
        s=rs.getString(2).charAt(0);
        p++;
        if(p<10)
            tffno.setText(fno+s+"00"+p);
        else if(p<100)
            tffno.setText(fno+s+"0"+p);
        else if(p<1000)
            tffno.setText(fno+s+p);
        else
        {
            s++;
            p=1;
            fno=fno+s+"00"+p;
        }
        stmt=con.prepareStatement("select cname from course_details");
        rs=stmt.executeQuery();
        course_lst.setModel(model);
       while(rs.next())
         model.addElement(rs.getString(1));
        tffno.setEditable(false);
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
    public Admission(String text, File f1) throws SQLException {
        initComponents();
        f=f1;
        this.setDefaultCloseOperation(1);
        con=Conn.conLink();
        tfregno.setText(text);
        tfregno.setEditable(false);
        this.getRootPane().setDefaultButton(submit);
        this.setLocationRelativeTo(null);
        adate_tf.setEditable(false);
        c=Calendar.getInstance();
        adate_tf.setText(""+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        stmt=con.prepareStatement("select aregno,ch from automatic_fno");
        rs=stmt.executeQuery();
        rs.next();
        p=rs.getShort(1);
        s=rs.getString(2).charAt(0);
        p++;
        if(p<10)
            tffno.setText(fno+s+"00"+p);
        else if(p<100)
            tffno.setText(fno+s+"0"+p);
        else if(p<1000)
            tffno.setText(fno+s+p);
        else
        {
            s++;
            p=1;
            fno=fno+s+"00"+p;
        }
        stmt=con.prepareStatement("select cname from course_details");
        rs=stmt.executeQuery();
        course_lst.setModel(model);
       while(rs.next())
         model.addElement(rs.getString(1));
        tffno.setEditable(false);
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        ImageIcon pimg = new ImageIcon(new ImageIcon(""+f1).getImage().getScaledInstance(sphoto.getWidth(),sphoto.getHeight(),Image.SCALE_DEFAULT ));
            sphoto.setIcon(pimg);   
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfregno = new javax.swing.JTextField();
        tffno = new javax.swing.JTextField();
        adate_tf = new javax.swing.JTextField();
        tfcfee = new javax.swing.JTextField();
        upload = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sphoto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        course_lst = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entry Form Admission");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Registration Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Form No");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Course");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Admission Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Total Fee");

        tfregno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfregno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfregnoFocusLost(evt);
            }
        });

        tffno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        adate_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tfcfee.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        upload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        upload.setForeground(new java.awt.Color(51, 0, 51));
        upload.setText("UPLOAD");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Admission Form");

        sphoto.setText("            PHOTO");
        sphoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        course_lst.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                course_lstFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(course_lst);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfregno)
                                .addComponent(tffno, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfcfee, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sphoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upload, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfregno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfcfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(submit)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(upload)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adate_tf, tfcfee, tffno, tfregno});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        byte t;
        String str="";
        if(tfcfee.getText().length()==0)
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
            stmt=con.prepareStatement("insert into admission values(?,?,?,?,?,?)");
            stmt.setString(1,tfregno.getText().toUpperCase());
            stmt.setString(2,tffno.getText());
            int a[]=course_lst.getSelectedIndices();
            for(int i=0;i<a.length;i++)
            {
            str=str+course_lst.getModel().getElementAt(a[i]);
            if(!(i==a.length-1))
            str=str+",";
            }
            stmt.setString(3,str);
            stmt.setString(4,adate_tf.getText());
            stmt.setInt(5,Integer.parseInt(tfcfee.getText()));
            FileInputStream fin=new FileInputStream(f);
            stmt.setBinaryStream(6, fin, fin.available());
             byte d = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION);
                if(d==0)
                { 
                     stmt.executeUpdate();
                     stmt=con.prepareStatement("update automatic_fno set aregno=?,ch=?");
                     stmt.setInt(1,p);
                     stmt.setString(2,Character.toString(s));
                     stmt.executeUpdate();
                     try {
                         stmt=con.prepareStatement("select aregno,ch from automatic_fno");
                         rs=stmt.executeQuery();
                         rs.next();
                         p=rs.getShort(1);
                         s=rs.getString(2).charAt(0);
                         p++;
                         if(p<10)
                             tffno.setText(fno+s+"00"+p);
                         else if(p<100)
                              tffno.setText(fno+s+"0"+p);
                         else if(p<1000)
                              tffno.setText(fno+s+p);
                         else
                          {
                              s++;
                              p=1;
                              fno=fno+s+"00"+p;
                          }
                         } catch (SQLException ex) {
                      Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
                    }
                      tfregno.setText("");
                      tfcfee.setText("");
                      tfregno.requestFocus();
                     con.close();
                     
                }
                else if(d==1)
                {}
        } catch (SQLException ex) {
            Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void tfregnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfregnoFocusLost
        con=Conn.conLink();
        try {
            stmt = con.prepareStatement("select upper(reg_no) from student_details");
            rs = stmt.executeQuery();
            byte t=0;
            while(rs.next()) {
                String str=rs.getString(1);
                if(tfregno.getText().toUpperCase().equals(str)) {
                    t=1;
                    break;
                }
            }
            if(t==0) { 
                 JOptionPane.showMessageDialog(this,"please insert valid registration");
                 tfregno.requestFocus();
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfregnoFocusLost

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
         JFileChooser chooser=new JFileChooser();
            chooser.showOpenDialog(null);
         f = chooser.getSelectedFile();
        ImageIcon img = new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(sphoto.getWidth(),sphoto.getHeight(),Image.SCALE_DEFAULT ));
            sphoto.setIcon(img);
    }//GEN-LAST:event_uploadActionPerformed
        
    private void course_lstFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_course_lstFocusLost
          
        int a[]=course_lst.getSelectedIndices();
           int fee=0;
            for(int i=0;i<a.length;i++)
            {
             con=Conn.conLink();
            String str=course_lst.getModel().getElementAt(a[i]);
               try {
                   stmt=con.prepareStatement("select fee from course_details where cname=?");
                   stmt.setString(1, str);
                   rs=stmt.executeQuery();
                   rs.next();
                   fee=fee+rs.getInt(1);
                    con.close();
               } catch (SQLException ex) {
                   Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
               }
            }
            tfcfee.setText(""+fee);  
    }//GEN-LAST:event_course_lstFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adate_tf;
    private javax.swing.JList<String> course_lst;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel sphoto;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tfcfee;
    private javax.swing.JTextField tffno;
    private javax.swing.JTextField tfregno;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
