package desafioalgprogra.figuras;

import java.util.Scanner;

/**
 *
 * @author Ratita
 */
public class Triangulos {

    public int datosx(String punto) {
        
        String cortar[] = punto.split(",");

        int ejeX = Integer.parseInt(cortar[0]);
        int ejeY = Integer.parseInt(cortar[1]);
        return ejeX;
        
        }
    public int datosy(String punto) {
        
        String cortar[] = punto.split(",");

        int ejeX = Integer.parseInt(cortar[0]);
        int ejeY = Integer.parseInt(cortar[1]);
        return ejeY;
        
        }
        
        
    }


