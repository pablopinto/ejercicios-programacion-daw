


public class Ej4{
	
	public static void main (String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for (int i =0;i <20;i++){
			int num = (int)(Math.random()*100);
			numero[i] = num;
			cuadrado[i] = numero[i]*numero[i];
			cubo[i] = cuadrado[i]*numero[i];
			System.out.print(numero[i]+ "   ");
			System.out.print(cuadrado[i]+"   ");
			System.out.print(cubo[i]+"   ");
			System.out.println();
	}
	
	
}
}

