import java.util.Scanner;

public class Ej11 {
	
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
        
        int[] Arr = new int[10];
        int[] Aux = new int[10];

        int aux=0;
        int pos=0;
        
        System.out.print("Introduce 10 numeros");
        System.out.println();
        for(int a =0;a<10;a++){
            int num = (int)(Math.random()*10);
            Arr[a]=num;
            Aux[a]=num;
        }

        for (int j=0; j<10;j++){//Impresion de los indices
            System.out.print(" "+j);
        }
            System.out.println();

        for ( int i = 0; i<10;i++){ // Impresion del Array
            System.out.print(" "+Arr[i]);
        }

        boolean esPrimo;
        esPrimo = true;
        for (int p =0;p<10;p++){
        for (int i = 2; i < Arr[p]; i++) {
          if (Arr[p]% i == 0) {
            esPrimo = false;
          }
        }

        if(esPrimo){
            aux = Arr[p];
            Arr[p]=0;
            for ( int j =0; j!=(Arr[j]=0);j++){
                Arr[j] = Aux[(j+1)%10] = Arr[j];
            }
            }
        }
        System.out.println();
        System.out.println(" - - - - - - - - - -");
        for (int f=0;f<10;f++){
            System.out.print(" "+Arr[f]);
        }
    }
}
 
