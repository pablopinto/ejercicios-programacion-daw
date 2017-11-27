
public class Ej11 {
	
	public static void main (String[] args) {
		int num =0;
		int contSus = 0;
		int contSuf = 0;
		int contBien = 0;
		int contNot = 0;
		int contSobr = 0;
	for ( int i=0;i<20;i++){
			num = (int)(Math.random()*5);
			switch(num){
				case 0:
				System.out.print("Suspenso");
				contSus++;
				break;
				case 1:
				System.out.print("Suficiente");
				contSuf++;
				break;
				case 2:
				System.out.print("Bien");
				contBien++;
				break;
				case 3:
				System.out.print("Notable");
				contNot++;
				break;
				case 4:
				System.out.print("Sobresaliente");
				contSobr++;
				break;
	}
	System.out.println();
}
	System.out.println("Cantidad de suspensos : "+contSus);
	System.out.println("Cantidad de suficientes : "+contSuf);
	System.out.println("Cantidad de bienes : "+contBien);
	System.out.println("Cantidad de notables : "+contNot);
	System.out.println("Cantidad de sobresalientes : "+contSobr);
}
}
