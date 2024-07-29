package View;

import Classes.Asignature;
import Classes.Student;
import Controller.getStudent;
import Model.DeleteStudent;
import Model.GetStudent;
import Model.GetStudentBubbleSort;
import Model.GetStudentQuickSort;
import Model.SaveStudent;
import Model.SearchStudent;
import Model.UpdateStudentNotes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Start extends javax.swing.JFrame {

    GetStudentQuickSort getStudentQuik = new GetStudentQuickSort();
    GetStudentBubbleSort getStudentBubblucle = new GetStudentBubbleSort();
    GetStudent getStudent = new GetStudent();
    SaveStudent saveStudent;
    Student student;
    Asignature asignature;
    ArrayList<Asignature> ArrayL = new ArrayList<>();
    SearchStudent searchStudent;

    //Jilmar
    int row = -1;
    int rowSave;
    String id = "";
    DeleteStudent delete;
    getStudent getStud;
    String[] title = {"Asignatura", "Parcial 1", "Parcial 2", "Parcial 3", "Promedio"};

    public Start() {
        initComponents();
        initTable();

        // Atributos Jilmar
        delete = new DeleteStudent();
        searchStudent = new SearchStudent();
        getStud = new getStudent();
        setData(getStud.getStudent());

    }

    public void initTable() {
        TableData.setModel(getStudent.view());
    }

    public void intiTableQuickSort() {
        TableData.setModel(getStudentQuik.view());
    }

    public void intiTableBubblucle() {
        TableData.setModel(getStudentBubblucle.view());
    }

    public void SetAsignature() {
        if (RadButtMatematicas.isSelected()) {
            asignature = new Asignature("Matematicas", "Ana Pérez Gómez", "1234");
            ArrayL.add(asignature);
        }
        if (RadButtLenguaje.isSelected()) {
            asignature = new Asignature("Lengua y literatura", "José García Ruiz", "1254");
            ArrayL.add(asignature);
        }
        if (RadButtFisica.isSelected()) {
            asignature = new Asignature("Fisica", "Juan Torres Castro", "1278");
            ArrayL.add(asignature);
        }
        if (RadButtQuimica.isSelected()) {
            asignature = new Asignature("Química", "Marta Ortiz Salinas", "1201");
            ArrayL.add(asignature);
        }
        if (RadButtBiologia.isSelected()) {
            asignature = new Asignature("Biología", "Sara Díaz López", "1202");
            ArrayL.add(asignature);
        }
        if (RadButtHistoria.isSelected()) {
            asignature = new Asignature("Historia", "Patricia Ruiz Álvarez", "1230");
            ArrayL.add(asignature);
        }
        if (RadButtGeografia.isSelected()) {
            asignature = new Asignature("Geografía", "Miguel Cabrera Gómez", "1201");
            ArrayL.add(asignature);
        }
        if (RadButtEdFsica.isSelected()) {
            asignature = new Asignature("Educación Física", "Lucia Díaz Márquez", "1270");
            ArrayL.add(asignature);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TxtLastNameFather = new javax.swing.JTextField();
        TxtLastNameMother = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtPhone = new javax.swing.JTextField();
        TxtIdent = new javax.swing.JTextField();
        TxtName = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        RadButtHistoria = new javax.swing.JRadioButton();
        RadButtGeografia = new javax.swing.JRadioButton();
        RadButtEdFsica = new javax.swing.JRadioButton();
        RadButtBiologia = new javax.swing.JRadioButton();
        RadButtLenguaje = new javax.swing.JRadioButton();
        RadButtFisica = new javax.swing.JRadioButton();
        RadButtQuimica = new javax.swing.JRadioButton();
        RadButtMatematicas = new javax.swing.JRadioButton();
        ButtonSave = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableData = new javax.swing.JTable();
        TxtSearch = new javax.swing.JTextField();
        ButtonOrder = new javax.swing.JLabel();
        ButtonEdit = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JLabel();
        ButtonTodos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblIdentification = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAsignature = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearch1 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAsignature1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(242, 242, 241));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio (1).png"))); // NOI18N
        jLabel4.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inicio", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(TxtLastNameFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 96, 158, 22));

        TxtLastNameMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLastNameMotherActionPerformed(evt);
            }
        });
        jPanel3.add(TxtLastNameMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 129, 158, 22));
        jPanel3.add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 129, 158, 22));

        TxtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPhoneActionPerformed(evt);
            }
        });
        jPanel3.add(TxtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 96, 158, 22));
        jPanel3.add(TxtIdent, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 64, 158, 22));
        jPanel3.add(TxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 64, 158, 22));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 162, 158, 22));

        RadButtHistoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(RadButtHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 253, -1, -1));

        RadButtGeografia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(RadButtGeografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 275, -1, -1));

        RadButtEdFsica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(RadButtEdFsica, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 297, -1, -1));

        RadButtBiologia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(RadButtBiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 233, -1, -1));

        RadButtLenguaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(RadButtLenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 253, -1, -1));

        RadButtFisica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(RadButtFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 275, -1, -1));

        RadButtQuimica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(RadButtQuimica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 297, -1, -1));

        RadButtMatematicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(RadButtMatematicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 233, -1, -1));

        ButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSaveMouseClicked(evt);
            }
        });
        jPanel3.add(ButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 172, 90, 23));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sistema de Gestión de Notas.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Registro de Alumnos", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableData);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 570, 220));

        TxtSearch.setBackground(new java.awt.Color(207, 207, 212));
        TxtSearch.setBorder(null);
        TxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSearchActionPerformed(evt);
            }
        });
        TxtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtSearchKeyPressed(evt);
            }
        });
        jPanel4.add(TxtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 48, 150, 20));

        ButtonOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonOrderMouseClicked(evt);
            }
        });
        jPanel4.add(ButtonOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 70, 17));

        ButtonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonEditMouseClicked(evt);
            }
        });
        jPanel4.add(ButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 50, 17));

        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        jPanel4.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 310, 60, 17));

        ButtonTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonTodosMouseClicked(evt);
            }
        });
        jPanel4.add(ButtonTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, 17));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sistema de Gestión de Notas (1).png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Listado de Alumnos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(242, 242, 241));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Buscar Estudiante");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanel5.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Nombre: ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel5.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Apellido:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));
        jPanel5.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 80, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Identificacion:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));
        jPanel5.add(lblIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 80, 20));

        tblAsignature.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAsignature);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Asignatura");
        model.addColumn("Parcial 1");
        model.addColumn("Parcial 2");
        model.addColumn("Parcial 3");
        model.addColumn("Promedio");
        tblAsignature.setModel(model);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 420, 180));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Registro de Notas");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        btnSave.setBackground(new java.awt.Color(102, 255, 255));
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSave.setText("Guardar ");
        btnSave.setOpaque(true);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        jPanel5.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 90, 30));

        jLabel25.setBackground(new java.awt.Color(204, 255, 204));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Editar Nota");
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 90, 30));

        jLabel26.setText("Seleccionar Materia para Editar");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnSearch.setBackground(new java.awt.Color(51, 204, 255));
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSearch.setText("Buscar");
        btnSearch.setOpaque(true);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        jPanel5.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 100, 20));

        jTabbedPane1.addTab("Registro de Notas", jPanel5);

        jPanel6.setBackground(new java.awt.Color(242, 242, 241));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("Consulta de Notas");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Buscar Estudiante");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch1ActionPerformed(evt);
            }
        });
        jPanel6.add(txtSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, -1));

        btnSearch1.setBackground(new java.awt.Color(51, 204, 255));
        btnSearch1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSearch1.setText("Buscar");
        btnSearch1.setOpaque(true);
        btnSearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearch1MouseClicked(evt);
            }
        });
        jPanel6.add(btnSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 100, 20));

        tblAsignature1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblAsignature1);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 550, 180));

        jTabbedPane1.addTab("Consulta de Notas", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 620, 390));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proyecto nota.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void TxtLastNameMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLastNameMotherActionPerformed

    }//GEN-LAST:event_TxtLastNameMotherActionPerformed

    private void TxtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneActionPerformed

    private void ButtonSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSaveMouseClicked
        SetAsignature();
        student = new Student(TxtName.getText(), TxtLastNameFather.getText(),
                TxtLastNameMother.getText(), jDateChooser1.getDate(),
                TxtIdent.getText(), TxtPhone.getText(),
                TxtEmail.getText(), ArrayL);

        // Jilmar
        for (Asignature a : student.getArrayList()) {
            a.addGrade("Primer Parcial", 0);
            a.addGrade("Segundo Parcial", 0);
            a.addGrade("Tercer Parcial", 0);
        }

        saveStudent = new SaveStudent(student);
        saveStudent.setStudent();
        initTable();
    }//GEN-LAST:event_ButtonSaveMouseClicked

    private void ButtonOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonOrderMouseClicked
        Object[] options = {"Ordenar por Apellidos (QuickSort)", "Ordenar por Cedula", "Salir"};
        int option = JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (option == 0) {
            JOptionPane.showMessageDialog(null, "Datos Ordenados por Apellidos");
            intiTableQuickSort();
        } else if (option == 1) {
            intiTableBubblucle();
            JOptionPane.showMessageDialog(null, "Datos Ordenados por Cedula");
        } else {
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
        }

    }//GEN-LAST:event_ButtonOrderMouseClicked

    private void ButtonTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonTodosMouseClicked
        initTable();
    }//GEN-LAST:event_ButtonTodosMouseClicked

    private void TxtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSearchKeyPressed

    private void TxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSearchActionPerformed
        Object[] options = {"Apellidos", "Nombres", "Cedula", "Telefono", "Salir"};
        int option = JOptionPane.showOptionDialog(null, "BUSCAR POR:", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (option == 0) {
            JOptionPane.showMessageDialog(null, "Buscar por Apellidos");
            TableData.setModel(searchStudent.search("Ape_Paterno", TxtSearch.getText()));

        } else if (option == 1) {
            JOptionPane.showMessageDialog(null, "Buscar por Nombres");
            TableData.setModel(searchStudent.search("Name", TxtSearch.getText()));
        } else if (option == 2) {
            JOptionPane.showMessageDialog(null, "Buscar por Cédula");
            TableData.setModel(searchStudent.search("Cédula", TxtSearch.getText()));
        } else if (option == 3) {
            JOptionPane.showMessageDialog(null, "Buscar por telefono");
            TableData.setModel(searchStudent.search("Telefono", TxtSearch.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Opcion Cancelada");
        }

    }//GEN-LAST:event_TxtSearchActionPerformed

    private void ButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEditMouseClicked
        UpdateStudent update = new UpdateStudent();
        update.setVisible(true);
        update.setLocationRelativeTo(this);
    }//GEN-LAST:event_ButtonEditMouseClicked

    private void TableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDataMouseClicked
        row = TableData.getSelectedRow();
        id = (String) TableData.getValueAt(row, 4);
    }//GEN-LAST:event_TableDataMouseClicked

    // Metodo para eliminar un estudiante por el numero de cedula Jilmar
    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        if (isValidId(id)) {
            int response = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                System.out.println("Entra");
                delete.deleteStudent(id);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un registro de un estudiante");
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        searchStudent();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        searchStudent();
    }//GEN-LAST:event_btnSearchMouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        row = tblAsignature.getSelectedRow();
        rowSave = row;
        setDates(student.getArrayList(), editTable(title, row));
    }//GEN-LAST:event_jLabel25MouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (rowSave < 0) {
            JOptionPane.showMessageDialog(this, "Elige una Materia para editar o registrar la nota");
            return;
        }
        
        saveStudentNotes();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void txtSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch1ActionPerformed

    private void btnSearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearch1MouseClicked
        id = txtSearch1.getText();
        if (isValidId(id)) {
            searchStudent(id);
        } else {
            JOptionPane.showMessageDialog(this, "Ingresa un numero de cedula");
        }
    }//GEN-LAST:event_btnSearch1MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonEdit;
    private javax.swing.JLabel ButtonOrder;
    private javax.swing.JLabel ButtonSave;
    private javax.swing.JLabel ButtonTodos;
    private javax.swing.JLabel DeleteButton;
    private javax.swing.JRadioButton RadButtBiologia;
    private javax.swing.JRadioButton RadButtEdFsica;
    private javax.swing.JRadioButton RadButtFisica;
    private javax.swing.JRadioButton RadButtGeografia;
    private javax.swing.JRadioButton RadButtHistoria;
    private javax.swing.JRadioButton RadButtLenguaje;
    private javax.swing.JRadioButton RadButtMatematicas;
    private javax.swing.JRadioButton RadButtQuimica;
    private javax.swing.JTable TableData;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtIdent;
    private javax.swing.JTextField TxtLastNameFather;
    private javax.swing.JTextField TxtLastNameMother;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtPhone;
    private javax.swing.JTextField TxtSearch;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnSearch1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIdentification;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAsignature;
    private javax.swing.JTable tblAsignature1;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch1;
    // End of variables declaration//GEN-END:variables

    // Busca un estudiante y lo establece en la tabla
    public void searchStudent() {
        student = null;
        id = txtSearch.getText();
        if (isValidId(id)) {
            student = getStud.getStudent(id);
            if (student != null) {
                displayStudentInfo(student);
                /*
                lblName.setText(student.getName());
                lblLastName.setText(student.getFirtsLastName());
                lblIdentification.setText(student.getIdentification());*/
                setDates(student.getArrayList(), tableModel(title));
            } else {
                JOptionPane.showMessageDialog(this, "No existe un registro con esa cedula");
            }
        }
    }
    
    //Estable los datos principales de un estydiante
    private void displayStudentInfo(Student student) {
        lblName.setText(student.getName());
        lblLastName.setText(student.getFirtsLastName());
        lblIdentification.setText(student.getIdentification());
    }

    // Establece los datos de las asignaturas en la tabla
    public void setDates(ArrayList<Asignature> asignature, DefaultTableModel model) {
        for (Asignature a : asignature) {
            Object[] obj = createAsignatureRow(a);
            model.addRow(obj);
        }
        tblAsignature.setModel(model);
    }
    
    // Crea y devulve un objecto con todas las asignaturas
    private Object[] createAsignatureRow(Asignature a) {
        Object[] obj = new Object[5];
        obj[0] = a.getName();
        obj[1] = a.getGrades().get("Primer Parcial");
        obj[2] = a.getGrades().get("Segundo Parcial");
        obj[3] = a.getGrades().get("Tercer Parcial");
        obj[4] = a.getGrades().get("Promedio");
        return obj;
    }

    // Busca y establece los datos de un estudiante
    public void searchStudent(String cedula) {

        String[] columnNames = new String[6];
        columnNames[0] = "Nombre";
        columnNames[1] = "Apellido";
        for (int i = 2; i < 6; i++) {
            columnNames[i] = "Materia " + (i - 1);
        }

        DefaultTableModel model = tableModel(columnNames);

        for (Student st : getStud.getStudent()) {
            if (st.getIdentification().equals(cedula)) {
                setData(st, model);
            }
        }
    }

    // Establce los datos en la tabla
    public void setData(Student st, DefaultTableModel model) {
        Object[] row1 = new Object[6];
        Object[] row2 = new Object[6];
        row1[0] = st.getName();
        row1[1] = st.getFirtsLastName();
        row2[0] = "";
        row2[1] = "";

        int colIndex = 2;
        for (Asignature a : st.getArrayList()) {
            row1[colIndex] = a.getName();
            row2[colIndex] = a.getGrades().get("Promedio");
            colIndex++;
            if (colIndex >= 6) {
                break;
            }
        }

        model.addRow(row1);
        model.addRow(row2);

        tblAsignature1.setModel(model);
    }

    // Establece todos los etudiantes en la tabla
    public void setData(List<Student> students) {

        String[] columnNames = new String[6];
        columnNames[0] = "Nombre";
        columnNames[1] = "Apellido";
        for (int i = 2; i < 6; i++) {
            columnNames[i] = "Materia " + (i - 1);
        }

        DefaultTableModel model = tableModel(columnNames);

        for (Student st : students) {
            setData(st, model);
        }
    }

    // Retorna un modelo de tabla con los titulos y celdas no editables
    public DefaultTableModel tableModel(String[] title) {

        DefaultTableModel model;

        boolean[] canEdit = new boolean[title.length];
        for (int i = 0; i < title.length; i++) {
            canEdit[i] = false;
        }

        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndx, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        for (String s : title) {
            model.addColumn(s);
        }

        return model;
    }

    // Registra las nuevas notas de un estudiante
    private void saveStudentNotes() {
        try {
            String asignature = (String) tblAsignature.getValueAt(rowSave, 0);
            double nota1 = getDoubleValue(tblAsignature.getValueAt(rowSave, 1));
            double nota2 = getDoubleValue(tblAsignature.getValueAt(rowSave, 2));
            double nota3 = getDoubleValue(tblAsignature.getValueAt(rowSave, 3));

            if (areValidGrades(nota1, nota2, nota3)) {
                double promedio = calculateAverage(nota1, nota2, nota3);
                updateStudentGrades(asignature, nota1, nota2, nota3, promedio);
                new UpdateStudentNotes(student).updateStudentNote();
                setDates(student.getArrayList(), tableModel(title));
            } else {
                JOptionPane.showMessageDialog(this, "Las notas deben estar entre 0 y 20.");
            }
        } catch (ClassCastException e) {
            System.err.println("Error converting string to double: " + e.getMessage());
        }
    }
    
    // Busca ma tarea correcta y actualiza la nota
    private void updateStudentGrades(String asignature, double nota1, double nota2, double nota3, double promedio) {
        for (Asignature a : student.getArrayList()) {
            if (a.getName().equals(asignature)) {
                Map<String, Double> notas = new HashMap<>();
                notas.put("Primer Parcial", nota1);
                notas.put("Segundo Parcial", nota2);
                notas.put("Tercer Parcial", nota3);
                notas.put("Promedio", promedio);
                a.setGrades(notas);
                break;
            }
        }
    }

    // Valida  que las notas esten correctas
    private boolean areValidGrades(double... grades) {
        for (double grade : grades) {
            if (!isValidGrade(grade)) {
                return false;
            }
        }
        return true;

    }

    // Método para obtener un valor double desde un Object
    private double getDoubleValue(Object value) {
        if (value instanceof Double) {
            return (Double) value;
        } else if (value instanceof String) {
            return Double.parseDouble((String) value);
        } else {
            throw new IllegalArgumentException("El valor no se puede convertir a double: " + value);
        }
    }

    // Método para validar que una nota esté en el rango de 0 a 20
    private boolean isValidGrade(double grade) {
        return grade >= 0 && grade <= 20;
    }
    
    // Metodo para calcular el promedio de las notas
    private double calculateAverage(double... grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Veridica qu el identificador de fila sea correcto
    private boolean isValidId(String id) {
        return id != null && !id.isEmpty();
    }

    // Retorna el titulo de la tabla
    private String[] getColumnTitles() {
        return new String[]{"Nombre", "Apellido", "Materia 1", "Materia 2", "Materia 3", "Materia 4"};
    }

    // Retornna la tabla la cual podemos solo editar una fila
    public DefaultTableModel editTable(String[] title, int editableRow) {

        DefaultTableModel model;

        boolean[] canEdit = new boolean[title.length];
        canEdit[0] = false;
        canEdit[title.length - 1] = false;
        for (int i = 1; i < title.length - 1; i++) {
            canEdit[i] = true;
        }

        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndx, int columnIndex) {
                // Permitir la edición solo si estamos en la fila editable
                if (rowIndx == editableRow) {
                    return canEdit[columnIndex];
                }
                return false;
            }
        };

        for (String s : title) {
            model.addColumn(s);
        }

        return model;
    }
}
