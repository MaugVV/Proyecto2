
package Clases;

import java.io.Serializable;

public class Caja implements Serializable {
    
    private String caja="";
    private int billete=0,cantidadBillete=0,cantidadMoneda=0;
    private Double moneda=0.0,cambio=0.0;
    
    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public int getBillete() {
        return billete;
    }

    public void setBillete(int billete) {
        this.billete = billete;
    }

    public int getCantidadBillete() {
        return cantidadBillete;
    }

    public void setCantidadBillete(int cantidadBillete) {
        this.cantidadBillete = cantidadBillete;
    }

    public int getCantidadMoneda() {
        return cantidadMoneda;
    }

    public void setCantidadMoneda(int cantidadMoneda) {
        this.cantidadMoneda = cantidadMoneda;
    }

    public Double getMoneda() {
        return moneda;
    }

    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }
    
    
    
    
}
