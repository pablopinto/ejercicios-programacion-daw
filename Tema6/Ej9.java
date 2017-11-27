

public class Ej9 {
	
	public static void main (String[] args) {
		int num =0;
		int cont = 0;
		while ( num != 24){
			num = (int)(Math.random()*100)+1;
			if ( num% 2 ==0){
			System.out.print( " " +num);
			cont++;
		}
	}
	System.out.println();
	System.out.print ( " Se han generado estos numeros " +cont );
}
}

