
package Utilidades;

import Clases.Caja;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Caja_Utilidades {
 
     private String ruta;    //atributo tipo String ruta

    public String getRuta() {
        return ruta;
    }

    public Caja_Utilidades(){
    
    
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Caja_Utilidades(String ruta) {
        this.ruta = ruta;
    }

  

    @Override
    public String toString() {
        return "Archivo{" + "ruta=" + ruta + '}';
    }
    
    public void guardarCliente(ArrayList<Caja> caja) {

        Path path = Paths.get(this.ruta);
        String r = path.toString();
         File f =new File(r);
      
        try {
         
                FileOutputStream fos=new FileOutputStream(f);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(caja); 
                fos.close();
                oos.close();
            
        } catch (Exception e) {
        }
    }
    
        public ArrayList<Caja> leerCaja() throws IOException {
        
        ArrayList<Caja> caja = new ArrayList<>();
        Path path = Paths.get(this.ruta);
        String r = path.toString();
         File f =new File(r);
        
         try {
                FileInputStream fis=new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fis);
                caja=(ArrayList<Caja>) ois.readObject();
                fis.close();
                ois.close();
                System.out.println("archivo cargado");
        } catch (Exception e) {
            System.out.println("error al leer");
        }
        return caja;
        }
}
