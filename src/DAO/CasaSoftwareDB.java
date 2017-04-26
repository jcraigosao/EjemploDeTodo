
package DAO;

import datos.CasaSoftware;
import java.io.FileNotFoundException;

public interface CasaSoftwareDB {
    public void escribir(CasaSoftware cs) throws FileNotFoundException;
    public CasaSoftware leer();
    
}
