package matematicas;
import java.util.Scanner;

public class Varios {
    public static int potencia(int bas , int pot){
        Scanner s = new Scanner(System.in);
        System.out.println ( "Introduce la Base = " );
        bas= s.nextInt();
        System.out.println ("Introduce la potencia = ");
        pot = s.nextInt();
        int cont =1; 
        int potencia =1;
        while(cont != pot){
            potencia = potencia*bas;
            cont ++;  
        }
        return(+potencia); 
	}
}