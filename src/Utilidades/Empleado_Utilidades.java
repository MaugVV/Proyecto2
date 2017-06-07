package Utilidades;

import Clases.Empleados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Empleado_Utilidades {

    private String ruta;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Empleado_Utilidades() {

    }

    public Empleado_Utilidades(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Archivo{" + "ruta=" + ruta + '}';
    }

    public void guardarEmpleado(ArrayList<Empleados> empleados) {
        Path path = Paths.get(this.ruta);
        String r = path.toString();
        File f = new File(r);
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(empleados);
            fos.close();
            oos.close();
        } catch (Exception e) {
        }
    }

    public ArrayList<Empleados> consultarEmpleados() throws IOException {
        ArrayList<Empleados> empleados = new ArrayList<>();
        Path path = Paths.get(this.ruta);
        String r = path.toString();
        File f = new File(r);
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            empleados = (ArrayList<Empleados>) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("archivo cargado");
        } catch (Exception e) {
            System.out.println("error al consultar");
        }
        return empleados;
    }
}
