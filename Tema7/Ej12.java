import java.util.Scanner;

public class Ej10 {
	
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
        int[] Arr = new int[20];
        int[] Aux = new int[20];

        int contPar=0;
        int contImp=0;
        int pos=0;

        for ( int i = 0; i<20;i++){ // Creacion del Array
            int num = (int)(Math.random()*100);
            Arr[i]=num;
        }

        System.out.println();
        int iResultado = 0;

        for (int j =0 ; j< 20;j++){// Calculo pares
            if(Arr[j]%2 ==0){
                Aux[iResultado++] = Arr[j]; 
            }
        }

        for (int k=0 ; k< 20;k++){// Calculo imppares
            if(Arr[k]%2 !=0){
                Aux[iResultado++] = Arr[k];  
            }
        }

        for (int p=0; p <20;p++ ){
            System.out.print( " "+Arr[p]);
        }
        System.out.println();
        for (int p=0; p <20;p++ ){
            System.out.print( " "+Aux[p]);
        }
} 
}