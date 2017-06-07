
package Utilidades;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;


public class vld_textbox {
    
     /*
        DESCRIPCION: CLASE QUE ME PERMITIRA VALIDAR LOS CAMPOS DE TEXTO YA SEAN
                     SOLO NUMEROS O SOLO LETRAS Y EL EMAIL Y CEDULA
    */
    
    public void soloNumeros(java.awt.event.KeyEvent evt){
         if(Character.isDigit(evt.getKeyChar()) || '.'==evt.getKeyChar()){
         }else{evt.consume();}  
    }
    public void soloLetras(java.awt.event.KeyEvent evt){
         if(Character.isLetter(evt.getKeyChar()) || ' '==evt.getKeyChar()){}else{evt.consume();}
    }
    public boolean email(String email){
        String sFormato;
            sFormato = "\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        Pattern p = Pattern.compile(sFormato);
        Matcher m = p.matcher(email);
        if(m.find()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean camposLlenos(JTextField campos[]){
        for (JTextField txt : campos) {
            if(txt.getText().trim().isEmpty()){
                txt.requestFocus();
                return false;
            }
        }
        return true;
    }
    
    public boolean validaCedula(String txt){
        String exp = "[01][0-9]{9}";
        return txt.matches(exp);    
    }
    public Boolean ValidaHora(String txt){
        String exp = "[0-24]{2}[:]{1}[0-60]{2}";
        return txt.matches(exp); 
    }
}
