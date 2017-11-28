import java.util.Scanner;

public class Ej7 {
	
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
        int[] Arr = new int[100];
        
		for (int i =0; i <100; i++){
			int num =(int)(Math.random()*20);
            Arr[i] = num;
            System.out.println(" " +Arr[i]);
        }
        System.out.println();
        System.out.println("Introduce un numero de la lista");
        int num1 = s.nextInt();
        System.out.println("Selecciona el numero que va a ser sustituido por el anterior");
        int num2 = s.nextInt();

		for ( int j =0; j<100;j++){
            if (Arr[j] == num1){
                Arr[j] = num2;
            }
            System.out.println(" " +Arr[j]);
		}
		
	}
}