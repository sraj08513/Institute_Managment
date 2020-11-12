package ims;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
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
public class MemberDetails extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;Short p;String eno="REPL/18";
    byte t,s=0;File f;
    public MemberDetails() throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(submit_bt);
        ImageIcon img=new ImageIcon(getClass().getResource("rayslogo.png"));
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        con=Conn.conLink();
        this.setLocationRelativeTo(null);
        stmt=con.prepareStatement("select type from etype");
        rs=stmt.executeQuery();
        while(rs.next())
        {
            etype_cb.addItem(rs.getString(1));
        }
         enmae_tf.requestFocus();
        stmt=con.prepareStatement("select eno from eautomatic");
        rs=stmt.executeQuery();
        rs.next();
        p=rs.getShort(1);
        p++;
        if(p<10)
            eno_tf.setText(eno+"00"+p);
        else if(p<100)
            eno_tf.setText(eno+"0"+p);
        else if(p<1000)
            eno_tf.setText(eno+p);
        else
        {
            p=1;
            eno_tf.setText(eno+"00"+p);
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
        enmae_tf = new javax.swing.JTextField();
        epost_tf = new javax.swing.JTextField();
        equali_tf = new javax.swing.JTextField();
        eexp_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        eno_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        phno_tf = new javax.swing.JTextField();
        email_id_tf = new javax.swing.JTextField();
        esalary_tf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        submit_bt = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        especiality_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        eadress_tf = new javax.swing.JTextArea();
        doj_dpc = new datechooser.beans.DateChooserCombo();
        dob_dpc = new datechooser.beans.DateChooserCombo();
        estatus_cb = new javax.swing.JComboBox<>();
        mphoto = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        etype_cb = new javax.swing.JComboBox<>();
        erespo_cb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entry Form - Employee Details");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Employee  no");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Employee Type");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Employee Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Employee Post");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Employee Qualification");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Employee Experience");

        enmae_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        enmae_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                enmae_tfFocusLost(evt);
            }
        });

        epost_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        epost_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                epost_tfFocusLost(evt);
            }
        });

        equali_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        eexp_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        eexp_tf.setText("0");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Employee Responsibility");

        eno_tf.setEditable(false);
        eno_tf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Date Of Joining");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Employee Salary");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Employee Speciality");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Address");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Mobile No.");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Employee Status");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Email_id");

        phno_tf.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        phno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phno_tfFocusLost(evt);
            }
        });

        email_id_tf.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        esalary_tf.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        esalary_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                esalary_tfFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel15.setText("MEMBER DETAILS");

        submit_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit_bt.setText("SUBMIT");
        submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Employee D.O.B");

        eadress_tf.setColumns(20);
        eadress_tf.setRows(5);
        jScrollPane1.setViewportView(eadress_tf);

        doj_dpc.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
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
    doj_dpc.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);

    dob_dpc.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
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

estatus_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVE", "INACTIVE" }));

mphoto.setText("            PHOTO");
mphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

