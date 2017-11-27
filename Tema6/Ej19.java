import java.util.Scanner;
public class Ej19 {
	
	public static void main (String args[]) {
        int par =0;
        int imp=999;
        int cont =0;
        int sum=0;
    System.out.println ("Adivina el numero"); 
    Scanner s = new Scanner(System.in);
    for ( int i=0;i <50;i++){
    int num = (int)(Math.random()*300)-100;
    cont++;
    sum = num +sum;
    System.out.print(num);
    System.out.print(" ");
    if (num%2 == 0 && num > par){
        par =num;
    }
    if (num%2 !=0 && num < imp )
        imp = num;
    }
    System.out.println();
    System.out.println ("Maximo de los pares : "+par);
    System.out.println ("Maximo de los pares : "+imp);
    System.out.println ("Media de todos los numeros : "+(sum/cont));
  }
	}