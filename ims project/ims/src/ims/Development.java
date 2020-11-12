package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Development extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt; short p;char s; 
    ResultSet rs;
    String cno="CN";
    Calendar c;
    byte t;
    
    public Development() throws SQLException {
        initComponents();
         ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        con=Conn.conLink();
         c=Calendar.getInstance();
        ad_tf.setText(""+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        this.getRootPane().setDefaultButton(submit);
        this.setLocationRelativeTo(null);
        cn_tf.requestFocus();
        stmt=con.prepareStatement("select aregno,ch from automatic");
        rs=stmt.executeQuery();
        rs.next();
        p=rs.getShort(1);
        s=rs.getString(2).charAt(0);
        p++;
        if(p<10)
        cno_tf.setText(cno+s+"00"+p);
        else if(p<100)
            cno_tf.setText(cno+s+"0"+p);
        else if(p<1000)
            cno_tf.setText(cno+s+p);
        else
        {
            s++;
            p=1;
            cno=cno+s+"00"+p;
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pTitle_tf = new javax.swing.JTextField();
        cno_tf = new javax.swing.JTextField();
        cn_tf = new javax.swing.JTextField();
        o_tf = new javax.swing.JTextField();
        p_tf = new javax.swing.JTextField();
        conno_tf = new javax.swing.JTextField();
        cost_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        ad_tf = new javax.swing.JTextField();
        dld_dcc = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Development Entry Form");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Project Title");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Client No.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Client Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Organization");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Platform");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Contact No.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Cost");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Accepted Date");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Dead Line Date");

        pTitle_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        cno_tf.setEditable(false);
        cno_tf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cno_tf.setEnabled(false);

        cn_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cn_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cn_tfFocusLost(evt);
            }
        });

        o_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        p_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        conno_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        conno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                conno_tfFocusLost(evt);
            }
        });

        cost_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cost_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cost_tfFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("DEVELOPMENT");

        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        ad_tf.setEditable(false);

        dld_dcc.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
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
    dld_dcc.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9)
                .addComponent(jLabel5)
                .addComponent(jLabel6)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cost_tf)
                    .addComponent(conno_tf)
                    .addComponent(p_tf)
                    .addComponent(o_tf)
                    .addComponent(pTitle_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addComponent(cno_tf)
                .addComponent(ad_tf)
                .addComponent(cn_tf)
                .addComponent(dld_dcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(30, 30, 30))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(jLabel10))
                .addGroup(layout.createSequentialGroup()
                    .addGap(156, 156, 156)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cn_tf, cno_tf, conno_tf, cost_tf, o_tf, pTitle_tf, p_tf});

    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(cno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addGap(15, 15, 15)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(cn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(pTitle_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(o_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(p_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(conno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(cost_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ad_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addComponent(dld_dcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(26, 26, 26)
            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ad_tf, cn_tf, cno_tf, conno_tf, cost_tf, o_tf, pTitle_tf, p_tf});

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(cn_tf.getText().length()==0)
        {
            cn_tf.requestFocus();
            t=1;
        }
        else if(pTitle_tf.getText().length()==0)
        {
            pTitle_tf.requestFocus();
            t=1;
        }
         else if(o_tf.getText().length()==0)
        {
            o_tf.requestFocus();
            t=1;
        }
        else if(p_tf.getText().length()==0)
        {
            p_tf.requestFocus();
            t=1;
        }
        else if(conno_tf.getText().length()==0)
        {
            conno_tf.requestFocus();
            t=1;
        }
        else if(cost_tf.getText().length()==0)
        {
            cost_tf.requestFocus();
            t=1;
        }
        else if(ad_tf.getText().length()==0)
        {
            ad_tf.requestFocus();
            t=1;
        }
        else t=0;
        
            if(t==1)
         JOptionPane.showMessageDialog(this,"Please Fill Blank Space","insertion",JOptionPane.INFORMATION_MESSAGE);
  
       if(t==0)        
        try
            {
                con=Conn.conLink();
                stmt=con.prepareStatement("insert into DEVELOPMENT values(?,?,?,?,?,?,?,?,?)");
                stmt.setString(1,pTitle_tf.getText());
                stmt.setString(2,cno_tf.getText().toUpperCase());
                stmt.setString(3,cn_tf.getText());
                stmt.setString(4,o_tf.getText());
                stmt.setString(5,p_tf.getText());
                stmt.setString(6,conno_tf.getText());
                stmt.setInt(7,Integer.parseInt(cost_tf.getText()));
                stmt.setString(8, ad_tf.getText());
                Calendar c=dld_dcc.getSelectedDate();
                stmt.setString(9,""+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
                stmt.executeUpdate();
                stmt=con.prepareStatement("update automatic set aregno=?,ch=?");
                 stmt.setInt(1,p);
                 stmt.setString(2,Character.toString(s));
                 stmt.executeUpdate();
        byte r = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION); 
                if(r==0)
                {
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"successfully record inserted!");
            stmt=con.prepareStatement("select aregno,ch from automatic");
            rs=stmt.executeQuery();
            rs.next();
            p=rs.getShort(1);
            s=rs.getString(2).charAt(0);
            p++;
            if(p<10)
              cno_tf.setText(cno+s+"00"+p);
            else if(p<100)
               cno_tf.setText(cno+s+"0"+p);
            else if(p<1000)
              cno_tf.setText(cno+s+p);
            else
            {
                s++;
                p=1;
                cno=cno+s+"00"+p;
            }
            cn_tf.setText("");
            pTitle_tf.setText("");
            o_tf.setText("");
            p_tf.setText("");
            conno_tf.setText("");
            cost_tf.setText("");
            c=Calendar.getInstance();
             ad_tf.setText(""+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)); 
            dld_dcc.setText("");
                }
            else if(r==1)
                    {
                    dld_dcc.requestFocus();
                    }
                
                 con.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"sorry","Connection problem",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_submitActionPerformed

    private void cn_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cn_tfFocusLost
          
          byte i,n=(byte)cn_tf.getText().length();
          for(i=0;i<n;i++)
          {
              char ch=cn_tf.getText().charAt(i);
          if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127)||(ch==32)))
              
          {
          
          JOptionPane.showMessageDialog(this,"name must be contain alphabet!","Insertion",JOptionPane.INFORMATION_MESSAGE);
          cn_tf.requestFocus();
          break;
          }
      }
    }//GEN-LAST:event_cn_tfFocusLost

    private void conno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conno_tfFocusLost
            byte n=(byte)conno_tf.getText().length();
            if(n==10)
            for(byte i=0;i<n;i++)
            {
              char ch=conno_tf.getText().charAt(i);
            if(!(ch>=48&&ch<=58||ch=='-'))
            {
              JOptionPane.showMessageDialog(this,"contact no cannot contains a alphabet!","insertion",JOptionPane.INFORMATION_MESSAGE);
               conno_tf.requestFocus();
               break;
            }
           }
            else
            {
                JOptionPane.showMessageDialog(this,"Contact number contains 10 digit only!","insertion",JOptionPane.INFORMATION_MESSAGE); 
                conno_tf.requestFocus();
            }
    }//GEN-LAST:event_conno_tfFocusLost

    private void cost_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cost_tfFocusLost
      byte n=(byte)cost_tf.getText().length();
            for(byte i=0;i<n;i++)
            {
              char ch=cost_tf.getText().charAt(i);
            if(!(ch>=48&&ch<=58))
            {
                JOptionPane.showMessageDialog(this,"cost cannot contains a alphabet!","insertion",JOptionPane.INFORMATION_MESSAGE);
                  cost_tf.requestFocus();
                  break;
            }
            }
    }//GEN-LAST:event_cost_tfFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_tf;
    private javax.swing.JTextField cn_tf;
    private javax.swing.JTextField cno_tf;
    private javax.swing.JTextField conno_tf;
    private javax.swing.JTextField cost_tf;
    private datechooser.beans.DateChooserCombo dld_dcc;
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
    private javax.swing.JTextField o_tf;
    private javax.swing.JTextField pTitle_tf;
    private javax.swing.JTextField p_tf;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
