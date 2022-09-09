/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_emilianoagurcia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class adminUniversos {
    ArrayList <Universo> ListaUniversos = new ArrayList();
    File Archivo = null;

    public adminUniversos(String path) {
        Archivo = new File(path);
    }

    public ArrayList<Universo> getListaUniversos() {
        return ListaUniversos;
    }

    public void setListaUniversos(ArrayList<Universo> ListaUniversos) {
        this.ListaUniversos = ListaUniversos;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    
    public void LeerArchivo() throws IOException{
        ListaUniversos = new ArrayList();
        Universo temp;
        
        FileInputStream FR = null;
        ObjectInputStream BR = null;
        
        if(Archivo.exists()){
            FR = new FileInputStream(Archivo);
            BR = new ObjectInputStream(FR);
            
            try {
                while( (temp = (Universo)BR.readObject()) != null){
                     ListaUniversos.add(temp);
                }
            } catch (Exception e) {
            }
        }
    }
    
    public void EscribirArchivo() throws IOException{
        FileOutputStream FW = null;
        ObjectOutputStream BW = null;
        
        try {
            FW = new FileOutputStream(Archivo);
            BW = new ObjectOutputStream(FW);
            
            for (Universo u : ListaUniversos) {
                BW.writeObject( u );
            }
            
            BW.flush();
        } catch (Exception e) {
        }
        FW.close();
        BW.close();
    }
}
