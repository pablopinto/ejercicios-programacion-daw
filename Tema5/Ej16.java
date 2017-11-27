import java.util.Scanner;
public class Ej16 {
	
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println ( "Introduce un numero = " );
        int num = s.nextInt();
        int cont=0;
        for (int i=1;i < num; i++){
            int calc= num%i;
            if (calc==0){
                cont++;
            }
            
            }
            if (cont <=2)
                    {
                        System.out.println("es primo");
                    }
                    else System.out.println("es par");

        }

    }
