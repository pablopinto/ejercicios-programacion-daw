import java.util.Scanner;
public class Ej12 {
	
	public static void main (String args[]) {
    System.out.println ("Adivina el numero"); 
    Scanner s = new Scanner(System.in);
    for (int i=1; i !=0; i++){
        int num = (int)(Math.random()*127)+32;
        System.out.print((char)num);
        for(int j=1; j!=0;i++){
            num = (int)(Math.random()*127)+32;
            System.out.print((char)num);
        }
        System.out.println();
    }

    
  }
}
