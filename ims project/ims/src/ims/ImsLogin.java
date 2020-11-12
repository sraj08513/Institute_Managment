package ims;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ImsLogin extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String user="",pass="",s="";
    byte r=0;
    public ImsLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        aduser_tf.requestFocus();
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        this.getRootPane().setDefaultButton(adlogin_bt);
        this.getRootPane().setDefaultButton(glogin_bt);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        aduser_lb = new javax.swing.JLabel();
        aduser_tf = new javax.swing.JTextField();
        adpass_tf = new javax.swing.JLabel();
        adpass_pf = new javax.swing.JPasswordField();
        adlogin_bt = new javax.swing.JButton();
        show = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adchange = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        glogin_bt = new javax.swing.JButton();
        gpass_lb = new javax.swing.JLabel();
        gpass_pf = new javax.swing.JPasswordField();
        show_bt = new javax.swing.JButton();
        guser_tf = new javax.swing.JTextField();
        guser_lb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        change = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN WINDOW");
        setResizable(false);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        aduser_lb.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        aduser_lb.setText("User Name");
        jPanel1.add(aduser_lb);
        aduser_lb.setBounds(230, 92, 100, 28);

        aduser_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aduser_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aduser_tfFocusLost(evt);
            }
        });
        jPanel1.add(aduser_tf);
        aduser_tf.setBounds(348, 95, 187, 28);

        adpass_tf.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        adpass_tf.setText("Password");
        jPanel1.add(adpass_tf);
        adpass_tf.setBounds(230, 141, 100, 28);

        adpass_pf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(adpass_pf);
        adpass_pf.setBounds(348, 144, 187, 28);

        adlogin_bt.setBackground(new java.awt.Color(204, 204, 255));
        adlogin_bt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adlogin_bt.setText("LOGIN");
        adlogin_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adlogin_btActionPerformed(evt);
            }
        });
        jPanel1.add(adlogin_bt);
        adlogin_bt.setBounds(450, 220, 83, 23);

        show.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show);
        show.setBounds(541, 147, 70, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(500, 20, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/key.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 130, 190, 210);

        adchange.setBackground(new java.awt.Color(255, 255, 255));
        adchange.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adchange.setText("Change Password");
        adchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adchangeActionPerformed(evt);
            }
        });
        jPanel1.add(adchange);
        adchange.setBounds(350, 180, 180, 23);

        jTabbedPane1.addTab("ADMINISTRATOR", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        glogin_bt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        glogin_bt.setText("LOGIN");
        glogin_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glogin_btActionPerformed(evt);
            }
        });
        jPanel2.add(glogin_bt);
        glogin_bt.setBounds(340, 200, 80, 23);

        gpass_lb.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        gpass_lb.setText("Password");
        jPanel2.add(gpass_lb);
        gpass_lb.setBounds(230, 130, 100, 28);

        gpass_pf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(gpass_pf);
        gpass_pf.setBounds(340, 130, 187, 28);

        show_bt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_bt.setText("Show");
        show_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_btActionPerformed(evt);
            }
        });
        jPanel2.add(show_bt);
        show_bt.setBounds(530, 130, 80, 25);

        guser_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(guser_tf);
        guser_tf.setBounds(340, 80, 187, 28);

        guser_lb.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        guser_lb.setText("User Name");
        jPanel2.add(guser_lb);
        guser_lb.setBounds(230, 80, 100, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/raysnew.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(500, 20, 100, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/key.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 130, 190, 210);

        change.setBackground(new java.awt.Color(255, 255, 255));
        change.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        change.setText("Change Password");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        jPanel2.add(change);
        change.setBounds(340, 170, 180, 23);

        jTabbedPane1.addTab("GUEST", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_btActionPerformed
        if(show_bt.getText().equals("Show")){
            show_bt.setText("Hide");
            gpass_pf.setEchoChar((char)0);
        } else if(show_bt.getText().equals("Hide")) {
            show_bt.setText("Show");
            gpass_pf.setEchoChar('*');
        }
    }//GEN-LAST:event_show_btActionPerformed

    private void glogin_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glogin_btActionPerformed
        user="";
        pass="";
        s="";
        r=0;
        char str[]=gpass_pf.getPassword();
        for(int i=0;i<str.length;i++) 
            s=s+str[i];
        try {
            stmt=con.prepareStatement("select username,password from users");
            rs=stmt.executeQuery();
            while(rs.next()) {
            user=rs.getString(1);
            pass=rs.getString(2);
            if(s.equals(pass)&&guser_tf.getText().equals(user)){
                r=1;
                break;
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImsLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(r==1)
        new FormType().setVisible(true);
        else
            JOptionPane.showMessageDialog(this,"Wrong password");
    }//GEN-LAST:event_glogin_btActionPerformed

    private void adlogin_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adlogin_btActionPerformed
        user="";
        pass="";
        s="";
        r=0;
        char str[]=adpass_pf.getPassword();
        for(int i=0;i<str.length;i++)
        {
            s=s+str[i];
        }
        try {
            stmt=con.prepareStatement("select adminname,pass from admin");
            rs=stmt.executeQuery();
            while(rs.next()){
            user=rs.getString(1).toUpperCase();
            pass=rs.getString(2);
            if(s.equals(pass)&&aduser_tf.getText().toUpperCase().equals(user)){
                r=1;
                break;
            }}
        } catch (SQLException ex) {
            Logger.getLogger(ImsLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(r==1)
        new AdminForm().setVisible(true);
        else
            JOptionPane.showMessageDialog(this,"WRONG PASSWORD","insertion",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_adlogin_btActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if(show.getText().equals("Show")){
            show.setText("Hide");
            adpass_pf.setEchoChar((char)0);
        } else if(show.getText().equals("Hide")) {
            show.setText("Show");
            adpass_pf.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
    if(change.isSelected())
        new ChangePass().setVisible(true);
    }//GEN-LAST:event_changeActionPerformed

    private void adchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adchangeActionPerformed
        if(adchange.isSelected())
            new ChangePassad().setVisible(true);
    }//GEN-LAST:event_adchangeActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        guser_tf.requestFocus();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void aduser_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aduser_tfFocusLost
        try {
            con=Conn.conLink();
            stmt=con.prepareStatement("select adminname from admin");
            rs=stmt.executeQuery();
            while(rs.next())
            {
                if(!(aduser_tf.getText().toUpperCase().equals(rs.getString(1).toUpperCase()))){
                    JOptionPane.showMessageDialog(this,"WRONG USER NAME");
                    aduser_tf.requestFocus();
                    break;}
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImsLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aduser_tfFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adchange;
    private javax.swing.JButton adlogin_bt;
    private javax.swing.JPasswordField adpass_pf;
    private javax.swing.JLabel adpass_tf;
    private javax.swing.JLabel aduser_lb;
    private javax.swing.JTextField aduser_tf;
    private javax.swing.JCheckBox change;
    private javax.swing.JButton glogin_bt;
    private javax.swing.JLabel gpass_lb;
    private javax.swing.JPasswordField gpass_pf;
    private javax.swing.JLabel guser_lb;
    private javax.swing.JTextField guser_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton show;
    private javax.swing.JButton show_bt;
    // End of variables declaration//GEN-END:variables
}
