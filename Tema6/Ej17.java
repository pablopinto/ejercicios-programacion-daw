import java.util.Scanner;
public class Ej17 {
	
	public static void main (String args[]) { 

     Scanner s = new Scanner(System.in);
    System.out.println ("Introduce el alto de la pecera (min 4 )");
    int alt = s.nextInt();
    System.out.println ("Introduce el ancho de la pecera (min 4 )"); 
    int anch = s.nextInt();
    int pezAlt = (int)(Math.random()*(alt-2))+1;
    int pezAnch =(int)(Math.random()*(anch-2)+1);
    
    for ( int i=0;i <alt;i++){
        System.out.print(" * ");
        for ( int j=1; j<anch;j++){
            if (i==0){
            System.out.print(" * ");
            }
            else if (i == alt-1){
            System.out.print(" * ");                      
            }
            else if(i != 0 && j == anch-1){
                System.out.print(" * ");
            }
            else if (pezAlt == i && pezAnch ==j){
                System.out.print(" & ");
            }
            else  System.out.print("   ");
        
                
        }
        System.out.println();
    }
  }  
}