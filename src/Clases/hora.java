/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dell
 */
public class hora extends Thread{
    public void run(){
       
        getHora();
    }
     public String getHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String date = sdf.format(new Date());
        return date;
    }
}
