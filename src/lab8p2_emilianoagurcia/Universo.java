/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class Universo implements Serializable{
    String Nombre;
    ArrayList <SerVivo> SeresVivos = new ArrayList();//Almacena los Seres Vivos, no va a los binarios
    int cantSeresVivos = SeresVivos.size();//Registrados, al crear uno, es 0.

    public Universo(String Nombre, int cantSeresVivos) {
        this.Nombre = Nombre;
        this.cantSeresVivos = cantSeresVivos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantSeresVivos() {
        return cantSeresVivos;
    }

    public void setCantSeresVivos(int cantSeresVivos) {
        this.cantSeresVivos = cantSeresVivos;
    }

    public ArrayList<SerVivo> getSeresVivos() {
        return SeresVivos;
    }

    public void setSeresVivos(ArrayList<SerVivo> SeresVivos) {
        this.SeresVivos = SeresVivos;
    }

    @Override
    public String toString() {
        return "Universo: "+Nombre;
    }
    
    
    
}
