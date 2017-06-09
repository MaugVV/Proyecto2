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
        File f = new File(r);

        try {

            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
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
        File f = new File(r);

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            detalle = (ArrayList<Detalle>) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("archivo cargado");
        } catch (Exception e) {
            System.out.println("erro al leer");
        }
        return detalle;
    }

    public ArrayList<Detalle> Estadisticas() {
        ArrayList<Detalle> sumas = new ArrayList();
        setRuta("src\\Archivos\\detalles.txt");
        try {
            List<Detalle> detalle = leerCliente();

            sumas = sumar(detalle);

        } catch (IOException ex) {
            Logger.getLogger(Detalle_Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sumas;
    }

    public ArrayList<Detalle> sumar(List<Detalle> l) {
        ArrayList<Detalle> sumas = new ArrayList();

        Boolean conf = false;
        int k=0;
        int c =0;
        for (int i = 0; i < l.size(); i++) {
            Detalle d = l.get(i);
            k++;
            conf = false;
            
             if(k==1){
                 sumas.add(d);
                 
            }else{
                  for (int j = 0; j < sumas.size(); j++) {
                    Detalle d1 = sumas.get(j);
                    if (d.getServicio().equalsIgnoreCase(d1.getServicio())) {
                        c= d1.getCantidad() + d.getCantidad();
                        d.setCantidad(c);
                        sumas.remove(j);
                        sumas.add(d);
                        conf = true;
                    }
                }
                if(!conf){
                    sumas.add(d);
                }
            }
         
            
         }

        return sumas;
    }
}
