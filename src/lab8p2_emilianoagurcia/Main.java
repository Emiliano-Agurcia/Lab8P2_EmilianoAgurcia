/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author emili
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        
        adminBarra AB = new adminBarra(PB_BarraCarga, 10, false);
        Thread Hilo_Barra = new Thread( AB );
        Hilo_Barra.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        Dialog_Cargar = new javax.swing.JDialog();
        BACKGROUND_Dialog = new javax.swing.JPanel();
        PB_BarraCarga = new javax.swing.JProgressBar();
        BACKGROUND = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        nombre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_NombreUniverso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SP_Years = new javax.swing.JSpinner();
        CB_Raza = new javax.swing.JComboBox<>();
        TF_ID = new javax.swing.JTextField();
        TF_Nombre = new javax.swing.JTextField();
        SP_Poder = new javax.swing.JSpinner();
        BT_AgregarSerVivo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CB_Universo = new javax.swing.JComboBox<>();
        BT_CrearUniverso = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        mod_SP_Years = new javax.swing.JSpinner();
        mod_CB_Universo = new javax.swing.JComboBox<>();
        mod_TF_ID = new javax.swing.JTextField();
        mod_TF_Nombre = new javax.swing.JTextField();
        mod_SP_Poder = new javax.swing.JSpinner();
        mod_BT_ModificarSerVivo = new javax.swing.JButton();
        mod_CB_Raza = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();

        BACKGROUND_Dialog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BACKGROUND_Dialog.add(PB_BarraCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 440, 20));

        javax.swing.GroupLayout Dialog_CargarLayout = new javax.swing.GroupLayout(Dialog_Cargar.getContentPane());
        Dialog_Cargar.getContentPane().setLayout(Dialog_CargarLayout);
        Dialog_CargarLayout.setHorizontalGroup(
            Dialog_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND_Dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Dialog_CargarLayout.setVerticalGroup(
            Dialog_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND_Dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACKGROUND.setBackground(new java.awt.Color(0, 0, 0));
        BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel1.setText("Poder");
        nombre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Crear Ser Vivo");
        nombre.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        nombre.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, -1, 20));

        TF_NombreUniverso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        nombre.add(TF_NombreUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 210, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel4.setText("Raza");
        nombre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel5.setText("Años");
        nombre.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel6.setText("ID");
        nombre.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel7.setText("Nombre");
        nombre.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel8.setText("Universo de Procedencia");
        nombre.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        SP_Years.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        SP_Years.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        nombre.add(SP_Years, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 80, -1));

        CB_Raza.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        CB_Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));
        nombre.add(CB_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 170, -1));

        TF_ID.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        nombre.add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 180, -1));

        TF_Nombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        nombre.add(TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 180, -1));

        SP_Poder.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        SP_Poder.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        nombre.add(SP_Poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 80, -1));

        BT_AgregarSerVivo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        BT_AgregarSerVivo.setText("Agregar Ser Vivo");
        BT_AgregarSerVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_AgregarSerVivoMouseClicked(evt);
            }
        });
        nombre.add(BT_AgregarSerVivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 170, 50));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel9.setText("Crear Universo");
        nombre.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, -1, -1));

        CB_Universo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        nombre.add(CB_Universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 170, -1));

        BT_CrearUniverso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        BT_CrearUniverso.setText("Crear Universo");
        BT_CrearUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CrearUniversoMouseClicked(evt);
            }
        });
        nombre.add(BT_CrearUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 140, 40));

        jTabbedPane1.addTab("Ser Vivo", nombre);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel10.setText("Poder");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setText("Modificar Ser Vivo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 130, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel12.setText("Raza");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel13.setText("Años");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel14.setText("ID");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel15.setText("Ser Vivo a Modificar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, 20));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel16.setText("Universo de Procedencia");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        mod_SP_Years.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        mod_SP_Years.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(mod_SP_Years, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 80, -1));

        mod_CB_Universo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jPanel1.add(mod_CB_Universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 170, -1));

        mod_TF_ID.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jPanel1.add(mod_TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 180, -1));

        mod_TF_Nombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jPanel1.add(mod_TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 180, -1));

        mod_SP_Poder.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        mod_SP_Poder.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel1.add(mod_SP_Poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 80, -1));

        mod_BT_ModificarSerVivo.setText("Agregar Ser Vivo");
        jPanel1.add(mod_BT_ModificarSerVivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 170, 50));

        mod_CB_Raza.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        mod_CB_Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));
        jPanel1.add(mod_CB_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 170, -1));

        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 190, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel17.setText("Nombre");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jTabbedPane1.addTab("Modificar Ser Vivo", jPanel1);

        BACKGROUND.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_CrearUniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CrearUniversoMouseClicked
        if(TF_NombreUniverso.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese un nombre para el universo");
        }else{
            Universo newUniverso = new Universo(
                TF_NombreUniverso.getText(),
                0
            );
        }
    }//GEN-LAST:event_BT_CrearUniversoMouseClicked

    private void BT_AgregarSerVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AgregarSerVivoMouseClicked
        if(TF_Nombre.getText().isEmpty() || TF_ID.getText().isEmpty() || CB_Universo.getSelectedItem() == null ){
            JOptionPane.showMessageDialog(this, "Por favor llene todas las casillas");
        }else{
            SerVivo newSer = new SerVivo(
                TF_Nombre.getText(),
                TF_ID.getText(),
                (int)SP_Poder.getValue(),
                (int)SP_Years.getValue(),
                (Universo) CB_Universo.getSelectedItem(),
                (String) CB_Raza.getSelectedItem()
            );
        }

    }//GEN-LAST:event_BT_AgregarSerVivoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUND;
    private javax.swing.JPanel BACKGROUND_Dialog;
    private javax.swing.JButton BT_AgregarSerVivo;
    private javax.swing.JButton BT_CrearUniverso;
    private javax.swing.JComboBox<String> CB_Raza;
    private javax.swing.JComboBox<String> CB_Universo;
    private javax.swing.JDialog Dialog_Cargar;
    private javax.swing.JProgressBar PB_BarraCarga;
    private javax.swing.JSpinner SP_Poder;
    private javax.swing.JSpinner SP_Years;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Nombre;
    private javax.swing.JTextField TF_NombreUniverso;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton mod_BT_ModificarSerVivo;
    private javax.swing.JComboBox<String> mod_CB_Raza;
    private javax.swing.JComboBox<String> mod_CB_Universo;
    private javax.swing.JSpinner mod_SP_Poder;
    private javax.swing.JSpinner mod_SP_Years;
    private javax.swing.JTextField mod_TF_ID;
    private javax.swing.JTextField mod_TF_Nombre;
    private javax.swing.JPanel nombre;
    // End of variables declaration//GEN-END:variables
}
