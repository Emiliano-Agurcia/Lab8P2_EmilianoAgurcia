/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import java.io.Serializable;

/**
 *
 * @author emili
 */
public class SerVivo implements Serializable{
    String Nombre;
    String ID;
    int Poder;
    int Years;
    Universo Procedencia;//Universo de procedencia
    String Raza;//Humano o Amanto

    public SerVivo(String Nombre, String ID, int Poder, int Years, Universo Procedencia, String Raza) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Poder = Poder;
        this.Years = Years;
        this.Procedencia = Procedencia;
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public int getYears() {
        return Years;
    }

    public void setYears(int Years) {
        this.Years = Years;
    }

    public Universo getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(Universo Procedencia) {
        this.Procedencia = Procedencia;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return Raza +": "+ Nombre;
    }
    
    
}
