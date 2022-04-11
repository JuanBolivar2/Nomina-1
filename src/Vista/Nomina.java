/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Modelo.*;
import javax.swing.JOptionPane;

/**
 *
 * @author candr
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ne=0;
        ne=Integer.parseInt(JOptionPane.showInputDialog("dig num emple"));
        Valor nomina[]=new Valor[ne];
        nomina[0]=new Valor();
        nomina[0].setVr(Integer.parseInt(JOptionPane.showInputDialog("digite valor hor")));
        JOptionPane.showMessageDialog(null, "valor hora:"+nomina[0].getVr());
        
        
        
    }
    
}
