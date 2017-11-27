import java.util.Scanner;
public class Ej21 {
	
	public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    int num =0;
    int m1 = (int)(Math.random()*2);
    int m2 = (int)(Math.random()*2);
    int m3 = (int)(Math.random()*2);
    int m4 = (int)(Math.random()*2);
    int m5 = (int)(Math.random()*2);
    
    System.out.print( "2 centimos - ");
    num =m1;
    switch(num){
        case 0:
        System.out.println(" cara");
        break;
        case 1:
        System.out.println(" cruz");
        break;
    }
    System.out.print( "20 centimos - ");
    num =m2;
    switch(num){
        case 0:
        System.out.println(" cara");
        break;
        case 1:
        System.out.println(" cruz");
        break;
    }
    System.out.print( "50 centimos - ");
    num =m3;
    switch(num){
        case 0:
        System.out.println(" cara");
        break;
        case 1:
        System.out.println(" cruz");
        break;
    }
    System.out.print( "1 euros - ");
    num =m4;
    switch(num){
        case 0:
        System.out.println(" cara");
        break;
        case 1:
        System.out.println(" cruz");
        break;
    }
    System.out.print( "2 euros - ");
    num =m5;

  
    switch(num){
        case 0:
        System.out.println(" cara");
        break;
        case 1:
        System.out.println(" cruz");
        break;
    }
  }
}