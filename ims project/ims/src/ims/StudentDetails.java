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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class StudentDetails extends javax.swing.JFrame {
    Connection con; ResultSet rs;
    PreparedStatement stmt; short p;char s;
    String regno="REPL/18",temp;
    byte i,n,d,t=0;
    Calendar c;
    File f;
    public StudentDetails() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        this.getRootPane().setDefaultButton(submit);
        male_rb.setSelected(true);
        tfregdate.setEditable(false);
        c=Calendar.getInstance();
        tfregdate.setText(""+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        tfsname.requestFocus();
        stmt=con.prepareStatement("select aregno,ch from automatic_reg");
        rs=stmt.executeQuery();
        rs.next();
        p=rs.getShort(1);
        s=rs.getString(2).charAt(0);
        p++;
        if(p<10)
            tfregno.setText(regno+s+"00"+p);
        else if(p<100)
            tfregno.setText(regno+s+"0"+p);
        else if(p<1000)
            tfregno.setText(regno+s+p);
        else
        {
            s++;
            p=1;
            regno=regno+s+"00"+p;
        }
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfregno = new javax.swing.JTextField();
        tfsname = new javax.swing.JTextField();
        tffname = new javax.swing.JTextField();
        tfregdate = new javax.swing.JTextField();
        tfcno = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taadd = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        sphoto = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        male_rb = new javax.swing.JRadioButton();
        female_rb = new javax.swing.JRadioButton();
        transgender_rb = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        dob_dc = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entry Form Registration  ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Student Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Father's Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Registration No.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("D.O.B.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Date of Registration");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Contact No.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Email_id");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Address");

        tfregno.setEditable(false);
        tfregno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        tfsname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfsname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfsnameFocusLost(evt);
            }
        });

        tffname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tffname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffnameFocusLost(evt);
            }
        });

        tfregdate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tfcno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfcno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfcnoFocusLost(evt);
            }
        });

        tfemail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        taadd.setColumns(20);
        taadd.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        taadd.setRows(5);
        jScrollPane1.setViewportView(taadd);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("STUDENT DETAILS");

        sphoto.setText("             PHOTO");
        sphoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        upload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        upload.setText("UPLOAD");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        buttonGroup1.add(male_rb);
        male_rb.setText("Male");

        buttonGroup1.add(female_rb);
        female_rb.setText("Female");

        buttonGroup1.add(transgender_rb);
        transgender_rb.setText("Transgender");

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        dob_dc.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8)
                .addComponent(jLabel6)
                .addComponent(jLabel7)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jLabel5)
                .addComponent(jLabel4)
                .addComponent(jLabel9))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfsname, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(tfregno)
                                .addComponent(tffname)
                                .addComponent(tfregdate)
                                .addComponent(tfemail)
                                .addComponent(tfcno)
                                .addComponent(dob_dc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(sphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(upload))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(24, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(male_rb)
                    .addGap(31, 31, 31)
                    .addComponent(female_rb)
                    .addGap(18, 18, 18)
                    .addComponent(transgender_rb)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(164, 164, 164)
                    .addComponent(jLabel10))
                .addGroup(layout.createSequentialGroup()
                    .addGap(201, 201, 201)
                    .addComponent(submit)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfcno, tfemail, tffname, tfregdate, tfregno, tfsname});

    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(sphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(upload)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfregno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tffname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(dob_dc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfregdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tfcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel7)
                    .addGap(18, 19, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male_rb)
                            .addComponent(female_rb)
                            .addComponent(transgender_rb))
                        .addComponent(jLabel8)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGap(18, 24, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
            .addComponent(submit)
            .addContainerGap())
    );

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, tfcno, tfemail, tffname, tfregdate, tfregno});

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(tfsname.getText().length()==0)
        {
          tfsname.requestFocus();
          t=1;
        }
        else if(tffname.getText().length()==0)
        {
          tffname.requestFocus();
          t=1;
        }
        else if(tfcno.getText().length()==0)
        {
          tfcno.requestFocus();
          t=1;
        }
        else if(taadd.getText().length()==0)
       {
         taadd.requestFocus();
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
            String str;
            if(male_rb.isSelected())
                str="male";
            else if(female_rb.isSelected())
                str="female";  
            else
                str="transgender";
            
            stmt=con.prepareStatement("insert into student_details values(?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,tfregno.getText());
            stmt.setString(2,tfsname.getText());
            stmt.setString(3,tffname.getText());
            c=dob_dc.getSelectedDate();
            stmt.setString(4,""+c.get(Calendar.DATE)+"/"+""+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
            stmt.setString(5,tfregdate.getText());
            stmt.setString(6,tfcno.getText());
            stmt.setString(7,tfemail.getText());
            stmt.setString(8,str);
            stmt.setString(9,taadd.getText());
            FileInputStream fin=new FileInputStream(f);
            stmt.setBinaryStream(10, fin, fin.available());
            d=(byte)JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION);
                if(d==0)
                { 
                     stmt.executeUpdate();
                     stmt=con.prepareStatement("update automatic_reg set aregno=?,ch=?");
                     stmt.setInt(1,p);
                     stmt.setString(2,Character.toString(s));
                     stmt.executeUpdate();
                     temp=tfregno.getText();
                     try {
                         stmt=con.prepareStatement("select aregno,ch from automatic_reg");
                         rs=stmt.executeQuery();
                         rs.next();
                         p=rs.getShort(1);
                         s=rs.getString(2).charAt(0);
                         p++;
                         if(p<10)
                             tfregno.setText(regno+s+"00"+p);
                         else if(p<100)
                             tfregno.setText(regno+s+"0"+p);
                         else if(p<1000)
                             tfregno.setText(regno+s+p);
                         else
                           {
                             s++;
                             p=1;
                             regno=regno+s+"00"+p;
                           }
                         } catch (SQLException ex) {
                      Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     tfsname.setText("");
                     tffname.setText("");
                     tfcno.setText("");
                     tfemail.setText("");
                     taadd.setText("");
                     tfsname.requestFocus();
                     con.close();   
                }
                else if(d==1)
                {}
                d=(byte)JOptionPane.showConfirmDialog(null, "do you want to take admission on it!","ims", JOptionPane.YES_NO_OPTION);
                     if(d==0)
                     {
                          new Admission(temp,f).setVisible(true);
                     }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (FileNotFoundException ex) {
                Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
            }


       }
    }//GEN-LAST:event_submitActionPerformed

    private void tfsnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfsnameFocusLost
          n=(byte)tfsname.getText().length();
           for(i=0;i<n;i++)
           {
              char ch=tfsname.getText().charAt(i);
              if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
              { 
                  JOptionPane.showMessageDialog(this,"Student Name must contain alphabet only !","Insertion Problem",JOptionPane.INFORMATION_MESSAGE);
                  tfsname.requestFocus();
                  break;
              }       
           }          
    }//GEN-LAST:event_tfsnameFocusLost

    private void tffnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffnameFocusLost
         n=(byte)tffname.getText().length();
           for(i=0;i<n;i++)
           {
              char ch=tffname.getText().charAt(i);
              if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
              {   
              JOptionPane.showMessageDialog(this,"Father's Name must contain alphabet only !","Insertion Problem",JOptionPane.INFORMATION_MESSAGE);    
              tffname.requestFocus();
              break;
              }       
           }
    }//GEN-LAST:event_tffnameFocusLost

    private void tfcnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfcnoFocusLost
        n=(byte)tfcno.getText().length();
         if(n==10)
         { 
           for(i=0;i<n;i++)
           {
              char ch=tfcno.getText().charAt(i);
              if(!(ch>=48&&ch<=58))
              {   
              JOptionPane.showMessageDialog(this,"It only contain digits !","Invalid Contact No",JOptionPane.INFORMATION_MESSAGE);    
              tfcno.requestFocus();
              break;
              }       
           }
         }
         else
         {  
             JOptionPane.showMessageDialog(this,"It contain 10 digits only !","Invalid Contact No",JOptionPane.INFORMATION_MESSAGE);
             tfcno.requestFocus();
         }   
    }//GEN-LAST:event_tfcnoFocusLost

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
       JFileChooser chooser=new JFileChooser();
            chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        ImageIcon img = new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(sphoto.getWidth(),sphoto.getHeight(),Image.SCALE_DEFAULT ));
            sphoto.setIcon(img);
    }//GEN-LAST:event_uploadActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dob_dc;
    private javax.swing.JRadioButton female_rb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male_rb;
    private javax.swing.JLabel sphoto;
    private javax.swing.JButton submit;
    private javax.swing.JTextArea taadd;
    private javax.swing.JTextField tfcno;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tffname;
    private javax.swing.JTextField tfregdate;
    private javax.swing.JTextField tfregno;
    private javax.swing.JTextField tfsname;
    private javax.swing.JRadioButton transgender_rb;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
