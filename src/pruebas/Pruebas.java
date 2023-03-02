
package pruebas;

/**
 *
 * @author Familia
 */
import java.util.*;
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String datos[];
        int vector [][]= new int [50][50];
        int filas;
        int columnas;
        int suma;
        System.out.println("FILAS");
        filas=n.nextInt();
        System.out.println("COLUMNAS");
        columnas=n.nextInt();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Fila"+(i+1));
                vector [i][j]=n.nextInt();   
            }  
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(vector[i][j]); 
                
            }  
        }
        suma=vector[0][0]+vector[1][0];
        System.out.println("Suma: "+suma);
        
           
    }
    
}
