package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     int numero , a = 0;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Ingrese un numero");
     numero = in.nextInt();
     
     for(int i = 1 ; i < numero ; i ++){ 
     if (numero % i == 0){
         a ++;
      }
     }if (a == 2){ 
     System.out.println("Es primo");
     }else{ 
     System.out.println("No es primo");
     }
    
    }
}