upload.setText("UPLOAD");
upload.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        uploadActionPerformed(evt);
    }
    });

    etype_cb.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            etype_cbFocusLost(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(256, 256, 256)
            .addComponent(jLabel15)
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(eno_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(equali_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addComponent(enmae_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(doj_dpc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etype_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eexp_tf))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(estatus_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especiality_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(30, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dob_dpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(erespo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(esalary_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(242, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(epost_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upload)
                    .addGap(114, 114, 114))))
    );

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dob_dpc, doj_dpc, enmae_tf, eno_tf, epost_tf, equali_tf, erespo_cb, esalary_tf, etype_cb});

    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel15)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enmae_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(epost_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(equali_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eexp_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etype_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(upload)
                    .addGap(25, 25, 25)
                    .addComponent(especiality_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(phno_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doj_dpc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(email_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(esalary_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erespo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(estatus_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob_dpc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(submit_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(30, 30, 30))
    );

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dob_dpc, doj_dpc, eexp_tf, enmae_tf, eno_tf, epost_tf, equali_tf, erespo_cb, esalary_tf, especiality_tf, etype_cb});

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {email_id_tf, phno_tf});

    getAccessibleContext().setAccessibleName("Entry Form - Member Details");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btActionPerformed
        if(enmae_tf.getText().length()==0)
        {
            s=1;
            enmae_tf.requestFocus();
        }
        else if(epost_tf.getText().length()==0)
        {
            s=1;
            epost_tf.requestFocus();
        }
        else if(equali_tf.getText().length()==0)
        {
            s=1;
            eadress_tf.requestFocus();
        }
        else if(eexp_tf.getText().length()==0)
        {
            s=1;
            eexp_tf.requestFocus();
        }
        else if(esalary_tf.getText().length()==0)
        {
            s=1;
            esalary_tf.requestFocus();
        }
        else if(especiality_tf.getText().length()==0)
        {
            s=1;
            especiality_tf.requestFocus();
        }
        else if(eadress_tf.getText().length()==0)
        {
            s=1;
            eadress_tf.requestFocus();
        }
        else if(phno_tf.getText().length()==0)
        {
            s=1;
            phno_tf.requestFocus();
        }
        else if(email_id_tf.getText().length()==0)
        {
            s=1;
            email_id_tf.requestFocus();
        }
       else
            s=0;       
        if(s==1)
             JOptionPane.showMessageDialog(this,"PLEASE FILL BLANK FIELD THEN CLICK ON SUBMIT!");
        if(s==0)
        try
        {    
            con=Conn.conLink();
            stmt=con.prepareStatement("insert into member_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,eno_tf.getText().toUpperCase());
            stmt.setString(2,enmae_tf.getText().toUpperCase());
            stmt.setString(3,epost_tf.getText());
            stmt.setString(4,equali_tf.getText());
            stmt.setString(5,eexp_tf.getText());
            stmt.setString(6, (String) etype_cb.getSelectedItem());
            Calendar c=doj_dpc.getSelectedDate();
            stmt.setString(7,""+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
            stmt.setString(8,especiality_tf.getText());
            stmt.setString(9, (String) erespo_cb.getSelectedItem());
            stmt.setString(10,phno_tf.getText());
            stmt.setString(11,email_id_tf.getText());
            stmt.setInt(12,Integer.parseInt(esalary_tf.getText()));
            stmt.setString(13, (String) estatus_cb.getSelectedItem());
            c=dob_dpc.getSelectedDate();
            stmt.setString(14,""+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));
            stmt.setString(15,eadress_tf.getText());
            FileInputStream fin=new FileInputStream(f);
            stmt.setBinaryStream(16, fin, fin.available());
            byte r = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert record!","ims", JOptionPane.YES_NO_OPTION);
                if(r==0)
                { 
                   stmt.executeUpdate();
                   //JOptionPane.showMessageDialog(this,"sucessfully record inserted!");
                   stmt=con.prepareStatement("update eautomatic set eno=?");
                   stmt.setInt(1,p);
                   stmt.executeUpdate();
                   byte z = (byte) JOptionPane.showConfirmDialog(null, "do you want to insert another record!","ims", JOptionPane.YES_NO_OPTION);
                    if(z==0)
                    {
                    enmae_tf.setText("");
                    epost_tf.setText("");
                    equali_tf.setText("");
                    eexp_tf.setText("0");
                    doj_dpc.setText("");
                    dob_dpc.setText("");
                    mphoto.setIcon(null);
                    esalary_tf.setText("");
                    especiality_tf.setText("");
                    eadress_tf.setText("");
                    phno_tf.setText("");
                    email_id_tf.setText("");
                    enmae_tf.requestFocus();
                    stmt=con.prepareStatement("select eno from eautomatic");
                    rs=stmt.executeQuery();
                    rs.next();
                    p=rs.getShort(1);
                    p++;
                    if(p<10)
                    eno_tf.setText(eno+"00"+p);
                    else if(p<100)
                    eno_tf.setText(eno+"0"+p);
                    else if(p<1000)
                    eno_tf.setText(eno+p);
                    else
                     {
                        p=1;
                        eno_tf.setText(eno+"00"+p);
                     }
                    }
                    else
                    this.dispose();
                }
                con.close();
        }
        catch(Exception e){System.out.print("connection problem,try again!");}
    }//GEN-LAST:event_submit_btActionPerformed

    private void enmae_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enmae_tfFocusLost
        t=(byte) enmae_tf.getText().length();
        for(int i=0;i<t;i++)
        {
            char ch=enmae_tf.getText().charAt(i);
            if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127) ||(ch==32)))
            {
                JOptionPane.showMessageDialog(this,"please insert valid name");
                enmae_tf.requestFocus();
                break;
            }
        }
    }//GEN-LAST:event_enmae_tfFocusLost

    private void phno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phno_tfFocusLost
        t=(byte) phno_tf.getText().length();
        if(t==10)
        for(int i=0;i<t;i++)
        {
            char ch=phno_tf.getText().charAt(i);
            if(!((ch>=48&&ch<=58)||(ch=='+') ||(ch=='-')))
            {
                JOptionPane.showMessageDialog(this,"please insert valid phno");
                phno_tf.requestFocus();
                break;
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Mobile Number contains 10 digit only");
            phno_tf.requestFocus();}
    }//GEN-LAST:event_phno_tfFocusLost

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
       JFileChooser chooser=new JFileChooser();
            chooser.showOpenDialog(null);
         f = chooser.getSelectedFile();
        ImageIcon img = new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(mphoto.getWidth(),mphoto.getHeight(),Image.SCALE_DEFAULT ));
            mphoto.setIcon(img);
    }//GEN-LAST:event_uploadActionPerformed

    private void etype_cbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etype_cbFocusLost
            erespo_cb.removeAllItems();
        try {
            con=Conn.conLink();
            String str="select * from";
            str=str+" "+(String) etype_cb.getSelectedItem();
            stmt=con.prepareStatement(str);
            rs=stmt.executeQuery();
            while(rs.next())
            {
               erespo_cb.addItem(rs.getString(1));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MemberDetails.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_etype_cbFocusLost

    private void esalary_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esalary_tfFocusLost
        t=(byte) esalary_tf.getText().length();
        for(int i=0;i<t;i++)
        {
            char ch=esalary_tf.getText().charAt(i);
            if(!(ch>=48&&ch<=58))
            {
                JOptionPane.showMessageDialog(this,"please insert valid salary");
                esalary_tf.requestFocus();
                break;
            }
        }
    }//GEN-LAST:event_esalary_tfFocusLost

    private void epost_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_epost_tfFocusLost
    t=(byte) epost_tf.getText().length();
        for(int i=0;i<t;i++)
        {
            char ch=epost_tf.getText().charAt(i);
            if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=127) ||(ch==32)))
            {
                JOptionPane.showMessageDialog(this,"please insert valid post");
                epost_tf.requestFocus();
                break;
            }
        }     
    }//GEN-LAST:event_epost_tfFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dob_dpc;
    private datechooser.beans.DateChooserCombo doj_dpc;
    private javax.swing.JTextArea eadress_tf;
    private javax.swing.JTextField eexp_tf;
    private javax.swing.JTextField email_id_tf;
    private javax.swing.JTextField enmae_tf;
    private javax.swing.JTextField eno_tf;
    private javax.swing.JTextField epost_tf;
    private javax.swing.JTextField equali_tf;
    private javax.swing.JComboBox<String> erespo_cb;
    private javax.swing.JTextField esalary_tf;
    private javax.swing.JTextField especiality_tf;
    private javax.swing.JComboBox<String> estatus_cb;
    private javax.swing.JComboBox<String> etype_cb;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mphoto;
    private javax.swing.JTextField phno_tf;
    private javax.swing.JButton submit_bt;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
