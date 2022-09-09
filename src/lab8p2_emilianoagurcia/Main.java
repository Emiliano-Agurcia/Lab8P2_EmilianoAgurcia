/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.DefaultComboBoxModel;
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

        Dialog_Cargar = new javax.swing.JDialog();
        BACKGROUND_Cargar = new javax.swing.JPanel();
        PB_BarraCarga = new javax.swing.JProgressBar();
        BACKGROUND = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Tab_Crear = new javax.swing.JPanel();
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
        Tab_Modificar = new javax.swing.JPanel();
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
        mod_CB_Elegir = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        Tab_Eliminar = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        elim_CB_Elegir = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        Tab_Verificacion = new javax.swing.JPanel();
        BT_Busqueda = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        busq_TF_ID1 = new javax.swing.JTextField();
        busq_TF_Nombre1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        BACKGROUND_Cargar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PB_BarraCarga.setForeground(new java.awt.Color(111, 186, 93));
        PB_BarraCarga.setString("Carga");
        PB_BarraCarga.setStringPainted(true);
        BACKGROUND_Cargar.add(PB_BarraCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 440, 40));

        javax.swing.GroupLayout Dialog_CargarLayout = new javax.swing.GroupLayout(Dialog_Cargar.getContentPane());
        Dialog_Cargar.getContentPane().setLayout(Dialog_CargarLayout);
        Dialog_CargarLayout.setHorizontalGroup(
            Dialog_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND_Cargar, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        Dialog_CargarLayout.setVerticalGroup(
            Dialog_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND_Cargar, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACKGROUND.setBackground(new java.awt.Color(0, 0, 0));
        BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tab_Crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel1.setText("Poder");
        Tab_Crear.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Crear Ser Vivo");
        Tab_Crear.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        Tab_Crear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, 20));

        TF_NombreUniverso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Crear.add(TF_NombreUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 210, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel4.setText("Raza");
        Tab_Crear.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel5.setText("Años");
        Tab_Crear.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel6.setText("ID");
        Tab_Crear.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel7.setText("Nombre");
        Tab_Crear.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel8.setText("Universo de Procedencia");
        Tab_Crear.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        SP_Years.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        SP_Years.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Tab_Crear.add(SP_Years, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 80, -1));

        CB_Raza.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        CB_Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));
        Tab_Crear.add(CB_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 170, -1));

        TF_ID.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Crear.add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 180, -1));

        TF_Nombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Crear.add(TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 180, -1));

        SP_Poder.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        SP_Poder.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        Tab_Crear.add(SP_Poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 80, -1));

        BT_AgregarSerVivo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        BT_AgregarSerVivo.setText("Agregar Ser Vivo");
        BT_AgregarSerVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_AgregarSerVivoMouseClicked(evt);
            }
        });
        Tab_Crear.add(BT_AgregarSerVivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 170, 50));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Crear Universo");
        Tab_Crear.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        CB_Universo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Crear.add(CB_Universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 170, -1));

        BT_CrearUniverso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        BT_CrearUniverso.setText("Crear Universo");
        BT_CrearUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CrearUniversoMouseClicked(evt);
            }
        });
        Tab_Crear.add(BT_CrearUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 140, 40));

        jTabbedPane1.addTab("Ser Vivo", Tab_Crear);

        Tab_Modificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel10.setText("Poder");
        Tab_Modificar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 204));
        jLabel11.setText("Modificar Ser Vivo");
        Tab_Modificar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 170, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel12.setText("Raza");
        Tab_Modificar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel13.setText("Años");
        Tab_Modificar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel14.setText("ID");
        Tab_Modificar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel15.setText("Ser Vivo a Modificar");
        Tab_Modificar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, 20));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel16.setText("Universo de Procedencia");
        Tab_Modificar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        mod_SP_Years.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        mod_SP_Years.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Tab_Modificar.add(mod_SP_Years, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 80, -1));

        mod_CB_Universo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Modificar.add(mod_CB_Universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 170, -1));

        mod_TF_ID.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Modificar.add(mod_TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 180, -1));

        mod_TF_Nombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Modificar.add(mod_TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 180, -1));

        mod_SP_Poder.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        mod_SP_Poder.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        Tab_Modificar.add(mod_SP_Poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 80, -1));

        mod_BT_ModificarSerVivo.setText("Modificar Ser Vivo");
        Tab_Modificar.add(mod_BT_ModificarSerVivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 170, 50));

        mod_CB_Raza.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        mod_CB_Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));
        Tab_Modificar.add(mod_CB_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 170, -1));

        mod_CB_Elegir.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        mod_CB_Elegir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mod_CB_ElegirItemStateChanged(evt);
            }
        });
        Tab_Modificar.add(mod_CB_Elegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 190, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel17.setText("Nombre");
        Tab_Modificar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jTabbedPane1.addTab("Modificar Ser Vivo", Tab_Modificar);

        Tab_Eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel21.setText("Ser Vivo a Eliminar");
        Tab_Eliminar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, 20));

        elim_CB_Elegir.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Eliminar.add(elim_CB_Elegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 190, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("Eliminar Ser Vivo");
        Tab_Eliminar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jTabbedPane1.addTab("Eliminar Ser Vivo", Tab_Eliminar);

        Tab_Verificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Busqueda.setText("Buscar");
        Tab_Verificacion.add(BT_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 411, 133, 51));

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel18.setText("ID");
        Tab_Verificacion.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel19.setText("Nombre");
        Tab_Verificacion.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        busq_TF_ID1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Verificacion.add(busq_TF_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 180, -1));

        busq_TF_Nombre1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Verificacion.add(busq_TF_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 180, -1));

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("Verificación");
        Tab_Verificacion.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jTabbedPane1.addTab("Verificacion", Tab_Verificacion);

        BACKGROUND.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 780));

        jMenu1.setText("Archivos");

        jMenuItem1.setText("Cargar Archivos");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void mod_CB_ElegirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mod_CB_ElegirItemStateChanged
        if(evt.getStateChange() == 2){
            SerVivo modSerVivo = (SerVivo) mod_CB_Elegir.getSelectedItem();
            DefaultComboBoxModel Mmod_CB_Universo = (DefaultComboBoxModel) mod_CB_Universo.getModel();
            
            mod_TF_Nombre.setText(modSerVivo.getNombre());
            mod_TF_ID.setText(modSerVivo.getID());
            mod_SP_Poder.setValue(modSerVivo.getPoder());
            mod_SP_Years.setValue(modSerVivo.getYears());
            mod_CB_Raza.setSelectedItem(modSerVivo.getRaza());
            mod_CB_Universo.setSelectedItem(modSerVivo.getProcedencia());
        }
    }//GEN-LAST:event_mod_CB_ElegirItemStateChanged

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
    private javax.swing.JPanel BACKGROUND_Cargar;
    private javax.swing.JButton BT_AgregarSerVivo;
    private javax.swing.JButton BT_Busqueda;
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
    private javax.swing.JPanel Tab_Crear;
    private javax.swing.JPanel Tab_Eliminar;
    private javax.swing.JPanel Tab_Modificar;
    private javax.swing.JPanel Tab_Verificacion;
    private javax.swing.JTextField busq_TF_ID1;
    private javax.swing.JTextField busq_TF_Nombre1;
    private javax.swing.JComboBox<String> elim_CB_Elegir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton mod_BT_ModificarSerVivo;
    private javax.swing.JComboBox<String> mod_CB_Elegir;
    private javax.swing.JComboBox<String> mod_CB_Raza;
    private javax.swing.JComboBox<String> mod_CB_Universo;
    private javax.swing.JSpinner mod_SP_Poder;
    private javax.swing.JSpinner mod_SP_Years;
    private javax.swing.JTextField mod_TF_ID;
    private javax.swing.JTextField mod_TF_Nombre;
    // End of variables declaration//GEN-END:variables


}
