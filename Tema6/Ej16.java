import java.util.Scanner;
public class Ej16 {
	
	public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
     int v1=0;
     int v2=0;
     int v3=0;
    
        int num1 = (int)(Math.random()*5);
        switch(num1){
            case 1:
            System.out.print(" Corazon");
            v1=1;
            break;
            case 2:
            System.out.print(" Diamante");
            v1=2;
            break; 
            case 3:
            System.out.print(" Herradura");
            v1=3;
            break; 
            case 4:
            System.out.print(" Campana");
            v1=4;
            break; 
            case 0:
            System.out.print(" Limon");
            v1=0;
            break; 
        }

        int num2 = (int)(Math.random()*5);
        switch(num2){
            case 1:
            System.out.print(" Corazon");
            v2=1;
            break;
            case 2:
            System.out.print(" Diamante");
            v2=2;
            break; 
            case 3:
            System.out.print(" Herradura");
            v2=3;
            break; 
            case 4:
            System.out.print(" Campana");
            v2=4;
            break; 
            case 0:
            System.out.print(" Limon");
            v2=0;
            break; 
        }
        int num3 = (int)(Math.random()*5);
        switch(num3){
            case 1:
            System.out.println(" Corazon");
            v3=1;
            break;
            case 2:
            System.out.println(" Diamante");
            v3=2;
            break; 
            case 3:
            System.out.println(" Herradura");
            v3=3;
            break; 
            case 4:
            System.out.println(" Campana");
            v3=4;
            break; 
            case 0:
            System.out.println(" Limon");
            v3=0;
            break; 
        }
    if (v1==v2 && v2 != v3 || v1==v3 && v1 !=v2 || v2==v3 && v2 !=v1){
        System.out.print("Bien , ha recuperado su moneda");
    }
    else if (v1==v2 && v2 ==v3){
        System.out.print("Enhorabuena,haganado 10 monedas");
    }
    else if ( v1 != v2 && v2!=v3){
        System.out.print(" Lo siento, ha perdido");
    }
  }
}