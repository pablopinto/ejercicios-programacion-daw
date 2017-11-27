import java.util.Scanner;

public class Ej5 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int[] Arr = new int[10];
		int max=0;
		int min=Integer.MAX_VALUE;
		System.out.println("Introduce diez numeros");
		for (int i=0; i<10;i++){
			int num = s.nextInt();
			Arr[i] = num;
			if ( num > max){
				max=num;
		}
		else if(num < min){
			min=num;
		}
	}
	for ( int j=0;j<10;j++){
		if (Arr[j] == max){
			System.out.println(Arr[j] + "Maximo");
		}
		else if (Arr[j] == min){
			System.out.println(Arr[j]+"Minimo");
		}
		else System.out.println(Arr[j]);
	}
			
	}
}

