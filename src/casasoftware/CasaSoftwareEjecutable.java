/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casasoftware;

import DAO.Archivo;
import com.sun.org.apache.xerces.internal.xs.PSVIProvider;
import datos.Admon;
import datos.CasaSoftware;
import datos.Consultor;
import datos.Contrato;
import datos.Lider;
import datos.Programador;
import excepciones.LenguajeExcepcion;
import excepciones.NombreExcepcion;
import excepciones.SalarioExcepcion;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class CasaSoftwareEjecutable {
    public static void main(String[] args) {
        try{
        CasaSoftware cs= new CasaSoftware();
        Contrato c2=null;
        Programador c3;
        Lider c4;
        
        try {
            Contrato c1= new Consultor(1, "Inglkjohojnlnllk");
            cs.adicionarContrato(c1);
            c2= new Admon(2, "Fgyrfhedfhdhedh", 1000000);
            cs.adicionarContrato(c2);
            c3= new Programador(3, "Irdyhdrfhdfhdh", 2000000, "java");
            cs.adicionarContrato(c3);
            c4= new Lider(4, "Vdrjhtjtdgjhdt", 2000000, "C");
            c4.adicionarProgramador(c3);
            cs.adicionarContrato(c4);
        } catch (NombreExcepcion ex) {
            ex.printStackTrace();
        } catch (SalarioExcepcion ex) {
            ex.printStackTrace();
        } catch (LenguajeExcepcion ex) {
            ex.printStackTrace();
        }
            System.out.println(cs.mostrarInformacion());
            System.out.println(cs.calcularSalarioTotal());
            
            Archivo db= new Archivo();
            db.escribir(cs);
      
    
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
    
    }
}
}
