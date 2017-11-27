
public class Ej11 {
	
	public static void main (String[] args) {
		int num =0;
		int cont = 0;
	for ( int i=0;i<20;i++){
			num = (int)(Math.random()*5);
			switch(num){
				case 0:
				System.out.print("Suspenso");
				break;
				case 1:
				System.out.print("Suficiente");
				break;
				case 2:
				System.out.print("Bien");
				break;
				case 3:
				System.out.print("Notable");
				break;
				case 4:
				System.out.print("Sobresaliente");
				break;
	}
	System.out.println();
	System.out.print ( " Se han generado estos numeros " +cont );
}
}
}
