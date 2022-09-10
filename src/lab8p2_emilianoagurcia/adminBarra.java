/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author emili
 */
public class adminBarra extends Thread{
    JProgressBar Barra;
    JLabel Cargue;
    JLabel Espere;
    
    boolean Cargar;
    boolean Completado;

    public adminBarra(JProgressBar Barra, JLabel Cargue, JLabel Espere, boolean Cargar, boolean Completado) {
        this.Barra = Barra;
        this.Cargue = Cargue;
        this.Espere = Espere;
        this.Cargar = Cargar;
        this.Completado = Completado;
    }

    public JProgressBar getBarra() {
        return Barra;
    }

    public void setBarra(JProgressBar Barra) {
        this.Barra = Barra;
    }

    public boolean isCompletado() {
        return Completado;
    }

    public void setCompletado(boolean Completado) {
        this.Completado = Completado;
    }

    public boolean isCargar() {
        return Cargar;
    }

    public void setCargar(boolean Cargar) {
        this.Cargar = Cargar;
    }

    @Override
    public void run() {
        while(Completado == false){
            
            if(Cargar == true){
                Barra.setValue(Barra.getValue() + 1);
                Barra.setString( Integer.toString(Barra.getValue()) + " de " + Integer.toString(Barra.getMaximum()) + " archivos cargados.");

                if(Barra.getValue() == Barra.getMaximum()){
                    Barra.setString("Archivos Cargados");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                    Cargue.setText("Cargue sus archivos");
                    Barra.setString("Cargar");
                    Barra.setValue(0);
                    Espere.setVisible(false);
                    Completado = true;
                }
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    
}
