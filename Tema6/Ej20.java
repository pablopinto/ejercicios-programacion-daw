import java.util.Scanner;
public class Ej20 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    System.out.println ("Porfavor indique la capacidad de la cuba en litros"); 
    int lit = s.nextInt();
    int alt = lit+1;
    int num = (int)(Math.random()*lit);
    for ( int i=0;i <alt;i++){
        System.out.print("*");
        for ( int j = 1 ; j<5;j++){
            
            if (i==alt-1){
                System.out.print("*");
            }
            else  if (i != alt && j==4){
                System.out.print("*");
            }
            else if ( i < num){
                System.out.print(" ");
            }
            else System.out.print ("=");
        }
        System.out.println();
    }

  } 
}   