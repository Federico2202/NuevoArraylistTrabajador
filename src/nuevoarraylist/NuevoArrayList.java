
package nuevoarraylist;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Federico Bornachera
 */
public class NuevoArrayList {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        ArrayList <String> nombre = new ArrayList ();
        ArrayList <Integer> SalarioDias = new ArrayList ();
        ArrayList <Integer> Dias = new ArrayList ();
        ArrayList <Integer> Total = new ArrayList ();
        boolean decision=true;
        
        int resultado =0, x=0;
        
        while (decision){
            System.out.println("Ingrese el nombre del trabajador: ");
            nombre.add(leer.next());
            System.out.println("");
            System.out.println("Ingrese el salario del trabajador: ");
            SalarioDias.add(leer.nextInt());
            System.out.println("");
            System.out.println("Ingrese los dias trabajados: ");
            Dias.add(leer.nextInt());
            System.out.println("Quiere ingresar otro trabajador? (0 Para Salir!!)");
            x=leer.nextInt();
            
            if(x==0){
                decision=false;
            }
        }
        
        for(int y=0; y<nombre.size(); y++){
            resultado=Dias.get(y)*SalarioDias.get(y);
            Total.add(resultado);
        }
        
        for(int y=0; y<nombre.size(); y++){
            System.out.println("Nombre \t " + nombre.get(y) + " Salario \t " + SalarioDias.get(y) + " Dias \t " + Dias.get(y) + " Total " + Total.get(y));
        }
                
    }
}
