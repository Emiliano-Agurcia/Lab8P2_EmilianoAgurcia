/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class adminSerVivo {
    ArrayList <SerVivo> ListaSeresVivos = new ArrayList();
    File Archivo = null;
    
    public adminSerVivo(String path) {
        Archivo = new File(path);
    }

    public ArrayList<SerVivo> getListaSeresVivos() {
        return ListaSeresVivos;
    }

    public void setListaSeresVivos(ArrayList<SerVivo> ListaSeresVivos) {
        this.ListaSeresVivos = ListaSeresVivos;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }

    public adminSerVivo() {
    }
    
    public void LeerArchivo() throws IOException{
        ListaSeresVivos = new ArrayList();
        SerVivo temp;
        
        FileInputStream FR = null;
        ObjectInputStream BR = null;
        
        if(Archivo.exists()){
            FR = new FileInputStream(Archivo);
            BR = new ObjectInputStream(FR);
            
            try {
                while( (temp = (SerVivo)BR.readObject()) != null){
                    ListaSeresVivos.add(temp);
                }
            } catch (Exception e) {
            }
        }
    }
    public void EscribirArchivo(){
        
    }
}
