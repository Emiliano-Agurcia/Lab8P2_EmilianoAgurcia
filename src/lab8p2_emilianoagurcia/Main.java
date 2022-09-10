/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import com.formdev.flatlaf.FlatDarkLaf;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author emili
 */
public class Main extends javax.swing.JFrame {
    ArrayList <SerVivo> SeresVivosCargados = new ArrayList();
    ArrayList <Universo> UniversosCargados = new ArrayList();
    
    public Main() throws IOException {
        initComponents();
        
        L_Espere.setVisible(false);
        AB = new adminBarra(PB_BarraCarga, L_Cargando, L_Espere, true, false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        BACKGROUND = new javax.swing.JPanel();
        TabbedPane = new javax.swing.JTabbedPane();
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
        TF_NombreSer = new javax.swing.JTextField();
        SP_Poder = new javax.swing.JSpinner();
        BT_AgregarSerVivo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CB_Universo = new javax.swing.JComboBox<>();
        BT_CrearUniverso = new javax.swing.JButton();
        Panel_Carga = new javax.swing.JPanel();
        L_Espere = new javax.swing.JLabel();
        L_Cargando = new javax.swing.JLabel();
        PB_BarraCarga = new javax.swing.JProgressBar();
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
        elim_BT_Eliminar = new javax.swing.JButton();
        Tab_Verificacion = new javax.swing.JPanel();
        BT_Busqueda = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        busq_TF_ID1 = new javax.swing.JTextField();
        busq_TF_Nombre1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        BarraMenu = new javax.swing.JMenu();
        Mitem_CargarArchivos = new javax.swing.JMenuItem();

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACKGROUND.setBackground(new java.awt.Color(0, 0, 0));
        BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabbedPaneStateChanged(evt);
            }
        });

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

        TF_NombreSer.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        Tab_Crear.add(TF_NombreSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 180, -1));

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

        Panel_Carga.setBackground(new java.awt.Color(51, 51, 51));
        Panel_Carga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L_Espere.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        L_Espere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Espere.setText("Esperate un rato brother");
        Panel_Carga.add(L_Espere, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 30));

        L_Cargando.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        L_Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Cargando.setText("Cargue sus archivos");
        Panel_Carga.add(L_Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 180, 70));

        PB_BarraCarga.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        PB_BarraCarga.setForeground(new java.awt.Color(75, 130, 62));
        PB_BarraCarga.setMaximum(10000);
        PB_BarraCarga.setString("Carga");
        PB_BarraCarga.setStringPainted(true);
        Panel_Carga.add(PB_BarraCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 560, 50));

        Tab_Crear.add(Panel_Carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 580, 300));

        TabbedPane.addTab("Agregar", Tab_Crear);

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
        mod_BT_ModificarSerVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mod_BT_ModificarSerVivoMouseClicked(evt);
            }
        });
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

        TabbedPane.addTab("Modificar", Tab_Modificar);

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

        elim_BT_Eliminar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        elim_BT_Eliminar.setText("Eliminar");
        elim_BT_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elim_BT_EliminarMouseClicked(evt);
            }
        });
        Tab_Eliminar.add(elim_BT_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 120, 50));

        TabbedPane.addTab("Eliminar", Tab_Eliminar);

        Tab_Verificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Busqueda.setText("Buscar");
        BT_Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_BusquedaMouseClicked(evt);
            }
        });
        Tab_Verificacion.add(BT_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 133, 51));

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

        TabbedPane.addTab("Verificacion", Tab_Verificacion);

        BACKGROUND.add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 780));

        BarraMenu.setText("Archivos");

        Mitem_CargarArchivos.setText("Cargar Archivos");
        Mitem_CargarArchivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Mitem_CargarArchivosMousePressed(evt);
            }
        });
        BarraMenu.add(Mitem_CargarArchivos);

        MenuBar.add(BarraMenu);

        setJMenuBar(MenuBar);

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
            boolean Incluido = false;
            for (int i = 0; i < UniversosCargados.size(); i++) {
                if(UniversosCargados.get(i).getNombre().equals(TF_NombreUniverso.getText())){
                    Incluido = true;
                }
            }
            if(Incluido == false){
                Universo newUniverso = new Universo(
                    TF_NombreUniverso.getText(),
                    0
                );

                //Single Universo
                try {
                    String path = "./cUniversos/" + TF_NombreUniverso.getText() + ".emi";
                    System.out.println(path);

                    adminUniversos AU = new adminUniversos(path);
                    AU.CargarArchivo();
                    AU.getListaUniversos().add(newUniverso);
                    AU.EscribirArchivo();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                //All Universos
                try {
                    adminUniversos AU = new adminUniversos("./AllUniversos.emi");
                    AU.CargarArchivo();
                    AU.getListaUniversos().add(newUniverso);
                    AU.EscribirArchivo();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                UniversosCargados.add(newUniverso);
                TF_NombreUniverso.setText("");
                JOptionPane.showMessageDialog(this, "El universo ha sido creado exitosamente");    
            }else{
                JOptionPane.showMessageDialog(this, "El Universo ya esta incluido");
            }
            
        }
    }//GEN-LAST:event_BT_CrearUniversoMouseClicked

    private void BT_AgregarSerVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AgregarSerVivoMouseClicked
        if(TF_NombreSer.getText().isEmpty() || TF_ID.getText().isEmpty() || CB_Universo.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, "Por favor llene todas las casillas");
        }else{
            boolean Incluido = false;
            for (int i = 0; i < SeresVivosCargados.size(); i++) {
                if(SeresVivosCargados.get(i).getNombre().equals(TF_NombreSer.getText())){
                    Incluido = true;
                }
            }
            if(Incluido == false){
                SerVivo newSer = new SerVivo(
                    TF_NombreSer.getText(),
                    TF_ID.getText(),
                    (int)SP_Poder.getValue(),
                    (int)SP_Years.getValue(),
                    (Universo) CB_Universo.getSelectedItem(),
                    (String) CB_Raza.getSelectedItem()
                );

                //Singel SerVivo
                try {
                    String path = "./cSeresVivos/" + TF_NombreSer.getText() + ".emi";

                    adminSerVivo AS = new adminSerVivo(path);

                    AS.CargarArchivo();
                    AS.getListaSeresVivos().add(newSer);
                    AS.EscribirArchivo();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                //AllSeresVivos
                try {
                    adminSerVivo AS = new adminSerVivo("./AllSeresVivos.emi");

                    AS.CargarArchivo();
                    AS.getListaSeresVivos().add(newSer);
                    AS.EscribirArchivo();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                //Agregar SerVivo a Universo
                try {

                    adminUniversos AU = new adminUniversos("./AllUniversos.emi");
                    AU.CargarArchivo();
                    for (int i = 0; i < AU.getListaUniversos().size(); i++) {
                        if(AU.getListaUniversos().get(i).getNombre().equals(newSer.getProcedencia().getNombre())){
                            AU.getListaUniversos().get(i).getSeresVivos().add(newSer);
                        }
                    }
                    AU.EscribirArchivo();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                JOptionPane.showMessageDialog(this, "Ser Vivo creado exitosamente");
                Limpiar_Crear();
                SeresVivosCargados.add(newSer);    
            }else{
                JOptionPane.showMessageDialog(this, "El ID ya esta incluido");
            }
            
        }

    }//GEN-LAST:event_BT_AgregarSerVivoMouseClicked

    private void TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabbedPaneStateChanged
        try {
            //Cargando
            DefaultComboBoxModel ModeloNuevoSeresVivos = new DefaultComboBoxModel(SeresVivosCargados.toArray());
            mod_CB_Elegir.setModel(ModeloNuevoSeresVivos);
            elim_CB_Elegir.setModel(ModeloNuevoSeresVivos);
            
            DefaultComboBoxModel ModeloNuevoUniversos = new DefaultComboBoxModel(UniversosCargados.toArray());
            CB_Universo.setModel(ModeloNuevoUniversos);
            mod_CB_Universo.setModel(ModeloNuevoUniversos);
            
            //Manual
            /*
            adminSerVivo AS = new adminSerVivo("./AllSeresVivos.emi");
            AS.CargarArchivo();
            
            adminUniversos AU = new adminUniversos("./AllUniversos.emi");
            AU.CargarArchivo();
            
            DefaultComboBoxModel ModeloNuevoSeresVivos = new DefaultComboBoxModel(AS.getListaSeresVivos().toArray());
            mod_CB_Elegir.setModel(ModeloNuevoSeresVivos);
            elim_CB_Elegir.setModel(ModeloNuevoSeresVivos);
            
            DefaultComboBoxModel ModeloNuevoUniversos = new DefaultComboBoxModel(AU.getListaUniversos().toArray());
            CB_Universo.setModel(ModeloNuevoUniversos);
            */
            
            
            mod_CB_Elegir.setSelectedIndex(-1);
            elim_CB_Elegir.setSelectedIndex(-1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_TabbedPaneStateChanged

    private void Mitem_CargarArchivosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mitem_CargarArchivosMousePressed
        
        JFileChooser FC = new JFileChooser("./");
        File Selected_Archivo = null;
        FileInputStream FR = null;
        ObjectInputStream BR = null;
        
        FileNameExtensionFilter MyFilter = new FileNameExtensionFilter("emi Files", "emi");
        
        FC.setFileFilter(MyFilter);
        
        int opcion = FC.showOpenDialog(this);
        
        if(opcion == 0){
            try {
                Selected_Archivo = FC.getSelectedFile();
                FR = new FileInputStream(Selected_Archivo);
                BR = new ObjectInputStream(FR);
                
                if (BR.readObject() instanceof SerVivo) {
                    adminSerVivo AS = new adminSerVivo();
                    AS.setArchivo(Selected_Archivo);
                    AS.CargarArchivo();

                    if (SeresVivosCargados.isEmpty()) {
                        SeresVivosCargados = AS.getListaSeresVivos();

                        //Progress Bar
                        PB_BarraCarga.setMaximum(AS.getListaSeresVivos().size());
                        L_Cargando.setText("Cargando archivos...");
                        L_Espere.setVisible(true);
                        AB.start();
                        AB = new adminBarra(PB_BarraCarga, L_Cargando, L_Espere, true, false);
                        //Fin Progress Bar    
                    }else{
                        for (int i = 0; i < AS.getListaSeresVivos().size(); i++) {
                            if(  !SeresVivosCargados.contains(AS.getListaSeresVivos().get(i))  ){
                                SeresVivosCargados.add(AS.getListaSeresVivos().get(i));
                            }
                        }
                    }

                } else {
                    adminUniversos AU = new adminUniversos();
                    AU.setArchivo(Selected_Archivo);
                    AU.CargarArchivo();
                    if (UniversosCargados.isEmpty()) {
                        UniversosCargados = AU.getListaUniversos();

                        //Progress Bar
                        L_Cargando.setText("Cargando archivos...");
                        L_Espere.setVisible(true);
                        PB_BarraCarga.setMaximum(AU.getListaUniversos().size());
                        AB.start();
                        AB = new adminBarra(PB_BarraCarga, L_Cargando, L_Espere, true, false);
                        //Fin Progress Bar    
                    } else {
                        for (int i = 0; i < AU.getListaUniversos().size(); i++) {
                            if(  !UniversosCargados.contains(AU.getListaUniversos().get(i))  ){
                                UniversosCargados.add(AU.getListaUniversos().get(i));
                            }
                        }
                    }
                    
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
            try {
                BR.close();
                FR.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_Mitem_CargarArchivosMousePressed

    private void elim_BT_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elim_BT_EliminarMouseClicked
        if(elim_CB_Elegir.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, "Elija un Ser Vivo");
        }else{
            int opcion = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar el Ser Vivo?", "Eliminar Ser Vivo", YES_NO_OPTION);
            if(opcion == 0){
                
                //En AllSeresVivos
                try {
                    adminSerVivo AS = new adminSerVivo("./AllSeresVivos.emi");
                    AS.CargarArchivo();
                    AS.getListaSeresVivos().remove(elim_CB_Elegir.getSelectedIndex());
                    AS.EscribirArchivo();
                    
                    SeresVivosCargados.remove(elim_CB_Elegir.getSelectedIndex());
                    
                    JOptionPane.showMessageDialog(this, "Ser Vivo eliminado exitosamente");
                    elim_CB_Elegir.setSelectedItem(null);
                } catch (Exception ex) {
                }
                
                //En SerVivo individual
                try {
                    for (int i = 0; i < SeresVivosCargados.size(); i++) {
                        String pathEliminar = "./cSeresVivos/" + ((SerVivo)elim_CB_Elegir.getSelectedItem()).getNombre() + ".emi";
                        String path = "./cSeresVivos/" + SeresVivosCargados.get(i).getNombre() + ".emi";
                        File Archivo = new File(path);
                        
                        if(pathEliminar.equals(path)){
                            Archivo.delete();
                        }
                        
                    }
                } catch (Exception e) {
                }
                
            }
        }
    }//GEN-LAST:event_elim_BT_EliminarMouseClicked

    private void mod_CB_ElegirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mod_CB_ElegirItemStateChanged
        if(mod_CB_Elegir.getSelectedItem() != null){
            SerVivo modSerVivo = (SerVivo) mod_CB_Elegir.getSelectedItem();
            
            mod_TF_Nombre.setText(modSerVivo.getNombre());
            mod_TF_ID.setText(modSerVivo.getID());
            mod_SP_Poder.setValue(modSerVivo.getPoder());
            mod_SP_Years.setValue(modSerVivo.getYears());
            mod_CB_Raza.setSelectedItem(modSerVivo.getRaza());
            mod_CB_Universo.setSelectedIndex(UniversosCargados.indexOf(modSerVivo.getProcedencia()));
        }
    }//GEN-LAST:event_mod_CB_ElegirItemStateChanged

    private void mod_BT_ModificarSerVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mod_BT_ModificarSerVivoMouseClicked
        if(mod_TF_Nombre.getText().isEmpty() || mod_TF_ID.getText().isEmpty() || mod_CB_Universo.getSelectedItem() == null ){
            JOptionPane.showMessageDialog(this, "Por favor llene todas las casillas");
        }
        if(mod_CB_Elegir.getSelectedIndex() != -1){
            
            //En AllSeresVivos
            try {
                adminSerVivo AS = new adminSerVivo("./AllSeresVivos");
                AS.CargarArchivo();    
                AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setNombre(mod_TF_Nombre.getText());
                AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setID(mod_TF_ID.getText());
                AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setPoder((int) mod_SP_Poder.getValue());
                AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setYears((int) mod_SP_Years.getValue());
                AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setRaza(mod_CB_Raza.getSelectedItem().toString());
                AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setProcedencia((Universo) mod_CB_Universo.getSelectedItem());
                AS.EscribirArchivo();
                
                JOptionPane.showMessageDialog(this, "Modificado exitosamente");
            } catch (Exception e) {
            }

            //En SerVivo individual
            try {
                for (int i = 0; i < SeresVivosCargados.size(); i++) {
                    String pathModificar = "./cSeresVivos/" + ((SerVivo) elim_CB_Elegir.getSelectedItem()).getNombre() + ".emi";
                    String path = "./cSeresVivos/" + SeresVivosCargados.get(i).getNombre() + ".emi";
                    File Archivo = new File(path);

                    if (pathModificar.equals(path)) {
                        adminSerVivo AS = new adminSerVivo(path);
                        Archivo.renameTo(new File( "./cSeresVivos/"+mod_TF_Nombre.getText()+".emi"));
                        AS.CargarArchivo();
                        AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setNombre(mod_TF_Nombre.getText());
                        AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setID(mod_TF_ID.getText());
                        AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setPoder((int) mod_SP_Poder.getValue());
                        AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setYears((int) mod_SP_Years.getValue());
                        AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setRaza(mod_CB_Raza.getSelectedItem().toString());
                        AS.getListaSeresVivos().get(mod_CB_Elegir.getSelectedIndex()).setProcedencia((Universo) mod_CB_Universo.getSelectedItem());
                        AS.EscribirArchivo();
                    }

                }
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_mod_BT_ModificarSerVivoMouseClicked

    private void BT_BusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_BusquedaMouseClicked
        boolean encontrado = false;
        SerVivo SerEncontrado = null;
        
        for (int i = 0; i < SeresVivosCargados.size(); i++) {
            if(SeresVivosCargados.get(i).getNombre().equals(busq_TF_Nombre1.getText()) && SeresVivosCargados.get(i).getID().equals(busq_TF_ID1.getText())){
                encontrado = true;
                SerEncontrado = SeresVivosCargados.get(i);
            }
        }
        
        if(encontrado == true){
            JOptionPane.showMessageDialog(this, "El ser ha sido Encontrado en el universo "+ SerEncontrado.getProcedencia().getNombre());
        }else{
            JOptionPane.showMessageDialog(this, "El ser que desea buscar no existe");
        }
    }//GEN-LAST:event_BT_BusquedaMouseClicked

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
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUND;
    private javax.swing.JButton BT_AgregarSerVivo;
    private javax.swing.JButton BT_Busqueda;
    private javax.swing.JButton BT_CrearUniverso;
    private javax.swing.JMenu BarraMenu;
    private javax.swing.JComboBox<String> CB_Raza;
    private javax.swing.JComboBox<String> CB_Universo;
    private javax.swing.JLabel L_Cargando;
    private javax.swing.JLabel L_Espere;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem Mitem_CargarArchivos;
    private javax.swing.JProgressBar PB_BarraCarga;
    private javax.swing.JPanel Panel_Carga;
    private javax.swing.JSpinner SP_Poder;
    private javax.swing.JSpinner SP_Years;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_NombreSer;
    private javax.swing.JTextField TF_NombreUniverso;
    private javax.swing.JPanel Tab_Crear;
    private javax.swing.JPanel Tab_Eliminar;
    private javax.swing.JPanel Tab_Modificar;
    private javax.swing.JPanel Tab_Verificacion;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JTextField busq_TF_ID1;
    private javax.swing.JTextField busq_TF_Nombre1;
    private javax.swing.JButton elim_BT_Eliminar;
    private javax.swing.JComboBox<String> elim_CB_Elegir;
    private javax.swing.JDialog jDialog1;
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
    private javax.swing.JButton mod_BT_ModificarSerVivo;
    private javax.swing.JComboBox<String> mod_CB_Elegir;
    private javax.swing.JComboBox<String> mod_CB_Raza;
    private javax.swing.JComboBox<String> mod_CB_Universo;
    private javax.swing.JSpinner mod_SP_Poder;
    private javax.swing.JSpinner mod_SP_Years;
    private javax.swing.JTextField mod_TF_ID;
    private javax.swing.JTextField mod_TF_Nombre;
    // End of variables declaration//GEN-END:variables

    public static void Cargar(){
        
    }
    
    public void Limpiar_Crear(){
        TF_NombreSer.setText("");
        TF_ID.setText("");
        SP_Poder.setValue(1);
        SP_Years.setValue(1);
        CB_Raza.setSelectedItem("Humano");
        CB_Universo.setSelectedIndex(-1);
    }
    
    private void AbrirJDialog(JDialog Ventana){
        Ventana.setModal(true);
        Ventana.pack();
        Ventana.setLocationRelativeTo(this);
        
        Ventana.setVisible(true);
    }
    
    adminBarra AB;
}
