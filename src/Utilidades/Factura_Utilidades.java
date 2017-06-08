
package Utilidades;

import Clases.Factura;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Factura_Utilidades {
   
    public Factura_Utilidades(){}
      private String ruta;    //atributo tipo String ruta

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Factura_Utilidades(String ruta) {
        this.ruta = ruta;
    }

  

    @Override
    public String toString() {
        return "Archivo{" + "ruta=" + ruta + '}';
    }
    
    public void guardarCliente(ArrayList<Factura> factura) {

        Path path = Paths.get(this.ruta);
        String r = path.toString();
         File f =new File(r);
      
        try {
         
                FileOutputStream fos=new FileOutputStream(f);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(factura); 
                fos.close();
                oos.close();
            
        } catch (Exception e) {
        }
    }
    
        public ArrayList<Factura> leerFactura() throws IOException {
        
        ArrayList<Factura> factura = new ArrayList<>();
        Path path = Paths.get(this.ruta);
        String r = path.toString();
         File f =new File(r);
        
         try {
                FileInputStream fis=new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fis);
                factura=(ArrayList<Factura>) ois.readObject();
                fis.close();
                ois.close();
                System.out.println("archivo cargado");
        } catch (Exception e) {
            System.out.println("erro al leer");
        }
        return factura;
        }
        
        public void escribir(String[] factura,String id) throws IOException {
        File f = new File("src\\Archivos\\Factura_"+id+".txt");
        try {
            if (f.exists()) {
               
            } else {
                f.createNewFile();
            }
        } catch (Exception e) {
        }
        FileWriter Factura = new FileWriter(f.getAbsolutePath());
        int li_num = factura.length;
        String ls_cadena = new String();

        for (int i = 0; i < li_num; i++) {
            if(factura[i]==null){
                break;
            }
            ls_cadena = factura[i] + "\n";
            Factura.write(ls_cadena);
        }
        
        Factura.close();
    }
}
