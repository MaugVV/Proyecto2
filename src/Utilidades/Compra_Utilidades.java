
package Utilidades;

import Clases.Compra;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Compra_Utilidades {
 
     private String ruta;    //atributo tipo String ruta

    public String getRuta() {
        return ruta;
    }

    public Compra_Utilidades(){
    
    
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Compra_Utilidades(String ruta) {
        this.ruta = ruta;
    }

  

    @Override
    public String toString() {
        return "Archivo{" + "ruta=" + ruta + '}';
    }
    
    public void guardarPedido(ArrayList<Compra> pedido) {

        Path path = Paths.get(this.ruta);
        String r = path.toString();
         File f =new File(r);
      
        try {
         
                FileOutputStream fos=new FileOutputStream(f);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(pedido); 
                fos.close();
                oos.close();
            
        } catch (Exception e) {
        }
    }
    
        public ArrayList<Compra> leerPedido() throws IOException {
        
        ArrayList<Compra> pedido = new ArrayList<>();
        Path path = Paths.get(this.ruta);
        String r = path.toString();
         File f =new File(r);
        
         try {
                FileInputStream fis=new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fis);
                pedido=(ArrayList<Compra>) ois.readObject();
                fis.close();
                ois.close();
                System.out.println("archivo cargado");
        } catch (Exception e) {
            System.out.println("error al leer");
        }
        return pedido;
        }
        
         public int Numero() {

        int n = 0;
        Compra f = new Compra();
        setRuta("src\\Archivos\\compras.txt");
        List<Compra> facturas = new ArrayList();
         try {
             facturas = leerPedido();
             for (Compra elem : facturas) {
                if (n < elem.getNumero()) {
                n = elem.getNumero();
            }

        }
         } catch (IOException ex) {
             Logger.getLogger(Compra_Utilidades.class.getName()).log(Level.SEVERE, null, ex);
         }
        

        return n+1;
    }
}
