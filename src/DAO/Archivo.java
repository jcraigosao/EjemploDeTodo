
package DAO;

import datos.Admon;
import datos.CasaSoftware;
import datos.Consultor;
import datos.Contrato;
import datos.Lider;
import datos.Programador;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo implements CasaSoftwareDB {
    private File archivo;

    
    public Archivo() {
        this.archivo = new File("casaSoftware.txt");
    }

    
    @Override
    public void escribir(CasaSoftware cs) 
            throws FileNotFoundException {
        PrintStream salida= new PrintStream(archivo);
        ArrayList <Contrato> contratos= cs.getContratos();
        for (Contrato contrato : contratos) {
            if (contrato instanceof Consultor){
                Consultor consultor= (Consultor) contrato;
                salida.print("C,");
                salida.print(consultor.getId()+",");
                salida.print(consultor.getLabor()+",");
            }else if(contrato instanceof Admon){
                Admon admon=  (Admon) contrato;
                salida.print("A,");
                salida.print(admon.getId()+",");
                salida.print(admon.getNombre()+",");
                salida.print(admon.getSalario()+",");
            }else if(contrato instanceof Programador){
                Programador programador= (Programador) contrato;
                salida.print("P,");
                salida.print(programador.getId()+",");
                salida.print(programador.getNombre()+",");
                salida.print(programador.getSalario()+",");
                salida.print(programador.getLenguaje()+",");
            }else if(contrato instanceof Lider){
                Lider lider= (Lider) contrato;
                salida.print("L,");
                salida.print(lider.getId()+",");
                salida.print(lider.getNombre()+",");
                salida.print(lider.getSalario()+",");
                salida.print(lider.getLenguaje()+",");
                //Recorrer el equipo
                salida.print(lider.getEquipo().size()+",");
                    for (Programador p : lider.getEquipo()) {
                    salida.print(p.getId()+",");
                }
        
            }
        
        }
        salida.close();
    }

    @Override
    public CasaSoftware leer() {
       
        
        return null;
        
    
    }
    
}
