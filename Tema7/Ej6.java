import java.util.Scanner;

public class Ej6 {
	
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Introduce 15 numeros");
		int[] Arr = new int[15];
		for (int i =0; i <15; i++){
			int num = s.nextInt();
			Arr[i] = num;
		}
		for ( int j =0; j<14;j++){
			Arr[j] = Arr[j+1];
			Arr[0]=Arr[14];

			System.out.print(" " +Arr[j]);
		}
		
	}
}

