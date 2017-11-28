import java.util.Scanner;

public class Ej9 {
	
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
        int[] Arr = new int[8];
        for ( int i = 0; i<8;i++){
        System.out.println("Introduce un numero entero");
        int num= s.nextInt();
        Arr[i] =num;
        }

        for (int j=0; j<8;j++){
            if (Arr[j]%2 ==0){
                System.out.println (Arr[j] +"Par");
            }
            else if (Arr[j]%3 ==0){
                System.out.println (Arr[j]+ "Impar");
            }
            else System.out.println (Arr[j]);
            }
        }   
}