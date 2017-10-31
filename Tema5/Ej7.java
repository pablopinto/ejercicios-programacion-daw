import java.util.Scanner;
public class Ej7 {
	
    public static void main (String[] args) {
        System.out.print ( "Introduce las cifras de la caja fuerte : ");
        Scanner s = new Scanner (System.in);
        int comb =1234;
        for ( int i=0; i <4 ; i++){
            int num = s.nextInt();
            if ( num == comb){
                System.out.print ( "La combinacion es correcta");
                i=i+4;
            }
            else  System.out.println ("La combinacion no es correcta, prueba otra cifra ");
        }
    }
}