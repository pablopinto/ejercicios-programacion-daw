import java.util.Scanner;

public class Ej8 {
	
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
        int[] Arr = new int[12];
        int temp =0;
        for ( int i = 1; i != 12;i++){
        System.out.println("Introduce la temperatura en el mes "+i);
        temp = s.nextInt();
        Arr[i] = temp;
        }
    for(int j=0;j<12;j++){
        for(int f=0;f<Arr[j];f++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
    

