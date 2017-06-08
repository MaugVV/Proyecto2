
package Utilidades;

import Clases.Detalle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Detalle_Utilidades {
  
    
      private String ruta;    //atributo tipo String ruta

    public Detalle_Utilidades() {
      
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Detalle_Utilidades(String ruta) {
        this.ruta = ruta;
    }

  

    @Override
    public String toString() {
        return "Archivo{" + "ruta=" + ruta + '}';
    }
    
    public void guardarCliente(ArrayList<Detalle> detalle) {

        Path path = Paths.get(this.ruta);
        String r = path.toString();
         File f =new File(r);
      
        try {
         
                FileOutputStream fos=new FileOutputStream(f);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(detalle); 
                fos.close();
                oos.close();
            
        } catch (Exception e) {
        }
    }
    
        public ArrayList<Detalle> leerCliente() throws IOException {
        
        ArrayList<Detalle> detalle = new ArrayList<>();
        Path path = Paths.get(this.ruta);
        String r = path.toString();
         File f =new File(r);
        
         try {
                FileInputStream fis=new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fis);
                detalle=(ArrayList<Detalle>) ois.readObject();
                fis.close();
                ois.close();
                System.out.println("archivo cargado");
        } catch (Exception e) {
            System.out.println("erro al leer");
        }
        return detalle;
        }
        
        
                
        public ArrayList<Detalle> Estadisticas(){
         ArrayList<Detalle> sumas= new ArrayList();
         setRuta("src\\Archivos\\detalles.txt");
          try {
              List<Detalle> detalle = leerCliente();
              
             
              Collections.sort(detalle,new Comparator<Detalle>(){
                  @Override
                  public int compare(Detalle t, Detalle t1) {
                      int c = 0;
                      if(t.getCantidad()>t1.getCantidad()){
                          c=-1;
                      }
                      if(t.getCantidad()<t1.getCantidad()){
                          c=1;
                      }
                      if(t.getCantidad()==t1.getCantidad()){
                          c=0;
                      }
                      return c;
                  }
              });
//              for(Detalle d : detalle){
//                  sumas.add(d);
//              }
                sumas=sumar(detalle);
              
              
          } catch (IOException ex) {
              Logger.getLogger(Detalle_Utilidades.class.getName()).log(Level.SEVERE, null, ex);
          }
          return sumas;
        }
        public ArrayList<Detalle> sumar(List<Detalle> l){
            ArrayList<Detalle> sumas= new ArrayList();
            int[]indice = new int[l.size()];
            int i2=0;
            Boolean conf=false;
                for (int i = 0; i < l.size(); i++) {
                    Detalle d = l.get(i);
                  
                        if(sumas.size()>0){
                              for (int j = 0; j < sumas.size(); j++) {
                                  Detalle d1 = sumas.get(j);
                                  if(d.getServicio().equalsIgnoreCase(d1.getServicio())){
                                      int c = d.getCantidad()+d1.getCantidad();
                                      d.setCantidad(c);
                                      sumas.remove(j);
                                      sumas.add(d);
                                      conf=true;
                                  }
                              }
                              if(conf==false){
                              sumas.add(d);
                              }
                        }else{
                            sumas.add(d);
                        }
                    
            }
            
        return sumas;
        }
}
