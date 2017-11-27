import java.util.Scanner;
public class Ej18 {
	
	public static void main (String args[]) {
    System.out.println ("Adivina el numero"); 
    Scanner s = new Scanner(System.in);
    int var=99;
    for ( int i=0;i <3;i++){
    int num = (int)(Math.random()*5);
        while (num == var){
           num = (int)(Math.random()*5);
        }
    switch(num){
        case 0:
        System.out.print(" Rojo");
        var=num;
        break;
        case 1:
        System.out.print(" Azul");
        var=num;
        break;
        case 2:
        System.out.print(" Verde");
        var=num;
        break;
        case 3:
        System.out.print(" Amarillo");
        var=num;
        break;
        case 4:
        System.out.print(" Violeta");
        var=num;
        break;
        case 5:
        System.out.print(" Naranja");
        break;

      }
    }  
  }
}