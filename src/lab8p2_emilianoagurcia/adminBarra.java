/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import javax.swing.JProgressBar;

/**
 *
 * @author emili
 */
public class adminBarra extends Thread{
    JProgressBar Barra;
    boolean Completado;

    public adminBarra(JProgressBar Barra, boolean Completado) {
        this.Barra = Barra;
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

    @Override
    public void run() {
        while(Completado == false){
            Barra.setValue(Barra.getValue() + 1);
            Barra.setString( Integer.toString(Barra.getValue()) + " de " + Integer.toString(Barra.getMaximum()) + " archivos cargados.");
            
            if(Barra.getValue() == Barra.getMaximum()){
                Barra.setString("Archivos Cargados");
                Completado = true;
            }
            
        }
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
    
    
}
