import java.util.Scanner;
public class Ej15 {
	
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println ( "Introduce la Base = " );
        int bas= s.nextInt();
        System.out.println ("Introduce la potencia = ");
        int pot = s.nextInt();
        int cont =1; 
        int potencia =1;
        while(cont != pot){
            potencia = potencia*bas;
            cont ++;  
        }
        System.out.println(+potencia); 
	}
}