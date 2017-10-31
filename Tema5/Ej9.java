import java.util.Scanner;

public class Ej9 {
	
	public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print ( "Introduce una cifra: " );
        int num = s.nextInt();
        int cont=0;
        while ( num > 0){
            num= num/10;
            cont++;
        }
        System.out.print ("Numero de cifras : "+cont);
	}
}
