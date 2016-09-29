package copybytesimaxe;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Copybytesimaxe {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
       //Con clases FileInputStream y FileOutputStream
/*       String uno = "/home/oracle/NetBeansProjects/Copybytesimaxe/foto1.png";
       String dos = "/home/oracle/NetBeansProjects/Copybytesimaxe/foto2.png";
       
       File imagen1 = new File(uno);
       File imagen2 = new File(dos);
       
       FileInputStream copiar = new FileInputStream(imagen1);
       FileOutputStream pegar = new FileOutputStream(imagen2,true);
        
       int i = copiar.read();
        
       System.out.println("Copiando...");
       while(i != -1){
           pegar.write(i);
           i = copiar.read();
       }        
       pegar.flush();
       copiar.close();
       pegar.close();
        
       System.out.println("Copiados: "+i +" bytes");
*/
        
       //Con clases BufferedInputStream y BufferedOutputStream 
       String uno = "/home/oracle/NetBeansProjects/Copybytesimaxe/foto1.png";
       String dos = "/home/oracle/NetBeansProjects/Copybytesimaxe/foto2.png";
       
       FileInputStream imagen1 = new FileInputStream(uno);
       FileOutputStream imagen2 = new FileOutputStream(dos);
       
       BufferedInputStream copiar = new BufferedInputStream(imagen1);
       BufferedOutputStream pegar = new BufferedOutputStream(imagen2);
        
       int i = copiar.read();
        
       System.out.println("Copiando...");
       while(i != -1){
           pegar.write(i);
           i = copiar.read();
       }        
       pegar.flush();
       copiar.close();
       pegar.close();
        
       System.out.println("Copiados: "+i +" bytes");
        
}

}
