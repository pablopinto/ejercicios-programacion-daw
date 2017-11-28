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
            System.out.print(" " +Arr[i]);
        }

        System.out.println();

        for (int j =0 ; j< 20;j++){// Calculo pares
            if(Arr[j]%2 ==0){
                contPar++;
                Aux[j%20] = Arr[j];  
                System.out.print( " "+Aux[j]);
            }
        }

      
      
        

} 
}