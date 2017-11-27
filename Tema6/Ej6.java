import java.util.Scanner;
public class Ej6 {
	
	public static void main (String args[]) {
    System.out.println ("Adivina el numero"); 
    Scanner s = new Scanner(System.in);
    int num = (int)(Math.random()*100);
    int resp = -1;
    for ( int i=0;i <5;i++){
        System.out.println ("Introduce una respuesta: ");
        resp = s.nextInt();
        if (resp == num ){
            System.out.println("Has averiguado el numero");
        }
        else if ( resp < num ){
            System.out.println("El numero que has metido es menor que el que pensado");
        }
        else if (resp > num ){
            System.out.println("El numero que he pensado es menor que le que has introducido");
        }
    }
  }
	}