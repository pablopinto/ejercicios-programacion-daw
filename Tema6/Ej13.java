import java.util.Scanner;
public class Ej13 {
	
	public static void main (String args[]) {
    System.out.println ("Tirando dados"); 
    Scanner s = new Scanner(System.in);
    int num1=-99;
    int num2=99;
    while(num1 != num2){
        num1 = (int)(Math.random()*6)+1;
        System.out.print ("Dado 1 = "+num1 + " ");
        num2 = (int)(Math.random()*6)+1;
        System.out.print("Dado 2 = " +num2);
        System.out.println();
    }
    }
  }
	