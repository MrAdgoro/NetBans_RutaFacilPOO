/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Flotilla implements Serializable{
    List<Bus> lstBuses;
    public Flotilla(){
        lstBuses = new ArrayList<Bus>();
    }
    public Boolean AgregarBus(Bus objBus){
        lstBuses.add(objBus);
        return guardarBuses();
    }
    public Bus getBus(int intIndice){
        return lstBuses.get(intIndice);
    }
    
    
    public List<Bus> ListarBuses(){
        // Leer la lista desde el archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/BD/flotilla.dat"))) {
            lstBuses = (List<Bus>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstBuses;
    }
    public Boolean EliminarBus(Bus objBus){
        lstBuses.remove(objBus);
        return guardarBuses();
    }
    private Boolean guardarBuses(){
       String outputFilePath = "/src/BD/flotilla.dat";
        
        // Crear el directorio si no existe
        File file = new File(outputFilePath);
        File directory = file.getParentFile();
        if (directory != null && !directory.exists()) {
            directory.mkdirs(); // Crear directorios si no existen
        }
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BD/flotilla.dat"));
            oos.writeObject(lstBuses);
            oos.close();
        }catch(Exception e){
            return false;
        }
        return true; 
    }
}
