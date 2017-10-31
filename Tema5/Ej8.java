import java.util.Scanner;

public class Ej8 {
	
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println ( "Introduce tabla a calcular" );
        int num = s.nextInt();
        System.out.println ( "---" );
		for ( int i = 0 ; i <=10 ; i++){
            System.out.println ( "---" );
            System.out.println ( + (i*num) );
        }
	}
}
